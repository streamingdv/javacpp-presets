// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// KernelAndDevice encapsulates the logic needed to run a computation eagerly.
// The computation can be a single instantiated kernel (implemented by
// KernelAndDeviceOp below) or a multi-device function (implemented by
// KernelAndDeviceFunc below).
//
// Also see:
// https://www.tensorflow.org/code/tensorflow/core/common_runtime/kernel_benchmark_testlib.h
// and
// https://www.tensorflow.org/code/tensorflow/core/kernels/ops_testutil.h
@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class KernelAndDevice extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public KernelAndDevice(Pointer p) { super(p); }

  // Populates this with a kernel appropriate for 'ndef'.
  //
  // The provided FunctionLibraryRuntime MUST outlive all calls to
  // Run() on the returned KernelAndDevice.
  public native @ByVal Status Init(@Const @ByRef NodeDef ndef, GraphCollector graph_collector);

  // Non-multi-device functions are run using regular CallOp and look like
  // primitive operations from KernelAndDevice perspective.
  // `flr` can be nullptr if the operation is not run on any specific device
  // (currently can happen only for multi-device functions).

  // Not thread safe.

  // TODO(ashankar): Handle list-valued inputs.
  public native @ByVal Status Run(@Const @ByRef TensorValueVector inputs,
                       TensorVector outputs, NodeExecStats stats,
                       StepStats step_stats, GraphCollector graph_collector,
                       CancellationManager cancellation_manager);

  public native @ByVal Status Run(ScopedStepContainer step_container,
                       @Const @ByRef TensorValueVector inputs,
                       TensorVector outputs, NodeExecStats stats,
                       StepStats step_stats, GraphCollector graph_collector,
                       CancellationManager cancellation_manager);

  public native Device InputDevice(int i);
  public native Device OutputDevice(int idx);
  // If idx'th output is a resource, returns the device backing the resource.
  // Else, returns nullptr.
  public native Device OutputResourceDevice(int idx);

  // Returns the kernel that will be used to run this.
  // Returns nullptr if this will be run using function library runtime.
  public native @Const OpKernel kernel();

  // Returns the device on which this kernel will run. In the case of
  // multi-device functions, this is the default device that is passed to the
  // placer but actual computation can happen on a different set of devices.
  // Also, outputs can be produced on devices different from what this method
  // returns.
  public native Device device();

  public native @Const @ByRef DataTypeVector output_dtypes();

  public native @Cast("tensorflow::DataType") int input_type(int i);
  public native int num_inputs();
  public native int num_outputs();
  public native @StdString BytePointer name();
}

// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.onnxruntime;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;
import org.bytedeco.dnnl.*;
import static org.bytedeco.dnnl.global.dnnl.*;

import static org.bytedeco.onnxruntime.global.onnxruntime.*;


@Namespace("Ort") @Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class SessionOptions extends BaseSessionOptions {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SessionOptions(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SessionOptions(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public SessionOptions position(long position) {
        return (SessionOptions)super.position(position);
    }
    @Override public SessionOptions getPointer(long i) {
        return new SessionOptions((Pointer)this).position(position + i);
    }

  public SessionOptions() { super((Pointer)null); allocate(); }
  private native void allocate();
  public SessionOptions(OrtSessionOptions p) { super((Pointer)null); allocate(p); }
  private native void allocate(OrtSessionOptions p);

  public native @ByVal SessionOptions Clone();

  public native @ByRef SessionOptions SetIntraOpNumThreads(int intra_op_num_threads);
  public native @ByRef SessionOptions SetInterOpNumThreads(int inter_op_num_threads);
  public native @ByRef SessionOptions SetGraphOptimizationLevel(@Cast("GraphOptimizationLevel") int graph_optimization_level);

  public native @ByRef SessionOptions EnableCpuMemArena();
  public native @ByRef SessionOptions DisableCpuMemArena();

  public native @ByRef SessionOptions SetOptimizedModelFilePath(@Cast("const ORTCHAR_T*") Pointer optimized_model_file);

  public native @ByRef SessionOptions EnableProfiling(@Cast("const ORTCHAR_T*") Pointer profile_file_prefix);
  public native @ByRef SessionOptions DisableProfiling();

  public native @ByRef SessionOptions EnableMemPattern();
  public native @ByRef SessionOptions DisableMemPattern();

  public native @ByRef SessionOptions SetExecutionMode(@Cast("ExecutionMode") int execution_mode);

  public native @ByRef SessionOptions SetLogId(@Cast("const char*") BytePointer logid);
  public native @ByRef SessionOptions SetLogId(String logid);
  public native @ByRef SessionOptions SetLogSeverityLevel(int level);

  public native @ByRef SessionOptions Add(OrtCustomOpDomain custom_op_domain);

  public native @ByRef SessionOptions DisablePerSessionThreads();

  public native @ByRef SessionOptions AddConfigEntry(@Cast("const char*") BytePointer config_key, @Cast("const char*") BytePointer config_value);
  public native @ByRef SessionOptions AddConfigEntry(String config_key, String config_value);
  public native @ByRef SessionOptions AddInitializer(@Cast("const char*") BytePointer name, @Const OrtValue ort_val);
  public native @ByRef SessionOptions AddInitializer(String name, @Const OrtValue ort_val);

  public native @ByRef SessionOptions AppendExecutionProvider_CUDA(@Const @ByRef OrtCUDAProviderOptions provider_options);
  public native @ByRef SessionOptions AppendExecutionProvider_OpenVINO(@Const @ByRef OrtOpenVINOProviderOptions provider_options);
  public native @ByRef SessionOptions AppendExecutionProvider_TensorRT(@Const @ByRef OrtTensorRTProviderOptions provider_options);
}

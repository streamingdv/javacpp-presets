// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.functions.*;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;
 // namespace internal

@Namespace("at") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class OperandInfo extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OperandInfo(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public OperandInfo(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public OperandInfo position(long position) {
        return (OperandInfo)super.position(position);
    }
    @Override public OperandInfo getPointer(long i) {
        return new OperandInfo((Pointer)this).offsetAddress(i);
    }

  public OperandInfo() { super((Pointer)null); allocate(); }
  private native void allocate();
  public OperandInfo(@Cast({"", "c10::MaybeOwned<at::TensorBase>&&"}) @StdMove TensorBaseMaybeOwned t) { super((Pointer)null); allocate(t); }
  private native void allocate(@Cast({"", "c10::MaybeOwned<at::TensorBase>&&"}) @StdMove TensorBaseMaybeOwned t);

  /** The data pointer. This may be different from tensor->data_ptr() if the
   *  iterator is split. */
  public native Pointer data(); public native OperandInfo data(Pointer setter);

  /** Stride after broadcasting. The stride is in bytes, not number of elements. */
  public native @ByRef @Cast("at::OperandInfo::StrideVector*") SymDimVector stride_bytes(); public native OperandInfo stride_bytes(SymDimVector setter);

  /** The desired device and type for the operand. For inputs, this specifies
   *  that the input should be converted to this type if necessary. For outputs,
   *  this specifies which type to allocate. target_dtype and device are
   *  initialized with the dtype and device of the tensor but during type
   *  promotion target_dtype value can become different from tensor's dtype
   *  also, during type promotion target_dtype and device can be set for an
   *  undefined tensor so that tensor can be properly constructed later. */
  public native @ByRef DeviceOptional device(); public native OperandInfo device(DeviceOptional setter);
  public native ScalarType target_dtype(); public native OperandInfo target_dtype(ScalarType setter);
  // Caches dtype of the tensor, because scalar_type is an expensive operation
  // If dtype of the tensor is changed (e.g. as a result of type promotion or in
  // allocate_outputs), this
  // value should be changed too.
  public native ScalarType current_dtype(); public native OperandInfo current_dtype(ScalarType setter);

  public native @Cast("bool") boolean is_device_defined();
  public native @Cast("bool") boolean is_type_defined();
  public native @ByVal TensorOptions options();

  public native @Cast("bool") boolean is_output(); public native OperandInfo is_output(boolean setter);

  public native @Cast("bool") boolean will_resize(); public native OperandInfo will_resize(boolean setter);

  public native @Cast("bool") boolean is_read_write(); public native OperandInfo is_read_write(boolean setter);

  public native void validate();

  /** The tensor operand. Note that the strides, data pointer, and
   *  other attributes may differ due to dimension reordering and
   *  coalescing. */
  public native @Const @ByRef Tensor tensor();
  public native @Const @ByRef TensorBase tensor_base();
  public native void tensor(@Cast({"", "c10::MaybeOwned<at::TensorBase>&&"}) @StdMove TensorBaseMaybeOwned tensor);

  // Save the original tensor operand in cases when an output is modified
  // (e.g. if dtype is changed)
  public native @Const @ByRef Tensor original_tensor();
  public native @Const @ByRef TensorBase original_tensor_base();

  // Set tensor to a new value, and store the old tensor value in
  // original_tensor Should only ever be called once for the lifetime of an
  // operand
  public native void exchange_tensor(@Cast({"", "c10::MaybeOwned<at::TensorBase>&&"}) @StdMove TensorBaseMaybeOwned new_tensor);

  // Move original_tensor back into tensor, exchange_tensor must have been
  // called before
  public native void restore_original_tensor();
}

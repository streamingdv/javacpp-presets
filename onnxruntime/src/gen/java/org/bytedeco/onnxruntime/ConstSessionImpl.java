// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

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

@Name("Ort::detail::ConstSessionImpl<OrtSession>") @Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class ConstSessionImpl extends BaseSession {
    static { Loader.load(); }
    /** Default native constructor. */
    public ConstSessionImpl() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ConstSessionImpl(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ConstSessionImpl(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ConstSessionImpl position(long position) {
        return (ConstSessionImpl)super.position(position);
    }
    @Override public ConstSessionImpl getPointer(long i) {
        return new ConstSessionImpl((Pointer)this).offsetAddress(i);
    }


  /** Returns the number of model inputs */
  public native @Cast("size_t") long GetInputCount();
  /** Returns the number of model outputs */
  public native @Cast("size_t") long GetOutputCount();
  /** Returns the number of inputs that have defaults that can be overridden */
  public native @Cast("size_t") long GetOverridableInitializerCount();

  /** \brief Returns a copy of input name at the specified index.
   *
   * @param index must less than the value returned by GetInputCount()
   * @param allocator to allocate memory for the copy of the name returned
   * @return a instance of smart pointer that would deallocate the buffer when out of scope.
   *  The OrtAllocator instances must be valid at the point of memory release.
   */
  public native @UniquePtr("char, Ort::detail::AllocatedFree") @Cast("char*") BytePointer GetInputNameAllocated(@Cast("size_t") long index, OrtAllocator allocator);

  /** \brief Returns a copy of output name at then specified index.
   *
   * @param index must less than the value returned by GetOutputCount()
   * @param allocator to allocate memory for the copy of the name returned
   * @return a instance of smart pointer that would deallocate the buffer when out of scope.
   *  The OrtAllocator instances must be valid at the point of memory release.
   */
  public native @UniquePtr("char, Ort::detail::AllocatedFree") @Cast("char*") BytePointer GetOutputNameAllocated(@Cast("size_t") long index, OrtAllocator allocator);

  /** \brief Returns a copy of the overridable initializer name at then specified index.
   *
   * @param index must less than the value returned by GetOverridableInitializerCount()
   * @param allocator to allocate memory for the copy of the name returned
   * @return a instance of smart pointer that would deallocate the buffer when out of scope.
   *  The OrtAllocator instances must be valid at the point of memory release.
   */
  /** Wraps OrtApi::SessionGetOverridableInitializerName */
  public native @UniquePtr("char, Ort::detail::AllocatedFree") @Cast("char*") BytePointer GetOverridableInitializerNameAllocated(@Cast("size_t") long index, OrtAllocator allocator);

  /** Wraps OrtApi::SessionGetProfilingStartTimeNs */
  public native @Cast("uint64_t") long GetProfilingStartTimeNs();
  /** Wraps OrtApi::SessionGetModelMetadata */
  public native @ByVal ModelMetadata GetModelMetadata();

  /** Wraps OrtApi::SessionGetInputTypeInfo */
  public native @ByVal TypeInfo GetInputTypeInfo(@Cast("size_t") long index);
  /** Wraps OrtApi::SessionGetOutputTypeInfo */
  public native @ByVal TypeInfo GetOutputTypeInfo(@Cast("size_t") long index);
  /** Wraps OrtApi::SessionGetOverridableInitializerTypeInfo */
  public native @ByVal TypeInfo GetOverridableInitializerTypeInfo(@Cast("size_t") long index);
}

// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.tvm;

import org.bytedeco.tvm.Module;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;
import org.bytedeco.dnnl.*;
import static org.bytedeco.dnnl.global.dnnl.*;
import org.bytedeco.llvm.LLVM.*;
import static org.bytedeco.llvm.global.LLVM.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.tvm.global.tvm_runtime.*;


/**
 * \brief Byte array type used to pass in byte array
 *  When kTVMBytes is used as data type.
 */
@Properties(inherit = org.bytedeco.tvm.presets.tvm_runtime.class)
public class TVMByteArray extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TVMByteArray() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TVMByteArray(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TVMByteArray(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TVMByteArray position(long position) {
        return (TVMByteArray)super.position(position);
    }
    @Override public TVMByteArray getPointer(long i) {
        return new TVMByteArray((Pointer)this).offsetAddress(i);
    }

  public native @Cast("const char*") BytePointer data(); public native TVMByteArray data(BytePointer setter);
  public native @Cast("size_t") long size(); public native TVMByteArray size(long setter);
}

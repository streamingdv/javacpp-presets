// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.opencl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.opencl.global.OpenCL.*;


@Properties(inherit = org.bytedeco.opencl.presets.OpenCL.class)
public class cl_ushort4 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public cl_ushort4() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public cl_ushort4(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cl_ushort4(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public cl_ushort4 position(long position) {
        return (cl_ushort4)super.position(position);
    }
    @Override public cl_ushort4 getPointer(long i) {
        return new cl_ushort4((Pointer)this).position(position + i);
    }

    public native @Cast("cl_ushort") int s(int i); public native cl_ushort4 s(int i, int setter);
    @MemberGetter public native @Cast("cl_ushort*") IntPointer s();
// #if __CL_HAS_ANON_STRUCT__
// #endif
// #if defined( __CL_USHORT2__)
// #endif
// #if defined( __CL_USHORT4__)
// #endif
}

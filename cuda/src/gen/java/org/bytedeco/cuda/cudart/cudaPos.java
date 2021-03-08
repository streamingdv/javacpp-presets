// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * CUDA 3D position
 *
 * @see ::make_cudaPos
 */
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class cudaPos extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public cudaPos() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public cudaPos(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudaPos(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public cudaPos position(long position) {
        return (cudaPos)super.position(position);
    }
    @Override public cudaPos getPointer(long i) {
        return new cudaPos((Pointer)this).position(position + i);
    }

    /** x */
    public native @Cast("size_t") long x(); public native cudaPos x(long setter);
    /** y */
    public native @Cast("size_t") long y(); public native cudaPos y(long setter);
    /** z */
    public native @Cast("size_t") long z(); public native cudaPos z(long setter);
}

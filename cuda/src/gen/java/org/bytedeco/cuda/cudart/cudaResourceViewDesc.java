// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * CUDA resource view descriptor
 */
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class cudaResourceViewDesc extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public cudaResourceViewDesc() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public cudaResourceViewDesc(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudaResourceViewDesc(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public cudaResourceViewDesc position(long position) {
        return (cudaResourceViewDesc)super.position(position);
    }
    @Override public cudaResourceViewDesc getPointer(long i) {
        return new cudaResourceViewDesc((Pointer)this).offsetAddress(i);
    }

    /** Resource view format */
    public native @Cast("cudaResourceViewFormat") int format(); public native cudaResourceViewDesc format(int setter);
    /** Width of the resource view */
    public native @Cast("size_t") long width(); public native cudaResourceViewDesc width(long setter);
    /** Height of the resource view */
    public native @Cast("size_t") long height(); public native cudaResourceViewDesc height(long setter);
    /** Depth of the resource view */
    public native @Cast("size_t") long depth(); public native cudaResourceViewDesc depth(long setter);
    /** First defined mipmap level */
    public native @Cast("unsigned int") int firstMipmapLevel(); public native cudaResourceViewDesc firstMipmapLevel(int setter);
    /** Last defined mipmap level */
    public native @Cast("unsigned int") int lastMipmapLevel(); public native cudaResourceViewDesc lastMipmapLevel(int setter);
    /** First layer index */
    public native @Cast("unsigned int") int firstLayer(); public native cudaResourceViewDesc firstLayer(int setter);
    /** Last layer index */
    public native @Cast("unsigned int") int lastLayer(); public native cudaResourceViewDesc lastLayer(int setter);
}

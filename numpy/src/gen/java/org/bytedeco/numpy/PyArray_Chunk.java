// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.numpy;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.cpython.*;
import static org.bytedeco.cpython.global.python.*;

import static org.bytedeco.numpy.global.numpy.*;


/* Mirrors buffer object to ptr */

@Properties(inherit = org.bytedeco.numpy.presets.numpy.class)
public class PyArray_Chunk extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyArray_Chunk() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyArray_Chunk(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyArray_Chunk(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyArray_Chunk position(long position) {
        return (PyArray_Chunk)super.position(position);
    }
    @Override public PyArray_Chunk getPointer(long i) {
        return new PyArray_Chunk((Pointer)this).offsetAddress(i);
    }

        public native @ByRef PyObject ob_base(); public native PyArray_Chunk ob_base(PyObject setter);
        public native PyObject base(); public native PyArray_Chunk base(PyObject setter);
        public native Pointer ptr(); public native PyArray_Chunk ptr(Pointer setter);
        public native @Cast("npy_intp") long len(); public native PyArray_Chunk len(long setter);
        public native int flags(); public native PyArray_Chunk flags(int setter);
}

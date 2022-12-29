// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;




////////////////////////////////// MatConstIterator //////////////////////////////////

@Namespace("cv") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class MatConstIterator extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MatConstIterator(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public MatConstIterator(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public MatConstIterator position(long position) {
        return (MatConstIterator)super.position(position);
    }
    @Override public MatConstIterator getPointer(long i) {
        return new MatConstIterator((Pointer)this).offsetAddress(i);
    }


    /** default constructor */
    public MatConstIterator() { super((Pointer)null); allocate(); }
    private native void allocate();
    /** constructor that sets the iterator to the beginning of the matrix */
    public MatConstIterator(@Const Mat _m) { super((Pointer)null); allocate(_m); }
    private native void allocate(@Const Mat _m);
    /** constructor that sets the iterator to the specified element of the matrix */
    public MatConstIterator(@Const Mat _m, int _row, int _col/*=0*/) { super((Pointer)null); allocate(_m, _row, _col); }
    private native void allocate(@Const Mat _m, int _row, int _col/*=0*/);
    public MatConstIterator(@Const Mat _m, int _row) { super((Pointer)null); allocate(_m, _row); }
    private native void allocate(@Const Mat _m, int _row);
    /** constructor that sets the iterator to the specified element of the matrix */
    public MatConstIterator(@Const Mat _m, @ByVal Point _pt) { super((Pointer)null); allocate(_m, _pt); }
    private native void allocate(@Const Mat _m, @ByVal Point _pt);
    /** constructor that sets the iterator to the specified element of the matrix */
    
    /** copy constructor */
    public MatConstIterator(@Const @ByRef MatConstIterator it) { super((Pointer)null); allocate(it); }
    private native void allocate(@Const @ByRef MatConstIterator it);

    /** copy operator */
    public native @ByRef @Name("operator =") MatConstIterator put(@Const @ByRef MatConstIterator it);
    /** returns the current matrix element */
    public native @Cast("const uchar*") @Name("operator *") BytePointer multiply();
    /** returns the i-th matrix element, relative to the current */
    public native @Cast("const uchar*") @Name("operator []") BytePointer get(@Cast("ptrdiff_t") long i);

    /** shifts the iterator forward by the specified number of elements */
    public native @ByRef @Name("operator +=") MatConstIterator addPut(@Cast("ptrdiff_t") long ofs);
    /** shifts the iterator backward by the specified number of elements */
    public native @ByRef @Name("operator -=") MatConstIterator subtractPut(@Cast("ptrdiff_t") long ofs);
    /** decrements the iterator */
    public native @ByRef @Name("operator --") MatConstIterator decrement();
    /** decrements the iterator */
    public native @ByVal @Name("operator --") MatConstIterator decrement(int arg0);
    /** increments the iterator */
    public native @ByRef @Name("operator ++") MatConstIterator increment();
    /** increments the iterator */
    public native @ByVal @Name("operator ++") MatConstIterator increment(int arg0);
    /** returns the current iterator position */
    public native @ByVal Point pos();
    /** returns the current iterator position */
    public native void pos(IntPointer _idx);
    public native void pos(IntBuffer _idx);
    public native void pos(int[] _idx);

    public native @Cast("ptrdiff_t") long lpos();
    public native void seek(@Cast("ptrdiff_t") long ofs, @Cast("bool") boolean relative/*=false*/);
    public native void seek(@Cast("ptrdiff_t") long ofs);
    public native void seek(@Const IntPointer _idx, @Cast("bool") boolean relative/*=false*/);
    public native void seek(@Const IntPointer _idx);
    public native void seek(@Const IntBuffer _idx, @Cast("bool") boolean relative/*=false*/);
    public native void seek(@Const IntBuffer _idx);
    public native void seek(@Const int[] _idx, @Cast("bool") boolean relative/*=false*/);
    public native void seek(@Const int[] _idx);

    public native @Const Mat m(); public native MatConstIterator m(Mat setter);
    public native @Cast("size_t") long elemSize(); public native MatConstIterator elemSize(long setter);
    public native @Cast("const uchar*") BytePointer ptr(); public native MatConstIterator ptr(BytePointer setter);
    public native @Cast("const uchar*") BytePointer sliceStart(); public native MatConstIterator sliceStart(BytePointer setter);
    public native @Cast("const uchar*") BytePointer sliceEnd(); public native MatConstIterator sliceEnd(BytePointer setter);
}

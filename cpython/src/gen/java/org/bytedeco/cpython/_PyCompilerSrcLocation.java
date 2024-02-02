// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;


/* source location information */
@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class _PyCompilerSrcLocation extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public _PyCompilerSrcLocation() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public _PyCompilerSrcLocation(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public _PyCompilerSrcLocation(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public _PyCompilerSrcLocation position(long position) {
        return (_PyCompilerSrcLocation)super.position(position);
    }
    @Override public _PyCompilerSrcLocation getPointer(long i) {
        return new _PyCompilerSrcLocation((Pointer)this).offsetAddress(i);
    }

    public native int lineno(); public native _PyCompilerSrcLocation lineno(int setter);
    public native int end_lineno(); public native _PyCompilerSrcLocation end_lineno(int setter);
    public native int col_offset(); public native _PyCompilerSrcLocation col_offset(int setter);
    public native int end_col_offset(); public native _PyCompilerSrcLocation end_col_offset(int setter);
}

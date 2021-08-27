// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

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


@Properties(inherit = org.bytedeco.numpy.presets.numpy.class)
public class PyArray_DatetimeDTypeMetaData extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyArray_DatetimeDTypeMetaData() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyArray_DatetimeDTypeMetaData(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyArray_DatetimeDTypeMetaData(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyArray_DatetimeDTypeMetaData position(long position) {
        return (PyArray_DatetimeDTypeMetaData)super.position(position);
    }
    @Override public PyArray_DatetimeDTypeMetaData getPointer(long i) {
        return new PyArray_DatetimeDTypeMetaData((Pointer)this).offsetAddress(i);
    }

    public native @ByRef NpyAuxData base(); public native PyArray_DatetimeDTypeMetaData base(NpyAuxData setter);
    public native @ByRef PyArray_DatetimeMetaData meta(); public native PyArray_DatetimeDTypeMetaData meta(PyArray_DatetimeMetaData setter);
}

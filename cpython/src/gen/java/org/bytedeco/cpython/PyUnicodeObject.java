// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;


/* Strings allocated through PyUnicode_FromUnicode(NULL, len) use the
   PyUnicodeObject structure. The actual string data is initially in the wstr
   block, and copied into the data block using _PyUnicode_Ready. */
@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class PyUnicodeObject extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyUnicodeObject() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyUnicodeObject(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyUnicodeObject(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyUnicodeObject position(long position) {
        return (PyUnicodeObject)super.position(position);
    }
    @Override public PyUnicodeObject getPointer(long i) {
        return new PyUnicodeObject((Pointer)this).position(position + i);
    }

    public native @ByRef PyCompactUnicodeObject _base(); public native PyUnicodeObject _base(PyCompactUnicodeObject setter);
        @Name("data.any") public native Pointer data_any(); public native PyUnicodeObject data_any(Pointer setter);
        @Name("data.latin1") public native @Cast("Py_UCS1*") BytePointer data_latin1(); public native PyUnicodeObject data_latin1(BytePointer setter);
        @Name("data.ucs2") public native @Cast("Py_UCS2*") ShortPointer data_ucs2(); public native PyUnicodeObject data_ucs2(ShortPointer setter);
        @Name("data.ucs4") public native @Cast("Py_UCS4*") IntPointer data_ucs4(); public native PyUnicodeObject data_ucs4(IntPointer setter);                     /* Canonical, smallest-form Unicode buffer */
}

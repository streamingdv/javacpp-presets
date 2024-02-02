// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;


@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class PyUnicodeErrorObject extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyUnicodeErrorObject() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyUnicodeErrorObject(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyUnicodeErrorObject(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyUnicodeErrorObject position(long position) {
        return (PyUnicodeErrorObject)super.position(position);
    }
    @Override public PyUnicodeErrorObject getPointer(long i) {
        return new PyUnicodeErrorObject((Pointer)this).offsetAddress(i);
    }

    public native @ByRef PyObject ob_base(); public native PyUnicodeErrorObject ob_base(PyObject setter); public native PyObject dict(); public native PyUnicodeErrorObject dict(PyObject setter);
             public native PyObject args(); public native PyUnicodeErrorObject args(PyObject setter); public native PyObject notes(); public native PyUnicodeErrorObject notes(PyObject setter); public native PyObject traceback(); public native PyUnicodeErrorObject traceback(PyObject setter);
             public native PyObject context(); public native PyUnicodeErrorObject context(PyObject setter); public native PyObject cause(); public native PyUnicodeErrorObject cause(PyObject setter);
             public native @Cast("char") byte suppress_context(); public native PyUnicodeErrorObject suppress_context(byte setter);
    public native PyObject encoding(); public native PyUnicodeErrorObject encoding(PyObject setter);
    public native PyObject object(); public native PyUnicodeErrorObject object(PyObject setter);
    public native @Cast("Py_ssize_t") long start(); public native PyUnicodeErrorObject start(long setter);
    public native @Cast("Py_ssize_t") long end(); public native PyUnicodeErrorObject end(long setter);
    public native PyObject reason(); public native PyUnicodeErrorObject reason(PyObject setter);
}

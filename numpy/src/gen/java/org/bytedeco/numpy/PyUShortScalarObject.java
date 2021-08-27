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
public class PyUShortScalarObject extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyUShortScalarObject() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyUShortScalarObject(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyUShortScalarObject(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyUShortScalarObject position(long position) {
        return (PyUShortScalarObject)super.position(position);
    }
    @Override public PyUShortScalarObject getPointer(long i) {
        return new PyUShortScalarObject((Pointer)this).offsetAddress(i);
    }

        public native @ByRef PyObject ob_base(); public native PyUShortScalarObject ob_base(PyObject setter);
        public native @Cast("unsigned short") short obval(); public native PyUShortScalarObject obval(short setter);
}

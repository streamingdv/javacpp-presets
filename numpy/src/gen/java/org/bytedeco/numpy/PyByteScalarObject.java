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

// #endif


@Properties(inherit = org.bytedeco.numpy.presets.numpy.class)
public class PyByteScalarObject extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyByteScalarObject() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyByteScalarObject(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyByteScalarObject(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyByteScalarObject position(long position) {
        return (PyByteScalarObject)super.position(position);
    }
    @Override public PyByteScalarObject getPointer(long i) {
        return new PyByteScalarObject((Pointer)this).offsetAddress(i);
    }

        public native @ByRef PyObject ob_base(); public native PyByteScalarObject ob_base(PyObject setter);
        public native byte obval(); public native PyByteScalarObject obval(byte setter);
}

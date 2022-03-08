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


/* These must deal with unaligned and swapped data if necessary */
@Properties(inherit = org.bytedeco.numpy.presets.numpy.class)
public class PyArray_GetItemFunc extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    PyArray_GetItemFunc(Pointer p) { super(p); }
    protected PyArray_GetItemFunc() { allocate(); }
    private native void allocate();
    public native PyObject call(Pointer arg0, Pointer arg1);
}

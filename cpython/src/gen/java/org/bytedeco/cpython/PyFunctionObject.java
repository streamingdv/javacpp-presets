// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;

// #endif

/* Function objects and code objects should not be confused with each other:
 *
 * Function objects are created by the execution of the 'def' statement.
 * They reference a code object in their __code__ attribute, which is a
 * purely syntactic object, i.e. nothing more than a compiled version of some
 * source code lines.  There is one code object per source code "fragment",
 * but each code object can be referenced by zero or many function objects
 * depending only on how many times the 'def' statement in the source was
 * executed so far.
 */

@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class PyFunctionObject extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyFunctionObject() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyFunctionObject(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyFunctionObject(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyFunctionObject position(long position) {
        return (PyFunctionObject)super.position(position);
    }
    @Override public PyFunctionObject getPointer(long i) {
        return new PyFunctionObject((Pointer)this).position(position + i);
    }

    public native @ByRef PyObject ob_base(); public native PyFunctionObject ob_base(PyObject setter);
    public native PyObject func_code(); public native PyFunctionObject func_code(PyObject setter);        /* A code object, the __code__ attribute */
    public native PyObject func_globals(); public native PyFunctionObject func_globals(PyObject setter);     /* A dictionary (other mappings won't do) */
    public native PyObject func_defaults(); public native PyFunctionObject func_defaults(PyObject setter);    /* NULL or a tuple */
    public native PyObject func_kwdefaults(); public native PyFunctionObject func_kwdefaults(PyObject setter);  /* NULL or a dict */
    public native PyObject func_closure(); public native PyFunctionObject func_closure(PyObject setter);     /* NULL or a tuple of cell objects */
    public native PyObject func_doc(); public native PyFunctionObject func_doc(PyObject setter);         /* The __doc__ attribute, can be anything */
    public native PyObject func_name(); public native PyFunctionObject func_name(PyObject setter);        /* The __name__ attribute, a string object */
    public native PyObject func_dict(); public native PyFunctionObject func_dict(PyObject setter);        /* The __dict__ attribute, a dict or NULL */
    public native PyObject func_weakreflist(); public native PyFunctionObject func_weakreflist(PyObject setter); /* List of weak references */
    public native PyObject func_module(); public native PyFunctionObject func_module(PyObject setter);      /* The __module__ attribute, can be anything */
    public native PyObject func_annotations(); public native PyFunctionObject func_annotations(PyObject setter); /* Annotations, a dict or NULL */
    public native PyObject func_qualname(); public native PyFunctionObject func_qualname(PyObject setter);    /* The qualified name */
    public native vectorcallfunc vectorcall(); public native PyFunctionObject vectorcall(vectorcallfunc setter);

    /* Invariant:
     *     func_closure contains the bindings for func_code->co_freevars, so
     *     PyTuple_Size(func_closure) == PyCode_GetNumFree(func_code)
     *     (func_closure may be NULL if PyCode_GetNumFree(func_code) == 0).
     */
}

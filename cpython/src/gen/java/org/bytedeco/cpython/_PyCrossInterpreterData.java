// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;


// _PyCrossInterpreterData is similar to Py_buffer as an effectively
// opaque struct that holds data outside the object machinery.  This
// is necessary to pass safely between interpreters in the same process.
@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class _PyCrossInterpreterData extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public _PyCrossInterpreterData() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public _PyCrossInterpreterData(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public _PyCrossInterpreterData(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public _PyCrossInterpreterData position(long position) {
        return (_PyCrossInterpreterData)super.position(position);
    }
    @Override public _PyCrossInterpreterData getPointer(long i) {
        return new _PyCrossInterpreterData((Pointer)this).position(position + i);
    }

    // data is the cross-interpreter-safe derivation of a Python object
    // (see _PyObject_GetCrossInterpreterData).  It will be NULL if the
    // new_object func (below) encodes the data.
    public native Pointer data(); public native _PyCrossInterpreterData data(Pointer setter);
    // obj is the Python object from which the data was derived.  This
    // is non-NULL only if the data remains bound to the object in some
    // way, such that the object must be "released" (via a decref) when
    // the data is released.  In that case the code that sets the field,
    // likely a registered "crossinterpdatafunc", is responsible for
    // ensuring it owns the reference (i.e. incref).
    public native PyObject obj(); public native _PyCrossInterpreterData obj(PyObject setter);
    // interp is the ID of the owning interpreter of the original
    // object.  It corresponds to the active interpreter when
    // _PyObject_GetCrossInterpreterData() was called.  This should only
    // be set by the cross-interpreter machinery.
    //
    // We use the ID rather than the PyInterpreterState to avoid issues
    // with deleted interpreters.  Note that IDs are never re-used, so
    // each one will always correspond to a specific interpreter
    // (whether still alive or not).
    public native @Cast("int64_t") long interp(); public native _PyCrossInterpreterData interp(long setter);
    // new_object is a function that returns a new object in the current
    // interpreter given the data.  The resulting object (a new
    // reference) will be equivalent to the original object.  This field
    // is required.
    public static class New_object__xid extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    New_object__xid(Pointer p) { super(p); }
        protected New_object__xid() { allocate(); }
        private native void allocate();
        public native PyObject call(_xid arg0);
    }
    public native New_object__xid new_object(); public native _PyCrossInterpreterData new_object(New_object__xid setter);
    // free is called when the data is released.  If it is NULL then
    // nothing will be done to free the data.  For some types this is
    // okay (e.g. bytes) and for those types this field should be set
    // to NULL.  However, for most the data was allocated just for
    // cross-interpreter use, so it must be freed when
    // _PyCrossInterpreterData_Release is called or the memory will
    // leak.  In that case, at the very least this field should be set
    // to PyMem_RawFree (the default if not explicitly set to NULL).
    // The call will happen with the original interpreter activated.
    public static class Free_Pointer extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Free_Pointer(Pointer p) { super(p); }
        protected Free_Pointer() { allocate(); }
        private native void allocate();
        public native void call(Pointer arg0);
    }
    public native @Name("free") Free_Pointer _free(); public native _PyCrossInterpreterData _free(Free_Pointer setter);
}

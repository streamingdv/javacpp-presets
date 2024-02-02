// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.hdf5;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.hdf5.global.hdf5.*;


/**
 * A function for freeing objects. This function will be called with a pointer
 * to the object and a pointer to a pointer to the asynchronous request object.
 * The function should free the object and return non-negative to indicate that
 * the object can be removed from the ID type. If the function returns negative
 * (failure) then the object will remain in the ID type. For asynchronous
 * operations and handling the request parameter, see the HDF5 user guide and
 * VOL connector author guide.
 */
@Properties(inherit = org.bytedeco.hdf5.presets.hdf5.class)
public class H5I_free_t extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    H5I_free_t(Pointer p) { super(p); }
    protected H5I_free_t() { allocate(); }
    private native void allocate();
    public native @Cast("herr_t") int call(Pointer obj, @Cast("void**") PointerPointer request);
}

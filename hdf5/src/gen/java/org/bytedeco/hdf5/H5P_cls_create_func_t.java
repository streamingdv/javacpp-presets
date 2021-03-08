// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.hdf5;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.hdf5.global.hdf5.*;

// #endif

/*******************/
/* Public Typedefs */
/*******************/


/* Define property list class callback function pointer types */
@Properties(inherit = org.bytedeco.hdf5.presets.hdf5.class)
public class H5P_cls_create_func_t extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    H5P_cls_create_func_t(Pointer p) { super(p); }
    protected H5P_cls_create_func_t() { allocate(); }
    private native void allocate();
    public native @Cast("herr_t") int call(@Cast("hid_t") long prop_id, Pointer create_data);
}

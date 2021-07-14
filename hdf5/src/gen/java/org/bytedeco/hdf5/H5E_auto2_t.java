// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.hdf5;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.hdf5.global.hdf5.*;

/** <!-- [H5E_walk2_t_snip] -->
 <p>
 *  <!-- [H5E_auto2_t_snip] -->
/**
 * \brief Callback function for H5Eset_auto2()
 *
 * \estack_id{estack}
 * @param client_data [in] Pointer to client data in the format expected by the
 *                        user-defined function
 * @return \herr_t
 */
@Properties(inherit = org.bytedeco.hdf5.presets.hdf5.class)
public class H5E_auto2_t extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    H5E_auto2_t(Pointer p) { super(p); }
    protected H5E_auto2_t() { allocate(); }
    private native void allocate();
    public native @Cast("herr_t") int call(@Cast("hid_t") long estack, Pointer client_data);
}

// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.hdf5;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.hdf5.global.hdf5.*;

// #endif

/**
 * \brief This callback determines if a filter can be applied to the dataset
 *        with the characteristics provided
 *
 * \dcpl_id
 * \type_id
 * \space_id
 *
 * @return \htri_t
 *
 * \details Before a dataset gets created, the \ref H5Z_can_apply_func_t
 *          callbacks for any filters used in the dataset creation property list
 *          are called with the dataset's dataset creation property list, the
 *          dataset's datatype and a dataspace describing a chunk (for chunked
 *          dataset storage).
 *
 *          The \ref H5Z_can_apply_func_t callback must determine if the
 *          combination of the dataset creation property list setting, the
 *          datatype and the dataspace represent a valid combination to apply
 *          this filter to.  For example, some cases of invalid combinations may
 *          involve the filter not operating correctly on certain datatypes (or
 *          certain datatype sizes), or certain sizes of the chunk dataspace.
 *
 *          The \ref H5Z_can_apply_func_t callback can be the NULL pointer, in
 *          which case, the library will assume that it can apply to any
 *          combination of dataset creation property list values, datatypes and
 *          dataspaces.
 *
 *          The \ref H5Z_can_apply_func_t callback returns positive a valid
 *          combination, zero for an invalid combination and negative for an
 *          error.
 */
/** <!-- [H5Z_can_apply_func_t_snip] --> */
@Properties(inherit = org.bytedeco.hdf5.presets.hdf5.class)
public class H5Z_can_apply_func_t extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    H5Z_can_apply_func_t(Pointer p) { super(p); }
    protected H5Z_can_apply_func_t() { allocate(); }
    private native void allocate();
    public native @Cast("htri_t") int call(@Cast("hid_t") long dcpl_id, @Cast("hid_t") long type_id, @Cast("hid_t") long space_id);
}

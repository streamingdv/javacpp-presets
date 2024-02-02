// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.hdf5;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.hdf5.global.hdf5.*;

/** <!-- [H5Z_can_apply_func_t_snip] -->
<p>
/**
 * \brief The filter operation callback function, defining a filter's operation
 *        on data
 *
 * \dcpl_id
 * \type_id
 * \space_id
 *
 * @return \herr_t
 *
 * \details After the \ref H5Z_can_apply_func_t callbacks are checked for new
 *          datasets, the \ref H5Z_set_local_func_t callbacks for any filters
 *          used in the dataset creation property list are called. These
 *          callbacks receive the dataset's private copy of the dataset creation
 *          property list passed in to H5Dcreate() (i.e. not the actual property
 *          list passed in to H5Dcreate()) and the datatype ID passed in to
 *          H5Dcreate() (which is not copied and should not be modified) and a
 *          dataspace describing the chunk (for chunked dataset storage) (which
 *          should also not be modified).
 *
 *          The \ref H5Z_set_local_func_t callback must set any parameters that
 *          are specific to this dataset, based on the combination of the
 *          dataset creation property list values, the datatype and the
 *          dataspace. For example, some filters perform different actions based
 *          on different datatypes (or datatype sizes) or different number of
 *          dimensions or dataspace sizes.
 *
 *          The \ref H5Z_set_local_func_t callback can be the NULL pointer, in
 *          which case, the library will assume that there are no
 *          dataset-specific settings for this filter.
 *
 *          The \ref H5Z_set_local_func_t callback must return non-negative on
 *          success and negative for an error.
 */
/** <!-- [H5Z_set_local_func_t_snip] --> */
@Properties(inherit = org.bytedeco.hdf5.presets.hdf5.class)
public class H5Z_set_local_func_t extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    H5Z_set_local_func_t(Pointer p) { super(p); }
    protected H5Z_set_local_func_t() { allocate(); }
    private native void allocate();
    public native @Cast("herr_t") int call(@Cast("hid_t") long dcpl_id, @Cast("hid_t") long type_id, @Cast("hid_t") long space_id);
}

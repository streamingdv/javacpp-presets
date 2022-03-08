// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.dnnl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;

import static org.bytedeco.dnnl.global.dnnl.*;


/** \} dnnl_api_eltwise
 <p>
 *  \addtogroup dnnl_api_softmax
 *  \{
 <p>
 *  A descriptor of a Softmax operation. */
@Properties(inherit = org.bytedeco.dnnl.presets.dnnl.class)
public class dnnl_softmax_desc_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public dnnl_softmax_desc_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public dnnl_softmax_desc_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public dnnl_softmax_desc_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public dnnl_softmax_desc_t position(long position) {
        return (dnnl_softmax_desc_t)super.position(position);
    }
    @Override public dnnl_softmax_desc_t getPointer(long i) {
        return new dnnl_softmax_desc_t((Pointer)this).offsetAddress(i);
    }

    /** The kind of primitive. Used for self-identifying the primitive
     *  descriptor. Must be #dnnl_softmax. */
    public native @Cast("dnnl_primitive_kind_t") int primitive_kind(); public native dnnl_softmax_desc_t primitive_kind(int setter);
    /** The kind of propagation. Possible values: #dnnl_forward_training and
     *  #dnnl_forward_inference. */
    public native @Cast("dnnl_prop_kind_t") int prop_kind(); public native dnnl_softmax_desc_t prop_kind(int setter);
    /** Source and destination memory descriptor. */
    public native @ByRef dnnl_memory_desc_t data_desc(); public native dnnl_softmax_desc_t data_desc(dnnl_memory_desc_t setter);
    /** Source and Destination of gradient memory descriptor. */
    public native @ByRef dnnl_memory_desc_t diff_desc(); public native dnnl_softmax_desc_t diff_desc(dnnl_memory_desc_t setter);
    /** The axis along which to perform the softmax. */
    public native int softmax_axis(); public native dnnl_softmax_desc_t softmax_axis(int setter);
}

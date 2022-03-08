// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.dnnl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;

import static org.bytedeco.dnnl.global.dnnl.*;


/** \} dnnl_api_inner_product
 <p>
 *  \addtogroup dnnl_api_rnn RNN
 * 
 *  A primitive to compute recurrent neural network layers.
 * 
 *  @see \ref dev_guide_rnn in developer guide
 * 
 *  \{
 <p>
 *  Base class for primitive descriptors for RNN primitives. */
@Namespace("dnnl") @Properties(inherit = org.bytedeco.dnnl.presets.dnnl.class)
public class rnn_primitive_desc_base extends org.bytedeco.dnnl.primitive_desc {
    static { Loader.load(); }

    
        
            
                public rnn_primitive_desc_base() { super((Pointer)null); allocate(); }
                private native void allocate();
                public rnn_primitive_desc_base(@Const @ByRef rnn_primitive_desc_base arg0) { super((Pointer)null); allocate(arg0); }
                private native void allocate(@Const @ByRef rnn_primitive_desc_base arg0);
                
                ///
                public rnn_primitive_desc_base(dnnl_primitive_desc t, @Cast("bool") boolean weak/*=false*/) { super((Pointer)null); allocate(t, weak); }
                private native void allocate(dnnl_primitive_desc t, @Cast("bool") boolean weak/*=false*/);
                public rnn_primitive_desc_base(dnnl_primitive_desc t) { super((Pointer)null); allocate(t); }
                private native void allocate(dnnl_primitive_desc t);
    
        
        ///
        public rnn_primitive_desc_base(const_dnnl_op_desc_t desc, @Const primitive_attr attr,
                    @Const @ByRef engine aengine, @Const dnnl_primitive_desc hint_fwd_pd,
                    @Cast("bool") boolean allow_empty/*=false*/) { super((Pointer)null); allocate(desc, attr, aengine, hint_fwd_pd, allow_empty); }
        private native void allocate(const_dnnl_op_desc_t desc, @Const primitive_attr attr,
                    @Const @ByRef engine aengine, @Const dnnl_primitive_desc hint_fwd_pd,
                    @Cast("bool") boolean allow_empty/*=false*/);
        public rnn_primitive_desc_base(const_dnnl_op_desc_t desc, @Const primitive_attr attr,
                    @Const @ByRef engine aengine, @Const dnnl_primitive_desc hint_fwd_pd) { super((Pointer)null); allocate(desc, attr, aengine, hint_fwd_pd); }
        private native void allocate(const_dnnl_op_desc_t desc, @Const primitive_attr attr,
                    @Const @ByRef engine aengine, @Const dnnl_primitive_desc hint_fwd_pd);
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public rnn_primitive_desc_base(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public rnn_primitive_desc_base(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public rnn_primitive_desc_base position(long position) {
        return (rnn_primitive_desc_base)super.position(position);
    }
    @Override public rnn_primitive_desc_base getPointer(long i) {
        return new rnn_primitive_desc_base((Pointer)this).offsetAddress(i);
    }


    /** Default constructor. Produces an empty object. */

    /** Constructs an RNN primitive descriptor base from a C API primitive
     *  descriptor while checking that it actually describes the expected
     *  primitive by comparing propagation and primitive kinds.
     * 
     *  @param pd C API primitive descriptor.
     *  @param aprop_kind Expected propagation kind.
     *  @param cell_kind Expected cell kind. */
    public rnn_primitive_desc_base(dnnl_primitive_desc pd,
                prop_kind aprop_kind, algorithm cell_kind) { super((Pointer)null); allocate(pd, aprop_kind, cell_kind); }
    private native void allocate(dnnl_primitive_desc pd,
                prop_kind aprop_kind, algorithm cell_kind);
    public rnn_primitive_desc_base(dnnl_primitive_desc pd,
                @Cast("dnnl::prop_kind") int aprop_kind, @Cast("dnnl::algorithm") int cell_kind) { super((Pointer)null); allocate(pd, aprop_kind, cell_kind); }
    private native void allocate(dnnl_primitive_desc pd,
                @Cast("dnnl::prop_kind") int aprop_kind, @Cast("dnnl::algorithm") int cell_kind);

    /** Returns source layer memory descriptor.
     *  @return Source layer memory descriptor. */
    public native @ByVal memory.desc src_layer_desc();

    /** Returns source iteration memory descriptor.
     *  @return Source iteration memory descriptor.
     *  @return A zero memory descriptor if the primitive does not have a
     *           source iteration parameter. */
    public native @ByVal memory.desc src_iter_desc();

    /** Returns source recurrent cell state memory descriptor.
     *  @return Source recurrent cell state memory descriptor. */
    public native @ByVal memory.desc src_iter_c_desc();

    /** Returns weights layer memory descriptor.
     *  @return Weights layer memory descriptor. */
    public native @ByVal memory.desc weights_layer_desc();

    /** Returns weights iteration memory descriptor.
     *  @return Weights iteration memory descriptor. */
    public native @ByVal memory.desc weights_iter_desc();

    /** Returns weights peephole memory descriptor.
     *  @return Weights peephole memory descriptor. */
    public native @ByVal memory.desc weights_peephole_desc();

    /** Returns weights projection memory descriptor.
     *  @return Weights projection memory descriptor. */
    public native @ByVal memory.desc weights_projection_desc();

    /** Returns bias memory descriptor.
     *  @return Bias memory descriptor.
     *  @return A zero memory descriptor if the primitive does not have a
     *           bias parameter. */
    public native @ByVal memory.desc bias_desc();

    /** Returns destination layer memory descriptor.
     *  @return Destination layer memory descriptor. */
    public native @ByVal memory.desc dst_layer_desc();

    /** Returns destination iteration memory descriptor.
     *  @return Destination iteration memory descriptor.
     *  @return A zero memory descriptor if the primitive does not have a
     *           destination iteration parameter. */
    public native @ByVal memory.desc dst_iter_desc();

    /** Returns destination recurrent cell state memory descriptor.
     *  @return Destination recurrent cell state memory descriptor. */
    public native @ByVal memory.desc dst_iter_c_desc();

    /** Returns diff source layer memory descriptor.
     *  @return Diff source layer memory descriptor. */
    public native @ByVal memory.desc diff_src_layer_desc();

    /** Returns diff source iteration memory descriptor.
     *  @return Diff source iteration memory descriptor.
     *  @return A zero memory descriptor if the primitive does not have a
     *           diff source iteration parameter. */
    public native @ByVal memory.desc diff_src_iter_desc();

    /** Returns diff source recurrent cell state memory descriptor.
     *  @return Diff source recurrent cell state memory descriptor. */
    public native @ByVal memory.desc diff_src_iter_c_desc();

    /** Returns diff weights layer memory descriptor.
     *  @return Diff weights layer memory descriptor. */
    public native @ByVal memory.desc diff_weights_layer_desc();

    /** Returns diff weights iteration memory descriptor.
     *  @return Diff weights iteration memory descriptor. */
    public native @ByVal memory.desc diff_weights_iter_desc();

    /** Returns diff weights peephole memory descriptor.
     *  @return Diff weights peephole memory descriptor. */
    public native @ByVal memory.desc diff_weights_peephole_desc();

    /** Returns diff weights projection memory descriptor.
     *  @return Diff weights projection memory descriptor. */
    public native @ByVal memory.desc diff_weights_projection_desc();

    /** Returns diff bias memory descriptor.
     *  @return Diff bias memory descriptor.
     *  @return A zero memory descriptor if the primitive does not have a
     *           diff bias parameter. */
    public native @ByVal memory.desc diff_bias_desc();

    /** Returns diff destination layer memory descriptor.
     *  @return Diff destination layer memory descriptor. */
    public native @ByVal memory.desc diff_dst_layer_desc();

    /** Returns diff destination iteration memory descriptor.
     *  @return Diff destination iteration memory descriptor.
     *  @return A zero memory descriptor if the primitive does not have a
     *           diff destination iteration parameter. */
    public native @ByVal memory.desc diff_dst_iter_desc();

    /** Returns diff destination recurrent cell state memory descriptor.
     *  @return Diff destination recurrent cell state memory descriptor. */
    public native @ByVal memory.desc diff_dst_iter_c_desc();
}

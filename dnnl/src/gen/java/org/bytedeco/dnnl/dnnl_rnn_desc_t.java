// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.dnnl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;

import static org.bytedeco.dnnl.global.dnnl.*;


/** A descriptor for an RNN operation. */
@Properties(inherit = org.bytedeco.dnnl.presets.dnnl.class)
public class dnnl_rnn_desc_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public dnnl_rnn_desc_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public dnnl_rnn_desc_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public dnnl_rnn_desc_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public dnnl_rnn_desc_t position(long position) {
        return (dnnl_rnn_desc_t)super.position(position);
    }
    @Override public dnnl_rnn_desc_t getPointer(long i) {
        return new dnnl_rnn_desc_t((Pointer)this).offsetAddress(i);
    }

    /** The kind of primitive. Used for self-identifying the primitive
     *  descriptor. Must be #dnnl_rnn. */
    public native @Cast("dnnl_primitive_kind_t") int primitive_kind(); public native dnnl_rnn_desc_t primitive_kind(int setter);
    /** The kind of propagation. Possible values: #dnnl_forward_training,
     *  #dnnl_forward_inference, and #dnnl_backward. */
    public native @Cast("dnnl_prop_kind_t") int prop_kind(); public native dnnl_rnn_desc_t prop_kind(int setter);
    /** RNN cell kind. Must be one of #dnnl_vanilla_rnn,
     *  #dnnl_vanilla_lstm, #dnnl_vanilla_gru, or #dnnl_lbr_gru. */
    public native @Cast("dnnl_alg_kind_t") int cell_kind(); public native dnnl_rnn_desc_t cell_kind(int setter);
    /** The direction of RNN primitive execution. */
    public native @Cast("dnnl_rnn_direction_t") int direction(); public native dnnl_rnn_desc_t direction(int setter);
    /** Source layer memory descriptor. */
    public native @ByRef dnnl_memory_desc_t src_layer_desc(); public native dnnl_rnn_desc_t src_layer_desc(dnnl_memory_desc_t setter);
    /** Source iteration memory descriptor for hidden state. */
    public native @ByRef dnnl_memory_desc_t src_iter_desc(); public native dnnl_rnn_desc_t src_iter_desc(dnnl_memory_desc_t setter);
    /** Source iteration memory descriptor for cell state. */
    public native @ByRef dnnl_memory_desc_t src_iter_c_desc(); public native dnnl_rnn_desc_t src_iter_c_desc(dnnl_memory_desc_t setter);
    /** Weights layer memory descriptor. */
    public native @ByRef dnnl_memory_desc_t weights_layer_desc(); public native dnnl_rnn_desc_t weights_layer_desc(dnnl_memory_desc_t setter);
    /** Weights iteration memory descriptor. */
    public native @ByRef dnnl_memory_desc_t weights_iter_desc(); public native dnnl_rnn_desc_t weights_iter_desc(dnnl_memory_desc_t setter);
    /** Bias memory descriptor. */
    public native @ByRef dnnl_memory_desc_t bias_desc(); public native dnnl_rnn_desc_t bias_desc(dnnl_memory_desc_t setter);
    /** Destination layer memory descriptor. */
    public native @ByRef dnnl_memory_desc_t dst_layer_desc(); public native dnnl_rnn_desc_t dst_layer_desc(dnnl_memory_desc_t setter);
    /** Destination iter memory descriptor for hidden state. */
    public native @ByRef dnnl_memory_desc_t dst_iter_desc(); public native dnnl_rnn_desc_t dst_iter_desc(dnnl_memory_desc_t setter);
    /** Destination iter memory descriptor for cell state. */
    public native @ByRef dnnl_memory_desc_t dst_iter_c_desc(); public native dnnl_rnn_desc_t dst_iter_c_desc(dnnl_memory_desc_t setter);
    /** Weights peephole memory descriptor.
     *  This memory descriptor is equal to zero memory descriptor in case of
     *  non-peephole LSTMs and other non-LSTM RNNs. */
    public native @ByRef dnnl_memory_desc_t weights_peephole_desc(); public native dnnl_rnn_desc_t weights_peephole_desc(dnnl_memory_desc_t setter);
    /** Weights projection memory descriptor.
     *  This memory descriptor is equal to zero memory descriptor in case of
     *  non-projection LSTMs and other non-LSTM RNNs. */
    public native @ByRef dnnl_memory_desc_t weights_projection_desc(); public native dnnl_rnn_desc_t weights_projection_desc(dnnl_memory_desc_t setter);

    /** Source gradient layer memory descriptor. */
    public native @ByRef dnnl_memory_desc_t diff_src_layer_desc(); public native dnnl_rnn_desc_t diff_src_layer_desc(dnnl_memory_desc_t setter);
    /** Source gradient iter memory descriptor for hidden state. */
    public native @ByRef dnnl_memory_desc_t diff_src_iter_desc(); public native dnnl_rnn_desc_t diff_src_iter_desc(dnnl_memory_desc_t setter);
    /** Source gradient iter memory descriptor for cell state. */
    public native @ByRef dnnl_memory_desc_t diff_src_iter_c_desc(); public native dnnl_rnn_desc_t diff_src_iter_c_desc(dnnl_memory_desc_t setter);
    /** Weights gradient layer memory descriptor. */
    public native @ByRef dnnl_memory_desc_t diff_weights_layer_desc(); public native dnnl_rnn_desc_t diff_weights_layer_desc(dnnl_memory_desc_t setter);
    /** Weights gradient iter memory descriptor. */
    public native @ByRef dnnl_memory_desc_t diff_weights_iter_desc(); public native dnnl_rnn_desc_t diff_weights_iter_desc(dnnl_memory_desc_t setter);
    /** Bias gradient memory descriptor. */
    public native @ByRef dnnl_memory_desc_t diff_bias_desc(); public native dnnl_rnn_desc_t diff_bias_desc(dnnl_memory_desc_t setter);
    /** Destination gradient layer memory descriptor. */
    public native @ByRef dnnl_memory_desc_t diff_dst_layer_desc(); public native dnnl_rnn_desc_t diff_dst_layer_desc(dnnl_memory_desc_t setter);
    /** Destination gradient iteration memory descriptor for hidden state. */
    public native @ByRef dnnl_memory_desc_t diff_dst_iter_desc(); public native dnnl_rnn_desc_t diff_dst_iter_desc(dnnl_memory_desc_t setter);
    /** Destination gradient iteration memory descriptor for cell state. */
    public native @ByRef dnnl_memory_desc_t diff_dst_iter_c_desc(); public native dnnl_rnn_desc_t diff_dst_iter_c_desc(dnnl_memory_desc_t setter);
    /** Weights gradient peephole memory descriptor.
     *  This memory descriptor is equal to zero memory descriptor in case of
     *  non-peephole LSTMs and other non-LSTM RNNs. */
    public native @ByRef dnnl_memory_desc_t diff_weights_peephole_desc(); public native dnnl_rnn_desc_t diff_weights_peephole_desc(dnnl_memory_desc_t setter);
    /** Weights gradient projection memory descriptor.
     *  This memory descriptor is equal to zero memory descriptor in case of
     *  non-projection LSTMs and other non-LSTM RNNs. */
    public native @ByRef dnnl_memory_desc_t diff_weights_projection_desc(); public native dnnl_rnn_desc_t diff_weights_projection_desc(dnnl_memory_desc_t setter);

    /** RNN cell flags */
    public native @Cast("unsigned int") int flags(); public native dnnl_rnn_desc_t flags(int setter);
    /** Activation function used for vanilla_rnn cell kind.
     *  Must be either #dnnl_eltwise_relu or #dnnl_eltwise_tanh. */
    public native @Cast("dnnl_alg_kind_t") int activation_kind(); public native dnnl_rnn_desc_t activation_kind(int setter);
    public native float alpha(); public native dnnl_rnn_desc_t alpha(float setter);
    public native float beta(); public native dnnl_rnn_desc_t beta(float setter);

}

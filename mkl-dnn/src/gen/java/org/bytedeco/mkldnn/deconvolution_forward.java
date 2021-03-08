// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.mkldnn;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.mkldnn.global.mklml.*;

import static org.bytedeco.mkldnn.global.mkldnn.*;


/** \} */
//
/** \addtogroup cpp_api_deconvolution Deconvolution
/** A primitive to compute deconvolution using different algorithms.
/**
/** @see \ref c_api_deconvolution in \ref c_api
/** \{ */

@Namespace("mkldnn") @Properties(inherit = org.bytedeco.mkldnn.presets.mkldnn.class)
public class deconvolution_forward extends primitive {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public deconvolution_forward(Pointer p) { super(p); }

    @NoOffset public static class desc extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public desc(Pointer p) { super(p); }
    
        public native @ByRef @Cast("mkldnn_deconvolution_desc_t*") mkldnn_convolution_desc_t data(); public native desc data(mkldnn_convolution_desc_t setter);
        public desc(@Cast("mkldnn::prop_kind") int aprop_kind, @Cast("mkldnn::algorithm") int aalgorithm,
                        @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc bias_desc,
                        @Const @ByRef memory.desc dst_desc,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntPointer strides,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntPointer padding_l,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntPointer padding_r,
                        @Cast("const mkldnn::padding_kind") int apadding_kind) { super((Pointer)null); allocate(aprop_kind, aalgorithm, src_desc, weights_desc, bias_desc, dst_desc, strides, padding_l, padding_r, apadding_kind); }
        private native void allocate(@Cast("mkldnn::prop_kind") int aprop_kind, @Cast("mkldnn::algorithm") int aalgorithm,
                        @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc bias_desc,
                        @Const @ByRef memory.desc dst_desc,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntPointer strides,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntPointer padding_l,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntPointer padding_r,
                        @Cast("const mkldnn::padding_kind") int apadding_kind);
        public desc(@Cast("mkldnn::prop_kind") int aprop_kind, @Cast("mkldnn::algorithm") int aalgorithm,
                        @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc bias_desc,
                        @Const @ByRef memory.desc dst_desc,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntBuffer strides,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntBuffer padding_l,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntBuffer padding_r,
                        @Cast("const mkldnn::padding_kind") int apadding_kind) { super((Pointer)null); allocate(aprop_kind, aalgorithm, src_desc, weights_desc, bias_desc, dst_desc, strides, padding_l, padding_r, apadding_kind); }
        private native void allocate(@Cast("mkldnn::prop_kind") int aprop_kind, @Cast("mkldnn::algorithm") int aalgorithm,
                        @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc bias_desc,
                        @Const @ByRef memory.desc dst_desc,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntBuffer strides,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntBuffer padding_l,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntBuffer padding_r,
                        @Cast("const mkldnn::padding_kind") int apadding_kind);
        public desc(@Cast("mkldnn::prop_kind") int aprop_kind, @Cast("mkldnn::algorithm") int aalgorithm,
                        @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc bias_desc,
                        @Const @ByRef memory.desc dst_desc,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal int[] strides,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal int[] padding_l,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal int[] padding_r,
                        @Cast("const mkldnn::padding_kind") int apadding_kind) { super((Pointer)null); allocate(aprop_kind, aalgorithm, src_desc, weights_desc, bias_desc, dst_desc, strides, padding_l, padding_r, apadding_kind); }
        private native void allocate(@Cast("mkldnn::prop_kind") int aprop_kind, @Cast("mkldnn::algorithm") int aalgorithm,
                        @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc bias_desc,
                        @Const @ByRef memory.desc dst_desc,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal int[] strides,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal int[] padding_l,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal int[] padding_r,
                        @Cast("const mkldnn::padding_kind") int apadding_kind);
        public desc(@Cast("mkldnn::prop_kind") int aprop_kind, @Cast("mkldnn::algorithm") int aalgorithm,
                        @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc dst_desc,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntPointer strides,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntPointer padding_l,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntPointer padding_r,
                        @Cast("const mkldnn::padding_kind") int apadding_kind) { super((Pointer)null); allocate(aprop_kind, aalgorithm, src_desc, weights_desc, dst_desc, strides, padding_l, padding_r, apadding_kind); }
        private native void allocate(@Cast("mkldnn::prop_kind") int aprop_kind, @Cast("mkldnn::algorithm") int aalgorithm,
                        @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc dst_desc,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntPointer strides,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntPointer padding_l,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntPointer padding_r,
                        @Cast("const mkldnn::padding_kind") int apadding_kind);
        public desc(@Cast("mkldnn::prop_kind") int aprop_kind, @Cast("mkldnn::algorithm") int aalgorithm,
                        @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc dst_desc,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntBuffer strides,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntBuffer padding_l,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntBuffer padding_r,
                        @Cast("const mkldnn::padding_kind") int apadding_kind) { super((Pointer)null); allocate(aprop_kind, aalgorithm, src_desc, weights_desc, dst_desc, strides, padding_l, padding_r, apadding_kind); }
        private native void allocate(@Cast("mkldnn::prop_kind") int aprop_kind, @Cast("mkldnn::algorithm") int aalgorithm,
                        @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc dst_desc,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntBuffer strides,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntBuffer padding_l,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntBuffer padding_r,
                        @Cast("const mkldnn::padding_kind") int apadding_kind);
        public desc(@Cast("mkldnn::prop_kind") int aprop_kind, @Cast("mkldnn::algorithm") int aalgorithm,
                        @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc dst_desc,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal int[] strides,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal int[] padding_l,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal int[] padding_r,
                        @Cast("const mkldnn::padding_kind") int apadding_kind) { super((Pointer)null); allocate(aprop_kind, aalgorithm, src_desc, weights_desc, dst_desc, strides, padding_l, padding_r, apadding_kind); }
        private native void allocate(@Cast("mkldnn::prop_kind") int aprop_kind, @Cast("mkldnn::algorithm") int aalgorithm,
                        @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc dst_desc,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal int[] strides,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal int[] padding_l,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal int[] padding_r,
                        @Cast("const mkldnn::padding_kind") int apadding_kind);
        public desc(@Cast("mkldnn::prop_kind") int aprop_kind, @Cast("mkldnn::algorithm") int aalgorithm,
                        @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc bias_desc,
                        @Const @ByRef memory.desc dst_desc,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntPointer strides,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntPointer dilates,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntPointer padding_l,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntPointer padding_r,
                        @Cast("const mkldnn::padding_kind") int apadding_kind) { super((Pointer)null); allocate(aprop_kind, aalgorithm, src_desc, weights_desc, bias_desc, dst_desc, strides, dilates, padding_l, padding_r, apadding_kind); }
        private native void allocate(@Cast("mkldnn::prop_kind") int aprop_kind, @Cast("mkldnn::algorithm") int aalgorithm,
                        @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc bias_desc,
                        @Const @ByRef memory.desc dst_desc,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntPointer strides,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntPointer dilates,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntPointer padding_l,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntPointer padding_r,
                        @Cast("const mkldnn::padding_kind") int apadding_kind);
        public desc(@Cast("mkldnn::prop_kind") int aprop_kind, @Cast("mkldnn::algorithm") int aalgorithm,
                        @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc bias_desc,
                        @Const @ByRef memory.desc dst_desc,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntBuffer strides,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntBuffer dilates,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntBuffer padding_l,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntBuffer padding_r,
                        @Cast("const mkldnn::padding_kind") int apadding_kind) { super((Pointer)null); allocate(aprop_kind, aalgorithm, src_desc, weights_desc, bias_desc, dst_desc, strides, dilates, padding_l, padding_r, apadding_kind); }
        private native void allocate(@Cast("mkldnn::prop_kind") int aprop_kind, @Cast("mkldnn::algorithm") int aalgorithm,
                        @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc bias_desc,
                        @Const @ByRef memory.desc dst_desc,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntBuffer strides,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntBuffer dilates,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntBuffer padding_l,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntBuffer padding_r,
                        @Cast("const mkldnn::padding_kind") int apadding_kind);
        public desc(@Cast("mkldnn::prop_kind") int aprop_kind, @Cast("mkldnn::algorithm") int aalgorithm,
                        @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc bias_desc,
                        @Const @ByRef memory.desc dst_desc,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal int[] strides,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal int[] dilates,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal int[] padding_l,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal int[] padding_r,
                        @Cast("const mkldnn::padding_kind") int apadding_kind) { super((Pointer)null); allocate(aprop_kind, aalgorithm, src_desc, weights_desc, bias_desc, dst_desc, strides, dilates, padding_l, padding_r, apadding_kind); }
        private native void allocate(@Cast("mkldnn::prop_kind") int aprop_kind, @Cast("mkldnn::algorithm") int aalgorithm,
                        @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc bias_desc,
                        @Const @ByRef memory.desc dst_desc,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal int[] strides,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal int[] dilates,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal int[] padding_l,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal int[] padding_r,
                        @Cast("const mkldnn::padding_kind") int apadding_kind);
        public desc(@Cast("mkldnn::prop_kind") int aprop_kind, @Cast("mkldnn::algorithm") int aalgorithm,
                        @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc dst_desc,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntPointer strides,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntPointer dilates,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntPointer padding_l,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntPointer padding_r,
                        @Cast("const mkldnn::padding_kind") int apadding_kind) { super((Pointer)null); allocate(aprop_kind, aalgorithm, src_desc, weights_desc, dst_desc, strides, dilates, padding_l, padding_r, apadding_kind); }
        private native void allocate(@Cast("mkldnn::prop_kind") int aprop_kind, @Cast("mkldnn::algorithm") int aalgorithm,
                        @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc dst_desc,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntPointer strides,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntPointer dilates,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntPointer padding_l,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntPointer padding_r,
                        @Cast("const mkldnn::padding_kind") int apadding_kind);
        public desc(@Cast("mkldnn::prop_kind") int aprop_kind, @Cast("mkldnn::algorithm") int aalgorithm,
                        @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc dst_desc,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntBuffer strides,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntBuffer dilates,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntBuffer padding_l,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntBuffer padding_r,
                        @Cast("const mkldnn::padding_kind") int apadding_kind) { super((Pointer)null); allocate(aprop_kind, aalgorithm, src_desc, weights_desc, dst_desc, strides, dilates, padding_l, padding_r, apadding_kind); }
        private native void allocate(@Cast("mkldnn::prop_kind") int aprop_kind, @Cast("mkldnn::algorithm") int aalgorithm,
                        @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc dst_desc,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntBuffer strides,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntBuffer dilates,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntBuffer padding_l,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntBuffer padding_r,
                        @Cast("const mkldnn::padding_kind") int apadding_kind);
        public desc(@Cast("mkldnn::prop_kind") int aprop_kind, @Cast("mkldnn::algorithm") int aalgorithm,
                        @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc dst_desc,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal int[] strides,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal int[] dilates,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal int[] padding_l,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal int[] padding_r,
                        @Cast("const mkldnn::padding_kind") int apadding_kind) { super((Pointer)null); allocate(aprop_kind, aalgorithm, src_desc, weights_desc, dst_desc, strides, dilates, padding_l, padding_r, apadding_kind); }
        private native void allocate(@Cast("mkldnn::prop_kind") int aprop_kind, @Cast("mkldnn::algorithm") int aalgorithm,
                        @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc dst_desc,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal int[] strides,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal int[] dilates,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal int[] padding_l,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal int[] padding_r,
                        @Cast("const mkldnn::padding_kind") int apadding_kind);
    }

    public static class primitive_desc extends org.bytedeco.mkldnn.primitive_desc {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public primitive_desc(Pointer p) { super(p); }
    
        public primitive_desc(@Const @ByRef desc desc, @Const @ByRef engine e) { super((Pointer)null); allocate(desc, e); }
        private native void allocate(@Const @ByRef desc desc, @Const @ByRef engine e);

        public primitive_desc(@Const @ByRef desc desc, @Const @ByRef primitive_attr attr, @Const @ByRef engine e) { super((Pointer)null); allocate(desc, attr, e); }
        private native void allocate(@Const @ByRef desc desc, @Const @ByRef primitive_attr attr, @Const @ByRef engine e);

        public native @ByVal memory.primitive_desc src_primitive_desc();
        public native @ByVal memory.primitive_desc weights_primitive_desc();
        public native @ByVal memory.primitive_desc bias_primitive_desc();
        public native @ByVal memory.primitive_desc dst_primitive_desc();
    }

    public deconvolution_forward(@Const @ByRef primitive_desc aprimitive_desc,
                @Const @ByRef primitive.at src, @Const @ByRef primitive.at weights,
                @Const @ByRef primitive.at bias, @Const @ByRef memory dst) { super((Pointer)null); allocate(aprimitive_desc, src, weights, bias, dst); }
    private native void allocate(@Const @ByRef primitive_desc aprimitive_desc,
                @Const @ByRef primitive.at src, @Const @ByRef primitive.at weights,
                @Const @ByRef primitive.at bias, @Const @ByRef memory dst);

    public deconvolution_forward(@Const @ByRef primitive_desc aprimitive_desc,
                @Const @ByRef primitive.at src, @Const @ByRef primitive.at weights,
                @Const @ByRef memory dst) { super((Pointer)null); allocate(aprimitive_desc, src, weights, dst); }
    private native void allocate(@Const @ByRef primitive_desc aprimitive_desc,
                @Const @ByRef primitive.at src, @Const @ByRef primitive.at weights,
                @Const @ByRef memory dst);
}

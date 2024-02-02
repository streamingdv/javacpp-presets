// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.dnnl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;

import static org.bytedeco.dnnl.global.dnnl.*;


/** Layer normalization backward propagation primitive. */
@Namespace("dnnl") @Properties(inherit = org.bytedeco.dnnl.presets.dnnl.class)
public class layer_normalization_backward extends primitive {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public layer_normalization_backward(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public layer_normalization_backward(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public layer_normalization_backward position(long position) {
        return (layer_normalization_backward)super.position(position);
    }
    @Override public layer_normalization_backward getPointer(long i) {
        return new layer_normalization_backward((Pointer)this).offsetAddress(i);
    }

    /** Primitive descriptor for a layer normalization backward propagation
     *  primitive. */
    public static class primitive_desc extends org.bytedeco.dnnl.primitive_desc {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public primitive_desc(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public primitive_desc(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public primitive_desc position(long position) {
            return (primitive_desc)super.position(position);
        }
        @Override public primitive_desc getPointer(long i) {
            return new primitive_desc((Pointer)this).offsetAddress(i);
        }
    
        /** Default constructor. Produces an empty object. */
        
        ///
        public primitive_desc() { super((Pointer)null); allocate(); }
        private native void allocate();

        /** Constructs a primitive descriptor for a layer normalization backward
         *  propagation primitive.
         * 
         *  @param aengine Engine to use.
         *  @param aprop_kind Propagation kind. Possible values are
         *      #dnnl::prop_kind::backward_data and #dnnl::prop_kind::backward
         *      (diffs for all parameters are computed in this case).
         *  @param diff_src_desc Diff source memory descriptor.
         *  @param diff_dst_desc Diff destination memory descriptor.
         *  @param src_desc Source memory descriptor.
         *  @param stat_desc Statistics memory descriptors.
         *  @param epsilon Layer normalization epsilon parameter.
         *  @param flags Layer normalization flags (\ref
         *      dnnl::normalization_flags).
         *  @param attr Primitive attributes to use. Attributes are optional
         *      and default to empty attributes.
         *  @param hint_fwd_pd Primitive descriptor for a layer normalization
         *      forward propagation primitive. It is used as a hint for
         *      deciding which memory format to use.
         *  @param allow_empty A flag signifying whether construction is
         *      allowed to fail without throwing an exception. In this case an
         *      empty object will be produced. This flag is optional and
         *      defaults to false. */
        
        ///
        public primitive_desc(@Const @ByRef engine aengine, prop_kind aprop_kind,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_src_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_dst_desc, @Const @ByRef org.bytedeco.dnnl.memory.desc src_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc stat_desc, float epsilon,
                        normalization_flags flags,
                        @Const @ByRef layer_normalization_forward.primitive_desc hint_fwd_pd,
                        @Const @ByRef(nullValue = "dnnl::primitive_attr()") primitive_attr attr,
                        @Cast("bool") boolean allow_empty/*=false*/) { super((Pointer)null); allocate(aengine, aprop_kind, diff_src_desc, diff_dst_desc, src_desc, stat_desc, epsilon, flags, hint_fwd_pd, attr, allow_empty); }
        private native void allocate(@Const @ByRef engine aengine, prop_kind aprop_kind,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_src_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_dst_desc, @Const @ByRef org.bytedeco.dnnl.memory.desc src_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc stat_desc, float epsilon,
                        normalization_flags flags,
                        @Const @ByRef layer_normalization_forward.primitive_desc hint_fwd_pd,
                        @Const @ByRef(nullValue = "dnnl::primitive_attr()") primitive_attr attr,
                        @Cast("bool") boolean allow_empty/*=false*/);
        public primitive_desc(@Const @ByRef engine aengine, prop_kind aprop_kind,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_src_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_dst_desc, @Const @ByRef org.bytedeco.dnnl.memory.desc src_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc stat_desc, float epsilon,
                        normalization_flags flags,
                        @Const @ByRef layer_normalization_forward.primitive_desc hint_fwd_pd) { super((Pointer)null); allocate(aengine, aprop_kind, diff_src_desc, diff_dst_desc, src_desc, stat_desc, epsilon, flags, hint_fwd_pd); }
        private native void allocate(@Const @ByRef engine aengine, prop_kind aprop_kind,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_src_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_dst_desc, @Const @ByRef org.bytedeco.dnnl.memory.desc src_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc stat_desc, float epsilon,
                        normalization_flags flags,
                        @Const @ByRef layer_normalization_forward.primitive_desc hint_fwd_pd);
        public primitive_desc(@Const @ByRef engine aengine, @Cast("dnnl::prop_kind") int aprop_kind,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_src_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_dst_desc, @Const @ByRef org.bytedeco.dnnl.memory.desc src_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc stat_desc, float epsilon,
                        @Cast("dnnl::normalization_flags") int flags,
                        @Const @ByRef layer_normalization_forward.primitive_desc hint_fwd_pd,
                        @Const @ByRef(nullValue = "dnnl::primitive_attr()") primitive_attr attr,
                        @Cast("bool") boolean allow_empty/*=false*/) { super((Pointer)null); allocate(aengine, aprop_kind, diff_src_desc, diff_dst_desc, src_desc, stat_desc, epsilon, flags, hint_fwd_pd, attr, allow_empty); }
        private native void allocate(@Const @ByRef engine aengine, @Cast("dnnl::prop_kind") int aprop_kind,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_src_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_dst_desc, @Const @ByRef org.bytedeco.dnnl.memory.desc src_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc stat_desc, float epsilon,
                        @Cast("dnnl::normalization_flags") int flags,
                        @Const @ByRef layer_normalization_forward.primitive_desc hint_fwd_pd,
                        @Const @ByRef(nullValue = "dnnl::primitive_attr()") primitive_attr attr,
                        @Cast("bool") boolean allow_empty/*=false*/);
        public primitive_desc(@Const @ByRef engine aengine, @Cast("dnnl::prop_kind") int aprop_kind,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_src_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_dst_desc, @Const @ByRef org.bytedeco.dnnl.memory.desc src_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc stat_desc, float epsilon,
                        @Cast("dnnl::normalization_flags") int flags,
                        @Const @ByRef layer_normalization_forward.primitive_desc hint_fwd_pd) { super((Pointer)null); allocate(aengine, aprop_kind, diff_src_desc, diff_dst_desc, src_desc, stat_desc, epsilon, flags, hint_fwd_pd); }
        private native void allocate(@Const @ByRef engine aengine, @Cast("dnnl::prop_kind") int aprop_kind,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_src_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_dst_desc, @Const @ByRef org.bytedeco.dnnl.memory.desc src_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc stat_desc, float epsilon,
                        @Cast("dnnl::normalization_flags") int flags,
                        @Const @ByRef layer_normalization_forward.primitive_desc hint_fwd_pd);

        /** Constructs a primitive descriptor for a layer normalization backward
         *  propagation primitive.
         * 
         *  @param aengine Engine to use.
         *  @param aprop_kind Propagation kind. Possible values are
         *      #dnnl::prop_kind::backward_data and #dnnl::prop_kind::backward
         *      (diffs for all parameters are computed in this case).
         *  @param diff_src_desc Diff source memory descriptor.
         *  @param diff_dst_desc Diff destination memory descriptor.
         *  @param src_desc Source memory descriptor.
         *  @param epsilon Layer normalization epsilon parameter.
         *  @param flags Layer normalization flags (\ref
         *      dnnl::normalization_flags).
         *  @param attr Primitive attributes to use. Attributes are optional
         *      and default to empty attributes.
         *  @param hint_fwd_pd Primitive descriptor for a layer normalization
         *      forward propagation primitive. It is used as a hint for
         *      deciding which memory format to use.
         *  @param allow_empty A flag signifying whether construction is
         *      allowed to fail without throwing an exception. In this case an
         *      empty object will be produced. This flag is optional and
         *      defaults to false. */
        
        ///
        public primitive_desc(@Const @ByRef engine aengine, prop_kind aprop_kind,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_src_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_dst_desc, @Const @ByRef org.bytedeco.dnnl.memory.desc src_desc,
                        float epsilon, normalization_flags flags,
                        @Const @ByRef layer_normalization_forward.primitive_desc hint_fwd_pd,
                        @Const @ByRef(nullValue = "dnnl::primitive_attr()") primitive_attr attr,
                        @Cast("bool") boolean allow_empty/*=false*/) { super((Pointer)null); allocate(aengine, aprop_kind, diff_src_desc, diff_dst_desc, src_desc, epsilon, flags, hint_fwd_pd, attr, allow_empty); }
        private native void allocate(@Const @ByRef engine aengine, prop_kind aprop_kind,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_src_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_dst_desc, @Const @ByRef org.bytedeco.dnnl.memory.desc src_desc,
                        float epsilon, normalization_flags flags,
                        @Const @ByRef layer_normalization_forward.primitive_desc hint_fwd_pd,
                        @Const @ByRef(nullValue = "dnnl::primitive_attr()") primitive_attr attr,
                        @Cast("bool") boolean allow_empty/*=false*/);
        public primitive_desc(@Const @ByRef engine aengine, prop_kind aprop_kind,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_src_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_dst_desc, @Const @ByRef org.bytedeco.dnnl.memory.desc src_desc,
                        float epsilon, normalization_flags flags,
                        @Const @ByRef layer_normalization_forward.primitive_desc hint_fwd_pd) { super((Pointer)null); allocate(aengine, aprop_kind, diff_src_desc, diff_dst_desc, src_desc, epsilon, flags, hint_fwd_pd); }
        private native void allocate(@Const @ByRef engine aengine, prop_kind aprop_kind,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_src_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_dst_desc, @Const @ByRef org.bytedeco.dnnl.memory.desc src_desc,
                        float epsilon, normalization_flags flags,
                        @Const @ByRef layer_normalization_forward.primitive_desc hint_fwd_pd);
        public primitive_desc(@Const @ByRef engine aengine, @Cast("dnnl::prop_kind") int aprop_kind,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_src_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_dst_desc, @Const @ByRef org.bytedeco.dnnl.memory.desc src_desc,
                        float epsilon, @Cast("dnnl::normalization_flags") int flags,
                        @Const @ByRef layer_normalization_forward.primitive_desc hint_fwd_pd,
                        @Const @ByRef(nullValue = "dnnl::primitive_attr()") primitive_attr attr,
                        @Cast("bool") boolean allow_empty/*=false*/) { super((Pointer)null); allocate(aengine, aprop_kind, diff_src_desc, diff_dst_desc, src_desc, epsilon, flags, hint_fwd_pd, attr, allow_empty); }
        private native void allocate(@Const @ByRef engine aengine, @Cast("dnnl::prop_kind") int aprop_kind,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_src_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_dst_desc, @Const @ByRef org.bytedeco.dnnl.memory.desc src_desc,
                        float epsilon, @Cast("dnnl::normalization_flags") int flags,
                        @Const @ByRef layer_normalization_forward.primitive_desc hint_fwd_pd,
                        @Const @ByRef(nullValue = "dnnl::primitive_attr()") primitive_attr attr,
                        @Cast("bool") boolean allow_empty/*=false*/);
        public primitive_desc(@Const @ByRef engine aengine, @Cast("dnnl::prop_kind") int aprop_kind,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_src_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_dst_desc, @Const @ByRef org.bytedeco.dnnl.memory.desc src_desc,
                        float epsilon, @Cast("dnnl::normalization_flags") int flags,
                        @Const @ByRef layer_normalization_forward.primitive_desc hint_fwd_pd) { super((Pointer)null); allocate(aengine, aprop_kind, diff_src_desc, diff_dst_desc, src_desc, epsilon, flags, hint_fwd_pd); }
        private native void allocate(@Const @ByRef engine aengine, @Cast("dnnl::prop_kind") int aprop_kind,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_src_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_dst_desc, @Const @ByRef org.bytedeco.dnnl.memory.desc src_desc,
                        float epsilon, @Cast("dnnl::normalization_flags") int flags,
                        @Const @ByRef layer_normalization_forward.primitive_desc hint_fwd_pd);

        /** Constructs a primitive descriptor for a layer normalization
         *  backward propagation primitive from a C API primitive descriptor
         *  that must have a matching kind.
         * 
         *  @param pd C API primitive descriptor for a layer normalization
         *      backward propagation primitive. */
        public primitive_desc(dnnl_primitive_desc pd) { super((Pointer)null); allocate(pd); }
        private native void allocate(dnnl_primitive_desc pd);

        /** \copydoc dnnl::primitive_desc_base::src_desc()const */
        public native @ByVal org.bytedeco.dnnl.memory.desc src_desc();

        /** \copydoc dnnl::primitive_desc_base::weights_desc()const */
        public native @ByVal org.bytedeco.dnnl.memory.desc weights_desc();

        /** \copydoc dnnl::primitive_desc_base::dst_desc()const */
        public native @ByVal org.bytedeco.dnnl.memory.desc dst_desc();

        /** \copydoc dnnl::primitive_desc_base::diff_src_desc()const */
        public native @ByVal org.bytedeco.dnnl.memory.desc diff_src_desc();

        /** \copydoc dnnl::primitive_desc_base::diff_dst_desc()const */
        public native @ByVal org.bytedeco.dnnl.memory.desc diff_dst_desc();

        /** \copydoc dnnl::primitive_desc_base::diff_weights_desc()const */
        public native @ByVal org.bytedeco.dnnl.memory.desc diff_weights_desc();

        /** \copydoc dnnl::batch_normalization_forward::primitive_desc::mean_desc()const */
        public native @ByVal org.bytedeco.dnnl.memory.desc mean_desc();

        /** \copydoc dnnl::batch_normalization_forward::primitive_desc::variance_desc()const */
        public native @ByVal org.bytedeco.dnnl.memory.desc variance_desc();

        /** \copydoc dnnl::primitive_desc_base::workspace_desc()const */
        public native @ByVal org.bytedeco.dnnl.memory.desc workspace_desc();

        /** \copydoc dnnl::primitive_desc_base::get_prop_kind()const */
        public native prop_kind get_prop_kind();

        /** \copydoc dnnl::primitive_desc_base::get_epsilon()const */
        public native float get_epsilon();

        /** Returns normalization flags.
         *  @return Normalization flags. */
        public native normalization_flags get_flags();
    }

    /** Default constructor. Produces an empty object. */
    public layer_normalization_backward() { super((Pointer)null); allocate(); }
    private native void allocate();

    /** Constructs a layer normalization backward propagation primitive.
     *  @param pd Primitive descriptor for a layer normalization backward
     *      propagation primitive. */
    public layer_normalization_backward(@Const @ByRef primitive_desc pd) { super((Pointer)null); allocate(pd); }
    private native void allocate(@Const @ByRef primitive_desc pd);

    /** Constructs a layer normalization backward propagation primitive from
     *      a cache blob.
     *  @param pd Primitive descriptor for a layer normalization backward
     *      propagation primitive.
     *  @param cache_blob Cache blob. */
    public layer_normalization_backward(
                @Const @ByRef primitive_desc pd, @Cast("uint8_t*") @StdVector BytePointer cache_blob) { super((Pointer)null); allocate(pd, cache_blob); }
    private native void allocate(
                @Const @ByRef primitive_desc pd, @Cast("uint8_t*") @StdVector BytePointer cache_blob);
    public layer_normalization_backward(
                @Const @ByRef primitive_desc pd, @Cast("uint8_t*") @StdVector ByteBuffer cache_blob) { super((Pointer)null); allocate(pd, cache_blob); }
    private native void allocate(
                @Const @ByRef primitive_desc pd, @Cast("uint8_t*") @StdVector ByteBuffer cache_blob);
    public layer_normalization_backward(
                @Const @ByRef primitive_desc pd, @Cast("uint8_t*") @StdVector byte[] cache_blob) { super((Pointer)null); allocate(pd, cache_blob); }
    private native void allocate(
                @Const @ByRef primitive_desc pd, @Cast("uint8_t*") @StdVector byte[] cache_blob);
}

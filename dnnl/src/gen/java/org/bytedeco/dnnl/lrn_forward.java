// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.dnnl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;

import static org.bytedeco.dnnl.global.dnnl.*;


/** \} dnnl_api_deconvolution
 <p>
 *  \addtogroup dnnl_api_lrn LRN
 * 
 *  A primitive to perform local response normalization (LRN) across or within
 *  channels.
 * 
 *  @see \ref dev_guide_lrn in developer guide
 * 
 *  \{
 <p>
 *  Local response normalization (LRN) forward propagation primitive. */
@Namespace("dnnl") @Properties(inherit = org.bytedeco.dnnl.presets.dnnl.class)
public class lrn_forward extends primitive {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public lrn_forward(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public lrn_forward(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public lrn_forward position(long position) {
        return (lrn_forward)super.position(position);
    }
    @Override public lrn_forward getPointer(long i) {
        return new lrn_forward((Pointer)this).offsetAddress(i);
    }

    /** Descriptor for an LRN forward propagation primitive. */
    @NoOffset public static class desc extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public desc(Pointer p) { super(p); }
    
        
        ///
        public native @ByRef dnnl_lrn_desc_t data(); public native desc data(dnnl_lrn_desc_t setter);

        /** Constructs a descriptor for a LRN forward propagation primitive.
         * 
         *  @param aprop_kind Propagation kind. Possible values are
         *      #dnnl::prop_kind::forward_training, and
         *      #dnnl::prop_kind::forward_inference.
         *  @param aalgorithm LRN algorithm kind: either
         *      #dnnl::algorithm::lrn_across_channels, or
         *      #dnnl::algorithm::lrn_within_channel.
         *  @param data_desc Source and destination memory descriptors.
         *  @param local_size Regularization local size.
         *  @param alpha The alpha regularization parameter.
         *  @param beta The beta regularization parameter.
         *  @param k The k regularization parameter. */
        public desc(prop_kind aprop_kind, algorithm aalgorithm,
                        @Const @ByRef memory.desc data_desc, @Cast("dnnl::memory::dim") long local_size,
                        float alpha, float beta, float k/*=1.f*/) { super((Pointer)null); allocate(aprop_kind, aalgorithm, data_desc, local_size, alpha, beta, k); }
        private native void allocate(prop_kind aprop_kind, algorithm aalgorithm,
                        @Const @ByRef memory.desc data_desc, @Cast("dnnl::memory::dim") long local_size,
                        float alpha, float beta, float k/*=1.f*/);
        public desc(prop_kind aprop_kind, algorithm aalgorithm,
                        @Const @ByRef memory.desc data_desc, @Cast("dnnl::memory::dim") long local_size,
                        float alpha, float beta) { super((Pointer)null); allocate(aprop_kind, aalgorithm, data_desc, local_size, alpha, beta); }
        private native void allocate(prop_kind aprop_kind, algorithm aalgorithm,
                        @Const @ByRef memory.desc data_desc, @Cast("dnnl::memory::dim") long local_size,
                        float alpha, float beta);
        public desc(@Cast("dnnl::prop_kind") int aprop_kind, @Cast("dnnl::algorithm") int aalgorithm,
                        @Const @ByRef memory.desc data_desc, @Cast("dnnl::memory::dim") long local_size,
                        float alpha, float beta, float k/*=1.f*/) { super((Pointer)null); allocate(aprop_kind, aalgorithm, data_desc, local_size, alpha, beta, k); }
        private native void allocate(@Cast("dnnl::prop_kind") int aprop_kind, @Cast("dnnl::algorithm") int aalgorithm,
                        @Const @ByRef memory.desc data_desc, @Cast("dnnl::memory::dim") long local_size,
                        float alpha, float beta, float k/*=1.f*/);
        public desc(@Cast("dnnl::prop_kind") int aprop_kind, @Cast("dnnl::algorithm") int aalgorithm,
                        @Const @ByRef memory.desc data_desc, @Cast("dnnl::memory::dim") long local_size,
                        float alpha, float beta) { super((Pointer)null); allocate(aprop_kind, aalgorithm, data_desc, local_size, alpha, beta); }
        private native void allocate(@Cast("dnnl::prop_kind") int aprop_kind, @Cast("dnnl::algorithm") int aalgorithm,
                        @Const @ByRef memory.desc data_desc, @Cast("dnnl::memory::dim") long local_size,
                        float alpha, float beta);
    }

    /** Primitive descriptor for an LRN forward propagation primitive. */
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

        /** Constructs a primitive descriptor for an LRN forward propagation
         *  primitive.
         * 
         *  @param adesc Descriptor for an LRN forward propagation primitive.
         *  @param aengine Engine to use.
         *  @param allow_empty A flag signifying whether construction is
         *      allowed to fail without throwing an exception. In this case an
         *      empty object will be produced. This flag is optional and
         *      defaults to false. */
        
        ///
        public primitive_desc(@Const @ByRef desc adesc, @Const @ByRef engine aengine,
                        @Cast("bool") boolean allow_empty/*=false*/) { super((Pointer)null); allocate(adesc, aengine, allow_empty); }
        private native void allocate(@Const @ByRef desc adesc, @Const @ByRef engine aengine,
                        @Cast("bool") boolean allow_empty/*=false*/);
        public primitive_desc(@Const @ByRef desc adesc, @Const @ByRef engine aengine) { super((Pointer)null); allocate(adesc, aengine); }
        private native void allocate(@Const @ByRef desc adesc, @Const @ByRef engine aengine);

        /** Constructs a primitive descriptor for an LRN forward propagation
         *  primitive.
         * 
         *  @param adesc Descriptor for an LRN forward propagation primitive.
         *  @param aengine Engine to use.
         *  @param attr Primitive attributes to use.
         *  @param allow_empty A flag signifying whether construction is
         *      allowed to fail without throwing an exception. In this case an
         *      empty object will be produced. This flag is optional and
         *      defaults to false. */
        
        ///
        public primitive_desc(@Const @ByRef desc adesc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine aengine, @Cast("bool") boolean allow_empty/*=false*/) { super((Pointer)null); allocate(adesc, attr, aengine, allow_empty); }
        private native void allocate(@Const @ByRef desc adesc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine aengine, @Cast("bool") boolean allow_empty/*=false*/);
        public primitive_desc(@Const @ByRef desc adesc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine aengine) { super((Pointer)null); allocate(adesc, attr, aengine); }
        private native void allocate(@Const @ByRef desc adesc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine aengine);

        /** Constructs a primitive descriptor for an LRN forward propagation
         *  primitive from a C API primitive descriptor that must have a
         *  matching kind.
         * 
         *  @param pd C API primitive descriptor for an LRN forward
         *      propagation primitive. */
        public primitive_desc(dnnl_primitive_desc pd) { super((Pointer)null); allocate(pd); }
        private native void allocate(dnnl_primitive_desc pd);

        /** \copydoc dnnl::primitive_desc_base::src_desc()const */
        public native @ByVal memory.desc src_desc();

        /** \copydoc dnnl::primitive_desc_base::dst_desc()const */
        public native @ByVal memory.desc dst_desc();

        /** \copydoc dnnl::primitive_desc_base::workspace_desc()const */
        public native @ByVal memory.desc workspace_desc();
    }

    /** Default constructor. Produces an empty object. */
    public lrn_forward() { super((Pointer)null); allocate(); }
    private native void allocate();

    /** Constructs an LRN forward propagation primitive.
     *  @param pd Primitive descriptor for an LRN forward propagation
     *      primitive. */
    public lrn_forward(@Const @ByRef primitive_desc pd) { super((Pointer)null); allocate(pd); }
    private native void allocate(@Const @ByRef primitive_desc pd);
}

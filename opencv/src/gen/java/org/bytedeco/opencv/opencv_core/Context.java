// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;



@Namespace("cv::ocl") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class Context extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Context(Pointer p) { super(p); }

    public Context() { super((Pointer)null); allocate(); }
    @NoException private native void allocate();
    /** @deprecated */
    public Context(int dtype) { super((Pointer)null); allocate(dtype); }
    private native void allocate(int dtype);
    public Context(@Const @ByRef Context c) { super((Pointer)null); allocate(c); }
    private native void allocate(@Const @ByRef Context c);
    public native @ByRef @Name("operator =") Context put(@Const @ByRef Context c);

    /** @deprecated */
    public native @Cast("bool") boolean create();
    /** @deprecated */
    public native @Cast("bool") boolean create(int dtype);

    public native @Cast("size_t") long ndevices();
    public native @ByRef Device device(@Cast("size_t") long idx);
    public native @ByVal Program getProg(@Const @ByRef ProgramSource prog,
                        @Str BytePointer buildopt, @Str BytePointer errmsg);
    public native @ByVal Program getProg(@Const @ByRef ProgramSource prog,
                        @Str String buildopt, @Str String errmsg);
    public native void unloadProg(@ByRef Program prog);


    /** Get thread-local OpenCL context (initialize if necessary) */
// #if 0  // OpenCV 5.0
// #else
    public static native @ByRef Context getDefault(@Cast("bool") boolean initialize/*=true*/);
    public static native @ByRef Context getDefault();
// #endif

    /** @return cl_context value */
    public native Pointer ptr();

    /**
     * \brief Get OpenCL context property specified on context creation
     * @param propertyId Property id (CL_CONTEXT_* as defined in cl_context_properties type)
     * @return Property value if property was specified on clCreateContext, or NULL if context created without the property
     */
    public native Pointer getOpenCLContextProperty(int propertyId);

    public native @Cast("bool") boolean useSVM();
    public native void setUseSVM(@Cast("bool") boolean enabled);

    /**
     * @param context OpenCL handle (cl_context). clRetainContext() is called on success
     */
    public static native @ByVal Context fromHandle(Pointer context);
    public static native @ByVal Context fromDevice(@Const @ByRef Device device);
    public static native @ByVal Context create(@StdString BytePointer configuration);
    public static native @ByVal Context create(@StdString String configuration);

    public native void release();

    public static class UserContext extends Pointer {
        static { Loader.load(); }
        /** Default native constructor. */
        public UserContext() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public UserContext(long size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public UserContext(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(long size);
        @Override public UserContext position(long position) {
            return (UserContext)super.position(position);
        }
        @Override public UserContext getPointer(long i) {
            return new UserContext((Pointer)this).offsetAddress(i);
        }
    
    }
    public native void setUserContext(@ByVal @Cast("std::type_index*") Pointer typeId, @SharedPtr UserContext userContext);
    public native @SharedPtr UserContext getUserContext(@ByVal @Cast("std::type_index*") Pointer typeId);

    @Opaque public static class Impl extends Pointer {
        /** Empty constructor. Calls {@code super((Pointer)null)}. */
        public Impl() { super((Pointer)null); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public Impl(Pointer p) { super(p); }
    }
    public native Impl getImpl();
    public native @Cast("bool") boolean empty();
// TODO OpenCV 5.0
//protected:
    public native Impl p(); public native Context p(Impl setter);
}

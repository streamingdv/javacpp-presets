// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;


@Namespace("cv::ocl") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class Image2D extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Image2D(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Image2D(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Image2D position(long position) {
        return (Image2D)super.position(position);
    }
    @Override public Image2D getPointer(long i) {
        return new Image2D((Pointer)this).offsetAddress(i);
    }

    public Image2D() { super((Pointer)null); allocate(); }
    @NoException private native void allocate();

    /**
    @param src UMat object from which to get image properties and data
    @param norm flag to enable the use of normalized channel data types
    @param alias flag indicating that the image should alias the src UMat. If true, changes to the
        image or src will be reflected in both objects.
    */
    public Image2D(@Const @ByRef UMat src, @Cast("bool") boolean norm/*=false*/, @Cast("bool") boolean alias/*=false*/) { super((Pointer)null); allocate(src, norm, alias); }
    private native void allocate(@Const @ByRef UMat src, @Cast("bool") boolean norm/*=false*/, @Cast("bool") boolean alias/*=false*/);
    public Image2D(@Const @ByRef UMat src) { super((Pointer)null); allocate(src); }
    private native void allocate(@Const @ByRef UMat src);
    public Image2D(@Const @ByRef Image2D i) { super((Pointer)null); allocate(i); }
    private native void allocate(@Const @ByRef Image2D i);

    public native @ByRef @Name("operator =") Image2D put(@Const @ByRef Image2D i);

    /** Indicates if creating an aliased image should succeed.
    Depends on the underlying platform and the dimensions of the UMat.
    */
    public static native @Cast("bool") boolean canCreateAlias(@Const @ByRef UMat u);

    /** Indicates if the image format is supported.
    */
    public static native @Cast("bool") boolean isFormatSupported(int depth, int cn, @Cast("bool") boolean norm);

    public native Pointer ptr();
}

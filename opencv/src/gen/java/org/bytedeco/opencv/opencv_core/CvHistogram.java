// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;


@Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class CvHistogram extends org.bytedeco.opencv.opencv_imgproc.AbstractCvHistogram {
    static { Loader.load(); }
    /** Default native constructor. */
    public CvHistogram() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CvHistogram(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvHistogram(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CvHistogram position(long position) {
        return (CvHistogram)super.position(position);
    }

    public native int type(); public native CvHistogram type(int setter);
    public native CvArr bins(); public native CvHistogram bins(CvArr setter);
    /** For uniform histograms.                      */
    public native float thresh(int i, int j); public native CvHistogram thresh(int i, int j, float setter);
    @MemberGetter public native @Cast("float(*)[2]") FloatPointer thresh();
    /** For non-uniform histograms.                  */
    public native FloatPointer thresh2(int i); public native CvHistogram thresh2(int i, FloatPointer setter);
    public native @Cast("float**") PointerPointer thresh2(); public native CvHistogram thresh2(PointerPointer setter);
    /** Embedded matrix header for array histograms. */
    public native @ByRef CvMatND mat(); public native CvHistogram mat(CvMatND setter);
}

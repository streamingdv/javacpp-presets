// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_imgproc;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;

import static org.bytedeco.opencv.global.opencv_imgproc.*;



/** Convexity defect */
@Properties(inherit = org.bytedeco.opencv.presets.opencv_imgproc.class)
public class CvConvexityDefect extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CvConvexityDefect() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CvConvexityDefect(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvConvexityDefect(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CvConvexityDefect position(long position) {
        return (CvConvexityDefect)super.position(position);
    }

    /** point of the contour where the defect begins */
    public native CvPoint start(); public native CvConvexityDefect start(CvPoint setter);
    /** point of the contour where the defect ends */
    public native CvPoint end(); public native CvConvexityDefect end(CvPoint setter);
    /** the farthest from the convex hull point within the defect */
    public native CvPoint depth_point(); public native CvConvexityDefect depth_point(CvPoint setter);
    /** distance between the farthest point and the convex hull */
    public native float depth(); public native CvConvexityDefect depth(float setter);
}

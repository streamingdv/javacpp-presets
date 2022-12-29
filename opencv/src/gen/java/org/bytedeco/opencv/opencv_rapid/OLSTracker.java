// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_rapid;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.opencv.opencv_flann.*;
import static org.bytedeco.opencv.global.opencv_flann.*;
import org.bytedeco.opencv.opencv_features2d.*;
import static org.bytedeco.opencv.global.opencv_features2d.*;
import org.bytedeco.opencv.opencv_calib3d.*;
import static org.bytedeco.opencv.global.opencv_calib3d.*;

import static org.bytedeco.opencv.global.opencv_rapid.*;


/** implements "Optimal local searching for fast and robust textureless 3D object tracking in highly
 * cluttered backgrounds" \cite seo2013optimal
 */
@Namespace("cv::rapid") @Properties(inherit = org.bytedeco.opencv.presets.opencv_rapid.class)
public class OLSTracker extends Tracker {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OLSTracker(Pointer p) { super(p); }

    public static native @Ptr OLSTracker create(@ByVal Mat pts3d, @ByVal Mat tris, int histBins/*=8*/, @Cast("uchar") byte sobelThesh/*=10*/);
    public static native @Ptr OLSTracker create(@ByVal Mat pts3d, @ByVal Mat tris);
    public static native @Ptr OLSTracker create(@ByVal UMat pts3d, @ByVal UMat tris, int histBins/*=8*/, @Cast("uchar") byte sobelThesh/*=10*/);
    public static native @Ptr OLSTracker create(@ByVal UMat pts3d, @ByVal UMat tris);
    public static native @Ptr OLSTracker create(@ByVal GpuMat pts3d, @ByVal GpuMat tris, int histBins/*=8*/, @Cast("uchar") byte sobelThesh/*=10*/);
    public static native @Ptr OLSTracker create(@ByVal GpuMat pts3d, @ByVal GpuMat tris);
}

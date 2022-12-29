// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_xfeatures2d;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_ml.*;
import static org.bytedeco.opencv.global.opencv_ml.*;
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
import org.bytedeco.opencv.opencv_shape.*;
import static org.bytedeco.opencv.global.opencv_shape.*;

import static org.bytedeco.opencv.global.opencv_xfeatures2d.*;



/** \brief The class implements the keypoint detector introduced by \cite Agrawal08, synonym of StarDetector. :
 */
@Namespace("cv::xfeatures2d") @Properties(inherit = org.bytedeco.opencv.presets.opencv_xfeatures2d.class)
public class StarDetector extends Feature2D {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StarDetector(Pointer p) { super(p); }

    /** the full constructor */
    public static native @Ptr StarDetector create(int maxSize/*=45*/, int responseThreshold/*=30*/,
                             int lineThresholdProjected/*=10*/,
                             int lineThresholdBinarized/*=8*/,
                             int suppressNonmaxSize/*=5*/);
    public static native @Ptr StarDetector create();

    public native void setMaxSize(int _maxSize);
    public native int getMaxSize();

    public native void setResponseThreshold(int _responseThreshold);
    public native int getResponseThreshold();

    public native void setLineThresholdProjected(int _lineThresholdProjected);
    public native int getLineThresholdProjected();

    public native void setLineThresholdBinarized(int _lineThresholdBinarized);
    public native int getLineThresholdBinarized();

    public native void setSuppressNonmaxSize(int _suppressNonmaxSize);
    public native int getSuppressNonmaxSize();

    public native @Str @Override BytePointer getDefaultName();
}

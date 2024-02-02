// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_imgproc;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;

import static org.bytedeco.opencv.global.opencv_imgproc.*;


/** \brief finds arbitrary template in the grayscale image using Generalized Hough Transform
<p>
Detects position, translation and rotation \cite Guil1999 .
*/
@Namespace("cv") @Properties(inherit = org.bytedeco.opencv.presets.opencv_imgproc.class)
public class GeneralizedHoughGuil extends GeneralizedHough {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public GeneralizedHoughGuil(Pointer p) { super(p); }
    /** Downcast constructor. */
    public GeneralizedHoughGuil(Algorithm pointer) { super((Pointer)null); allocate(pointer); }
    @Namespace private native @Name("static_cast<cv::GeneralizedHoughGuil*>") void allocate(Algorithm pointer);

    /** Angle difference in degrees between two points in feature. */
    public native void setXi(double xi);
    public native double getXi();

    /** Feature table levels. */
    public native void setLevels(int levels);
    public native int getLevels();

    /** Maximal difference between angles that treated as equal. */
    public native void setAngleEpsilon(double angleEpsilon);
    public native double getAngleEpsilon();

    /** Minimal rotation angle to detect in degrees. */
    public native void setMinAngle(double minAngle);
    public native double getMinAngle();

    /** Maximal rotation angle to detect in degrees. */
    public native void setMaxAngle(double maxAngle);
    public native double getMaxAngle();

    /** Angle step in degrees. */
    public native void setAngleStep(double angleStep);
    public native double getAngleStep();

    /** Angle votes threshold. */
    public native void setAngleThresh(int angleThresh);
    public native int getAngleThresh();

    /** Minimal scale to detect. */
    public native void setMinScale(double minScale);
    public native double getMinScale();

    /** Maximal scale to detect. */
    public native void setMaxScale(double maxScale);
    public native double getMaxScale();

    /** Scale step. */
    public native void setScaleStep(double scaleStep);
    public native double getScaleStep();

    /** Scale votes threshold. */
    public native void setScaleThresh(int scaleThresh);
    public native int getScaleThresh();

    /** Position votes threshold. */
    public native void setPosThresh(int posThresh);
    public native int getPosThresh();
}

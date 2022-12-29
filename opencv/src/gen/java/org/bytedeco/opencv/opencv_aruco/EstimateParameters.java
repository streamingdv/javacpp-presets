// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_aruco;

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
import org.bytedeco.opencv.opencv_dnn.*;
import static org.bytedeco.opencv.global.opencv_dnn.*;
import org.bytedeco.opencv.opencv_objdetect.*;
import static org.bytedeco.opencv.global.opencv_objdetect.*;

import static org.bytedeco.opencv.global.opencv_aruco.*;


/** \brief Pose estimation parameters
 *
 * @param pattern Defines center this system and axes direction (default PatternPositionType::ARUCO_CCW_CENTER).
 * @param useExtrinsicGuess Parameter used for SOLVEPNP_ITERATIVE. If true (1), the function uses the provided
 * rvec and tvec values as initial approximations of the rotation and translation vectors, respectively, and further
 * optimizes them (default false).
 * @param solvePnPMethod Method for solving a PnP problem: see \ref calib3d_solvePnP_flags (default SOLVEPNP_ITERATIVE).
 * @see PatternPositionType, solvePnP(), check tutorial_aruco_detection in aruco contrib
 */
@Namespace("cv::aruco") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_aruco.class)
public class EstimateParameters extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public EstimateParameters(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public EstimateParameters(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public EstimateParameters position(long position) {
        return (EstimateParameters)super.position(position);
    }
    @Override public EstimateParameters getPointer(long i) {
        return new EstimateParameters((Pointer)this).offsetAddress(i);
    }

    public native @Cast("cv::aruco::PatternPositionType") int pattern(); public native EstimateParameters pattern(int setter);
    public native @Cast("bool") boolean useExtrinsicGuess(); public native EstimateParameters useExtrinsicGuess(boolean setter);
    public native int solvePnPMethod(); public native EstimateParameters solvePnPMethod(int setter);

    public EstimateParameters() { super((Pointer)null); allocate(); }
    private native void allocate();
}

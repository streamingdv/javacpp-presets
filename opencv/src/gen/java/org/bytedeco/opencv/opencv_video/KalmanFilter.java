// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_video;

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

import static org.bytedeco.opencv.global.opencv_video.*;


/** \example samples/cpp/kalman.cpp
An example using the standard Kalman filter
*/

/** \brief Kalman filter class.
<p>
The class implements a standard Kalman filter <http://en.wikipedia.org/wiki/Kalman_filter>,
\cite Welch95 . However, you can modify transitionMatrix, controlMatrix, and measurementMatrix to get
an extended Kalman filter functionality.
\note In C API when CvKalman\* kalmanFilter structure is not needed anymore, it should be released
with cvReleaseKalman(&kalmanFilter)
 */
@Namespace("cv") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_video.class)
public class KalmanFilter extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public KalmanFilter(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public KalmanFilter(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public KalmanFilter position(long position) {
        return (KalmanFilter)super.position(position);
    }
    @Override public KalmanFilter getPointer(long i) {
        return new KalmanFilter((Pointer)this).position(position + i);
    }

    public KalmanFilter() { super((Pointer)null); allocate(); }
    private native void allocate();
    /** \overload
    @param dynamParams Dimensionality of the state.
    @param measureParams Dimensionality of the measurement.
    @param controlParams Dimensionality of the control vector.
    @param type Type of the created matrices that should be CV_32F or CV_64F.
    */
    public KalmanFilter( int dynamParams, int measureParams, int controlParams/*=0*/, int type/*=CV_32F*/ ) { super((Pointer)null); allocate(dynamParams, measureParams, controlParams, type); }
    private native void allocate( int dynamParams, int measureParams, int controlParams/*=0*/, int type/*=CV_32F*/ );
    public KalmanFilter( int dynamParams, int measureParams ) { super((Pointer)null); allocate(dynamParams, measureParams); }
    private native void allocate( int dynamParams, int measureParams );

    /** \brief Re-initializes Kalman filter. The previous content is destroyed.
    <p>
    @param dynamParams Dimensionality of the state.
    @param measureParams Dimensionality of the measurement.
    @param controlParams Dimensionality of the control vector.
    @param type Type of the created matrices that should be CV_32F or CV_64F.
     */
    public native void init( int dynamParams, int measureParams, int controlParams/*=0*/, int type/*=CV_32F*/ );
    public native void init( int dynamParams, int measureParams );

    /** \brief Computes a predicted state.
    <p>
    @param control The optional input control
     */
    public native @Const @ByRef Mat predict( @Const @ByRef(nullValue = "cv::Mat()") Mat control );
    public native @Const @ByRef Mat predict( );

    /** \brief Updates the predicted state from the measurement.
    <p>
    @param measurement The measured system parameters
     */
    public native @Const @ByRef Mat correct( @Const @ByRef Mat measurement );

    /** predicted state (x'(k)): x(k)=A*x(k-1)+B*u(k) */
    public native @ByRef Mat statePre(); public native KalmanFilter statePre(Mat setter);
    /** corrected state (x(k)): x(k)=x'(k)+K(k)*(z(k)-H*x'(k)) */
    public native @ByRef Mat statePost(); public native KalmanFilter statePost(Mat setter);
    /** state transition matrix (A) */
    public native @ByRef Mat transitionMatrix(); public native KalmanFilter transitionMatrix(Mat setter);
    /** control matrix (B) (not used if there is no control) */
    public native @ByRef Mat controlMatrix(); public native KalmanFilter controlMatrix(Mat setter);
    /** measurement matrix (H) */
    public native @ByRef Mat measurementMatrix(); public native KalmanFilter measurementMatrix(Mat setter);
    /** process noise covariance matrix (Q) */
    public native @ByRef Mat processNoiseCov(); public native KalmanFilter processNoiseCov(Mat setter);
    /** measurement noise covariance matrix (R) */
    public native @ByRef Mat measurementNoiseCov(); public native KalmanFilter measurementNoiseCov(Mat setter);
    /** priori error estimate covariance matrix (P'(k)): P'(k)=A*P(k-1)*At + Q)*/
    public native @ByRef Mat errorCovPre(); public native KalmanFilter errorCovPre(Mat setter);
    /** Kalman gain matrix (K(k)): K(k)=P'(k)*Ht*inv(H*P'(k)*Ht+R) */
    public native @ByRef Mat gain(); public native KalmanFilter gain(Mat setter);
    /** posteriori error estimate covariance matrix (P(k)): P(k)=(I-K(k)*H)*P'(k) */
    public native @ByRef Mat errorCovPost(); public native KalmanFilter errorCovPost(Mat setter);

    // temporary matrices
    public native @ByRef Mat temp1(); public native KalmanFilter temp1(Mat setter);
    public native @ByRef Mat temp2(); public native KalmanFilter temp2(Mat setter);
    public native @ByRef Mat temp3(); public native KalmanFilter temp3(Mat setter);
    public native @ByRef Mat temp4(); public native KalmanFilter temp4(Mat setter);
    public native @ByRef Mat temp5(); public native KalmanFilter temp5(Mat setter);
}

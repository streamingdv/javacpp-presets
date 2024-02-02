// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_objdetect;

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

import static org.bytedeco.opencv.global.opencv_objdetect.*;

@Namespace("cv") @Properties(inherit = org.bytedeco.opencv.presets.opencv_objdetect.class)
public class QRCodeDetector extends GraphicalCodeDetector {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public QRCodeDetector(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public QRCodeDetector(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public QRCodeDetector position(long position) {
        return (QRCodeDetector)super.position(position);
    }
    @Override public QRCodeDetector getPointer(long i) {
        return new QRCodeDetector((Pointer)this).offsetAddress(i);
    }

    public QRCodeDetector() { super((Pointer)null); allocate(); }
    private native void allocate();

    /** \brief sets the epsilon used during the horizontal scan of QR code stop marker detection.
     @param epsX Epsilon neighborhood, which allows you to determine the horizontal pattern
     of the scheme 1:1:3:1:1 according to QR code standard.
    */
    public native @ByRef QRCodeDetector setEpsX(double epsX);
    /** \brief sets the epsilon used during the vertical scan of QR code stop marker detection.
     @param epsY Epsilon neighborhood, which allows you to determine the vertical pattern
     of the scheme 1:1:3:1:1 according to QR code standard.
     */
    public native @ByRef QRCodeDetector setEpsY(double epsY);

    /** \brief use markers to improve the position of the corners of the QR code
     *
     * alignmentMarkers using by default
     */
    public native @ByRef QRCodeDetector setUseAlignmentMarkers(@Cast("bool") boolean useAlignmentMarkers);

    /** \brief Decodes QR code on a curved surface in image once it's found by the detect() method.
     <p>
     Returns UTF8-encoded output string or empty string if the code cannot be decoded.
     @param img grayscale or color (BGR) image containing QR code.
     @param points Quadrangle vertices found by detect() method (or some other algorithm).
     @param straight_qrcode The optional output image containing rectified and binarized QR code
     */
    public native @Str BytePointer decodeCurved(@ByVal Mat img, @ByVal Mat points, @ByVal(nullValue = "cv::OutputArray(cv::noArray())") Mat straight_qrcode);
    public native @Str BytePointer decodeCurved(@ByVal Mat img, @ByVal Mat points);
    public native @Str String decodeCurved(@ByVal UMat img, @ByVal UMat points, @ByVal(nullValue = "cv::OutputArray(cv::noArray())") UMat straight_qrcode);
    public native @Str String decodeCurved(@ByVal UMat img, @ByVal UMat points);
    public native @Str BytePointer decodeCurved(@ByVal GpuMat img, @ByVal GpuMat points, @ByVal(nullValue = "cv::OutputArray(cv::noArray())") GpuMat straight_qrcode);
    public native @Str BytePointer decodeCurved(@ByVal GpuMat img, @ByVal GpuMat points);

    /** \brief Both detects and decodes QR code on a curved surface
     <p>
     @param img grayscale or color (BGR) image containing QR code.
     @param points optional output array of vertices of the found QR code quadrangle. Will be empty if not found.
     @param straight_qrcode The optional output image containing rectified and binarized QR code
     */
    public native @StdString BytePointer detectAndDecodeCurved(@ByVal Mat img, @ByVal(nullValue = "cv::OutputArray(cv::noArray())") Mat points,
                                                  @ByVal(nullValue = "cv::OutputArray(cv::noArray())") Mat straight_qrcode);
    public native @StdString BytePointer detectAndDecodeCurved(@ByVal Mat img);
    public native @StdString String detectAndDecodeCurved(@ByVal UMat img, @ByVal(nullValue = "cv::OutputArray(cv::noArray())") UMat points,
                                                  @ByVal(nullValue = "cv::OutputArray(cv::noArray())") UMat straight_qrcode);
    public native @StdString String detectAndDecodeCurved(@ByVal UMat img);
    public native @StdString BytePointer detectAndDecodeCurved(@ByVal GpuMat img, @ByVal(nullValue = "cv::OutputArray(cv::noArray())") GpuMat points,
                                                  @ByVal(nullValue = "cv::OutputArray(cv::noArray())") GpuMat straight_qrcode);
    public native @StdString BytePointer detectAndDecodeCurved(@ByVal GpuMat img);
}

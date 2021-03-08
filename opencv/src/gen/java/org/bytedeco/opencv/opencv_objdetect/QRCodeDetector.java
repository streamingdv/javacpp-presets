// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

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

import static org.bytedeco.opencv.global.opencv_objdetect.*;


@Namespace("cv") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_objdetect.class)
public class QRCodeDetector extends Pointer {
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
        return new QRCodeDetector((Pointer)this).position(position + i);
    }

    public QRCodeDetector() { super((Pointer)null); allocate(); }
    private native void allocate();

    /** \brief sets the epsilon used during the horizontal scan of QR code stop marker detection.
     @param epsX Epsilon neighborhood, which allows you to determine the horizontal pattern
     of the scheme 1:1:3:1:1 according to QR code standard.
    */
    public native void setEpsX(double epsX);
    /** \brief sets the epsilon used during the vertical scan of QR code stop marker detection.
     @param epsY Epsilon neighborhood, which allows you to determine the vertical pattern
     of the scheme 1:1:3:1:1 according to QR code standard.
     */
    public native void setEpsY(double epsY);

    /** \brief Detects QR code in image and returns the quadrangle containing the code.
     @param img grayscale or color (BGR) image containing (or not) QR code.
     @param points Output vector of vertices of the minimum-area quadrangle containing the code.
     */
    public native @Cast("bool") boolean detect(@ByVal Mat img, @ByVal Mat points);
    public native @Cast("bool") boolean detect(@ByVal UMat img, @ByVal UMat points);
    public native @Cast("bool") boolean detect(@ByVal GpuMat img, @ByVal GpuMat points);

    /** \brief Decodes QR code in image once it's found by the detect() method.
     <p>
     Returns UTF8-encoded output string or empty string if the code cannot be decoded.
     @param img grayscale or color (BGR) image containing QR code.
     @param points Quadrangle vertices found by detect() method (or some other algorithm).
     @param straight_qrcode The optional output image containing rectified and binarized QR code
     */
    public native @StdString BytePointer decode(@ByVal Mat img, @ByVal Mat points, @ByVal(nullValue = "cv::OutputArray(cv::noArray())") Mat straight_qrcode);
    public native @StdString BytePointer decode(@ByVal Mat img, @ByVal Mat points);
    public native @StdString String decode(@ByVal UMat img, @ByVal UMat points, @ByVal(nullValue = "cv::OutputArray(cv::noArray())") UMat straight_qrcode);
    public native @StdString String decode(@ByVal UMat img, @ByVal UMat points);
    public native @StdString BytePointer decode(@ByVal GpuMat img, @ByVal GpuMat points, @ByVal(nullValue = "cv::OutputArray(cv::noArray())") GpuMat straight_qrcode);
    public native @StdString BytePointer decode(@ByVal GpuMat img, @ByVal GpuMat points);

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

    /** \brief Both detects and decodes QR code
     <p>
     @param img grayscale or color (BGR) image containing QR code.
     @param points optional output array of vertices of the found QR code quadrangle. Will be empty if not found.
     @param straight_qrcode The optional output image containing rectified and binarized QR code
     */
    public native @StdString BytePointer detectAndDecode(@ByVal Mat img, @ByVal(nullValue = "cv::OutputArray(cv::noArray())") Mat points,
                                            @ByVal(nullValue = "cv::OutputArray(cv::noArray())") Mat straight_qrcode);
    public native @StdString BytePointer detectAndDecode(@ByVal Mat img);
    public native @StdString String detectAndDecode(@ByVal UMat img, @ByVal(nullValue = "cv::OutputArray(cv::noArray())") UMat points,
                                            @ByVal(nullValue = "cv::OutputArray(cv::noArray())") UMat straight_qrcode);
    public native @StdString String detectAndDecode(@ByVal UMat img);
    public native @StdString BytePointer detectAndDecode(@ByVal GpuMat img, @ByVal(nullValue = "cv::OutputArray(cv::noArray())") GpuMat points,
                                            @ByVal(nullValue = "cv::OutputArray(cv::noArray())") GpuMat straight_qrcode);
    public native @StdString BytePointer detectAndDecode(@ByVal GpuMat img);

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

    /** \brief Detects QR codes in image and returns the vector of the quadrangles containing the codes.
     @param img grayscale or color (BGR) image containing (or not) QR codes.
     @param points Output vector of vector of vertices of the minimum-area quadrangle containing the codes.
     */
    public native @Cast("bool") boolean detectMulti(@ByVal Mat img, @ByVal Mat points);
    public native @Cast("bool") boolean detectMulti(@ByVal UMat img, @ByVal UMat points);
    public native @Cast("bool") boolean detectMulti(@ByVal GpuMat img, @ByVal GpuMat points);

    /** \brief Decodes QR codes in image once it's found by the detect() method.
     @param img grayscale or color (BGR) image containing QR codes.
     @param decoded_info UTF8-encoded output vector of string or empty vector of string if the codes cannot be decoded.
     @param points vector of Quadrangle vertices found by detect() method (or some other algorithm).
     @param straight_qrcode The optional output vector of images containing rectified and binarized QR codes
     */
    public native @Cast("bool") boolean decodeMulti(
                @ByVal Mat img, @ByVal Mat points,
                @ByRef StringVector decoded_info,
                @ByVal(nullValue = "cv::OutputArrayOfArrays(cv::noArray())") MatVector straight_qrcode
        );
    public native @Cast("bool") boolean decodeMulti(
                @ByVal Mat img, @ByVal Mat points,
                @ByRef StringVector decoded_info
        );
    public native @Cast("bool") boolean decodeMulti(
                @ByVal Mat img, @ByVal Mat points,
                @ByRef StringVector decoded_info,
                @ByVal(nullValue = "cv::OutputArrayOfArrays(cv::noArray())") UMatVector straight_qrcode
        );
    public native @Cast("bool") boolean decodeMulti(
                @ByVal Mat img, @ByVal Mat points,
                @ByRef StringVector decoded_info,
                @ByVal(nullValue = "cv::OutputArrayOfArrays(cv::noArray())") GpuMatVector straight_qrcode
        );
    public native @Cast("bool") boolean decodeMulti(
                @ByVal UMat img, @ByVal UMat points,
                @ByRef StringVector decoded_info,
                @ByVal(nullValue = "cv::OutputArrayOfArrays(cv::noArray())") MatVector straight_qrcode
        );
    public native @Cast("bool") boolean decodeMulti(
                @ByVal UMat img, @ByVal UMat points,
                @ByRef StringVector decoded_info
        );
    public native @Cast("bool") boolean decodeMulti(
                @ByVal UMat img, @ByVal UMat points,
                @ByRef StringVector decoded_info,
                @ByVal(nullValue = "cv::OutputArrayOfArrays(cv::noArray())") UMatVector straight_qrcode
        );
    public native @Cast("bool") boolean decodeMulti(
                @ByVal UMat img, @ByVal UMat points,
                @ByRef StringVector decoded_info,
                @ByVal(nullValue = "cv::OutputArrayOfArrays(cv::noArray())") GpuMatVector straight_qrcode
        );
    public native @Cast("bool") boolean decodeMulti(
                @ByVal GpuMat img, @ByVal GpuMat points,
                @ByRef StringVector decoded_info,
                @ByVal(nullValue = "cv::OutputArrayOfArrays(cv::noArray())") MatVector straight_qrcode
        );
    public native @Cast("bool") boolean decodeMulti(
                @ByVal GpuMat img, @ByVal GpuMat points,
                @ByRef StringVector decoded_info
        );
    public native @Cast("bool") boolean decodeMulti(
                @ByVal GpuMat img, @ByVal GpuMat points,
                @ByRef StringVector decoded_info,
                @ByVal(nullValue = "cv::OutputArrayOfArrays(cv::noArray())") UMatVector straight_qrcode
        );
    public native @Cast("bool") boolean decodeMulti(
                @ByVal GpuMat img, @ByVal GpuMat points,
                @ByRef StringVector decoded_info,
                @ByVal(nullValue = "cv::OutputArrayOfArrays(cv::noArray())") GpuMatVector straight_qrcode
        );

    /** \brief Both detects and decodes QR codes
    @param img grayscale or color (BGR) image containing QR codes.
    @param decoded_info UTF8-encoded output vector of string or empty vector of string if the codes cannot be decoded.
    @param points optional output vector of vertices of the found QR code quadrangles. Will be empty if not found.
    @param straight_qrcode The optional output vector of images containing rectified and binarized QR codes
    */
    public native @Cast("bool") boolean detectAndDecodeMulti(
                @ByVal Mat img, @ByRef StringVector decoded_info,
                @ByVal(nullValue = "cv::OutputArray(cv::noArray())") Mat points,
                @ByVal(nullValue = "cv::OutputArrayOfArrays(cv::noArray())") MatVector straight_qrcode
        );
    public native @Cast("bool") boolean detectAndDecodeMulti(
                @ByVal Mat img, @ByRef StringVector decoded_info
        );
    public native @Cast("bool") boolean detectAndDecodeMulti(
                @ByVal Mat img, @ByRef StringVector decoded_info,
                @ByVal(nullValue = "cv::OutputArray(cv::noArray())") Mat points,
                @ByVal(nullValue = "cv::OutputArrayOfArrays(cv::noArray())") UMatVector straight_qrcode
        );
    public native @Cast("bool") boolean detectAndDecodeMulti(
                @ByVal Mat img, @ByRef StringVector decoded_info,
                @ByVal(nullValue = "cv::OutputArray(cv::noArray())") Mat points,
                @ByVal(nullValue = "cv::OutputArrayOfArrays(cv::noArray())") GpuMatVector straight_qrcode
        );
    public native @Cast("bool") boolean detectAndDecodeMulti(
                @ByVal UMat img, @ByRef StringVector decoded_info,
                @ByVal(nullValue = "cv::OutputArray(cv::noArray())") UMat points,
                @ByVal(nullValue = "cv::OutputArrayOfArrays(cv::noArray())") MatVector straight_qrcode
        );
    public native @Cast("bool") boolean detectAndDecodeMulti(
                @ByVal UMat img, @ByRef StringVector decoded_info
        );
    public native @Cast("bool") boolean detectAndDecodeMulti(
                @ByVal UMat img, @ByRef StringVector decoded_info,
                @ByVal(nullValue = "cv::OutputArray(cv::noArray())") UMat points,
                @ByVal(nullValue = "cv::OutputArrayOfArrays(cv::noArray())") UMatVector straight_qrcode
        );
    public native @Cast("bool") boolean detectAndDecodeMulti(
                @ByVal UMat img, @ByRef StringVector decoded_info,
                @ByVal(nullValue = "cv::OutputArray(cv::noArray())") UMat points,
                @ByVal(nullValue = "cv::OutputArrayOfArrays(cv::noArray())") GpuMatVector straight_qrcode
        );
    public native @Cast("bool") boolean detectAndDecodeMulti(
                @ByVal GpuMat img, @ByRef StringVector decoded_info,
                @ByVal(nullValue = "cv::OutputArray(cv::noArray())") GpuMat points,
                @ByVal(nullValue = "cv::OutputArrayOfArrays(cv::noArray())") MatVector straight_qrcode
        );
    public native @Cast("bool") boolean detectAndDecodeMulti(
                @ByVal GpuMat img, @ByRef StringVector decoded_info
        );
    public native @Cast("bool") boolean detectAndDecodeMulti(
                @ByVal GpuMat img, @ByRef StringVector decoded_info,
                @ByVal(nullValue = "cv::OutputArray(cv::noArray())") GpuMat points,
                @ByVal(nullValue = "cv::OutputArrayOfArrays(cv::noArray())") UMatVector straight_qrcode
        );
    public native @Cast("bool") boolean detectAndDecodeMulti(
                @ByVal GpuMat img, @ByRef StringVector decoded_info,
                @ByVal(nullValue = "cv::OutputArray(cv::noArray())") GpuMat points,
                @ByVal(nullValue = "cv::OutputArrayOfArrays(cv::noArray())") GpuMatVector straight_qrcode
        );
}

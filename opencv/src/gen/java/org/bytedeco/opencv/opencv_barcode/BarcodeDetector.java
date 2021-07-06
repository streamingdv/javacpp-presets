// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_barcode;

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
import org.bytedeco.opencv.opencv_dnn.*;
import static org.bytedeco.opencv.global.opencv_dnn.*;

import static org.bytedeco.opencv.global.opencv_barcode.*;


@Namespace("cv::barcode") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_barcode.class)
public class BarcodeDetector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BarcodeDetector(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public BarcodeDetector(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public BarcodeDetector position(long position) {
        return (BarcodeDetector)super.position(position);
    }
    @Override public BarcodeDetector getPointer(long i) {
        return new BarcodeDetector((Pointer)this).offsetAddress(i);
    }

    /**
     * \brief Initialize the BarcodeDetector.
     * @param prototxt_path prototxt file path for the super resolution model
     * @param model_path model file path for the super resolution model
     */
    public BarcodeDetector(@StdString BytePointer prototxt_path/*=""*/, @StdString BytePointer model_path/*=""*/) { super((Pointer)null); allocate(prototxt_path, model_path); }
    private native void allocate(@StdString BytePointer prototxt_path/*=""*/, @StdString BytePointer model_path/*=""*/);
    public BarcodeDetector() { super((Pointer)null); allocate(); }
    private native void allocate();
    public BarcodeDetector(@StdString String prototxt_path/*=""*/, @StdString String model_path/*=""*/) { super((Pointer)null); allocate(prototxt_path, model_path); }
    private native void allocate(@StdString String prototxt_path/*=""*/, @StdString String model_path/*=""*/);

    /** \brief Detects Barcode in image and returns the rectangle(s) containing the code.
     *
     * @param img grayscale or color (BGR) image containing (or not) Barcode.
     * @param points Output vector of vector of vertices of the minimum-area rotated rectangle containing the codes.
     * For N detected barcodes, the dimensions of this array should be [N][4].
     * Order of four points in vector< Point2f> is bottomLeft, topLeft, topRight, bottomRight.
     */
    public native @Cast("bool") boolean detect(@ByVal Mat img, @ByVal Mat points);
    public native @Cast("bool") boolean detect(@ByVal UMat img, @ByVal UMat points);
    public native @Cast("bool") boolean detect(@ByVal GpuMat img, @ByVal GpuMat points);

    /** \brief Decodes barcode in image once it's found by the detect() method.
     *
     * @param img grayscale or color (BGR) image containing bar code.
     * @param points vector of rotated rectangle vertices found by detect() method (or some other algorithm).
     * For N detected barcodes, the dimensions of this array should be [N][4].
     * Order of four points in vector<Point2f> is bottomLeft, topLeft, topRight, bottomRight.
     * @param decoded_info UTF8-encoded output vector of string or empty vector of string if the codes cannot be decoded.
     * @param decoded_type vector of BarcodeType, specifies the type of these barcodes
     */
    public native @Cast("bool") boolean decode(@ByVal Mat img, @ByVal Mat points, @ByRef StringVector decoded_info, @Cast("cv::barcode::BarcodeType*") @StdVector IntPointer decoded_type);
    public native @Cast("bool") boolean decode(@ByVal Mat img, @ByVal Mat points, @ByRef StringVector decoded_info, @Cast("cv::barcode::BarcodeType*") @StdVector IntBuffer decoded_type);
    public native @Cast("bool") boolean decode(@ByVal Mat img, @ByVal Mat points, @ByRef StringVector decoded_info, @Cast("cv::barcode::BarcodeType*") @StdVector int[] decoded_type);
    public native @Cast("bool") boolean decode(@ByVal UMat img, @ByVal UMat points, @ByRef StringVector decoded_info, @Cast("cv::barcode::BarcodeType*") @StdVector IntPointer decoded_type);
    public native @Cast("bool") boolean decode(@ByVal UMat img, @ByVal UMat points, @ByRef StringVector decoded_info, @Cast("cv::barcode::BarcodeType*") @StdVector IntBuffer decoded_type);
    public native @Cast("bool") boolean decode(@ByVal UMat img, @ByVal UMat points, @ByRef StringVector decoded_info, @Cast("cv::barcode::BarcodeType*") @StdVector int[] decoded_type);
    public native @Cast("bool") boolean decode(@ByVal GpuMat img, @ByVal GpuMat points, @ByRef StringVector decoded_info, @Cast("cv::barcode::BarcodeType*") @StdVector IntPointer decoded_type);
    public native @Cast("bool") boolean decode(@ByVal GpuMat img, @ByVal GpuMat points, @ByRef StringVector decoded_info, @Cast("cv::barcode::BarcodeType*") @StdVector IntBuffer decoded_type);
    public native @Cast("bool") boolean decode(@ByVal GpuMat img, @ByVal GpuMat points, @ByRef StringVector decoded_info, @Cast("cv::barcode::BarcodeType*") @StdVector int[] decoded_type);

    /** \brief Both detects and decodes barcode
     <p>
     * @param img grayscale or color (BGR) image containing barcode.
     * @param decoded_info UTF8-encoded output vector of string(s) or empty vector of string if the codes cannot be decoded.
     * @param decoded_type vector of BarcodeType, specifies the type of these barcodes
     * @param points optional output vector of vertices of the found  barcode rectangle. Will be empty if not found.
     */
    public native @Cast("bool") boolean detectAndDecode(@ByVal Mat img, @ByRef StringVector decoded_info, @Cast("cv::barcode::BarcodeType*") @StdVector IntPointer decoded_type, @ByVal(nullValue = "cv::OutputArray(cv::noArray())") Mat points);
    public native @Cast("bool") boolean detectAndDecode(@ByVal Mat img, @ByRef StringVector decoded_info, @Cast("cv::barcode::BarcodeType*") @StdVector IntPointer decoded_type);
    public native @Cast("bool") boolean detectAndDecode(@ByVal Mat img, @ByRef StringVector decoded_info, @Cast("cv::barcode::BarcodeType*") @StdVector IntBuffer decoded_type, @ByVal(nullValue = "cv::OutputArray(cv::noArray())") Mat points);
    public native @Cast("bool") boolean detectAndDecode(@ByVal Mat img, @ByRef StringVector decoded_info, @Cast("cv::barcode::BarcodeType*") @StdVector IntBuffer decoded_type);
    public native @Cast("bool") boolean detectAndDecode(@ByVal Mat img, @ByRef StringVector decoded_info, @Cast("cv::barcode::BarcodeType*") @StdVector int[] decoded_type, @ByVal(nullValue = "cv::OutputArray(cv::noArray())") Mat points);
    public native @Cast("bool") boolean detectAndDecode(@ByVal Mat img, @ByRef StringVector decoded_info, @Cast("cv::barcode::BarcodeType*") @StdVector int[] decoded_type);
    public native @Cast("bool") boolean detectAndDecode(@ByVal UMat img, @ByRef StringVector decoded_info, @Cast("cv::barcode::BarcodeType*") @StdVector IntPointer decoded_type, @ByVal(nullValue = "cv::OutputArray(cv::noArray())") UMat points);
    public native @Cast("bool") boolean detectAndDecode(@ByVal UMat img, @ByRef StringVector decoded_info, @Cast("cv::barcode::BarcodeType*") @StdVector IntPointer decoded_type);
    public native @Cast("bool") boolean detectAndDecode(@ByVal UMat img, @ByRef StringVector decoded_info, @Cast("cv::barcode::BarcodeType*") @StdVector IntBuffer decoded_type, @ByVal(nullValue = "cv::OutputArray(cv::noArray())") UMat points);
    public native @Cast("bool") boolean detectAndDecode(@ByVal UMat img, @ByRef StringVector decoded_info, @Cast("cv::barcode::BarcodeType*") @StdVector IntBuffer decoded_type);
    public native @Cast("bool") boolean detectAndDecode(@ByVal UMat img, @ByRef StringVector decoded_info, @Cast("cv::barcode::BarcodeType*") @StdVector int[] decoded_type, @ByVal(nullValue = "cv::OutputArray(cv::noArray())") UMat points);
    public native @Cast("bool") boolean detectAndDecode(@ByVal UMat img, @ByRef StringVector decoded_info, @Cast("cv::barcode::BarcodeType*") @StdVector int[] decoded_type);
    public native @Cast("bool") boolean detectAndDecode(@ByVal GpuMat img, @ByRef StringVector decoded_info, @Cast("cv::barcode::BarcodeType*") @StdVector IntPointer decoded_type, @ByVal(nullValue = "cv::OutputArray(cv::noArray())") GpuMat points);
    public native @Cast("bool") boolean detectAndDecode(@ByVal GpuMat img, @ByRef StringVector decoded_info, @Cast("cv::barcode::BarcodeType*") @StdVector IntPointer decoded_type);
    public native @Cast("bool") boolean detectAndDecode(@ByVal GpuMat img, @ByRef StringVector decoded_info, @Cast("cv::barcode::BarcodeType*") @StdVector IntBuffer decoded_type, @ByVal(nullValue = "cv::OutputArray(cv::noArray())") GpuMat points);
    public native @Cast("bool") boolean detectAndDecode(@ByVal GpuMat img, @ByRef StringVector decoded_info, @Cast("cv::barcode::BarcodeType*") @StdVector IntBuffer decoded_type);
    public native @Cast("bool") boolean detectAndDecode(@ByVal GpuMat img, @ByRef StringVector decoded_info, @Cast("cv::barcode::BarcodeType*") @StdVector int[] decoded_type, @ByVal(nullValue = "cv::OutputArray(cv::noArray())") GpuMat points);
    public native @Cast("bool") boolean detectAndDecode(@ByVal GpuMat img, @ByRef StringVector decoded_info, @Cast("cv::barcode::BarcodeType*") @StdVector int[] decoded_type);
}
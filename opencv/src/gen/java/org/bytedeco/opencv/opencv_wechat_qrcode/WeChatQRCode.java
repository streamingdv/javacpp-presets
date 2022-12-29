// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_wechat_qrcode;

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

import static org.bytedeco.opencv.global.opencv_wechat_qrcode.*;

/** \addtogroup wechat_qrcode
 *  \{
/**
 * \brief  WeChat QRCode includes two CNN-based models:
 * A object detection model and a super resolution model.
 * Object detection model is applied to detect QRCode with the bounding box.
 * super resolution model is applied to zoom in QRCode when it is small.
 *
 */
@Namespace("cv::wechat_qrcode") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_wechat_qrcode.class)
public class WeChatQRCode extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public WeChatQRCode(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public WeChatQRCode(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public WeChatQRCode position(long position) {
        return (WeChatQRCode)super.position(position);
    }
    @Override public WeChatQRCode getPointer(long i) {
        return new WeChatQRCode((Pointer)this).offsetAddress(i);
    }

    /**
     * \brief Initialize the WeChatQRCode.
     * It includes two models, which are packaged with caffe format.
     * Therefore, there are prototxt and caffe models (In total, four paramenters).
     *
     * @param detector_prototxt_path prototxt file path for the detector
     * @param detector_caffe_model_path caffe model file path for the detector
     * @param super_resolution_prototxt_path prototxt file path for the super resolution model
     * @param super_resolution_caffe_model_path caffe file path for the super resolution model
     */
    public WeChatQRCode(@StdString BytePointer detector_prototxt_path/*=""*/,
                             @StdString BytePointer detector_caffe_model_path/*=""*/,
                             @StdString BytePointer super_resolution_prototxt_path/*=""*/,
                             @StdString BytePointer super_resolution_caffe_model_path/*=""*/) { super((Pointer)null); allocate(detector_prototxt_path, detector_caffe_model_path, super_resolution_prototxt_path, super_resolution_caffe_model_path); }
    private native void allocate(@StdString BytePointer detector_prototxt_path/*=""*/,
                             @StdString BytePointer detector_caffe_model_path/*=""*/,
                             @StdString BytePointer super_resolution_prototxt_path/*=""*/,
                             @StdString BytePointer super_resolution_caffe_model_path/*=""*/);
    public WeChatQRCode() { super((Pointer)null); allocate(); }
    private native void allocate();
    public WeChatQRCode(@StdString String detector_prototxt_path/*=""*/,
                             @StdString String detector_caffe_model_path/*=""*/,
                             @StdString String super_resolution_prototxt_path/*=""*/,
                             @StdString String super_resolution_caffe_model_path/*=""*/) { super((Pointer)null); allocate(detector_prototxt_path, detector_caffe_model_path, super_resolution_prototxt_path, super_resolution_caffe_model_path); }
    private native void allocate(@StdString String detector_prototxt_path/*=""*/,
                             @StdString String detector_caffe_model_path/*=""*/,
                             @StdString String super_resolution_prototxt_path/*=""*/,
                             @StdString String super_resolution_caffe_model_path/*=""*/);

    /**
     * \brief  Both detects and decodes QR code.
     * To simplify the usage, there is a only API: detectAndDecode
     *
     * @param img supports grayscale or color (BGR) image.
     * @param points optional output array of vertices of the found QR code quadrangle. Will be
     * empty if not found.
     * @return list of decoded string.
     */
    public native @ByVal StringVector detectAndDecode(@ByVal Mat img, @ByVal(nullValue = "cv::OutputArrayOfArrays(cv::noArray())") MatVector points);
    public native @ByVal StringVector detectAndDecode(@ByVal Mat img);
    public native @ByVal StringVector detectAndDecode(@ByVal Mat img, @ByVal(nullValue = "cv::OutputArrayOfArrays(cv::noArray())") UMatVector points);
    public native @ByVal StringVector detectAndDecode(@ByVal Mat img, @ByVal(nullValue = "cv::OutputArrayOfArrays(cv::noArray())") GpuMatVector points);
    public native @ByVal StringVector detectAndDecode(@ByVal UMat img, @ByVal(nullValue = "cv::OutputArrayOfArrays(cv::noArray())") MatVector points);
    public native @ByVal StringVector detectAndDecode(@ByVal UMat img);
    public native @ByVal StringVector detectAndDecode(@ByVal UMat img, @ByVal(nullValue = "cv::OutputArrayOfArrays(cv::noArray())") UMatVector points);
    public native @ByVal StringVector detectAndDecode(@ByVal UMat img, @ByVal(nullValue = "cv::OutputArrayOfArrays(cv::noArray())") GpuMatVector points);
    public native @ByVal StringVector detectAndDecode(@ByVal GpuMat img, @ByVal(nullValue = "cv::OutputArrayOfArrays(cv::noArray())") MatVector points);
    public native @ByVal StringVector detectAndDecode(@ByVal GpuMat img);
    public native @ByVal StringVector detectAndDecode(@ByVal GpuMat img, @ByVal(nullValue = "cv::OutputArrayOfArrays(cv::noArray())") UMatVector points);
    public native @ByVal StringVector detectAndDecode(@ByVal GpuMat img, @ByVal(nullValue = "cv::OutputArrayOfArrays(cv::noArray())") GpuMatVector points);

    /**
    * \brief set scale factor
    * QR code detector use neural network to detect QR.
    * Before running the neural network, the input image is pre-processed by scaling.
    * By default, the input image is scaled to an image with an area of 160000 pixels.
    * The scale factor allows to use custom scale the input image:
    * width = scaleFactor*width
    * height = scaleFactor*width
    *
    * scaleFactor valuse must be > 0 and <= 1, otherwise the scaleFactor value is set to -1
    * and use default scaled to an image with an area of 160000 pixels.
    */
    public native void setScaleFactor(float _scalingFactor);

    public native float getScaleFactor();
}

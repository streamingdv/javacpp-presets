// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_cudacodec;

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

import static org.bytedeco.opencv.global.opencv_cudacodec.*;


/** \brief Video reader interface, see createVideoReader().
<p>
Available if Nvidia's Video Codec SDK is installed.
<p>
Decoding support is dependent on the GPU, refer to the Nvidia Video Codec SDK Video Encode and Decode GPU Support Matrix for details.
<p>
\note
   -   An example on how to use the VideoReader interface can be found at
        opencv_source_code/samples/gpu/video_reader.cpp
 */
@Name("cv::cudacodec::VideoReader") @Properties(inherit = org.bytedeco.opencv.presets.opencv_cudacodec.class)
public class VideoReader extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public VideoReader(Pointer p) { super(p); }


    /** \brief Grabs, decodes and returns the next video frame.
    <p>
    @param frame [out] The video frame.
    @param stream Stream for the asynchronous version.
    @return {@code false} if no frames have been grabbed.
    <p>
    If no frames have been grabbed (there are no more frames in video file), the methods return false.
    The method throws an Exception if error occurs.
     */
    public native @Cast("bool") boolean nextFrame(@ByRef GpuMat frame, @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native @Cast("bool") boolean nextFrame(@ByRef GpuMat frame);

    /** \brief Grabs, decodes and returns the next video frame and frame luma histogram.
    <p>
    @param frame [out] The video frame.
    @param histogram [out] Histogram of the luma component of the encoded frame, see note.
    @param stream Stream for the asynchronous version.
    @return {@code false} if no frames have been grabbed.
    <p>
    If no frames have been grabbed (there are no more frames in video file), the methods return false.
    The method throws an Exception if error occurs.
    <p>
    \note Histogram data is collected by NVDEC during the decoding process resulting in zero performance penalty. NVDEC computes the histogram data for only the luma component of decoded output, not on post-processed frame(i.e. when scaling, cropping, etc. applied).  If the source is encoded using a limited range of luma values (FormatInfo::videoFullRangeFlag == false) then the histogram bin values will correspond to to this limited range of values and will need to be mapped to contain the same output as cuda::calcHist().  The MapHist() utility function can be used to perform this mapping on the host if required.
     */
    public native @Cast("bool") @Name("nextFrame") boolean nextFrameWithHist(@ByRef GpuMat frame, @ByRef GpuMat histogram, @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native @Cast("bool") @Name("nextFrame") boolean nextFrameWithHist(@ByRef GpuMat frame, @ByRef GpuMat histogram);

    /** \brief Returns information about video file format.
    */
    public native @ByVal FormatInfo format();

    /** \brief Grabs the next frame from the video source.
    <p>
    @param stream Stream for the asynchronous version.
    @return {@code true} (non-zero) in the case of success.
    <p>
    The method/function grabs the next frame from video file or camera and returns true (non-zero) in
    the case of success.
    <p>
    The primary use of the function is for reading both the encoded and decoded video data when rawMode is enabled.  With rawMode enabled
    retrieve() can be called following grab() to retrieve all the data associated with the current video source since the last call to grab() or the creation of the VideoReader.
     */
    public native @Cast("bool") boolean grab(@ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native @Cast("bool") boolean grab();

    /** \brief Returns previously grabbed video data.
    <p>
    @param frame [out] The returned data which depends on the provided idx.
    @param idx Determines the returned data inside image. The returned data can be the:
     - Decoded frame, idx = get(PROP_DECODED_FRAME_IDX).
     - Extra data if available, idx = get(PROP_EXTRA_DATA_INDEX).
     - Raw encoded data package.  To retrieve package i,  idx = get(PROP_RAW_PACKAGES_BASE_INDEX) + i with i < get(PROP_NUMBER_OF_RAW_PACKAGES_SINCE_LAST_GRAB)
    @return {@code false} if no frames have been grabbed
    <p>
    The method returns data associated with the current video source since the last call to grab() or the creation of the VideoReader. If no data is present
    the method returns false and the function returns an empty image.
     */
    public native @Cast("bool") boolean retrieve(@ByVal Mat frame, @Cast("const size_t") long idx/*=static_cast<size_t>(cv::cudacodec::VideoReaderProps::PROP_DECODED_FRAME_IDX)*/);
    public native @Cast("bool") boolean retrieve(@ByVal Mat frame);
    public native @Cast("bool") boolean retrieve(@ByVal UMat frame, @Cast("const size_t") long idx/*=static_cast<size_t>(cv::cudacodec::VideoReaderProps::PROP_DECODED_FRAME_IDX)*/);
    public native @Cast("bool") boolean retrieve(@ByVal UMat frame);
    public native @Cast("bool") boolean retrieve(@ByVal GpuMat frame, @Cast("const size_t") long idx/*=static_cast<size_t>(cv::cudacodec::VideoReaderProps::PROP_DECODED_FRAME_IDX)*/);
    public native @Cast("bool") boolean retrieve(@ByVal GpuMat frame);

    /** \brief Returns previously grabbed encoded video data.
    <p>
    @param frame [out] The encoded video data.
    @param idx Determines the returned data inside image. The returned data can be the:
     - Extra data if available, idx = get(PROP_EXTRA_DATA_INDEX).
     - Raw encoded data package.  To retrieve package i,  idx = get(PROP_RAW_PACKAGES_BASE_INDEX) + i with i < get(PROP_NUMBER_OF_RAW_PACKAGES_SINCE_LAST_GRAB)
    @return {@code false} if no frames have been grabbed
    <p>
    The method returns data associated with the current video source since the last call to grab() or the creation of the VideoReader. If no data is present
    the method returns false and the function returns an empty image.
     */

    /** \brief Returns the next video frame.
    <p>
    @param frame [out] The video frame.  If grab() has not been called then this will be empty().
    @return {@code false} if no frames have been grabbed
    <p>
    The method returns data associated with the current video source since the last call to grab(). If no data is present
    the method returns false and the function returns an empty image.
     */

    /** \brief Sets a property in the VideoReader.
    <p>
    @param propertyId Property identifier from cv::cudacodec::VideoReaderProps (eg. cv::cudacodec::VideoReaderProps::PROP_DECODED_FRAME_IDX,
    cv::cudacodec::VideoReaderProps::PROP_EXTRA_DATA_INDEX, ...).
    @param propertyVal Value of the property.
    @return {@code true} if the property has been set.
     */
    public native @Cast("bool") boolean set(@Cast("const cv::cudacodec::VideoReaderProps") int propertyId, double propertyVal);
    public native @Cast("bool") boolean setVideoReaderProps(@Cast("const cv::cudacodec::VideoReaderProps") int propertyId, double propertyVal);

    /** \brief Set the desired ColorFormat for the frame returned by nextFrame()/retrieve().
    <p>
    @param colorFormat Value of the ColorFormat.
    @return {@code true} unless the colorFormat is not supported.
     */
    public native @Cast("bool") boolean set(@Cast("const cv::cudacodec::ColorFormat") int colorFormat);

    /** \brief Returns the specified VideoReader property
    <p>
    @param propertyId Property identifier from cv::cudacodec::VideoReaderProps (eg. cv::cudacodec::VideoReaderProps::PROP_DECODED_FRAME_IDX,
    cv::cudacodec::VideoReaderProps::PROP_EXTRA_DATA_INDEX, ...).
    @param propertyVal
     - In: Optional value required for querying specific propertyId's, e.g. the index of the raw package to be checked for a key frame (cv::cudacodec::VideoReaderProps::PROP_LRF_HAS_KEY_FRAME).
     - Out: Value of the property.
    @return {@code true} unless the property is not supported.
    */
    public native @Cast("bool") boolean get(@Cast("const cv::cudacodec::VideoReaderProps") int propertyId, @ByRef DoublePointer propertyVal);
    public native @Cast("bool") boolean get(@Cast("const cv::cudacodec::VideoReaderProps") int propertyId, @ByRef DoubleBuffer propertyVal);
    public native @Cast("bool") boolean get(@Cast("const cv::cudacodec::VideoReaderProps") int propertyId, @ByRef double[] propertyVal);
    public native @Cast("bool") boolean getVideoReaderProps(@Cast("const cv::cudacodec::VideoReaderProps") int propertyId,  @ByRef DoublePointer propertyValOut, double propertyValIn/*=0*/);
    public native @Cast("bool") boolean getVideoReaderProps(@Cast("const cv::cudacodec::VideoReaderProps") int propertyId,  @ByRef DoublePointer propertyValOut);
    public native @Cast("bool") boolean getVideoReaderProps(@Cast("const cv::cudacodec::VideoReaderProps") int propertyId,  @ByRef DoubleBuffer propertyValOut, double propertyValIn/*=0*/);
    public native @Cast("bool") boolean getVideoReaderProps(@Cast("const cv::cudacodec::VideoReaderProps") int propertyId,  @ByRef DoubleBuffer propertyValOut);
    public native @Cast("bool") boolean getVideoReaderProps(@Cast("const cv::cudacodec::VideoReaderProps") int propertyId,  @ByRef double[] propertyValOut, double propertyValIn/*=0*/);
    public native @Cast("bool") boolean getVideoReaderProps(@Cast("const cv::cudacodec::VideoReaderProps") int propertyId,  @ByRef double[] propertyValOut);

    /** \brief Retrieves the specified property used by the VideoSource.
    <p>
    @param propertyId Property identifier from cv::VideoCaptureProperties (eg. cv::CAP_PROP_POS_MSEC, cv::CAP_PROP_POS_FRAMES, ...)
    or one from \ref videoio_flags_others.
    @param propertyVal Value for the specified property.
    <p>
    @return {@code true} unless the property is unset set or not supported.
     */
}

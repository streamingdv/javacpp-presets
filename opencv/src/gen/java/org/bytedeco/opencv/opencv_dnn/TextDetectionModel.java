// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_dnn;

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

import static org.bytedeco.opencv.global.opencv_dnn.*;



/** \brief Base class for text detection networks
 */
@Namespace("cv::dnn") @Properties(inherit = org.bytedeco.opencv.presets.opencv_dnn.class)
public class TextDetectionModel extends Model {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TextDetectionModel(Pointer p) { super(p); }


    /** \brief Performs detection
     *
     * Given the input \p frame, prepare network input, run network inference, post-process network output and return result detections.
     *
     * Each result is quadrangle's 4 points in this order:
     * - bottom-left
     * - top-left
     * - top-right
     * - bottom-right
     *
     * Use cv::getPerspectiveTransform function to retrieve image region without perspective transformations.
     *
     * \note If DL model doesn't support that kind of output then result may be derived from detectTextRectangles() output.
     *
     * @param frame [in] The input image
     * @param detections [out] array with detections' quadrangles (4 points per result)
     * @param confidences [out] array with detection confidences
     */
    public native void detect(
                @ByVal Mat frame,
                @ByRef PointVectorVector detections,
                @StdVector FloatPointer confidences
        );
    public native void detect(
                @ByVal Mat frame,
                @ByRef PointVectorVector detections,
                @StdVector FloatBuffer confidences
        );
    public native void detect(
                @ByVal Mat frame,
                @ByRef PointVectorVector detections,
                @StdVector float[] confidences
        );
    public native void detect(
                @ByVal UMat frame,
                @ByRef PointVectorVector detections,
                @StdVector FloatPointer confidences
        );
    public native void detect(
                @ByVal UMat frame,
                @ByRef PointVectorVector detections,
                @StdVector FloatBuffer confidences
        );
    public native void detect(
                @ByVal UMat frame,
                @ByRef PointVectorVector detections,
                @StdVector float[] confidences
        );
    public native void detect(
                @ByVal GpuMat frame,
                @ByRef PointVectorVector detections,
                @StdVector FloatPointer confidences
        );
    public native void detect(
                @ByVal GpuMat frame,
                @ByRef PointVectorVector detections,
                @StdVector FloatBuffer confidences
        );
    public native void detect(
                @ByVal GpuMat frame,
                @ByRef PointVectorVector detections,
                @StdVector float[] confidences
        );

    /** \overload */
    public native void detect(
                @ByVal Mat frame,
                @ByRef PointVectorVector detections
        );
    public native void detect(
                @ByVal UMat frame,
                @ByRef PointVectorVector detections
        );
    public native void detect(
                @ByVal GpuMat frame,
                @ByRef PointVectorVector detections
        );

    /** \brief Performs detection
     *
     * Given the input \p frame, prepare network input, run network inference, post-process network output and return result detections.
     *
     * Each result is rotated rectangle.
     *
     * \note Result may be inaccurate in case of strong perspective transformations.
     *
     * @param frame [in] the input image
     * @param detections [out] array with detections' RotationRect results
     * @param confidences [out] array with detection confidences
     */
    public native void detectTextRectangles(
                @ByVal Mat frame,
                @StdVector RotatedRect detections,
                @StdVector FloatPointer confidences
        );
    public native void detectTextRectangles(
                @ByVal Mat frame,
                @StdVector RotatedRect detections,
                @StdVector FloatBuffer confidences
        );
    public native void detectTextRectangles(
                @ByVal Mat frame,
                @StdVector RotatedRect detections,
                @StdVector float[] confidences
        );
    public native void detectTextRectangles(
                @ByVal UMat frame,
                @StdVector RotatedRect detections,
                @StdVector FloatPointer confidences
        );
    public native void detectTextRectangles(
                @ByVal UMat frame,
                @StdVector RotatedRect detections,
                @StdVector FloatBuffer confidences
        );
    public native void detectTextRectangles(
                @ByVal UMat frame,
                @StdVector RotatedRect detections,
                @StdVector float[] confidences
        );
    public native void detectTextRectangles(
                @ByVal GpuMat frame,
                @StdVector RotatedRect detections,
                @StdVector FloatPointer confidences
        );
    public native void detectTextRectangles(
                @ByVal GpuMat frame,
                @StdVector RotatedRect detections,
                @StdVector FloatBuffer confidences
        );
    public native void detectTextRectangles(
                @ByVal GpuMat frame,
                @StdVector RotatedRect detections,
                @StdVector float[] confidences
        );

    /** \overload */
    public native void detectTextRectangles(
                @ByVal Mat frame,
                @StdVector RotatedRect detections
        );
    public native void detectTextRectangles(
                @ByVal UMat frame,
                @StdVector RotatedRect detections
        );
    public native void detectTextRectangles(
                @ByVal GpuMat frame,
                @StdVector RotatedRect detections
        );
}

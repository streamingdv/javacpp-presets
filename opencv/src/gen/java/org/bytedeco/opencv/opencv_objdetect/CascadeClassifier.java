// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

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


/** \example samples/cpp/facedetect.cpp
This program demonstrates usage of the Cascade classifier class
\image html Cascade_Classifier_Tutorial_Result_Haar.jpg "Sample screenshot" width=321 height=254
*/
/** \brief Cascade classifier class for object detection.
 */
@Namespace("cv") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_objdetect.class)
public class CascadeClassifier extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CascadeClassifier(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CascadeClassifier(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public CascadeClassifier position(long position) {
        return (CascadeClassifier)super.position(position);
    }
    @Override public CascadeClassifier getPointer(long i) {
        return new CascadeClassifier((Pointer)this).offsetAddress(i);
    }

    public CascadeClassifier() { super((Pointer)null); allocate(); }
    private native void allocate();
    /** \brief Loads a classifier from a file.
    <p>
    @param filename Name of the file from which the classifier is loaded.
     */
    public CascadeClassifier(@Str BytePointer filename) { super((Pointer)null); allocate(filename); }
    private native void allocate(@Str BytePointer filename);
    public CascadeClassifier(@Str String filename) { super((Pointer)null); allocate(filename); }
    private native void allocate(@Str String filename);
    /** \brief Checks whether the classifier has been loaded.
    */
    public native @Cast("bool") boolean empty();
    /** \brief Loads a classifier from a file.
    <p>
    @param filename Name of the file from which the classifier is loaded. The file may contain an old
    HAAR classifier trained by the haartraining application or a new cascade classifier trained by the
    traincascade application.
     */
    public native @Cast("bool") boolean load( @Str BytePointer filename );
    public native @Cast("bool") boolean load( @Str String filename );
    /** \brief Reads a classifier from a FileStorage node.
    <p>
    \note The file may contain a new cascade classifier (trained by the traincascade application) only.
     */
    public native @Cast("bool") boolean read( @Const @ByRef FileNode node );

    /** \brief Detects objects of different sizes in the input image. The detected objects are returned as a list
    of rectangles.
    <p>
    @param image Matrix of the type CV_8U containing an image where objects are detected.
    @param objects Vector of rectangles where each rectangle contains the detected object, the
    rectangles may be partially outside the original image.
    @param scaleFactor Parameter specifying how much the image size is reduced at each image scale.
    @param minNeighbors Parameter specifying how many neighbors each candidate rectangle should have
    to retain it.
    @param flags Parameter with the same meaning for an old cascade as in the function
    cvHaarDetectObjects. It is not used for a new cascade.
    @param minSize Minimum possible object size. Objects smaller than that are ignored.
    @param maxSize Maximum possible object size. Objects larger than that are ignored. If {@code maxSize == minSize} model is evaluated on single scale.
    */
    public native void detectMultiScale( @ByVal Mat image,
                              @ByRef RectVector objects,
                              double scaleFactor/*=1.1*/,
                              int minNeighbors/*=3*/, int flags/*=0*/,
                              @ByVal(nullValue = "cv::Size()") Size minSize,
                              @ByVal(nullValue = "cv::Size()") Size maxSize );
    public native void detectMultiScale( @ByVal Mat image,
                              @ByRef RectVector objects );
    public native void detectMultiScale( @ByVal UMat image,
                              @ByRef RectVector objects,
                              double scaleFactor/*=1.1*/,
                              int minNeighbors/*=3*/, int flags/*=0*/,
                              @ByVal(nullValue = "cv::Size()") Size minSize,
                              @ByVal(nullValue = "cv::Size()") Size maxSize );
    public native void detectMultiScale( @ByVal UMat image,
                              @ByRef RectVector objects );
    public native void detectMultiScale( @ByVal GpuMat image,
                              @ByRef RectVector objects,
                              double scaleFactor/*=1.1*/,
                              int minNeighbors/*=3*/, int flags/*=0*/,
                              @ByVal(nullValue = "cv::Size()") Size minSize,
                              @ByVal(nullValue = "cv::Size()") Size maxSize );
    public native void detectMultiScale( @ByVal GpuMat image,
                              @ByRef RectVector objects );

    /** \overload
    @param image Matrix of the type CV_8U containing an image where objects are detected.
    @param objects Vector of rectangles where each rectangle contains the detected object, the
    rectangles may be partially outside the original image.
    @param numDetections Vector of detection numbers for the corresponding objects. An object's number
    of detections is the number of neighboring positively classified rectangles that were joined
    together to form the object.
    @param scaleFactor Parameter specifying how much the image size is reduced at each image scale.
    @param minNeighbors Parameter specifying how many neighbors each candidate rectangle should have
    to retain it.
    @param flags Parameter with the same meaning for an old cascade as in the function
    cvHaarDetectObjects. It is not used for a new cascade.
    @param minSize Minimum possible object size. Objects smaller than that are ignored.
    @param maxSize Maximum possible object size. Objects larger than that are ignored. If {@code maxSize == minSize} model is evaluated on single scale.
    */
    public native @Name("detectMultiScale") void detectMultiScale2( @ByVal Mat image,
                              @ByRef RectVector objects,
                              @StdVector IntPointer numDetections,
                              double scaleFactor/*=1.1*/,
                              int minNeighbors/*=3*/, int flags/*=0*/,
                              @ByVal(nullValue = "cv::Size()") Size minSize,
                              @ByVal(nullValue = "cv::Size()") Size maxSize );
    public native @Name("detectMultiScale") void detectMultiScale2( @ByVal Mat image,
                              @ByRef RectVector objects,
                              @StdVector IntPointer numDetections );
    public native @Name("detectMultiScale") void detectMultiScale2( @ByVal Mat image,
                              @ByRef RectVector objects,
                              @StdVector IntBuffer numDetections,
                              double scaleFactor/*=1.1*/,
                              int minNeighbors/*=3*/, int flags/*=0*/,
                              @ByVal(nullValue = "cv::Size()") Size minSize,
                              @ByVal(nullValue = "cv::Size()") Size maxSize );
    public native @Name("detectMultiScale") void detectMultiScale2( @ByVal Mat image,
                              @ByRef RectVector objects,
                              @StdVector IntBuffer numDetections );
    public native @Name("detectMultiScale") void detectMultiScale2( @ByVal Mat image,
                              @ByRef RectVector objects,
                              @StdVector int[] numDetections,
                              double scaleFactor/*=1.1*/,
                              int minNeighbors/*=3*/, int flags/*=0*/,
                              @ByVal(nullValue = "cv::Size()") Size minSize,
                              @ByVal(nullValue = "cv::Size()") Size maxSize );
    public native @Name("detectMultiScale") void detectMultiScale2( @ByVal Mat image,
                              @ByRef RectVector objects,
                              @StdVector int[] numDetections );
    public native @Name("detectMultiScale") void detectMultiScale2( @ByVal UMat image,
                              @ByRef RectVector objects,
                              @StdVector IntPointer numDetections,
                              double scaleFactor/*=1.1*/,
                              int minNeighbors/*=3*/, int flags/*=0*/,
                              @ByVal(nullValue = "cv::Size()") Size minSize,
                              @ByVal(nullValue = "cv::Size()") Size maxSize );
    public native @Name("detectMultiScale") void detectMultiScale2( @ByVal UMat image,
                              @ByRef RectVector objects,
                              @StdVector IntPointer numDetections );
    public native @Name("detectMultiScale") void detectMultiScale2( @ByVal UMat image,
                              @ByRef RectVector objects,
                              @StdVector IntBuffer numDetections,
                              double scaleFactor/*=1.1*/,
                              int minNeighbors/*=3*/, int flags/*=0*/,
                              @ByVal(nullValue = "cv::Size()") Size minSize,
                              @ByVal(nullValue = "cv::Size()") Size maxSize );
    public native @Name("detectMultiScale") void detectMultiScale2( @ByVal UMat image,
                              @ByRef RectVector objects,
                              @StdVector IntBuffer numDetections );
    public native @Name("detectMultiScale") void detectMultiScale2( @ByVal UMat image,
                              @ByRef RectVector objects,
                              @StdVector int[] numDetections,
                              double scaleFactor/*=1.1*/,
                              int minNeighbors/*=3*/, int flags/*=0*/,
                              @ByVal(nullValue = "cv::Size()") Size minSize,
                              @ByVal(nullValue = "cv::Size()") Size maxSize );
    public native @Name("detectMultiScale") void detectMultiScale2( @ByVal UMat image,
                              @ByRef RectVector objects,
                              @StdVector int[] numDetections );
    public native @Name("detectMultiScale") void detectMultiScale2( @ByVal GpuMat image,
                              @ByRef RectVector objects,
                              @StdVector IntPointer numDetections,
                              double scaleFactor/*=1.1*/,
                              int minNeighbors/*=3*/, int flags/*=0*/,
                              @ByVal(nullValue = "cv::Size()") Size minSize,
                              @ByVal(nullValue = "cv::Size()") Size maxSize );
    public native @Name("detectMultiScale") void detectMultiScale2( @ByVal GpuMat image,
                              @ByRef RectVector objects,
                              @StdVector IntPointer numDetections );
    public native @Name("detectMultiScale") void detectMultiScale2( @ByVal GpuMat image,
                              @ByRef RectVector objects,
                              @StdVector IntBuffer numDetections,
                              double scaleFactor/*=1.1*/,
                              int minNeighbors/*=3*/, int flags/*=0*/,
                              @ByVal(nullValue = "cv::Size()") Size minSize,
                              @ByVal(nullValue = "cv::Size()") Size maxSize );
    public native @Name("detectMultiScale") void detectMultiScale2( @ByVal GpuMat image,
                              @ByRef RectVector objects,
                              @StdVector IntBuffer numDetections );
    public native @Name("detectMultiScale") void detectMultiScale2( @ByVal GpuMat image,
                              @ByRef RectVector objects,
                              @StdVector int[] numDetections,
                              double scaleFactor/*=1.1*/,
                              int minNeighbors/*=3*/, int flags/*=0*/,
                              @ByVal(nullValue = "cv::Size()") Size minSize,
                              @ByVal(nullValue = "cv::Size()") Size maxSize );
    public native @Name("detectMultiScale") void detectMultiScale2( @ByVal GpuMat image,
                              @ByRef RectVector objects,
                              @StdVector int[] numDetections );

    /** \overload
    This function allows you to retrieve the final stage decision certainty of classification.
    For this, one needs to set {@code outputRejectLevels} on true and provide the {@code rejectLevels} and {@code levelWeights} parameter.
    For each resulting detection, {@code levelWeights} will then contain the certainty of classification at the final stage.
    This value can then be used to separate strong from weaker classifications.
    <p>
    A code sample on how to use it efficiently can be found below:
    <pre>{@code
    Mat img;
    vector<double> weights;
    vector<int> levels;
    vector<Rect> detections;
    CascadeClassifier model("/path/to/your/model.xml");
    model.detectMultiScale(img, detections, levels, weights, 1.1, 3, 0, Size(), Size(), true);
    cerr << "Detection " << detections[0] << " with weight " << weights[0] << endl;
    }</pre>
    */
    public native @Name("detectMultiScale") void detectMultiScale3( @ByVal Mat image,
                                      @ByRef RectVector objects,
                                      @StdVector IntPointer rejectLevels,
                                      @StdVector DoublePointer levelWeights,
                                      double scaleFactor/*=1.1*/,
                                      int minNeighbors/*=3*/, int flags/*=0*/,
                                      @ByVal(nullValue = "cv::Size()") Size minSize,
                                      @ByVal(nullValue = "cv::Size()") Size maxSize,
                                      @Cast("bool") boolean outputRejectLevels/*=false*/ );
    public native @Name("detectMultiScale") void detectMultiScale3( @ByVal Mat image,
                                      @ByRef RectVector objects,
                                      @StdVector IntPointer rejectLevels,
                                      @StdVector DoublePointer levelWeights );
    public native @Name("detectMultiScale") void detectMultiScale3( @ByVal Mat image,
                                      @ByRef RectVector objects,
                                      @StdVector IntBuffer rejectLevels,
                                      @StdVector DoubleBuffer levelWeights,
                                      double scaleFactor/*=1.1*/,
                                      int minNeighbors/*=3*/, int flags/*=0*/,
                                      @ByVal(nullValue = "cv::Size()") Size minSize,
                                      @ByVal(nullValue = "cv::Size()") Size maxSize,
                                      @Cast("bool") boolean outputRejectLevels/*=false*/ );
    public native @Name("detectMultiScale") void detectMultiScale3( @ByVal Mat image,
                                      @ByRef RectVector objects,
                                      @StdVector IntBuffer rejectLevels,
                                      @StdVector DoubleBuffer levelWeights );
    public native @Name("detectMultiScale") void detectMultiScale3( @ByVal Mat image,
                                      @ByRef RectVector objects,
                                      @StdVector int[] rejectLevels,
                                      @StdVector double[] levelWeights,
                                      double scaleFactor/*=1.1*/,
                                      int minNeighbors/*=3*/, int flags/*=0*/,
                                      @ByVal(nullValue = "cv::Size()") Size minSize,
                                      @ByVal(nullValue = "cv::Size()") Size maxSize,
                                      @Cast("bool") boolean outputRejectLevels/*=false*/ );
    public native @Name("detectMultiScale") void detectMultiScale3( @ByVal Mat image,
                                      @ByRef RectVector objects,
                                      @StdVector int[] rejectLevels,
                                      @StdVector double[] levelWeights );
    public native @Name("detectMultiScale") void detectMultiScale3( @ByVal UMat image,
                                      @ByRef RectVector objects,
                                      @StdVector IntPointer rejectLevels,
                                      @StdVector DoublePointer levelWeights,
                                      double scaleFactor/*=1.1*/,
                                      int minNeighbors/*=3*/, int flags/*=0*/,
                                      @ByVal(nullValue = "cv::Size()") Size minSize,
                                      @ByVal(nullValue = "cv::Size()") Size maxSize,
                                      @Cast("bool") boolean outputRejectLevels/*=false*/ );
    public native @Name("detectMultiScale") void detectMultiScale3( @ByVal UMat image,
                                      @ByRef RectVector objects,
                                      @StdVector IntPointer rejectLevels,
                                      @StdVector DoublePointer levelWeights );
    public native @Name("detectMultiScale") void detectMultiScale3( @ByVal UMat image,
                                      @ByRef RectVector objects,
                                      @StdVector IntBuffer rejectLevels,
                                      @StdVector DoubleBuffer levelWeights,
                                      double scaleFactor/*=1.1*/,
                                      int minNeighbors/*=3*/, int flags/*=0*/,
                                      @ByVal(nullValue = "cv::Size()") Size minSize,
                                      @ByVal(nullValue = "cv::Size()") Size maxSize,
                                      @Cast("bool") boolean outputRejectLevels/*=false*/ );
    public native @Name("detectMultiScale") void detectMultiScale3( @ByVal UMat image,
                                      @ByRef RectVector objects,
                                      @StdVector IntBuffer rejectLevels,
                                      @StdVector DoubleBuffer levelWeights );
    public native @Name("detectMultiScale") void detectMultiScale3( @ByVal UMat image,
                                      @ByRef RectVector objects,
                                      @StdVector int[] rejectLevels,
                                      @StdVector double[] levelWeights,
                                      double scaleFactor/*=1.1*/,
                                      int minNeighbors/*=3*/, int flags/*=0*/,
                                      @ByVal(nullValue = "cv::Size()") Size minSize,
                                      @ByVal(nullValue = "cv::Size()") Size maxSize,
                                      @Cast("bool") boolean outputRejectLevels/*=false*/ );
    public native @Name("detectMultiScale") void detectMultiScale3( @ByVal UMat image,
                                      @ByRef RectVector objects,
                                      @StdVector int[] rejectLevels,
                                      @StdVector double[] levelWeights );
    public native @Name("detectMultiScale") void detectMultiScale3( @ByVal GpuMat image,
                                      @ByRef RectVector objects,
                                      @StdVector IntPointer rejectLevels,
                                      @StdVector DoublePointer levelWeights,
                                      double scaleFactor/*=1.1*/,
                                      int minNeighbors/*=3*/, int flags/*=0*/,
                                      @ByVal(nullValue = "cv::Size()") Size minSize,
                                      @ByVal(nullValue = "cv::Size()") Size maxSize,
                                      @Cast("bool") boolean outputRejectLevels/*=false*/ );
    public native @Name("detectMultiScale") void detectMultiScale3( @ByVal GpuMat image,
                                      @ByRef RectVector objects,
                                      @StdVector IntPointer rejectLevels,
                                      @StdVector DoublePointer levelWeights );
    public native @Name("detectMultiScale") void detectMultiScale3( @ByVal GpuMat image,
                                      @ByRef RectVector objects,
                                      @StdVector IntBuffer rejectLevels,
                                      @StdVector DoubleBuffer levelWeights,
                                      double scaleFactor/*=1.1*/,
                                      int minNeighbors/*=3*/, int flags/*=0*/,
                                      @ByVal(nullValue = "cv::Size()") Size minSize,
                                      @ByVal(nullValue = "cv::Size()") Size maxSize,
                                      @Cast("bool") boolean outputRejectLevels/*=false*/ );
    public native @Name("detectMultiScale") void detectMultiScale3( @ByVal GpuMat image,
                                      @ByRef RectVector objects,
                                      @StdVector IntBuffer rejectLevels,
                                      @StdVector DoubleBuffer levelWeights );
    public native @Name("detectMultiScale") void detectMultiScale3( @ByVal GpuMat image,
                                      @ByRef RectVector objects,
                                      @StdVector int[] rejectLevels,
                                      @StdVector double[] levelWeights,
                                      double scaleFactor/*=1.1*/,
                                      int minNeighbors/*=3*/, int flags/*=0*/,
                                      @ByVal(nullValue = "cv::Size()") Size minSize,
                                      @ByVal(nullValue = "cv::Size()") Size maxSize,
                                      @Cast("bool") boolean outputRejectLevels/*=false*/ );
    public native @Name("detectMultiScale") void detectMultiScale3( @ByVal GpuMat image,
                                      @ByRef RectVector objects,
                                      @StdVector int[] rejectLevels,
                                      @StdVector double[] levelWeights );

    public native @Cast("bool") boolean isOldFormatCascade();
    public native @ByVal Size getOriginalWindowSize();
    public native int getFeatureType();
    public native Pointer getOldCascade();

    public static native @Cast("bool") boolean convert(@Str BytePointer oldcascade, @Str BytePointer newcascade);
    public static native @Cast("bool") boolean convert(@Str String oldcascade, @Str String newcascade);

    public native void setMaskGenerator(@Ptr BaseCascadeClassifier.MaskGenerator maskGenerator);
    public native @Ptr BaseCascadeClassifier.MaskGenerator getMaskGenerator();

    public native @Ptr BaseCascadeClassifier cc(); public native CascadeClassifier cc(BaseCascadeClassifier setter);
}

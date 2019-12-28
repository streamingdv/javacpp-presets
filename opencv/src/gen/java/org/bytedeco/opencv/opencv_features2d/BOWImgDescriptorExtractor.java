// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_features2d;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

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

import static org.bytedeco.opencv.global.opencv_features2d.*;


/** \brief Class to compute an image descriptor using the *bag of visual words*.
<p>
Such a computation consists of the following steps:
<p>
1.  Compute descriptors for a given image and its keypoints set.
2.  Find the nearest visual words from the vocabulary for each keypoint descriptor.
3.  Compute the bag-of-words image descriptor as is a normalized histogram of vocabulary words
encountered in the image. The i-th bin of the histogram is a frequency of i-th word of the
vocabulary in the given image.
 */
@Namespace("cv") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_features2d.class)
public class BOWImgDescriptorExtractor extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BOWImgDescriptorExtractor(Pointer p) { super(p); }

    /** \brief The constructor.
    <p>
    @param dextractor Descriptor extractor that is used to compute descriptors for an input image and
    its keypoints.
    @param dmatcher Descriptor matcher that is used to find the nearest word of the trained vocabulary
    for each keypoint descriptor of the image.
     */
    public BOWImgDescriptorExtractor( @Cast("cv::DescriptorExtractor*") @Ptr Feature2D dextractor,
                                   @Ptr DescriptorMatcher dmatcher ) { super((Pointer)null); allocate(dextractor, dmatcher); }
    private native void allocate( @Cast("cv::DescriptorExtractor*") @Ptr Feature2D dextractor,
                                   @Ptr DescriptorMatcher dmatcher );
    /** \overload */
    public BOWImgDescriptorExtractor( @Ptr DescriptorMatcher dmatcher ) { super((Pointer)null); allocate(dmatcher); }
    private native void allocate( @Ptr DescriptorMatcher dmatcher );

    /** \brief Sets a visual vocabulary.
    <p>
    @param vocabulary Vocabulary (can be trained using the inheritor of BOWTrainer ). Each row of the
    vocabulary is a visual word (cluster center).
     */
    public native void setVocabulary( @Const @ByRef Mat vocabulary );

    /** \brief Returns the set vocabulary.
    */
    public native @Const @ByRef Mat getVocabulary();

    /** \brief Computes an image descriptor using the set visual vocabulary.
    <p>
    @param image Image, for which the descriptor is computed.
    @param keypoints Keypoints detected in the input image.
    @param imgDescriptor Computed output image descriptor.
    @param pointIdxsOfClusters Indices of keypoints that belong to the cluster. This means that
    pointIdxsOfClusters[i] are keypoint indices that belong to the i -th cluster (word of vocabulary)
    returned if it is non-zero.
    @param descriptors Descriptors of the image keypoints that are returned if they are non-zero.
     */
    public native void compute( @ByVal Mat image, @ByRef KeyPointVector keypoints, @ByVal Mat imgDescriptor,
                      IntVectorVector pointIdxsOfClusters/*=0*/, Mat descriptors/*=0*/ );
    public native void compute( @ByVal Mat image, @ByRef KeyPointVector keypoints, @ByVal Mat imgDescriptor );
    public native void compute( @ByVal UMat image, @ByRef KeyPointVector keypoints, @ByVal UMat imgDescriptor,
                      IntVectorVector pointIdxsOfClusters/*=0*/, Mat descriptors/*=0*/ );
    public native void compute( @ByVal UMat image, @ByRef KeyPointVector keypoints, @ByVal UMat imgDescriptor );
    public native void compute( @ByVal GpuMat image, @ByRef KeyPointVector keypoints, @ByVal GpuMat imgDescriptor,
                      IntVectorVector pointIdxsOfClusters/*=0*/, Mat descriptors/*=0*/ );
    public native void compute( @ByVal GpuMat image, @ByRef KeyPointVector keypoints, @ByVal GpuMat imgDescriptor );
    /** \overload
    @param keypointDescriptors Computed descriptors to match with vocabulary.
    @param imgDescriptor Computed output image descriptor.
    @param pointIdxsOfClusters Indices of keypoints that belong to the cluster. This means that
    pointIdxsOfClusters[i] are keypoint indices that belong to the i -th cluster (word of vocabulary)
    returned if it is non-zero.
    */
    public native void compute( @ByVal Mat keypointDescriptors, @ByVal Mat imgDescriptor,
                      IntVectorVector pointIdxsOfClusters/*=0*/ );
    public native void compute( @ByVal Mat keypointDescriptors, @ByVal Mat imgDescriptor );
    public native void compute( @ByVal UMat keypointDescriptors, @ByVal UMat imgDescriptor,
                      IntVectorVector pointIdxsOfClusters/*=0*/ );
    public native void compute( @ByVal UMat keypointDescriptors, @ByVal UMat imgDescriptor );
    public native void compute( @ByVal GpuMat keypointDescriptors, @ByVal GpuMat imgDescriptor,
                      IntVectorVector pointIdxsOfClusters/*=0*/ );
    public native void compute( @ByVal GpuMat keypointDescriptors, @ByVal GpuMat imgDescriptor );
    // compute() is not constant because DescriptorMatcher::match is not constant

    /** \brief Returns an image descriptor size if the vocabulary is set. Otherwise, it returns 0.
    */
    public native int descriptorSize();

    /** \brief Returns an image descriptor type.
     */
    public native int descriptorType();
}

// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.global;

import org.bytedeco.opencv.opencv_features2d.*;

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

public class opencv_features2d extends org.bytedeco.opencv.presets.opencv_features2d {
    static { Loader.load(); }

// Parsed from <opencv2/features2d.hpp>

/*M///////////////////////////////////////////////////////////////////////////////////////
//
//  IMPORTANT: READ BEFORE DOWNLOADING, COPYING, INSTALLING OR USING.
//
//  By downloading, copying, installing or using the software you agree to this license.
//  If you do not agree to this license, do not download, install,
//  copy or use the software.
//
//
//                           License Agreement
//                For Open Source Computer Vision Library
//
// Copyright (C) 2000-2008, Intel Corporation, all rights reserved.
// Copyright (C) 2009, Willow Garage Inc., all rights reserved.
// Third party copyrights are property of their respective owners.
//
// Redistribution and use in source and binary forms, with or without modification,
// are permitted provided that the following conditions are met:
//
//   * Redistribution's of source code must retain the above copyright notice,
//     this list of conditions and the following disclaimer.
//
//   * Redistribution's in binary form must reproduce the above copyright notice,
//     this list of conditions and the following disclaimer in the documentation
//     and/or other materials provided with the distribution.
//
//   * The name of the copyright holders may not be used to endorse or promote products
//     derived from this software without specific prior written permission.
//
// This software is provided by the copyright holders and contributors "as is" and
// any express or implied warranties, including, but not limited to, the implied
// warranties of merchantability and fitness for a particular purpose are disclaimed.
// In no event shall the Intel Corporation or contributors be liable for any direct,
// indirect, incidental, special, exemplary, or consequential damages
// (including, but not limited to, procurement of substitute goods or services;
// loss of use, data, or profits; or business interruption) however caused
// and on any theory of liability, whether in contract, strict liability,
// or tort (including negligence or otherwise) arising in any way out of
// the use of this software, even if advised of the possibility of such damage.
//
//M*/

// #ifndef OPENCV_FEATURES_2D_HPP
// #define OPENCV_FEATURES_2D_HPP

// #include "opencv2/opencv_modules.hpp"
// #include "opencv2/core.hpp"

// #ifdef HAVE_OPENCV_FLANN
// #include "opencv2/flann/miniflann.hpp"
// #endif

/**
  \defgroup features2d 2D Features Framework
  \{
    \defgroup features2d_main Feature Detection and Description
    \defgroup features2d_match Descriptor Matchers
<p>
Matchers of keypoint descriptors in OpenCV have wrappers with a common interface that enables you to
easily switch between different algorithms solving the same problem. This section is devoted to
matching descriptors that are represented as vectors in a multidimensional space. All objects that
implement vector descriptor matchers inherit the DescriptorMatcher interface.
    <p>
    \defgroup features2d_draw Drawing Function of Keypoints and Matches
    \defgroup features2d_category Object Categorization
<p>
This section describes approaches based on local 2D features and used to categorize objects.
    <p>
    \defgroup feature2d_hal Hardware Acceleration Layer
    \{
        \defgroup features2d_hal_interface Interface
    \}
  \}
 */
// Targeting ../opencv_features2d/KeyPointsFilter.java


// Targeting ../opencv_features2d/Feature2D.java



/** Feature detectors in OpenCV have wrappers with a common interface that enables you to easily switch
between different algorithms solving the same problem. All objects that implement keypoint detectors
inherit the FeatureDetector interface. */

/** Extractors of keypoint descriptors in OpenCV have wrappers with a common interface that enables you
to easily switch between different algorithms solving the same problem. This section is devoted to
computing descriptors represented as vectors in a multidimensional space. All objects that implement
the vector descriptor extractors inherit the DescriptorExtractor interface.
 */
// Targeting ../opencv_features2d/AffineFeature.java


// Targeting ../opencv_features2d/SIFT.java


// Targeting ../opencv_features2d/BRISK.java


// Targeting ../opencv_features2d/ORB.java


// Targeting ../opencv_features2d/MSER.java


// Targeting ../opencv_features2d/FastFeatureDetector.java



/** \overload */
@Namespace("cv") public static native void FAST( @ByVal Mat image, @ByRef KeyPointVector keypoints,
                      int threshold, @Cast("bool") boolean nonmaxSuppression/*=true*/ );
@Namespace("cv") public static native void FAST( @ByVal Mat image, @ByRef KeyPointVector keypoints,
                      int threshold );
@Namespace("cv") public static native void FAST( @ByVal UMat image, @ByRef KeyPointVector keypoints,
                      int threshold, @Cast("bool") boolean nonmaxSuppression/*=true*/ );
@Namespace("cv") public static native void FAST( @ByVal UMat image, @ByRef KeyPointVector keypoints,
                      int threshold );
@Namespace("cv") public static native void FAST( @ByVal GpuMat image, @ByRef KeyPointVector keypoints,
                      int threshold, @Cast("bool") boolean nonmaxSuppression/*=true*/ );
@Namespace("cv") public static native void FAST( @ByVal GpuMat image, @ByRef KeyPointVector keypoints,
                      int threshold );

/** \brief Detects corners using the FAST algorithm
<p>
@param image grayscale image where keypoints (corners) are detected.
@param keypoints keypoints detected on the image.
@param threshold threshold on difference between intensity of the central pixel and pixels of a
circle around this pixel.
@param nonmaxSuppression if true, non-maximum suppression is applied to detected corners
(keypoints).
@param type one of the three neighborhoods as defined in the paper:
FastFeatureDetector::TYPE_9_16, FastFeatureDetector::TYPE_7_12,
FastFeatureDetector::TYPE_5_8
<p>
Detects corners using the FAST algorithm by \cite Rosten06 .
<p>
\note In Python API, types are given as cv.FAST_FEATURE_DETECTOR_TYPE_5_8,
cv.FAST_FEATURE_DETECTOR_TYPE_7_12 and cv.FAST_FEATURE_DETECTOR_TYPE_9_16. For corner
detection, use cv.FAST.detect() method.
 */
@Namespace("cv") public static native void FAST( @ByVal Mat image, @ByRef KeyPointVector keypoints,
                      int threshold, @Cast("bool") boolean nonmaxSuppression, @Cast("cv::FastFeatureDetector::DetectorType") int type );
@Namespace("cv") public static native void FAST( @ByVal UMat image, @ByRef KeyPointVector keypoints,
                      int threshold, @Cast("bool") boolean nonmaxSuppression, @Cast("cv::FastFeatureDetector::DetectorType") int type );
@Namespace("cv") public static native void FAST( @ByVal GpuMat image, @ByRef KeyPointVector keypoints,
                      int threshold, @Cast("bool") boolean nonmaxSuppression, @Cast("cv::FastFeatureDetector::DetectorType") int type );
// Targeting ../opencv_features2d/AgastFeatureDetector.java



/** \overload */
@Namespace("cv") public static native void AGAST( @ByVal Mat image, @ByRef KeyPointVector keypoints,
                      int threshold, @Cast("bool") boolean nonmaxSuppression/*=true*/ );
@Namespace("cv") public static native void AGAST( @ByVal Mat image, @ByRef KeyPointVector keypoints,
                      int threshold );
@Namespace("cv") public static native void AGAST( @ByVal UMat image, @ByRef KeyPointVector keypoints,
                      int threshold, @Cast("bool") boolean nonmaxSuppression/*=true*/ );
@Namespace("cv") public static native void AGAST( @ByVal UMat image, @ByRef KeyPointVector keypoints,
                      int threshold );
@Namespace("cv") public static native void AGAST( @ByVal GpuMat image, @ByRef KeyPointVector keypoints,
                      int threshold, @Cast("bool") boolean nonmaxSuppression/*=true*/ );
@Namespace("cv") public static native void AGAST( @ByVal GpuMat image, @ByRef KeyPointVector keypoints,
                      int threshold );

/** \brief Detects corners using the AGAST algorithm
<p>
@param image grayscale image where keypoints (corners) are detected.
@param keypoints keypoints detected on the image.
@param threshold threshold on difference between intensity of the central pixel and pixels of a
circle around this pixel.
@param nonmaxSuppression if true, non-maximum suppression is applied to detected corners
(keypoints).
@param type one of the four neighborhoods as defined in the paper:
AgastFeatureDetector::AGAST_5_8, AgastFeatureDetector::AGAST_7_12d,
AgastFeatureDetector::AGAST_7_12s, AgastFeatureDetector::OAST_9_16
<p>
For non-Intel platforms, there is a tree optimised variant of AGAST with same numerical results.
The 32-bit binary tree tables were generated automatically from original code using perl script.
The perl script and examples of tree generation are placed in features2d/doc folder.
Detects corners using the AGAST algorithm by \cite mair2010_agast .
 <p>
 */
@Namespace("cv") public static native void AGAST( @ByVal Mat image, @ByRef KeyPointVector keypoints,
                      int threshold, @Cast("bool") boolean nonmaxSuppression, @Cast("cv::AgastFeatureDetector::DetectorType") int type );
@Namespace("cv") public static native void AGAST( @ByVal UMat image, @ByRef KeyPointVector keypoints,
                      int threshold, @Cast("bool") boolean nonmaxSuppression, @Cast("cv::AgastFeatureDetector::DetectorType") int type );
@Namespace("cv") public static native void AGAST( @ByVal GpuMat image, @ByRef KeyPointVector keypoints,
                      int threshold, @Cast("bool") boolean nonmaxSuppression, @Cast("cv::AgastFeatureDetector::DetectorType") int type );
// Targeting ../opencv_features2d/GFTTDetector.java


// Targeting ../opencv_features2d/SimpleBlobDetector.java


// Targeting ../opencv_features2d/KAZE.java


// Targeting ../opencv_features2d/AKAZE.java



/** \} features2d_main
<p>
/****************************************************************************************\
*                                      Distance                                          *
\****************************************************************************************/

/*
 * Squared Euclidean distance functor
 */

/*
 * Euclidean distance functor
 */

/*
 * Manhattan distance (city block distance) functor
 */
// Targeting ../opencv_features2d/DescriptorMatcher.java


// Targeting ../opencv_features2d/BFMatcher.java


// Targeting ../opencv_features2d/FlannBasedMatcher.java



// #endif

/** \} features2d_match
<p>
/****************************************************************************************\
*                                   Drawing functions                                    *
\****************************************************************************************/

/** \addtogroup features2d_draw
/** \{ */

/** enum struct cv::DrawMatchesFlags */
public static final int
  /** Output image matrix will be created (Mat::create),
 *  i.e. existing memory of output image may be reused.
 *  Two source image, matches and single keypoints will be drawn.
 *  For each keypoint only the center point will be drawn (without
 *  the circle around keypoint with keypoint size and orientation). */
  DEFAULT = 0,
  /** Output image matrix will not be created (Mat::create).
 *  Matches will be drawn on existing content of output image. */
  DRAW_OVER_OUTIMG = 1,
  /** Single keypoints will not be drawn. */
  NOT_DRAW_SINGLE_POINTS = 2,
  /** For each keypoint the circle around keypoint with keypoint size and
 *  orientation will be drawn. */
  DRAW_RICH_KEYPOINTS = 4;
@Namespace("cv") public static native @Cast("bool") @Name("operator !") boolean not(@Cast("const cv::DrawMatchesFlags") int val);

@Namespace("cv") public static native @Cast("bool") @Name("operator ==") boolean equals(@Cast("const cv::DrawMatchesFlags") int a, int b);

@Namespace("cv") public static native @Cast("bool") @Name("operator !=") boolean notEquals(@Cast("const cv::DrawMatchesFlags") int a, int b);


@Namespace("cv") public static native @Cast("cv::DrawMatchesFlags") @Name("operator |") int or(@Cast("const cv::DrawMatchesFlags") int a, @Cast("const cv::DrawMatchesFlags") int b);

@Namespace("cv") public static native @Cast("cv::DrawMatchesFlags") @Name("operator &") int and(@Cast("const cv::DrawMatchesFlags") int a, @Cast("const cv::DrawMatchesFlags") int b);

@Namespace("cv") public static native @Cast("cv::DrawMatchesFlags") @Name("operator ^") int xor(@Cast("const cv::DrawMatchesFlags") int a, @Cast("const cv::DrawMatchesFlags") int b);


@Namespace("cv") public static native @Cast("cv::DrawMatchesFlags*") @ByRef @Name("operator |=") IntPointer orPut(@Cast("cv::DrawMatchesFlags*") @ByRef IntPointer _this, @Cast("const cv::DrawMatchesFlags") int val);
@Namespace("cv") public static native @Cast("cv::DrawMatchesFlags*") @ByRef @Name("operator |=") IntBuffer orPut(@Cast("cv::DrawMatchesFlags*") @ByRef IntBuffer _this, @Cast("const cv::DrawMatchesFlags") int val);
@Namespace("cv") public static native @Cast("cv::DrawMatchesFlags*") @ByRef @Name("operator |=") int[] orPut(@Cast("cv::DrawMatchesFlags*") @ByRef int[] _this, @Cast("const cv::DrawMatchesFlags") int val);

@Namespace("cv") public static native @Cast("cv::DrawMatchesFlags*") @ByRef @Name("operator &=") IntPointer andPut(@Cast("cv::DrawMatchesFlags*") @ByRef IntPointer _this, @Cast("const cv::DrawMatchesFlags") int val);
@Namespace("cv") public static native @Cast("cv::DrawMatchesFlags*") @ByRef @Name("operator &=") IntBuffer andPut(@Cast("cv::DrawMatchesFlags*") @ByRef IntBuffer _this, @Cast("const cv::DrawMatchesFlags") int val);
@Namespace("cv") public static native @Cast("cv::DrawMatchesFlags*") @ByRef @Name("operator &=") int[] andPut(@Cast("cv::DrawMatchesFlags*") @ByRef int[] _this, @Cast("const cv::DrawMatchesFlags") int val);

@Namespace("cv") public static native @Cast("cv::DrawMatchesFlags*") @ByRef @Name("operator ^=") IntPointer xorPut(@Cast("cv::DrawMatchesFlags*") @ByRef IntPointer _this, @Cast("const cv::DrawMatchesFlags") int val);
@Namespace("cv") public static native @Cast("cv::DrawMatchesFlags*") @ByRef @Name("operator ^=") IntBuffer xorPut(@Cast("cv::DrawMatchesFlags*") @ByRef IntBuffer _this, @Cast("const cv::DrawMatchesFlags") int val);
@Namespace("cv") public static native @Cast("cv::DrawMatchesFlags*") @ByRef @Name("operator ^=") int[] xorPut(@Cast("cv::DrawMatchesFlags*") @ByRef int[] _this, @Cast("const cv::DrawMatchesFlags") int val);



/** \brief Draws keypoints.
<p>
@param image Source image.
@param keypoints Keypoints from the source image.
@param outImage Output image. Its content depends on the flags value defining what is drawn in the
output image. See possible flags bit values below.
@param color Color of keypoints.
@param flags Flags setting drawing features. Possible flags bit values are defined by
DrawMatchesFlags. See details above in drawMatches .
<p>
\note
For Python API, flags are modified as cv.DRAW_MATCHES_FLAGS_DEFAULT,
cv.DRAW_MATCHES_FLAGS_DRAW_RICH_KEYPOINTS, cv.DRAW_MATCHES_FLAGS_DRAW_OVER_OUTIMG,
cv.DRAW_MATCHES_FLAGS_NOT_DRAW_SINGLE_POINTS
 */
@Namespace("cv") public static native void drawKeypoints( @ByVal Mat image, @Const @ByRef KeyPointVector keypoints, @ByVal Mat outImage,
                               @Const @ByRef(nullValue = "cv::Scalar::all(-1)") Scalar color, @Cast("cv::DrawMatchesFlags") int flags/*=cv::DrawMatchesFlags::DEFAULT*/ );
@Namespace("cv") public static native void drawKeypoints( @ByVal Mat image, @Const @ByRef KeyPointVector keypoints, @ByVal Mat outImage );
@Namespace("cv") public static native void drawKeypoints( @ByVal UMat image, @Const @ByRef KeyPointVector keypoints, @ByVal UMat outImage,
                               @Const @ByRef(nullValue = "cv::Scalar::all(-1)") Scalar color, @Cast("cv::DrawMatchesFlags") int flags/*=cv::DrawMatchesFlags::DEFAULT*/ );
@Namespace("cv") public static native void drawKeypoints( @ByVal UMat image, @Const @ByRef KeyPointVector keypoints, @ByVal UMat outImage );
@Namespace("cv") public static native void drawKeypoints( @ByVal GpuMat image, @Const @ByRef KeyPointVector keypoints, @ByVal GpuMat outImage,
                               @Const @ByRef(nullValue = "cv::Scalar::all(-1)") Scalar color, @Cast("cv::DrawMatchesFlags") int flags/*=cv::DrawMatchesFlags::DEFAULT*/ );
@Namespace("cv") public static native void drawKeypoints( @ByVal GpuMat image, @Const @ByRef KeyPointVector keypoints, @ByVal GpuMat outImage );

/** \brief Draws the found matches of keypoints from two images.
<p>
@param img1 First source image.
@param keypoints1 Keypoints from the first source image.
@param img2 Second source image.
@param keypoints2 Keypoints from the second source image.
@param matches1to2 Matches from the first image to the second one, which means that keypoints1[i]
has a corresponding point in keypoints2[matches[i]] .
@param outImg Output image. Its content depends on the flags value defining what is drawn in the
output image. See possible flags bit values below.
@param matchColor Color of matches (lines and connected keypoints). If matchColor==Scalar::all(-1)
, the color is generated randomly.
@param singlePointColor Color of single keypoints (circles), which means that keypoints do not
have the matches. If singlePointColor==Scalar::all(-1) , the color is generated randomly.
@param matchesMask Mask determining which matches are drawn. If the mask is empty, all matches are
drawn.
@param flags Flags setting drawing features. Possible flags bit values are defined by
DrawMatchesFlags.
<p>
This function draws matches of keypoints from two images in the output image. Match is a line
connecting two keypoints (circles). See cv::DrawMatchesFlags.
 */
@Namespace("cv") public static native void drawMatches( @ByVal Mat img1, @Const @ByRef KeyPointVector keypoints1,
                             @ByVal Mat img2, @Const @ByRef KeyPointVector keypoints2,
                             @Const @ByRef DMatchVector matches1to2, @ByVal Mat outImg,
                             @Const @ByRef(nullValue = "cv::Scalar::all(-1)") Scalar matchColor, @Const @ByRef(nullValue = "cv::Scalar::all(-1)") Scalar singlePointColor,
                             @Cast("char*") @StdVector BytePointer matchesMask/*=std::vector<char>()*/, @Cast("cv::DrawMatchesFlags") int flags/*=cv::DrawMatchesFlags::DEFAULT*/ );
@Namespace("cv") public static native void drawMatches( @ByVal Mat img1, @Const @ByRef KeyPointVector keypoints1,
                             @ByVal Mat img2, @Const @ByRef KeyPointVector keypoints2,
                             @Const @ByRef DMatchVector matches1to2, @ByVal Mat outImg );
@Namespace("cv") public static native void drawMatches( @ByVal Mat img1, @Const @ByRef KeyPointVector keypoints1,
                             @ByVal Mat img2, @Const @ByRef KeyPointVector keypoints2,
                             @Const @ByRef DMatchVector matches1to2, @ByVal Mat outImg,
                             @Const @ByRef(nullValue = "cv::Scalar::all(-1)") Scalar matchColor, @Const @ByRef(nullValue = "cv::Scalar::all(-1)") Scalar singlePointColor,
                             @Cast("char*") @StdVector ByteBuffer matchesMask/*=std::vector<char>()*/, @Cast("cv::DrawMatchesFlags") int flags/*=cv::DrawMatchesFlags::DEFAULT*/ );
@Namespace("cv") public static native void drawMatches( @ByVal Mat img1, @Const @ByRef KeyPointVector keypoints1,
                             @ByVal Mat img2, @Const @ByRef KeyPointVector keypoints2,
                             @Const @ByRef DMatchVector matches1to2, @ByVal Mat outImg,
                             @Const @ByRef(nullValue = "cv::Scalar::all(-1)") Scalar matchColor, @Const @ByRef(nullValue = "cv::Scalar::all(-1)") Scalar singlePointColor,
                             @Cast("char*") @StdVector byte[] matchesMask/*=std::vector<char>()*/, @Cast("cv::DrawMatchesFlags") int flags/*=cv::DrawMatchesFlags::DEFAULT*/ );
@Namespace("cv") public static native void drawMatches( @ByVal UMat img1, @Const @ByRef KeyPointVector keypoints1,
                             @ByVal UMat img2, @Const @ByRef KeyPointVector keypoints2,
                             @Const @ByRef DMatchVector matches1to2, @ByVal UMat outImg,
                             @Const @ByRef(nullValue = "cv::Scalar::all(-1)") Scalar matchColor, @Const @ByRef(nullValue = "cv::Scalar::all(-1)") Scalar singlePointColor,
                             @Cast("char*") @StdVector BytePointer matchesMask/*=std::vector<char>()*/, @Cast("cv::DrawMatchesFlags") int flags/*=cv::DrawMatchesFlags::DEFAULT*/ );
@Namespace("cv") public static native void drawMatches( @ByVal UMat img1, @Const @ByRef KeyPointVector keypoints1,
                             @ByVal UMat img2, @Const @ByRef KeyPointVector keypoints2,
                             @Const @ByRef DMatchVector matches1to2, @ByVal UMat outImg );
@Namespace("cv") public static native void drawMatches( @ByVal UMat img1, @Const @ByRef KeyPointVector keypoints1,
                             @ByVal UMat img2, @Const @ByRef KeyPointVector keypoints2,
                             @Const @ByRef DMatchVector matches1to2, @ByVal UMat outImg,
                             @Const @ByRef(nullValue = "cv::Scalar::all(-1)") Scalar matchColor, @Const @ByRef(nullValue = "cv::Scalar::all(-1)") Scalar singlePointColor,
                             @Cast("char*") @StdVector ByteBuffer matchesMask/*=std::vector<char>()*/, @Cast("cv::DrawMatchesFlags") int flags/*=cv::DrawMatchesFlags::DEFAULT*/ );
@Namespace("cv") public static native void drawMatches( @ByVal UMat img1, @Const @ByRef KeyPointVector keypoints1,
                             @ByVal UMat img2, @Const @ByRef KeyPointVector keypoints2,
                             @Const @ByRef DMatchVector matches1to2, @ByVal UMat outImg,
                             @Const @ByRef(nullValue = "cv::Scalar::all(-1)") Scalar matchColor, @Const @ByRef(nullValue = "cv::Scalar::all(-1)") Scalar singlePointColor,
                             @Cast("char*") @StdVector byte[] matchesMask/*=std::vector<char>()*/, @Cast("cv::DrawMatchesFlags") int flags/*=cv::DrawMatchesFlags::DEFAULT*/ );
@Namespace("cv") public static native void drawMatches( @ByVal GpuMat img1, @Const @ByRef KeyPointVector keypoints1,
                             @ByVal GpuMat img2, @Const @ByRef KeyPointVector keypoints2,
                             @Const @ByRef DMatchVector matches1to2, @ByVal GpuMat outImg,
                             @Const @ByRef(nullValue = "cv::Scalar::all(-1)") Scalar matchColor, @Const @ByRef(nullValue = "cv::Scalar::all(-1)") Scalar singlePointColor,
                             @Cast("char*") @StdVector BytePointer matchesMask/*=std::vector<char>()*/, @Cast("cv::DrawMatchesFlags") int flags/*=cv::DrawMatchesFlags::DEFAULT*/ );
@Namespace("cv") public static native void drawMatches( @ByVal GpuMat img1, @Const @ByRef KeyPointVector keypoints1,
                             @ByVal GpuMat img2, @Const @ByRef KeyPointVector keypoints2,
                             @Const @ByRef DMatchVector matches1to2, @ByVal GpuMat outImg );
@Namespace("cv") public static native void drawMatches( @ByVal GpuMat img1, @Const @ByRef KeyPointVector keypoints1,
                             @ByVal GpuMat img2, @Const @ByRef KeyPointVector keypoints2,
                             @Const @ByRef DMatchVector matches1to2, @ByVal GpuMat outImg,
                             @Const @ByRef(nullValue = "cv::Scalar::all(-1)") Scalar matchColor, @Const @ByRef(nullValue = "cv::Scalar::all(-1)") Scalar singlePointColor,
                             @Cast("char*") @StdVector ByteBuffer matchesMask/*=std::vector<char>()*/, @Cast("cv::DrawMatchesFlags") int flags/*=cv::DrawMatchesFlags::DEFAULT*/ );
@Namespace("cv") public static native void drawMatches( @ByVal GpuMat img1, @Const @ByRef KeyPointVector keypoints1,
                             @ByVal GpuMat img2, @Const @ByRef KeyPointVector keypoints2,
                             @Const @ByRef DMatchVector matches1to2, @ByVal GpuMat outImg,
                             @Const @ByRef(nullValue = "cv::Scalar::all(-1)") Scalar matchColor, @Const @ByRef(nullValue = "cv::Scalar::all(-1)") Scalar singlePointColor,
                             @Cast("char*") @StdVector byte[] matchesMask/*=std::vector<char>()*/, @Cast("cv::DrawMatchesFlags") int flags/*=cv::DrawMatchesFlags::DEFAULT*/ );

/** \overload */
@Namespace("cv") public static native void drawMatches( @ByVal Mat img1, @Const @ByRef KeyPointVector keypoints1,
                             @ByVal Mat img2, @Const @ByRef KeyPointVector keypoints2,
                             @Const @ByRef DMatchVector matches1to2, @ByVal Mat outImg,
                             int matchesThickness, @Const @ByRef(nullValue = "cv::Scalar::all(-1)") Scalar matchColor,
                             @Const @ByRef(nullValue = "cv::Scalar::all(-1)") Scalar singlePointColor, @Cast("char*") @StdVector BytePointer matchesMask/*=std::vector<char>()*/,
                             @Cast("cv::DrawMatchesFlags") int flags/*=cv::DrawMatchesFlags::DEFAULT*/ );
@Namespace("cv") public static native void drawMatches( @ByVal Mat img1, @Const @ByRef KeyPointVector keypoints1,
                             @ByVal Mat img2, @Const @ByRef KeyPointVector keypoints2,
                             @Const @ByRef DMatchVector matches1to2, @ByVal Mat outImg,
                             int matchesThickness );
@Namespace("cv") public static native void drawMatches( @ByVal Mat img1, @Const @ByRef KeyPointVector keypoints1,
                             @ByVal Mat img2, @Const @ByRef KeyPointVector keypoints2,
                             @Const @ByRef DMatchVector matches1to2, @ByVal Mat outImg,
                             int matchesThickness, @Const @ByRef(nullValue = "cv::Scalar::all(-1)") Scalar matchColor,
                             @Const @ByRef(nullValue = "cv::Scalar::all(-1)") Scalar singlePointColor, @Cast("char*") @StdVector ByteBuffer matchesMask/*=std::vector<char>()*/,
                             @Cast("cv::DrawMatchesFlags") int flags/*=cv::DrawMatchesFlags::DEFAULT*/ );
@Namespace("cv") public static native void drawMatches( @ByVal Mat img1, @Const @ByRef KeyPointVector keypoints1,
                             @ByVal Mat img2, @Const @ByRef KeyPointVector keypoints2,
                             @Const @ByRef DMatchVector matches1to2, @ByVal Mat outImg,
                             int matchesThickness, @Const @ByRef(nullValue = "cv::Scalar::all(-1)") Scalar matchColor,
                             @Const @ByRef(nullValue = "cv::Scalar::all(-1)") Scalar singlePointColor, @Cast("char*") @StdVector byte[] matchesMask/*=std::vector<char>()*/,
                             @Cast("cv::DrawMatchesFlags") int flags/*=cv::DrawMatchesFlags::DEFAULT*/ );
@Namespace("cv") public static native void drawMatches( @ByVal UMat img1, @Const @ByRef KeyPointVector keypoints1,
                             @ByVal UMat img2, @Const @ByRef KeyPointVector keypoints2,
                             @Const @ByRef DMatchVector matches1to2, @ByVal UMat outImg,
                             int matchesThickness, @Const @ByRef(nullValue = "cv::Scalar::all(-1)") Scalar matchColor,
                             @Const @ByRef(nullValue = "cv::Scalar::all(-1)") Scalar singlePointColor, @Cast("char*") @StdVector BytePointer matchesMask/*=std::vector<char>()*/,
                             @Cast("cv::DrawMatchesFlags") int flags/*=cv::DrawMatchesFlags::DEFAULT*/ );
@Namespace("cv") public static native void drawMatches( @ByVal UMat img1, @Const @ByRef KeyPointVector keypoints1,
                             @ByVal UMat img2, @Const @ByRef KeyPointVector keypoints2,
                             @Const @ByRef DMatchVector matches1to2, @ByVal UMat outImg,
                             int matchesThickness );
@Namespace("cv") public static native void drawMatches( @ByVal UMat img1, @Const @ByRef KeyPointVector keypoints1,
                             @ByVal UMat img2, @Const @ByRef KeyPointVector keypoints2,
                             @Const @ByRef DMatchVector matches1to2, @ByVal UMat outImg,
                             int matchesThickness, @Const @ByRef(nullValue = "cv::Scalar::all(-1)") Scalar matchColor,
                             @Const @ByRef(nullValue = "cv::Scalar::all(-1)") Scalar singlePointColor, @Cast("char*") @StdVector ByteBuffer matchesMask/*=std::vector<char>()*/,
                             @Cast("cv::DrawMatchesFlags") int flags/*=cv::DrawMatchesFlags::DEFAULT*/ );
@Namespace("cv") public static native void drawMatches( @ByVal UMat img1, @Const @ByRef KeyPointVector keypoints1,
                             @ByVal UMat img2, @Const @ByRef KeyPointVector keypoints2,
                             @Const @ByRef DMatchVector matches1to2, @ByVal UMat outImg,
                             int matchesThickness, @Const @ByRef(nullValue = "cv::Scalar::all(-1)") Scalar matchColor,
                             @Const @ByRef(nullValue = "cv::Scalar::all(-1)") Scalar singlePointColor, @Cast("char*") @StdVector byte[] matchesMask/*=std::vector<char>()*/,
                             @Cast("cv::DrawMatchesFlags") int flags/*=cv::DrawMatchesFlags::DEFAULT*/ );
@Namespace("cv") public static native void drawMatches( @ByVal GpuMat img1, @Const @ByRef KeyPointVector keypoints1,
                             @ByVal GpuMat img2, @Const @ByRef KeyPointVector keypoints2,
                             @Const @ByRef DMatchVector matches1to2, @ByVal GpuMat outImg,
                             int matchesThickness, @Const @ByRef(nullValue = "cv::Scalar::all(-1)") Scalar matchColor,
                             @Const @ByRef(nullValue = "cv::Scalar::all(-1)") Scalar singlePointColor, @Cast("char*") @StdVector BytePointer matchesMask/*=std::vector<char>()*/,
                             @Cast("cv::DrawMatchesFlags") int flags/*=cv::DrawMatchesFlags::DEFAULT*/ );
@Namespace("cv") public static native void drawMatches( @ByVal GpuMat img1, @Const @ByRef KeyPointVector keypoints1,
                             @ByVal GpuMat img2, @Const @ByRef KeyPointVector keypoints2,
                             @Const @ByRef DMatchVector matches1to2, @ByVal GpuMat outImg,
                             int matchesThickness );
@Namespace("cv") public static native void drawMatches( @ByVal GpuMat img1, @Const @ByRef KeyPointVector keypoints1,
                             @ByVal GpuMat img2, @Const @ByRef KeyPointVector keypoints2,
                             @Const @ByRef DMatchVector matches1to2, @ByVal GpuMat outImg,
                             int matchesThickness, @Const @ByRef(nullValue = "cv::Scalar::all(-1)") Scalar matchColor,
                             @Const @ByRef(nullValue = "cv::Scalar::all(-1)") Scalar singlePointColor, @Cast("char*") @StdVector ByteBuffer matchesMask/*=std::vector<char>()*/,
                             @Cast("cv::DrawMatchesFlags") int flags/*=cv::DrawMatchesFlags::DEFAULT*/ );
@Namespace("cv") public static native void drawMatches( @ByVal GpuMat img1, @Const @ByRef KeyPointVector keypoints1,
                             @ByVal GpuMat img2, @Const @ByRef KeyPointVector keypoints2,
                             @Const @ByRef DMatchVector matches1to2, @ByVal GpuMat outImg,
                             int matchesThickness, @Const @ByRef(nullValue = "cv::Scalar::all(-1)") Scalar matchColor,
                             @Const @ByRef(nullValue = "cv::Scalar::all(-1)") Scalar singlePointColor, @Cast("char*") @StdVector byte[] matchesMask/*=std::vector<char>()*/,
                             @Cast("cv::DrawMatchesFlags") int flags/*=cv::DrawMatchesFlags::DEFAULT*/ );

@Namespace("cv") public static native @Name("drawMatches") void drawMatchesKnn( @ByVal Mat img1, @Const @ByRef KeyPointVector keypoints1,
                             @ByVal Mat img2, @Const @ByRef KeyPointVector keypoints2,
                             @Const @ByRef DMatchVectorVector matches1to2, @ByVal Mat outImg,
                             @Const @ByRef(nullValue = "cv::Scalar::all(-1)") Scalar matchColor, @Const @ByRef(nullValue = "cv::Scalar::all(-1)") Scalar singlePointColor,
                             @Cast("const std::vector<std::vector<char> >*") @ByRef(nullValue = "std::vector<std::vector<char> >()") ByteVectorVector matchesMask, @Cast("cv::DrawMatchesFlags") int flags/*=cv::DrawMatchesFlags::DEFAULT*/ );
@Namespace("cv") public static native @Name("drawMatches") void drawMatchesKnn( @ByVal Mat img1, @Const @ByRef KeyPointVector keypoints1,
                             @ByVal Mat img2, @Const @ByRef KeyPointVector keypoints2,
                             @Const @ByRef DMatchVectorVector matches1to2, @ByVal Mat outImg );
@Namespace("cv") public static native @Name("drawMatches") void drawMatchesKnn( @ByVal UMat img1, @Const @ByRef KeyPointVector keypoints1,
                             @ByVal UMat img2, @Const @ByRef KeyPointVector keypoints2,
                             @Const @ByRef DMatchVectorVector matches1to2, @ByVal UMat outImg,
                             @Const @ByRef(nullValue = "cv::Scalar::all(-1)") Scalar matchColor, @Const @ByRef(nullValue = "cv::Scalar::all(-1)") Scalar singlePointColor,
                             @Cast("const std::vector<std::vector<char> >*") @ByRef(nullValue = "std::vector<std::vector<char> >()") ByteVectorVector matchesMask, @Cast("cv::DrawMatchesFlags") int flags/*=cv::DrawMatchesFlags::DEFAULT*/ );
@Namespace("cv") public static native @Name("drawMatches") void drawMatchesKnn( @ByVal UMat img1, @Const @ByRef KeyPointVector keypoints1,
                             @ByVal UMat img2, @Const @ByRef KeyPointVector keypoints2,
                             @Const @ByRef DMatchVectorVector matches1to2, @ByVal UMat outImg );
@Namespace("cv") public static native @Name("drawMatches") void drawMatchesKnn( @ByVal GpuMat img1, @Const @ByRef KeyPointVector keypoints1,
                             @ByVal GpuMat img2, @Const @ByRef KeyPointVector keypoints2,
                             @Const @ByRef DMatchVectorVector matches1to2, @ByVal GpuMat outImg,
                             @Const @ByRef(nullValue = "cv::Scalar::all(-1)") Scalar matchColor, @Const @ByRef(nullValue = "cv::Scalar::all(-1)") Scalar singlePointColor,
                             @Cast("const std::vector<std::vector<char> >*") @ByRef(nullValue = "std::vector<std::vector<char> >()") ByteVectorVector matchesMask, @Cast("cv::DrawMatchesFlags") int flags/*=cv::DrawMatchesFlags::DEFAULT*/ );
@Namespace("cv") public static native @Name("drawMatches") void drawMatchesKnn( @ByVal GpuMat img1, @Const @ByRef KeyPointVector keypoints1,
                             @ByVal GpuMat img2, @Const @ByRef KeyPointVector keypoints2,
                             @Const @ByRef DMatchVectorVector matches1to2, @ByVal GpuMat outImg );

/** \} features2d_draw
<p>
/****************************************************************************************\
*   Functions to evaluate the feature detectors and [generic] descriptor extractors      *
\****************************************************************************************/

@Namespace("cv") public static native void evaluateFeatureDetector( @Const @ByRef Mat img1, @Const @ByRef Mat img2, @Const @ByRef Mat H1to2,
                                         KeyPointVector keypoints1, KeyPointVector keypoints2,
                                         @ByRef FloatPointer repeatability, @ByRef IntPointer correspCount,
                                         @Cast("cv::FeatureDetector*") @Ptr Feature2D fdetector/*=cv::Ptr<cv::FeatureDetector>()*/ );
@Namespace("cv") public static native void evaluateFeatureDetector( @Const @ByRef Mat img1, @Const @ByRef Mat img2, @Const @ByRef Mat H1to2,
                                         KeyPointVector keypoints1, KeyPointVector keypoints2,
                                         @ByRef FloatPointer repeatability, @ByRef IntPointer correspCount );
@Namespace("cv") public static native void evaluateFeatureDetector( @Const @ByRef Mat img1, @Const @ByRef Mat img2, @Const @ByRef Mat H1to2,
                                         KeyPointVector keypoints1, KeyPointVector keypoints2,
                                         @ByRef FloatBuffer repeatability, @ByRef IntBuffer correspCount,
                                         @Cast("cv::FeatureDetector*") @Ptr Feature2D fdetector/*=cv::Ptr<cv::FeatureDetector>()*/ );
@Namespace("cv") public static native void evaluateFeatureDetector( @Const @ByRef Mat img1, @Const @ByRef Mat img2, @Const @ByRef Mat H1to2,
                                         KeyPointVector keypoints1, KeyPointVector keypoints2,
                                         @ByRef FloatBuffer repeatability, @ByRef IntBuffer correspCount );
@Namespace("cv") public static native void evaluateFeatureDetector( @Const @ByRef Mat img1, @Const @ByRef Mat img2, @Const @ByRef Mat H1to2,
                                         KeyPointVector keypoints1, KeyPointVector keypoints2,
                                         @ByRef float[] repeatability, @ByRef int[] correspCount,
                                         @Cast("cv::FeatureDetector*") @Ptr Feature2D fdetector/*=cv::Ptr<cv::FeatureDetector>()*/ );
@Namespace("cv") public static native void evaluateFeatureDetector( @Const @ByRef Mat img1, @Const @ByRef Mat img2, @Const @ByRef Mat H1to2,
                                         KeyPointVector keypoints1, KeyPointVector keypoints2,
                                         @ByRef float[] repeatability, @ByRef int[] correspCount );

@Namespace("cv") public static native void computeRecallPrecisionCurve( @Const @ByRef DMatchVectorVector matches1to2,
                                             @Cast("const std::vector<std::vector<uchar> >*") @ByRef ByteVectorVector correctMatches1to2Mask,
                                             @ByRef Point2fVector recallPrecisionCurve );

@Namespace("cv") public static native float getRecall( @Const @ByRef Point2fVector recallPrecisionCurve, float l_precision );
@Namespace("cv") public static native int getNearestPoint( @Const @ByRef Point2fVector recallPrecisionCurve, float l_precision );
// Targeting ../opencv_features2d/BOWTrainer.java


// Targeting ../opencv_features2d/BOWKMeansTrainer.java


// Targeting ../opencv_features2d/BOWImgDescriptorExtractor.java



/** \} features2d_category
 <p>
 *  \} features2d */

 /* namespace cv */

// #endif


}

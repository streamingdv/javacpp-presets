// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.global;

import org.bytedeco.opencv.opencv_rapid.*;

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

public class opencv_rapid extends org.bytedeco.opencv.presets.opencv_rapid {
    static { Loader.load(); }

// Parsed from <opencv2/rapid.hpp>

// This file is part of OpenCV project.
// It is subject to the license terms in the LICENSE file found in the top-level directory
// of this distribution and at http://opencv.org/license.html.

// #ifndef OPENCV_RAPID_HPP_
// #define OPENCV_RAPID_HPP_

// #include <opencv2/core.hpp>
// #include <opencv2/imgproc.hpp>

/**
\defgroup rapid silhouette based 3D object tracking
<p>
implements "RAPID-a video rate object tracker" \cite harris1990rapid with the dynamic control point extraction of \cite drummond2002real
*/
/** \addtogroup rapid
 *  \{
<p>
/**
 * Debug draw markers of matched correspondences onto a lineBundle
 * @param bundle the lineBundle
 * @param cols column coordinates in the line bundle
 * @param colors colors for the markers. Defaults to white.
 */
@Namespace("cv::rapid") public static native void drawCorrespondencies(@ByVal Mat bundle, @ByVal Mat cols,
                                       @ByVal(nullValue = "cv::InputArray(cv::noArray())") Mat colors);
@Namespace("cv::rapid") public static native void drawCorrespondencies(@ByVal Mat bundle, @ByVal Mat cols);
@Namespace("cv::rapid") public static native void drawCorrespondencies(@ByVal UMat bundle, @ByVal UMat cols,
                                       @ByVal(nullValue = "cv::InputArray(cv::noArray())") UMat colors);
@Namespace("cv::rapid") public static native void drawCorrespondencies(@ByVal UMat bundle, @ByVal UMat cols);
@Namespace("cv::rapid") public static native void drawCorrespondencies(@ByVal GpuMat bundle, @ByVal GpuMat cols,
                                       @ByVal(nullValue = "cv::InputArray(cv::noArray())") GpuMat colors);
@Namespace("cv::rapid") public static native void drawCorrespondencies(@ByVal GpuMat bundle, @ByVal GpuMat cols);

/**
 * Debug draw search lines onto an image
 * @param img the output image
 * @param locations the source locations of a line bundle
 * @param color the line color
 */
@Namespace("cv::rapid") public static native void drawSearchLines(@ByVal Mat img, @ByVal Mat locations, @Const @ByRef Scalar color);
@Namespace("cv::rapid") public static native void drawSearchLines(@ByVal UMat img, @ByVal UMat locations, @Const @ByRef Scalar color);
@Namespace("cv::rapid") public static native void drawSearchLines(@ByVal GpuMat img, @ByVal GpuMat locations, @Const @ByRef Scalar color);

/**
 * Draw a wireframe of a triangle mesh
 * @param img the output image
 * @param pts2d the 2d points obtained by \ref projectPoints
 * @param tris triangle face connectivity
 * @param color line color
 * @param type line type. See \ref LineTypes.
 * @param cullBackface enable back-face culling based on CCW order
 */
@Namespace("cv::rapid") public static native void drawWireframe(@ByVal Mat img, @ByVal Mat pts2d, @ByVal Mat tris,
                                @Const @ByRef Scalar color, int type/*=cv::LINE_8*/, @Cast("bool") boolean cullBackface/*=false*/);
@Namespace("cv::rapid") public static native void drawWireframe(@ByVal Mat img, @ByVal Mat pts2d, @ByVal Mat tris,
                                @Const @ByRef Scalar color);
@Namespace("cv::rapid") public static native void drawWireframe(@ByVal UMat img, @ByVal UMat pts2d, @ByVal UMat tris,
                                @Const @ByRef Scalar color, int type/*=cv::LINE_8*/, @Cast("bool") boolean cullBackface/*=false*/);
@Namespace("cv::rapid") public static native void drawWireframe(@ByVal UMat img, @ByVal UMat pts2d, @ByVal UMat tris,
                                @Const @ByRef Scalar color);
@Namespace("cv::rapid") public static native void drawWireframe(@ByVal GpuMat img, @ByVal GpuMat pts2d, @ByVal GpuMat tris,
                                @Const @ByRef Scalar color, int type/*=cv::LINE_8*/, @Cast("bool") boolean cullBackface/*=false*/);
@Namespace("cv::rapid") public static native void drawWireframe(@ByVal GpuMat img, @ByVal GpuMat pts2d, @ByVal GpuMat tris,
                                @Const @ByRef Scalar color);
/**
 * Extract control points from the projected silhouette of a mesh
 *
 * see \cite drummond2002real Sec 2.1, Step b
 * @param num number of control points
 * @param len search radius (used to restrict the ROI)
 * @param pts3d the 3D points of the mesh
 * @param rvec rotation between mesh and camera
 * @param tvec translation between mesh and camera
 * @param K camera intrinsic
 * @param imsize size of the video frame
 * @param tris triangle face connectivity
 * @param ctl2d the 2D locations of the control points
 * @param ctl3d matching 3D points of the mesh
 */
@Namespace("cv::rapid") public static native void extractControlPoints(int num, int len, @ByVal Mat pts3d, @ByVal Mat rvec, @ByVal Mat tvec,
                                       @ByVal Mat K, @Const @ByRef Size imsize, @ByVal Mat tris, @ByVal Mat ctl2d,
                                       @ByVal Mat ctl3d);
@Namespace("cv::rapid") public static native void extractControlPoints(int num, int len, @ByVal UMat pts3d, @ByVal UMat rvec, @ByVal UMat tvec,
                                       @ByVal UMat K, @Const @ByRef Size imsize, @ByVal UMat tris, @ByVal UMat ctl2d,
                                       @ByVal UMat ctl3d);
@Namespace("cv::rapid") public static native void extractControlPoints(int num, int len, @ByVal GpuMat pts3d, @ByVal GpuMat rvec, @ByVal GpuMat tvec,
                                       @ByVal GpuMat K, @Const @ByRef Size imsize, @ByVal GpuMat tris, @ByVal GpuMat ctl2d,
                                       @ByVal GpuMat ctl3d);
/**
 * Extract the line bundle from an image
 * @param len the search radius. The bundle will have {@code 2*len + 1} columns.
 * @param ctl2d the search lines will be centered at this points and orthogonal to the contour defined by
 * them. The bundle will have as many rows.
 * @param img the image to read the pixel intensities values from
 * @param bundle line bundle image with size {@code ctl2d.rows() x (2 * len + 1)} and the same type as \p img
 * @param srcLocations the source pixel locations of \p bundle in \p img as CV_16SC2
 */
@Namespace("cv::rapid") public static native void extractLineBundle(int len, @ByVal Mat ctl2d, @ByVal Mat img, @ByVal Mat bundle,
                                    @ByVal Mat srcLocations);
@Namespace("cv::rapid") public static native void extractLineBundle(int len, @ByVal UMat ctl2d, @ByVal UMat img, @ByVal UMat bundle,
                                    @ByVal UMat srcLocations);
@Namespace("cv::rapid") public static native void extractLineBundle(int len, @ByVal GpuMat ctl2d, @ByVal GpuMat img, @ByVal GpuMat bundle,
                                    @ByVal GpuMat srcLocations);

/**
 * Find corresponding image locations by searching for a maximal sobel edge along the search line (a single
 * row in the bundle)
 * @param bundle the line bundle
 * @param cols correspondence-position per line in line-bundle-space
 * @param response the sobel response for the selected point
 */
@Namespace("cv::rapid") public static native void findCorrespondencies(@ByVal Mat bundle, @ByVal Mat cols,
                                       @ByVal(nullValue = "cv::OutputArray(cv::noArray())") Mat response);
@Namespace("cv::rapid") public static native void findCorrespondencies(@ByVal Mat bundle, @ByVal Mat cols);
@Namespace("cv::rapid") public static native void findCorrespondencies(@ByVal UMat bundle, @ByVal UMat cols,
                                       @ByVal(nullValue = "cv::OutputArray(cv::noArray())") UMat response);
@Namespace("cv::rapid") public static native void findCorrespondencies(@ByVal UMat bundle, @ByVal UMat cols);
@Namespace("cv::rapid") public static native void findCorrespondencies(@ByVal GpuMat bundle, @ByVal GpuMat cols,
                                       @ByVal(nullValue = "cv::OutputArray(cv::noArray())") GpuMat response);
@Namespace("cv::rapid") public static native void findCorrespondencies(@ByVal GpuMat bundle, @ByVal GpuMat cols);

/**
 * Collect corresponding 2d and 3d points based on correspondencies and mask
 * @param cols correspondence-position per line in line-bundle-space
 * @param srcLocations the source image location
 * @param pts2d 2d points
 * @param pts3d 3d points
 * @param mask mask containing non-zero values for the elements to be retained
 */
@Namespace("cv::rapid") public static native void convertCorrespondencies(@ByVal Mat cols, @ByVal Mat srcLocations, @ByVal Mat pts2d,
                                          @ByVal(nullValue = "cv::InputOutputArray(cv::noArray())") Mat pts3d, @ByVal(nullValue = "cv::InputArray(cv::noArray())") Mat mask);
@Namespace("cv::rapid") public static native void convertCorrespondencies(@ByVal Mat cols, @ByVal Mat srcLocations, @ByVal Mat pts2d);
@Namespace("cv::rapid") public static native void convertCorrespondencies(@ByVal UMat cols, @ByVal UMat srcLocations, @ByVal UMat pts2d,
                                          @ByVal(nullValue = "cv::InputOutputArray(cv::noArray())") UMat pts3d, @ByVal(nullValue = "cv::InputArray(cv::noArray())") UMat mask);
@Namespace("cv::rapid") public static native void convertCorrespondencies(@ByVal UMat cols, @ByVal UMat srcLocations, @ByVal UMat pts2d);
@Namespace("cv::rapid") public static native void convertCorrespondencies(@ByVal GpuMat cols, @ByVal GpuMat srcLocations, @ByVal GpuMat pts2d,
                                          @ByVal(nullValue = "cv::InputOutputArray(cv::noArray())") GpuMat pts3d, @ByVal(nullValue = "cv::InputArray(cv::noArray())") GpuMat mask);
@Namespace("cv::rapid") public static native void convertCorrespondencies(@ByVal GpuMat cols, @ByVal GpuMat srcLocations, @ByVal GpuMat pts2d);

/**
 * High level function to execute a single rapid \cite harris1990rapid iteration
 *
 * 1. \ref extractControlPoints
 * 2. \ref extractLineBundle
 * 3. \ref findCorrespondencies
 * 4. \ref convertCorrespondencies
 * 5. \ref solvePnPRefineLM
 *
 * @param img the video frame
 * @param num number of search lines
 * @param len search line radius
 * @param pts3d the 3D points of the mesh
 * @param tris triangle face connectivity
 * @param K camera matrix
 * @param rvec rotation between mesh and camera. Input values are used as an initial solution.
 * @param tvec translation between mesh and camera. Input values are used as an initial solution.
 * @param rmsd the 2d reprojection difference
 * @return ratio of search lines that could be extracted and matched
 */
@Namespace("cv::rapid") public static native float rapid(@ByVal Mat img, int num, int len, @ByVal Mat pts3d, @ByVal Mat tris, @ByVal Mat K,
                         @ByVal Mat rvec, @ByVal Mat tvec, DoublePointer rmsd/*=0*/);
@Namespace("cv::rapid") public static native float rapid(@ByVal Mat img, int num, int len, @ByVal Mat pts3d, @ByVal Mat tris, @ByVal Mat K,
                         @ByVal Mat rvec, @ByVal Mat tvec);
@Namespace("cv::rapid") public static native float rapid(@ByVal Mat img, int num, int len, @ByVal Mat pts3d, @ByVal Mat tris, @ByVal Mat K,
                         @ByVal Mat rvec, @ByVal Mat tvec, DoubleBuffer rmsd/*=0*/);
@Namespace("cv::rapid") public static native float rapid(@ByVal Mat img, int num, int len, @ByVal Mat pts3d, @ByVal Mat tris, @ByVal Mat K,
                         @ByVal Mat rvec, @ByVal Mat tvec, double[] rmsd/*=0*/);
@Namespace("cv::rapid") public static native float rapid(@ByVal UMat img, int num, int len, @ByVal UMat pts3d, @ByVal UMat tris, @ByVal UMat K,
                         @ByVal UMat rvec, @ByVal UMat tvec, DoublePointer rmsd/*=0*/);
@Namespace("cv::rapid") public static native float rapid(@ByVal UMat img, int num, int len, @ByVal UMat pts3d, @ByVal UMat tris, @ByVal UMat K,
                         @ByVal UMat rvec, @ByVal UMat tvec);
@Namespace("cv::rapid") public static native float rapid(@ByVal UMat img, int num, int len, @ByVal UMat pts3d, @ByVal UMat tris, @ByVal UMat K,
                         @ByVal UMat rvec, @ByVal UMat tvec, DoubleBuffer rmsd/*=0*/);
@Namespace("cv::rapid") public static native float rapid(@ByVal UMat img, int num, int len, @ByVal UMat pts3d, @ByVal UMat tris, @ByVal UMat K,
                         @ByVal UMat rvec, @ByVal UMat tvec, double[] rmsd/*=0*/);
@Namespace("cv::rapid") public static native float rapid(@ByVal GpuMat img, int num, int len, @ByVal GpuMat pts3d, @ByVal GpuMat tris, @ByVal GpuMat K,
                         @ByVal GpuMat rvec, @ByVal GpuMat tvec, DoublePointer rmsd/*=0*/);
@Namespace("cv::rapid") public static native float rapid(@ByVal GpuMat img, int num, int len, @ByVal GpuMat pts3d, @ByVal GpuMat tris, @ByVal GpuMat K,
                         @ByVal GpuMat rvec, @ByVal GpuMat tvec);
@Namespace("cv::rapid") public static native float rapid(@ByVal GpuMat img, int num, int len, @ByVal GpuMat pts3d, @ByVal GpuMat tris, @ByVal GpuMat K,
                         @ByVal GpuMat rvec, @ByVal GpuMat tvec, DoubleBuffer rmsd/*=0*/);
@Namespace("cv::rapid") public static native float rapid(@ByVal GpuMat img, int num, int len, @ByVal GpuMat pts3d, @ByVal GpuMat tris, @ByVal GpuMat K,
                         @ByVal GpuMat rvec, @ByVal GpuMat tvec, double[] rmsd/*=0*/);
// Targeting ../opencv_rapid/Tracker.java


// Targeting ../opencv_rapid/Rapid.java


// Targeting ../opencv_rapid/OLSTracker.java


// Targeting ../opencv_rapid/GOSTracker.java


/** \} */
 /* namespace rapid */
 /* namespace cv */

// #endif /* OPENCV_RAPID_HPP_ */


}

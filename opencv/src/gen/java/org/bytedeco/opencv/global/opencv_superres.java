// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.global;

import org.bytedeco.opencv.opencv_superres.*;

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
import org.bytedeco.opencv.opencv_features2d.*;
import static org.bytedeco.opencv.global.opencv_features2d.*;
import org.bytedeco.opencv.opencv_calib3d.*;
import static org.bytedeco.opencv.global.opencv_calib3d.*;
import org.bytedeco.opencv.opencv_objdetect.*;
import static org.bytedeco.opencv.global.opencv_objdetect.*;
import org.bytedeco.opencv.opencv_ximgproc.*;
import static org.bytedeco.opencv.global.opencv_ximgproc.*;
import org.bytedeco.opencv.opencv_video.*;
import static org.bytedeco.opencv.global.opencv_video.*;
import org.bytedeco.opencv.opencv_optflow.*;
import static org.bytedeco.opencv.global.opencv_optflow.*;

public class opencv_superres extends org.bytedeco.opencv.presets.opencv_superres {
    static { Loader.load(); }

// Parsed from <opencv2/superres.hpp>

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

// #ifndef OPENCV_SUPERRES_HPP
// #define OPENCV_SUPERRES_HPP

// #include "opencv2/core.hpp"
// #include "opencv2/superres/optical_flow.hpp"

/**
  \defgroup superres Super Resolution
<p>
The Super Resolution module contains a set of functions and classes that can be used to solve the
problem of resolution enhancement. There are a few methods implemented, most of them are described in
the papers \cite Farsiu03 and \cite Mitzel09 .
 <p>
 */
// Targeting ../opencv_superres/FrameSource.java



        @Namespace("cv::superres") public static native @Ptr FrameSource createFrameSource_Empty();

        @Namespace("cv::superres") public static native @Ptr FrameSource createFrameSource_Video(@Str BytePointer fileName);
        @Namespace("cv::superres") public static native @Ptr FrameSource createFrameSource_Video(@Str String fileName);
        @Namespace("cv::superres") public static native @Ptr FrameSource createFrameSource_Video_CUDA(@Str BytePointer fileName);
        @Namespace("cv::superres") public static native @Ptr FrameSource createFrameSource_Video_CUDA(@Str String fileName);

        @Namespace("cv::superres") public static native @Ptr FrameSource createFrameSource_Camera(int deviceId/*=0*/);
        @Namespace("cv::superres") public static native @Ptr FrameSource createFrameSource_Camera();
// Targeting ../opencv_superres/SuperResolution.java



        /** \brief Create Bilateral TV-L1 Super Resolution.
        <p>
        This class implements Super Resolution algorithm described in the papers \cite Farsiu03 and
        \cite Mitzel09 .
        <p>
        Here are important members of the class that control the algorithm, which you can set after
        constructing the class instance:
        <p>
        -   **int scale** Scale factor.
        -   **int iterations** Iteration count.
        -   **double tau** Asymptotic value of steepest descent method.
        -   **double lambda** Weight parameter to balance data term and smoothness term.
        -   **double alpha** Parameter of spacial distribution in Bilateral-TV.
        -   **int btvKernelSize** Kernel size of Bilateral-TV filter.
        -   **int blurKernelSize** Gaussian blur kernel size.
        -   **double blurSigma** Gaussian blur sigma.
        -   **int temporalAreaRadius** Radius of the temporal search area.
        -   **Ptr\<DenseOpticalFlowExt\> opticalFlow** Dense optical flow algorithm.
         */
        @Namespace("cv::superres") public static native @Ptr SuperResolution createSuperResolution_BTVL1();
        @Namespace("cv::superres") public static native @Ptr SuperResolution createSuperResolution_BTVL1_CUDA();

/** \} superres */

    


// #endif // OPENCV_SUPERRES_HPP


// Parsed from <opencv2/superres/optical_flow.hpp>

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

// #ifndef OPENCV_SUPERRES_OPTICAL_FLOW_HPP
// #define OPENCV_SUPERRES_OPTICAL_FLOW_HPP

// #include "opencv2/core.hpp"
// Targeting ../opencv_superres/DenseOpticalFlowExt.java


// Targeting ../opencv_superres/SuperResFarnebackOpticalFlow.java


        @Namespace("cv::superres") public static native @Ptr SuperResFarnebackOpticalFlow createOptFlow_Farneback();
        @Namespace("cv::superres") public static native @Ptr SuperResFarnebackOpticalFlow createOptFlow_Farneback_CUDA();
// Targeting ../opencv_superres/SuperResDualTVL1OpticalFlow.java


        @Namespace("cv::superres") public static native @Ptr SuperResDualTVL1OpticalFlow createOptFlow_DualTVL1();
        @Namespace("cv::superres") public static native @Ptr SuperResDualTVL1OpticalFlow createOptFlow_DualTVL1_CUDA();
// Targeting ../opencv_superres/BroxOpticalFlow.java


        @Namespace("cv::superres") public static native @Ptr BroxOpticalFlow createOptFlow_Brox_CUDA();
// Targeting ../opencv_superres/PyrLKOpticalFlow.java


        @Namespace("cv::superres") public static native @Ptr PyrLKOpticalFlow createOptFlow_PyrLK_CUDA();

/** \} */

    


// #endif // OPENCV_SUPERRES_OPTICAL_FLOW_HPP


}

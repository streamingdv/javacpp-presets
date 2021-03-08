// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.global;

import org.bytedeco.opencv.opencv_xphoto.*;

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
import org.bytedeco.opencv.opencv_photo.*;
import static org.bytedeco.opencv.global.opencv_photo.*;

public class opencv_xphoto extends org.bytedeco.opencv.presets.opencv_xphoto {
    static { Loader.load(); }

// Parsed from <opencv2/xphoto.hpp>

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

// #ifndef __OPENCV_XPHOTO_HPP__
// #define __OPENCV_XPHOTO_HPP__

/** \defgroup xphoto Additional photo processing algorithms
*/

// #include "xphoto/inpainting.hpp"
// #include "xphoto/white_balance.hpp"
// #include "xphoto/dct_image_denoising.hpp"
// #include "xphoto/bm3d_image_denoising.hpp"
// #include "xphoto/oilpainting.hpp"
// #include "xphoto/tonemap.hpp"

// #endif


// Parsed from <opencv2/xphoto/inpainting.hpp>

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
//                       (3-clause BSD License)
//
// Copyright (C) 2000-2019, Intel Corporation, all rights reserved.
// Copyright (C) 2009-2011, Willow Garage Inc., all rights reserved.
// Copyright (C) 2009-2016, NVIDIA Corporation, all rights reserved.
// Copyright (C) 2010-2013, Advanced Micro Devices, Inc., all rights reserved.
// Copyright (C) 2015-2016, OpenCV Foundation, all rights reserved.
// Copyright (C) 2015-2016, Itseez Inc., all rights reserved.
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
//   * Neither the names of the copyright holders nor the names of the contributors
//    may be used to endorse or promote products derived from this software
//    without specific prior written permission.
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

// #ifndef __OPENCV_INPAINTING_HPP__
// #define __OPENCV_INPAINTING_HPP__

/** \file
\date Jul 22, 2014
@author Yury Gitman
*/

// #include <opencv2/core.hpp>

/** \addtogroup xphoto
 *  \{
     <p>
     *  \brief Various inpainting algorithms
     *  @see inpaint */
    /** enum cv::xphoto::InpaintTypes */
    public static final int
        /** This algorithm searches for dominant correspondences (transformations) of
        image patches and tries to seamlessly fill-in the area to be inpainted using this
        transformations */
        INPAINT_SHIFTMAP = 0,
        /** Performs Frequency Selective Reconstruction (FSR).
        One of the two quality profiles BEST and FAST can be chosen, depending on the time available for reconstruction.
        See \cite GenserPCS2018 and \cite SeilerTIP2015 for details.
        <p>
        The algorithm may be utilized for the following areas of application:
        1. %Error Concealment (Inpainting).
           The sampling mask indicates the missing pixels of the distorted input
           image to be reconstructed.
        2. Non-Regular Sampling.
           For more information on how to choose a good sampling mask, please review
           \cite GroscheICIP2018 and \cite GroscheIST2018.
        <p>
        1-channel grayscale or 3-channel BGR image are accepted.
        <p>
        Conventional accepted ranges:
        - 0-255 for CV_8U
        - 0-65535 for CV_16U
        - 0-1 for CV_32F/CV_64F.
        */
        INPAINT_FSR_BEST = 1,
        /** See #INPAINT_FSR_BEST */
        INPAINT_FSR_FAST = 2;

    /** \brief The function implements different single-image inpainting algorithms.
    <p>
    See the original papers \cite He2012 (Shiftmap) or \cite GenserPCS2018 and \cite SeilerTIP2015 (FSR) for details.
    <p>
    @param src source image
    - #INPAINT_SHIFTMAP: it could be of any type and any number of channels from 1 to 4. In case of
    3- and 4-channels images the function expect them in CIELab colorspace or similar one, where first
    color component shows intensity, while second and third shows colors. Nonetheless you can try any
    colorspaces.
    - #INPAINT_FSR_BEST or #INPAINT_FSR_FAST: 1-channel grayscale or 3-channel BGR image.
    @param mask mask (#CV_8UC1), where non-zero pixels indicate valid image area, while zero pixels
    indicate area to be inpainted
    @param dst destination image
    @param algorithmType see xphoto::InpaintTypes
    */
    @Namespace("cv::xphoto") public static native void inpaint(@Const @ByRef Mat src, @Const @ByRef Mat mask, @ByRef Mat dst, int algorithmType);

/** \} */




// #endif // __OPENCV_INPAINTING_HPP__


// Parsed from <opencv2/xphoto/white_balance.hpp>

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
// Copyright (C) 2009-2011, Willow Garage Inc., all rights reserved.
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

// #ifndef __OPENCV_SIMPLE_COLOR_BALANCE_HPP__
// #define __OPENCV_SIMPLE_COLOR_BALANCE_HPP__

/** \file
\date Jun 26, 2014
@author Yury Gitman
*/

// #include <opencv2/core.hpp>
// Targeting ../opencv_xphoto/WhiteBalancer.java


// Targeting ../opencv_xphoto/SimpleWB.java



/** \brief Creates an instance of SimpleWB
 */
@Namespace("cv::xphoto") public static native @Ptr SimpleWB createSimpleWB();
// Targeting ../opencv_xphoto/GrayworldWB.java



/** \brief Creates an instance of GrayworldWB
 */
@Namespace("cv::xphoto") public static native @Ptr GrayworldWB createGrayworldWB();
// Targeting ../opencv_xphoto/LearningBasedWB.java



/** \brief Creates an instance of LearningBasedWB
<p>
@param path_to_model Path to a .yml file with the model. If not specified, the default model is used
 */
@Namespace("cv::xphoto") public static native @Ptr LearningBasedWB createLearningBasedWB(@Str BytePointer path_to_model/*=cv::String()*/);
@Namespace("cv::xphoto") public static native @Ptr LearningBasedWB createLearningBasedWB();
@Namespace("cv::xphoto") public static native @Ptr LearningBasedWB createLearningBasedWB(@Str String path_to_model/*=cv::String()*/);

/** \brief Implements an efficient fixed-point approximation for applying channel gains, which is
    the last step of multiple white balance algorithms.
<p>
@param src Input three-channel image in the BGR color space (either CV_8UC3 or CV_16UC3)
@param dst Output image of the same size and type as src.
@param gainB gain for the B channel
@param gainG gain for the G channel
@param gainR gain for the R channel
*/
@Namespace("cv::xphoto") public static native void applyChannelGains(@ByVal Mat src, @ByVal Mat dst, float gainB, float gainG, float gainR);
@Namespace("cv::xphoto") public static native void applyChannelGains(@ByVal UMat src, @ByVal UMat dst, float gainB, float gainG, float gainR);
@Namespace("cv::xphoto") public static native void applyChannelGains(@ByVal GpuMat src, @ByVal GpuMat dst, float gainB, float gainG, float gainR);
/** \} */



// #endif // __OPENCV_SIMPLE_COLOR_BALANCE_HPP__


// Parsed from <opencv2/xphoto/dct_image_denoising.hpp>

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
// Copyright (C) 2009-2011, Willow Garage Inc., all rights reserved.
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

// #ifndef __OPENCV_DCT_IMAGE_DENOISING_HPP__
// #define __OPENCV_DCT_IMAGE_DENOISING_HPP__

/** \file
\date Jun 26, 2014
@author Yury Gitman
*/

// #include <opencv2/core.hpp>

/** \addtogroup xphoto
 *  \{
    <p>
    /** \brief The function implements simple dct-based denoising
    <p>
    <http://www.ipol.im/pub/art/2011/ys-dct/>.
    @param src source image
    @param dst destination image
    @param sigma expected noise standard deviation
    @param psize size of block side where dct is computed
    <p>
    @see
       fastNlMeansDenoising
     */
    @Namespace("cv::xphoto") public static native void dctDenoising(@Const @ByRef Mat src, @ByRef Mat dst, double sigma, int psize/*=16*/);
    @Namespace("cv::xphoto") public static native void dctDenoising(@Const @ByRef Mat src, @ByRef Mat dst, double sigma);

/** \} */




// #endif // __OPENCV_DCT_IMAGE_DENOISING_HPP__


// Parsed from <opencv2/xphoto/bm3d_image_denoising.hpp>

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
// Copyright (C) 2009-2011, Willow Garage Inc., all rights reserved.
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

// #ifndef __OPENCV_BM3D_IMAGE_DENOISING_HPP__
// #define __OPENCV_BM3D_IMAGE_DENOISING_HPP__

/** \file
\date Jul 19, 2016
@author Bartek Pawlik
*/

// #include <opencv2/core.hpp>
        /** \addtogroup xphoto
         *  \{
         <p>
         *  BM3D transform types */
        /** enum cv::xphoto::TransformTypes */
        public static final int
            /** Un-normalized Haar transform */
            HAAR = 0;

        /** BM3D algorithm steps */
        /** enum cv::xphoto::Bm3dSteps */
        public static final int
            /** Execute all steps of the algorithm */
            BM3D_STEPALL = 0,
            /** Execute only first step of the algorithm */
            BM3D_STEP1 = 1,
            /** Execute only second step of the algorithm */
            BM3D_STEP2 = 2;

        /** \brief Performs image denoising using the Block-Matching and 3D-filtering algorithm
        <http://www.cs.tut.fi/~foi/GCF-BM3D/BM3D_TIP_2007.pdf> with several computational
        optimizations. Noise expected to be a gaussian white noise.
        <p>
        @param src Input 8-bit or 16-bit 1-channel image.
        @param dstStep1 Output image of the first step of BM3D with the same size and type as src.
        @param dstStep2 Output image of the second step of BM3D with the same size and type as src.
        @param h Parameter regulating filter strength. Big h value perfectly removes noise but also
        removes image details, smaller h value preserves details but also preserves some noise.
        @param templateWindowSize Size in pixels of the template patch that is used for block-matching.
        Should be power of 2.
        @param searchWindowSize Size in pixels of the window that is used to perform block-matching.
        Affect performance linearly: greater searchWindowsSize - greater denoising time.
        Must be larger than templateWindowSize.
        @param blockMatchingStep1 Block matching threshold for the first step of BM3D (hard thresholding),
        i.e. maximum distance for which two blocks are considered similar.
        Value expressed in euclidean distance.
        @param blockMatchingStep2 Block matching threshold for the second step of BM3D (Wiener filtering),
        i.e. maximum distance for which two blocks are considered similar.
        Value expressed in euclidean distance.
        @param groupSize Maximum size of the 3D group for collaborative filtering.
        @param slidingStep Sliding step to process every next reference block.
        @param beta Kaiser window parameter that affects the sidelobe attenuation of the transform of the
        window. Kaiser window is used in order to reduce border effects. To prevent usage of the window,
        set beta to zero.
        @param normType Norm used to calculate distance between blocks. L2 is slower than L1
        but yields more accurate results.
        @param step Step of BM3D to be executed. Possible variants are: step 1, step 2, both steps.
        @param transformType Type of the orthogonal transform used in collaborative filtering step.
        Currently only Haar transform is supported.
        <p>
        This function expected to be applied to grayscale images. Advanced usage of this function
        can be manual denoising of colored image in different colorspaces.
        <p>
        @see
        fastNlMeansDenoising
        */
        @Namespace("cv::xphoto") public static native void bm3dDenoising(
                    @ByVal Mat src,
                    @ByVal Mat dstStep1,
                    @ByVal Mat dstStep2,
                    float h/*=1*/,
                    int templateWindowSize/*=4*/,
                    int searchWindowSize/*=16*/,
                    int blockMatchingStep1/*=2500*/,
                    int blockMatchingStep2/*=400*/,
                    int groupSize/*=8*/,
                    int slidingStep/*=1*/,
                    float beta/*=2.0f*/,
                    int normType/*=cv::NORM_L2*/,
                    int step/*=cv::xphoto::BM3D_STEPALL*/,
                    int transformType/*=cv::xphoto::HAAR*/);
        @Namespace("cv::xphoto") public static native void bm3dDenoising(
                    @ByVal Mat src,
                    @ByVal Mat dstStep1,
                    @ByVal Mat dstStep2);
        @Namespace("cv::xphoto") public static native void bm3dDenoising(
                    @ByVal UMat src,
                    @ByVal UMat dstStep1,
                    @ByVal UMat dstStep2,
                    float h/*=1*/,
                    int templateWindowSize/*=4*/,
                    int searchWindowSize/*=16*/,
                    int blockMatchingStep1/*=2500*/,
                    int blockMatchingStep2/*=400*/,
                    int groupSize/*=8*/,
                    int slidingStep/*=1*/,
                    float beta/*=2.0f*/,
                    int normType/*=cv::NORM_L2*/,
                    int step/*=cv::xphoto::BM3D_STEPALL*/,
                    int transformType/*=cv::xphoto::HAAR*/);
        @Namespace("cv::xphoto") public static native void bm3dDenoising(
                    @ByVal UMat src,
                    @ByVal UMat dstStep1,
                    @ByVal UMat dstStep2);
        @Namespace("cv::xphoto") public static native void bm3dDenoising(
                    @ByVal GpuMat src,
                    @ByVal GpuMat dstStep1,
                    @ByVal GpuMat dstStep2,
                    float h/*=1*/,
                    int templateWindowSize/*=4*/,
                    int searchWindowSize/*=16*/,
                    int blockMatchingStep1/*=2500*/,
                    int blockMatchingStep2/*=400*/,
                    int groupSize/*=8*/,
                    int slidingStep/*=1*/,
                    float beta/*=2.0f*/,
                    int normType/*=cv::NORM_L2*/,
                    int step/*=cv::xphoto::BM3D_STEPALL*/,
                    int transformType/*=cv::xphoto::HAAR*/);
        @Namespace("cv::xphoto") public static native void bm3dDenoising(
                    @ByVal GpuMat src,
                    @ByVal GpuMat dstStep1,
                    @ByVal GpuMat dstStep2);

        /** \brief Performs image denoising using the Block-Matching and 3D-filtering algorithm
        <http://www.cs.tut.fi/~foi/GCF-BM3D/BM3D_TIP_2007.pdf> with several computational
        optimizations. Noise expected to be a gaussian white noise.
        <p>
        @param src Input 8-bit or 16-bit 1-channel image.
        @param dst Output image with the same size and type as src.
        @param h Parameter regulating filter strength. Big h value perfectly removes noise but also
        removes image details, smaller h value preserves details but also preserves some noise.
        @param templateWindowSize Size in pixels of the template patch that is used for block-matching.
        Should be power of 2.
        @param searchWindowSize Size in pixels of the window that is used to perform block-matching.
        Affect performance linearly: greater searchWindowsSize - greater denoising time.
        Must be larger than templateWindowSize.
        @param blockMatchingStep1 Block matching threshold for the first step of BM3D (hard thresholding),
        i.e. maximum distance for which two blocks are considered similar.
        Value expressed in euclidean distance.
        @param blockMatchingStep2 Block matching threshold for the second step of BM3D (Wiener filtering),
        i.e. maximum distance for which two blocks are considered similar.
        Value expressed in euclidean distance.
        @param groupSize Maximum size of the 3D group for collaborative filtering.
        @param slidingStep Sliding step to process every next reference block.
        @param beta Kaiser window parameter that affects the sidelobe attenuation of the transform of the
        window. Kaiser window is used in order to reduce border effects. To prevent usage of the window,
        set beta to zero.
        @param normType Norm used to calculate distance between blocks. L2 is slower than L1
        but yields more accurate results.
        @param step Step of BM3D to be executed. Allowed are only BM3D_STEP1 and BM3D_STEPALL.
        BM3D_STEP2 is not allowed as it requires basic estimate to be present.
        @param transformType Type of the orthogonal transform used in collaborative filtering step.
        Currently only Haar transform is supported.
        <p>
        This function expected to be applied to grayscale images. Advanced usage of this function
        can be manual denoising of colored image in different colorspaces.
        <p>
        @see
        fastNlMeansDenoising
        */
        @Namespace("cv::xphoto") public static native void bm3dDenoising(
                    @ByVal Mat src,
                    @ByVal Mat dst,
                    float h/*=1*/,
                    int templateWindowSize/*=4*/,
                    int searchWindowSize/*=16*/,
                    int blockMatchingStep1/*=2500*/,
                    int blockMatchingStep2/*=400*/,
                    int groupSize/*=8*/,
                    int slidingStep/*=1*/,
                    float beta/*=2.0f*/,
                    int normType/*=cv::NORM_L2*/,
                    int step/*=cv::xphoto::BM3D_STEPALL*/,
                    int transformType/*=cv::xphoto::HAAR*/);
        @Namespace("cv::xphoto") public static native void bm3dDenoising(
                    @ByVal Mat src,
                    @ByVal Mat dst);
        @Namespace("cv::xphoto") public static native void bm3dDenoising(
                    @ByVal UMat src,
                    @ByVal UMat dst,
                    float h/*=1*/,
                    int templateWindowSize/*=4*/,
                    int searchWindowSize/*=16*/,
                    int blockMatchingStep1/*=2500*/,
                    int blockMatchingStep2/*=400*/,
                    int groupSize/*=8*/,
                    int slidingStep/*=1*/,
                    float beta/*=2.0f*/,
                    int normType/*=cv::NORM_L2*/,
                    int step/*=cv::xphoto::BM3D_STEPALL*/,
                    int transformType/*=cv::xphoto::HAAR*/);
        @Namespace("cv::xphoto") public static native void bm3dDenoising(
                    @ByVal UMat src,
                    @ByVal UMat dst);
        @Namespace("cv::xphoto") public static native void bm3dDenoising(
                    @ByVal GpuMat src,
                    @ByVal GpuMat dst,
                    float h/*=1*/,
                    int templateWindowSize/*=4*/,
                    int searchWindowSize/*=16*/,
                    int blockMatchingStep1/*=2500*/,
                    int blockMatchingStep2/*=400*/,
                    int groupSize/*=8*/,
                    int slidingStep/*=1*/,
                    float beta/*=2.0f*/,
                    int normType/*=cv::NORM_L2*/,
                    int step/*=cv::xphoto::BM3D_STEPALL*/,
                    int transformType/*=cv::xphoto::HAAR*/);
        @Namespace("cv::xphoto") public static native void bm3dDenoising(
                    @ByVal GpuMat src,
                    @ByVal GpuMat dst);
        /** \} */
    


// #endif // __OPENCV_BM3D_IMAGE_DENOISING_HPP__


// Parsed from <opencv2/xphoto/oilpainting.hpp>

// This file is part of OpenCV project.
// It is subject to the license terms in the LICENSE file found in the top-level directory
// of this distribution and at http://opencv.org/license.html.


// #ifndef __OPENCV_OIL_PAINTING_HPP__
// #define __OPENCV_OIL_PAINTING_HPP__

// #include <opencv2/core.hpp>
// #include <opencv2/imgproc.hpp>

/** \addtogroup xphoto
 *  \{
<p>
/** \brief oilPainting
See the book \cite Holzmann1988 for details.
@param src Input three-channel or one channel image (either CV_8UC3 or CV_8UC1)
@param dst Output image of the same size and type as src.
@param size neighbouring size is 2-size+1
@param dynRatio image is divided by dynRatio before histogram processing
@param code	color space conversion code(see ColorConversionCodes). Histogram will used only first plane
*/
@Namespace("cv::xphoto") public static native void oilPainting(@ByVal Mat src, @ByVal Mat dst, int size, int dynRatio, int code);
@Namespace("cv::xphoto") public static native void oilPainting(@ByVal UMat src, @ByVal UMat dst, int size, int dynRatio, int code);
@Namespace("cv::xphoto") public static native void oilPainting(@ByVal GpuMat src, @ByVal GpuMat dst, int size, int dynRatio, int code);
/** \brief oilPainting
See the book \cite Holzmann1988 for details.
@param src Input three-channel or one channel image (either CV_8UC3 or CV_8UC1)
@param dst Output image of the same size and type as src.
@param size neighbouring size is 2-size+1
@param dynRatio image is divided by dynRatio before histogram processing
*/
@Namespace("cv::xphoto") public static native void oilPainting(@ByVal Mat src, @ByVal Mat dst, int size, int dynRatio);
@Namespace("cv::xphoto") public static native void oilPainting(@ByVal UMat src, @ByVal UMat dst, int size, int dynRatio);
@Namespace("cv::xphoto") public static native void oilPainting(@ByVal GpuMat src, @ByVal GpuMat dst, int size, int dynRatio);
/** \} */



// #endif // __OPENCV_OIL_PAINTING_HPP__


// Parsed from <opencv2/xphoto/tonemap.hpp>

// This file is part of OpenCV project.
// It is subject to the license terms in the LICENSE file found in the top-level directory
// of this distribution and at http://opencv.org/license.html.

// #ifndef OPENCV_XPHOTO_TONEMAP_HPP
// #define OPENCV_XPHOTO_TONEMAP_HPP

// #include "opencv2/photo.hpp"
// Targeting ../opencv_xphoto/TonemapDurand.java



/** \brief Creates TonemapDurand object
<p>
You need to set the OPENCV_ENABLE_NONFREE option in cmake to use those. Use them at your own risk.
<p>
@param gamma gamma value for gamma correction. See createTonemap
@param contrast resulting contrast on logarithmic scale, i. e. log(max / min), where max and min
are maximum and minimum luminance values of the resulting image.
@param saturation saturation enhancement value. See createTonemapDrago
@param sigma_color bilateral filter sigma in color space
@param sigma_space bilateral filter sigma in coordinate space
 */
@Namespace("cv::xphoto") public static native @Ptr TonemapDurand createTonemapDurand(float gamma/*=1.0f*/, float contrast/*=4.0f*/, float saturation/*=1.0f*/, float sigma_color/*=2.0f*/, float sigma_space/*=2.0f*/);
@Namespace("cv::xphoto") public static native @Ptr TonemapDurand createTonemapDurand();

 // namespace
// #endif  // OPENCV_XPHOTO_TONEMAP_HPP


}

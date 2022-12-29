// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.global;

import org.bytedeco.opencv.opencv_barcode.*;

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

public class opencv_barcode extends org.bytedeco.opencv.presets.opencv_barcode {
    static { Loader.load(); }

// Parsed from <opencv2/barcode.hpp>

// This file is part of OpenCV project.
// It is subject to the license terms in the LICENSE file found in the top-level directory
// of this distribution and at http://opencv.org/license.html.
// Copyright (c) 2020-2021 darkliang wangberlinT Certseeds

// #ifndef __OPENCV_BARCODE_HPP__
// #define __OPENCV_BARCODE_HPP__

// #include <opencv2/core.hpp>
// #include <ostream>

/** \defgroup barcode Barcode detecting and decoding methods
*/

/** \addtogroup barcode
 *  \{ */

/** enum cv::barcode::BarcodeType */
public static final int
    NONE = 0, EAN_8 = 1, EAN_13 = 2, UPC_A = 3, UPC_E = 4, UPC_EAN_EXTENSION = 5;

@Namespace("cv::barcode") public static native @Cast("std::ostream*") @ByRef @Name("operator <<") Pointer shiftLeft(@Cast("std::ostream*") @ByRef Pointer out, @Cast("const cv::barcode::BarcodeType") int barcode_type);
// Targeting ../opencv_barcode/BarcodeDetector.java


/** \} */

 // cv::barcode::
// #endif //__OPENCV_BARCODE_HPP__


}

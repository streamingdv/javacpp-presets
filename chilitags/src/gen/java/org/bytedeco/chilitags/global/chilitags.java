// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.chilitags.global;

import org.bytedeco.chilitags.*;

import org.bytedeco.javacpp.annotation.Index;
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
import org.bytedeco.opencv.opencv_video.*;
import static org.bytedeco.opencv.global.opencv_video.*;

public class chilitags extends org.bytedeco.chilitags.presets.chilitags {
    static { Loader.load(); }

// Targeting ../TagCornerMap.java


// Targeting ../TagPoseMap.java


// Targeting ../TagPoseMapd.java


// Parsed from chilitags/chilitags.hpp

/*******************************************************************************
*   Copyright 2013-2014 EPFL                                                   *
*   Copyright 2013-2014 Quentin Bonnard                                        *
*                                                                              *
*   This file is part of chilitags.                                            *
*                                                                              *
*   Chilitags is free software: you can redistribute it and/or modify          *
*   it under the terms of the Lesser GNU General Public License as             *
*   published by the Free Software Foundation, either version 3 of the         *
*   License, or (at your option) any later version.                            *
*                                                                              *
*   Chilitags is distributed in the hope that it will be useful,               *
*   but WITHOUT ANY WARRANTY; without even the implied warranty of             *
*   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the              *
*   GNU Lesser General Public License for more details.                        *
*                                                                              *
*   You should have received a copy of the GNU Lesser General Public License   *
*   along with Chilitags.  If not, see <http://www.gnu.org/licenses/>.         *
*******************************************************************************/

// #ifndef Chilitags_HPP
// #define Chilitags_HPP

// #include <map>
// #include <vector>
// #include <opencv2/core/core.hpp>
// #include <string>
// #include <memory>

// #include "chilitags_export.hpp"

/**
    The location of the detected chilitags are stored in a 4x2 matrix
    corresponding to the outside corners of its black border. The rows
    correspond to the 2D coordinates of the corners. The corners are
    consistenly stored clockwise, starting from top-left, i.e.
    <pre>{@literal
    {    top-left.x  ,    top-left.y  ,
         top-right.x ,    top-right.y ,
      bottom-right.x , bottom-left.y  ,
      bottom-left.x  , bottom-left.y  }
    }</pre>
 */
// Targeting ../Chilitags.java


// Targeting ../Chilitags3D.java


// Targeting ../Chilitags3Dd.java





// #endif


}

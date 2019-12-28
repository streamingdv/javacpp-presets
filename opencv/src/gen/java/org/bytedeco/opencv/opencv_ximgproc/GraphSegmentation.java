// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_ximgproc;

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

import static org.bytedeco.opencv.global.opencv_ximgproc.*;

            /** \addtogroup ximgproc_segmentation
             *  \{
                    <p>
                    /** \brief Graph Based Segmentation Algorithm.
                        The class implements the algorithm described in \cite PFF2004 .
                     */
                    @Namespace("cv::ximgproc::segmentation") @Properties(inherit = org.bytedeco.opencv.presets.opencv_ximgproc.class)
public class GraphSegmentation extends Algorithm {
                        static { Loader.load(); }
                        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
                        public GraphSegmentation(Pointer p) { super(p); }
                    
                            /** \brief Segment an image and store output in dst
                                @param src The input image. Any number of channel (1 (Eg: Gray), 3 (Eg: RGB), 4 (Eg: RGB-D)) can be provided
                                @param dst The output segmentation. It's a CV_32SC1 Mat with the same number of cols and rows as input image, with an unique, sequential, id for each pixel.
                            */
                            public native void processImage(@ByVal Mat src, @ByVal Mat dst);
                            public native void processImage(@ByVal UMat src, @ByVal UMat dst);
                            public native void processImage(@ByVal GpuMat src, @ByVal GpuMat dst);

                            public native void setSigma(double sigma);
                            public native double getSigma();

                            public native void setK(float k);
                            public native float getK();

                            public native void setMinSize(int min_size);
                            public native int getMinSize();
                    }

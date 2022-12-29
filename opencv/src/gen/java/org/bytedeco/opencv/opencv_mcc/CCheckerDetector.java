// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_mcc;

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

import static org.bytedeco.opencv.global.opencv_mcc.*;


/** \brief A class to find the positions of the ColorCharts in the image.
 */

@Namespace("cv::mcc") @Properties(inherit = org.bytedeco.opencv.presets.opencv_mcc.class)
public class CCheckerDetector extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CCheckerDetector(Pointer p) { super(p); }

    /** \brief Set the net which will be used to find the approximate
    *         bounding boxes for the color charts.
    *
    * It is not necessary to use this, but this usually results in
    * better detection rate.
    *
    * @param net the neural network, if the network in empty, then
    *            the function will return false.
    * @return true if it was able to set the detector's network,
    *         false otherwise.
    */

    public native @Cast("bool") boolean setNet(@ByVal Net net);

    /** \brief Find the ColorCharts in the given image.
    *
    * The found charts are not returned but instead stored in the
    * detector, these can be accessed later on using getBestColorChecker()
    * and getListColorChecker()
    * @param image image in color space BGR
    * @param chartType type of the chart to detect
    * @param regionsOfInterest regions of image to look for the chart, if
    *                          it is empty, charts are looked for in the
    *                          entire image
    * @param nc number of charts in the image, if you don't know the exact
    *           then keeping this number high helps.
    * @param useNet if it is true the network provided using the setNet()
    *               is used for preliminary search for regions where chart
    *               could be present, inside the regionsOfInterest provied.
    * @param params parameters of the detection system. More information
    *               about them can be found in the struct DetectorParameters.
    * @return true if atleast one chart is detected otherwise false
    */

    public native @Cast("bool") @Name("process") boolean processWithROI(@ByVal Mat image, @Cast("const cv::mcc::TYPECHART") int chartType,
                @Const @ByRef RectVector regionsOfInterest,
                int nc/*=1*/, @Cast("bool") boolean useNet/*=false*/,
                @Ptr DetectorParameters params/*=cv::mcc::DetectorParameters::create()*/);
    public native @Cast("bool") @Name("process") boolean processWithROI(@ByVal Mat image, @Cast("const cv::mcc::TYPECHART") int chartType,
                @Const @ByRef RectVector regionsOfInterest);
    public native @Cast("bool") @Name("process") boolean processWithROI(@ByVal UMat image, @Cast("const cv::mcc::TYPECHART") int chartType,
                @Const @ByRef RectVector regionsOfInterest,
                int nc/*=1*/, @Cast("bool") boolean useNet/*=false*/,
                @Ptr DetectorParameters params/*=cv::mcc::DetectorParameters::create()*/);
    public native @Cast("bool") @Name("process") boolean processWithROI(@ByVal UMat image, @Cast("const cv::mcc::TYPECHART") int chartType,
                @Const @ByRef RectVector regionsOfInterest);
    public native @Cast("bool") @Name("process") boolean processWithROI(@ByVal GpuMat image, @Cast("const cv::mcc::TYPECHART") int chartType,
                @Const @ByRef RectVector regionsOfInterest,
                int nc/*=1*/, @Cast("bool") boolean useNet/*=false*/,
                @Ptr DetectorParameters params/*=cv::mcc::DetectorParameters::create()*/);
    public native @Cast("bool") @Name("process") boolean processWithROI(@ByVal GpuMat image, @Cast("const cv::mcc::TYPECHART") int chartType,
                @Const @ByRef RectVector regionsOfInterest);


    /** \brief Find the ColorCharts in the given image.
    *
    * Differs from the above one only in the arguments.
    *
    * This version searches for the chart in the full image.
    *
    * The found charts are not returned but instead stored in the
    * detector, these can be accessed later on using getBestColorChecker()
    * and getListColorChecker()
    * @param image image in color space BGR
    * @param chartType type of the chart to detect
    * @param nc number of charts in the image, if you don't know the exact
    *           then keeping this number high helps.
    * @param useNet if it is true the network provided using the setNet()
    *               is used for preliminary search for regions where chart
    *               could be present, inside the regionsOfInterest provied.
    * @param params parameters of the detection system. More information
    *               about them can be found in the struct DetectorParameters.
    * @return true if atleast one chart is detected otherwise false
    */

    public native @Cast("bool") boolean process(@ByVal Mat image, @Cast("const cv::mcc::TYPECHART") int chartType,
                int nc/*=1*/, @Cast("bool") boolean useNet/*=false*/,
                @Ptr DetectorParameters params/*=cv::mcc::DetectorParameters::create()*/);
    public native @Cast("bool") boolean process(@ByVal Mat image, @Cast("const cv::mcc::TYPECHART") int chartType);
    public native @Cast("bool") boolean process(@ByVal UMat image, @Cast("const cv::mcc::TYPECHART") int chartType,
                int nc/*=1*/, @Cast("bool") boolean useNet/*=false*/,
                @Ptr DetectorParameters params/*=cv::mcc::DetectorParameters::create()*/);
    public native @Cast("bool") boolean process(@ByVal UMat image, @Cast("const cv::mcc::TYPECHART") int chartType);
    public native @Cast("bool") boolean process(@ByVal GpuMat image, @Cast("const cv::mcc::TYPECHART") int chartType,
                int nc/*=1*/, @Cast("bool") boolean useNet/*=false*/,
                @Ptr DetectorParameters params/*=cv::mcc::DetectorParameters::create()*/);
    public native @Cast("bool") boolean process(@ByVal GpuMat image, @Cast("const cv::mcc::TYPECHART") int chartType);

    /** \brief Get the best color checker. By the best it means the one
    *         detected with the highest confidence.
    * @return checker A single colorchecker, if atleast one colorchecker
    *                 was detected, 'nullptr' otherwise.
    */
    public native @Ptr CChecker getBestColorChecker();

    /** \brief Get the list of all detected colorcheckers
    * @return checkers vector of colorcheckers
    */
    public native @ByVal CCheckerVector getListColorChecker();

    /** \brief Returns the implementation of the CCheckerDetector.
    *
    */
    public static native @Ptr CCheckerDetector create();
}

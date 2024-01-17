// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_cudaoptflow;

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
import org.bytedeco.opencv.opencv_objdetect.*;
import static org.bytedeco.opencv.global.opencv_objdetect.*;
import org.bytedeco.opencv.opencv_video.*;
import static org.bytedeco.opencv.global.opencv_video.*;
import org.bytedeco.opencv.opencv_ximgproc.*;
import static org.bytedeco.opencv.global.opencv_ximgproc.*;
import org.bytedeco.opencv.opencv_optflow.*;
import static org.bytedeco.opencv.global.opencv_optflow.*;
import org.bytedeco.opencv.opencv_cudaarithm.*;
import static org.bytedeco.opencv.global.opencv_cudaarithm.*;
import org.bytedeco.opencv.opencv_cudafilters.*;
import static org.bytedeco.opencv.global.opencv_cudafilters.*;
import org.bytedeco.opencv.opencv_cudaimgproc.*;
import static org.bytedeco.opencv.global.opencv_cudaimgproc.*;
import static org.bytedeco.opencv.global.opencv_cudawarping.*;

import static org.bytedeco.opencv.global.opencv_cudaoptflow.*;


/** \brief Class for computing the optical flow vectors between two images using NVIDIA Optical Flow hardware and Optical Flow SDK 2.0.
\note
- A sample application demonstrating the use of NVIDIA Optical Flow can be found at
opencv_contrib_source_code/modules/cudaoptflow/samples/nvidia_optical_flow.cpp
- An example application comparing accuracy and performance of NVIDIA Optical Flow with other optical flow algorithms in OpenCV can be found at
opencv_contrib_source_code/modules/cudaoptflow/samples/optical_flow.cpp
*/

@Namespace("cv::cuda") @Properties(inherit = org.bytedeco.opencv.presets.opencv_cudaoptflow.class)
public class NvidiaOpticalFlow_2_0 extends NvidiaHWOpticalFlow {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NvidiaOpticalFlow_2_0(Pointer p) { super(p); }
    /** Downcast constructor. */
    public NvidiaOpticalFlow_2_0(Algorithm pointer) { super((Pointer)null); allocate(pointer); }
    @Namespace private native @Name("static_cast<cv::cuda::NvidiaOpticalFlow_2_0*>") void allocate(Algorithm pointer);

    /**
    * Supported optical flow performance levels.
    */
    /** enum cv::cuda::NvidiaOpticalFlow_2_0::NVIDIA_OF_PERF_LEVEL */
    public static final int
        NV_OF_PERF_LEVEL_UNDEFINED = 0,
        /** Slow perf level results in lowest performance and best quality */
        NV_OF_PERF_LEVEL_SLOW = 5,
        /** Medium perf level results in low performance and medium quality */
        NV_OF_PERF_LEVEL_MEDIUM = 10,
        /** Fast perf level results in high performance and low quality */
        NV_OF_PERF_LEVEL_FAST = 20,
        NV_OF_PERF_LEVEL_MAX = 21;

    /**
    * Supported grid size for output buffer.
    */
    /** enum cv::cuda::NvidiaOpticalFlow_2_0::NVIDIA_OF_OUTPUT_VECTOR_GRID_SIZE */
    public static final int
        NV_OF_OUTPUT_VECTOR_GRID_SIZE_UNDEFINED = 0,
        /** Output buffer grid size is 1x1  */
        NV_OF_OUTPUT_VECTOR_GRID_SIZE_1 = 1,
        /** Output buffer grid size is 2x2  */
        NV_OF_OUTPUT_VECTOR_GRID_SIZE_2 = 2,
        /** Output buffer grid size is 4x4  */
        NV_OF_OUTPUT_VECTOR_GRID_SIZE_4 = 4,
        NV_OF_OUTPUT_VECTOR_GRID_SIZE_MAX = 5;

    /**
    * Supported grid size for hint buffer.
    */
    /** enum cv::cuda::NvidiaOpticalFlow_2_0::NVIDIA_OF_HINT_VECTOR_GRID_SIZE */
    public static final int
        NV_OF_HINT_VECTOR_GRID_SIZE_UNDEFINED = 0,
        /** Hint buffer grid size is 1x1.*/
        NV_OF_HINT_VECTOR_GRID_SIZE_1 = 1,
        /** Hint buffer grid size is 2x2.*/
        NV_OF_HINT_VECTOR_GRID_SIZE_2 = 2,
        /** Hint buffer grid size is 4x4.*/
        NV_OF_HINT_VECTOR_GRID_SIZE_4 = 4,
        /** Hint buffer grid size is 8x8.*/
        NV_OF_HINT_VECTOR_GRID_SIZE_8 = 8,
        NV_OF_HINT_VECTOR_GRID_SIZE_MAX = 9;

    /** \brief convertToFloat() helper function converts the hardware-generated flow vectors to floating point representation (1 flow vector for gridSize).
    * gridSize can be queried via function getGridSize().
    <p>
    @param flow Buffer of type CV_16FC2 containing flow vectors generated by calc().
    @param floatFlow Buffer of type CV_32FC2, containing flow vectors in floating point representation, each flow vector for 1 pixel per gridSize, in the pitch-linear layout.
    */
    public native void convertToFloat(@ByVal Mat flow, @ByVal Mat floatFlow);
    public native void convertToFloat(@ByVal UMat flow, @ByVal UMat floatFlow);
    public native void convertToFloat(@ByVal GpuMat flow, @ByVal GpuMat floatFlow);

    /** \brief Instantiate NVIDIA Optical Flow
    <p>
    @param imageSize Size of input image in pixels.
    @param perfPreset Optional parameter. Refer [NV OF SDK documentation](https://developer.nvidia.com/opticalflow-sdk) for details about presets.
                      Defaults to NV_OF_PERF_LEVEL_SLOW.
    @param outputGridSize Optional parameter. Refer [NV OF SDK documentation](https://developer.nvidia.com/opticalflow-sdk) for details about output grid sizes.
                          Defaults to NV_OF_OUTPUT_VECTOR_GRID_SIZE_1.
    @param hintGridSize Optional parameter. Refer [NV OF SDK documentation](https://developer.nvidia.com/opticalflow-sdk) for details about hint grid sizes.
                        Defaults to NV_OF_HINT_VECTOR_GRID_SIZE_1.
    @param enableTemporalHints Optional parameter. Flag to enable temporal hints. When set to true, the hardware uses the flow vectors
                               generated in previous call to calc() as internal hints for the current call to calc().
                               Useful when computing flow vectors between successive video frames. Defaults to false.
    @param enableExternalHints Optional Parameter. Flag to enable passing external hints buffer to calc(). Defaults to false.
    @param enableCostBuffer Optional Parameter. Flag to enable cost buffer output from calc(). Defaults to false.
    @param gpuId Optional parameter to select the GPU ID on which the optical flow should be computed. Useful in multi-GPU systems. Defaults to 0.
    @param inputStream Optical flow algorithm may optionally involve cuda preprocessing on the input buffers.
                       The input cuda stream can be used to pipeline and synchronize the cuda preprocessing tasks with OF HW engine.
                       If input stream is not set, the execute function will use default stream which is NULL stream;
    @param outputStream Optical flow algorithm may optionally involve cuda post processing on the output flow vectors.
                        The output cuda stream can be used to pipeline and synchronize the cuda post processing tasks with OF HW engine.
                        If output stream is not set, the execute function will use default stream which is NULL stream;
    */
    public static native @Ptr NvidiaOpticalFlow_2_0 create(
            @ByVal Size imageSize,
            @Cast("cv::cuda::NvidiaOpticalFlow_2_0::NVIDIA_OF_PERF_LEVEL") int perfPreset/*=cv::cuda::NvidiaOpticalFlow_2_0::NV_OF_PERF_LEVEL_SLOW*/,
            @Cast("cv::cuda::NvidiaOpticalFlow_2_0::NVIDIA_OF_OUTPUT_VECTOR_GRID_SIZE") int outputGridSize/*=cv::cuda::NvidiaOpticalFlow_2_0::NV_OF_OUTPUT_VECTOR_GRID_SIZE_1*/,
            @Cast("cv::cuda::NvidiaOpticalFlow_2_0::NVIDIA_OF_HINT_VECTOR_GRID_SIZE") int hintGridSize/*=cv::cuda::NvidiaOpticalFlow_2_0::NV_OF_HINT_VECTOR_GRID_SIZE_1*/,
            @Cast("bool") boolean enableTemporalHints/*=false*/,
            @Cast("bool") boolean enableExternalHints/*=false*/,
            @Cast("bool") boolean enableCostBuffer/*=false*/,
            int gpuId/*=0*/,
            @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream inputStream,
            @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream outputStream);
    public static native @Ptr NvidiaOpticalFlow_2_0 create(
            @ByVal Size imageSize);

    /**  \brief Instantiate NVIDIA Optical Flow with ROI Feature
    <p>
    @param imageSize Size of input image in pixels.
    @param roiData Pointer to ROI data.
    @param perfPreset Optional parameter. Refer [NV OF SDK documentation](https://developer.nvidia.com/opticalflow-sdk) for details about presets.
                      Defaults to NV_OF_PERF_LEVEL_SLOW.
    @param outputGridSize Optional parameter. Refer [NV OF SDK documentation](https://developer.nvidia.com/opticalflow-sdk) for details about output grid sizes.
                          Defaults to NV_OF_OUTPUT_VECTOR_GRID_SIZE_1.
    @param hintGridSize Optional parameter. Refer [NV OF SDK documentation](https://developer.nvidia.com/opticalflow-sdk) for details about hint grid sizes.
                        Defaults to NV_OF_HINT_VECTOR_GRID_SIZE_1.
    @param enableTemporalHints Optional parameter. Flag to enable temporal hints. When set to true, the hardware uses the flow vectors
                               generated in previous call to calc() as internal hints for the current call to calc().
                               Useful when computing flow vectors between successive video frames. Defaults to false.
    @param enableExternalHints Optional Parameter. Flag to enable passing external hints buffer to calc(). Defaults to false.
    @param enableCostBuffer Optional Parameter. Flag to enable cost buffer output from calc(). Defaults to false.
    @param gpuId Optional parameter to select the GPU ID on which the optical flow should be computed. Useful in multi-GPU systems. Defaults to 0.
    @param inputStream Optical flow algorithm may optionally involve cuda preprocessing on the input buffers.
                       The input cuda stream can be used to pipeline and synchronize the cuda preprocessing tasks with OF HW engine.
                       If input stream is not set, the execute function will use default stream which is NULL stream;
    @param outputStream Optical flow algorithm may optionally involve cuda post processing on the output flow vectors.
                        The output cuda stream can be used to pipeline and synchronize the cuda post processing tasks with OF HW engine.
                        If output stream is not set, the execute function will use default stream which is NULL stream;
    */
    public static native @Ptr NvidiaOpticalFlow_2_0 create(
            @ByVal Size imageSize,
            @ByVal RectVector roiData,
            @Cast("cv::cuda::NvidiaOpticalFlow_2_0::NVIDIA_OF_PERF_LEVEL") int perfPreset/*=cv::cuda::NvidiaOpticalFlow_2_0::NV_OF_PERF_LEVEL_SLOW*/,
            @Cast("cv::cuda::NvidiaOpticalFlow_2_0::NVIDIA_OF_OUTPUT_VECTOR_GRID_SIZE") int outputGridSize/*=cv::cuda::NvidiaOpticalFlow_2_0::NV_OF_OUTPUT_VECTOR_GRID_SIZE_1*/,
            @Cast("cv::cuda::NvidiaOpticalFlow_2_0::NVIDIA_OF_HINT_VECTOR_GRID_SIZE") int hintGridSize/*=cv::cuda::NvidiaOpticalFlow_2_0::NV_OF_HINT_VECTOR_GRID_SIZE_1*/,
            @Cast("bool") boolean enableTemporalHints/*=false*/,
            @Cast("bool") boolean enableExternalHints/*=false*/,
            @Cast("bool") boolean enableCostBuffer/*=false*/,
            int gpuId/*=0*/,
            @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream inputStream,
            @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream outputStream);
    public static native @Ptr NvidiaOpticalFlow_2_0 create(
            @ByVal Size imageSize,
            @ByVal RectVector roiData);
}

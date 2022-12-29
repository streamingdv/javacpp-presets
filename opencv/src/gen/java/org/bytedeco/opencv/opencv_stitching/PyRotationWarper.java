// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_stitching;

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
import org.bytedeco.opencv.opencv_ml.*;
import static org.bytedeco.opencv.global.opencv_ml.*;
import org.bytedeco.opencv.opencv_shape.*;
import static org.bytedeco.opencv.global.opencv_shape.*;
import org.bytedeco.opencv.opencv_xfeatures2d.*;
import static org.bytedeco.opencv.global.opencv_xfeatures2d.*;

import static org.bytedeco.opencv.global.opencv_stitching.*;

    @Namespace("cv") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_stitching.class)
public class PyRotationWarper extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public PyRotationWarper(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public PyRotationWarper(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public PyRotationWarper position(long position) {
            return (PyRotationWarper)super.position(position);
        }
        @Override public PyRotationWarper getPointer(long i) {
            return new PyRotationWarper((Pointer)this).offsetAddress(i);
        }
    
        public PyRotationWarper(@Str BytePointer type, float scale) { super((Pointer)null); allocate(type, scale); }
        private native void allocate(@Str BytePointer type, float scale);
        public PyRotationWarper(@Str String type, float scale) { super((Pointer)null); allocate(type, scale); }
        private native void allocate(@Str String type, float scale);
        public PyRotationWarper() { super((Pointer)null); allocate(); }
        private native void allocate();

        /** \brief Projects the image point.
        <p>
        @param pt Source point
        @param K Camera intrinsic parameters
        @param R Camera rotation matrix
        @return Projected point
        */
        public native @ByVal Point2f warpPoint(@Const @ByRef Point2f pt, @ByVal Mat K, @ByVal Mat R);
        public native @ByVal Point2f warpPoint(@Const @ByRef Point2f pt, @ByVal UMat K, @ByVal UMat R);
        public native @ByVal Point2f warpPoint(@Const @ByRef Point2f pt, @ByVal GpuMat K, @ByVal GpuMat R);

        /** \brief Projects the image point backward.
        <p>
        @param pt Projected point
        @param K Camera intrinsic parameters
        @param R Camera rotation matrix
        @return Backward-projected point
        */
// #if CV_VERSION_MAJOR == 4
        public native @ByVal Point2f warpPointBackward(@Const @ByRef Point2f pt, @ByVal Mat K, @ByVal Mat R);
        public native @ByVal Point2f warpPointBackward(@Const @ByRef Point2f pt, @ByVal UMat K, @ByVal UMat R);
        public native @ByVal Point2f warpPointBackward(@Const @ByRef Point2f pt, @ByVal GpuMat K, @ByVal GpuMat R);
// #else
// #endif
        /** \brief Builds the projection maps according to the given camera data.
        <p>
        @param src_size Source image size
        @param K Camera intrinsic parameters
        @param R Camera rotation matrix
        @param xmap Projection map for the x axis
        @param ymap Projection map for the y axis
        @return Projected image minimum bounding box
        */
        public native @ByVal Rect buildMaps(@ByVal Size src_size, @ByVal Mat K, @ByVal Mat R, @ByVal Mat xmap, @ByVal Mat ymap);
        public native @ByVal Rect buildMaps(@ByVal Size src_size, @ByVal UMat K, @ByVal UMat R, @ByVal UMat xmap, @ByVal UMat ymap);
        public native @ByVal Rect buildMaps(@ByVal Size src_size, @ByVal GpuMat K, @ByVal GpuMat R, @ByVal GpuMat xmap, @ByVal GpuMat ymap);

        /** \brief Projects the image.
        <p>
        @param src Source image
        @param K Camera intrinsic parameters
        @param R Camera rotation matrix
        @param interp_mode Interpolation mode
        @param border_mode Border extrapolation mode
        @param dst Projected image
        @return Project image top-left corner
        */
        public native @ByVal Point warp(@ByVal Mat src, @ByVal Mat K, @ByVal Mat R, int interp_mode, int border_mode,
                    @ByVal Mat dst);
        public native @ByVal Point warp(@ByVal UMat src, @ByVal UMat K, @ByVal UMat R, int interp_mode, int border_mode,
                    @ByVal UMat dst);
        public native @ByVal Point warp(@ByVal GpuMat src, @ByVal GpuMat K, @ByVal GpuMat R, int interp_mode, int border_mode,
                    @ByVal GpuMat dst);

        /** \brief Projects the image backward.
        <p>
        @param src Projected image
        @param K Camera intrinsic parameters
        @param R Camera rotation matrix
        @param interp_mode Interpolation mode
        @param border_mode Border extrapolation mode
        @param dst_size Backward-projected image size
        @param dst Backward-projected image
        */
        public native void warpBackward(@ByVal Mat src, @ByVal Mat K, @ByVal Mat R, int interp_mode, int border_mode,
                    @ByVal Size dst_size, @ByVal Mat dst);
        public native void warpBackward(@ByVal UMat src, @ByVal UMat K, @ByVal UMat R, int interp_mode, int border_mode,
                    @ByVal Size dst_size, @ByVal UMat dst);
        public native void warpBackward(@ByVal GpuMat src, @ByVal GpuMat K, @ByVal GpuMat R, int interp_mode, int border_mode,
                    @ByVal Size dst_size, @ByVal GpuMat dst);

        /**
        @param src_size Source image bounding box
        @param K Camera intrinsic parameters
        @param R Camera rotation matrix
        @return Projected image minimum bounding box
        */
        public native @ByVal Rect warpRoi(@ByVal Size src_size, @ByVal Mat K, @ByVal Mat R);
        public native @ByVal Rect warpRoi(@ByVal Size src_size, @ByVal UMat K, @ByVal UMat R);
        public native @ByVal Rect warpRoi(@ByVal Size src_size, @ByVal GpuMat K, @ByVal GpuMat R);

        public native float getScale();
        public native void setScale(float arg0);
    }

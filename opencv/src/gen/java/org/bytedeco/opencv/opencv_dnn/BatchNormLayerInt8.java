// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_dnn;

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

import static org.bytedeco.opencv.global.opencv_dnn.*;


    @Namespace("cv::dnn") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_dnn.class)
public class BatchNormLayerInt8 extends BatchNormLayer {
        static { Loader.load(); }
        /** Default native constructor. */
        public BatchNormLayerInt8() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public BatchNormLayerInt8(long size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public BatchNormLayerInt8(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(long size);
        @Override public BatchNormLayerInt8 position(long position) {
            return (BatchNormLayerInt8)super.position(position);
        }
        @Override public BatchNormLayerInt8 getPointer(long i) {
            return new BatchNormLayerInt8((Pointer)this).offsetAddress(i);
        }
    
        public native float input_sc(); public native BatchNormLayerInt8 input_sc(float setter);
        public native float output_sc(); public native BatchNormLayerInt8 output_sc(float setter);
        public native int input_zp(); public native BatchNormLayerInt8 input_zp(int setter);
        public native int output_zp(); public native BatchNormLayerInt8 output_zp(int setter);
        public static native @Ptr BatchNormLayerInt8 create(@Const @ByRef LayerParams params);
    }

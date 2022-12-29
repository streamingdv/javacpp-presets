// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

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
public class CumSumLayer extends Layer {
        static { Loader.load(); }
        /** Default native constructor. */
        public CumSumLayer() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public CumSumLayer(long size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public CumSumLayer(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(long size);
        @Override public CumSumLayer position(long position) {
            return (CumSumLayer)super.position(position);
        }
        @Override public CumSumLayer getPointer(long i) {
            return new CumSumLayer((Pointer)this).offsetAddress(i);
        }
    
        public native int exclusive(); public native CumSumLayer exclusive(int setter);
        public native int reverse(); public native CumSumLayer reverse(int setter);

        public static native @Ptr CumSumLayer create(@Const @ByRef LayerParams params);
    }

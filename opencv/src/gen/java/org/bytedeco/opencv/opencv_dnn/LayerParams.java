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


    /** \brief This class provides all data needed to initialize layer.
     *
     * It includes dictionary with scalar params (which can be read by using Dict interface),
     * blob params #blobs and optional meta information: #name and #type of layer instance.
    */
    @Namespace("cv::dnn") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_dnn.class)
public class LayerParams extends Dict {
        static { Loader.load(); }
        /** Default native constructor. */
        public LayerParams() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public LayerParams(long size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public LayerParams(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(long size);
        @Override public LayerParams position(long position) {
            return (LayerParams)super.position(position);
        }
        @Override public LayerParams getPointer(long i) {
            return new LayerParams((Pointer)this).offsetAddress(i);
        }
    
        //TODO: Add ability to name blob params
        /** List of learned parameters stored as blobs. */
        public native @ByRef MatVector blobs(); public native LayerParams blobs(MatVector setter);

        /** Name of the layer instance (optional, can be used internal purposes). */
        public native @Str BytePointer name(); public native LayerParams name(BytePointer setter);
        /** Type name which was used for creating layer by layer factory (optional). */
        public native @Str BytePointer type(); public native LayerParams type(BytePointer setter);
    }

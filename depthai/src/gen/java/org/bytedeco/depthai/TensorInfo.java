// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.depthai;

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

import static org.bytedeco.depthai.global.depthai.*;


/** TensorInfo structure */
@Namespace("dai") @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class TensorInfo extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TensorInfo() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TensorInfo(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TensorInfo(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TensorInfo position(long position) {
        return (TensorInfo)super.position(position);
    }
    @Override public TensorInfo getPointer(long i) {
        return new TensorInfo((Pointer)this).offsetAddress(i);
    }

    public enum StorageOrder {
        NHWC(0x4213),
        NHCW(0x4231),
        NCHW(0x4321),
        HWC(0x213),
        CHW(0x321),
        WHC(0x123),
        HCW(0x231),
        WCH(0x132),
        CWH(0x312),
        NC(0x43),
        CN(0x34),
        C(0x3),
        H(0x2),
        W(0x1);

        public final int value;
        private StorageOrder(int v) { this.value = v; }
        private StorageOrder(StorageOrder e) { this.value = e.value; }
        public StorageOrder intern() { for (StorageOrder e : values()) if (e.value == value) return e; return this; }
        @Override public String toString() { return intern().name(); }
    }

    public enum DataType {
        FP16(0),  // Half precision floating point
        U8F(1),   // Unsigned byte
        INT(2),   // Signed integer (4 byte)
        FP32(3),  // Single precision floating point
        I8(4);   // Signed byte

        public final int value;
        private DataType(int v) { this.value = v; }
        private DataType(DataType e) { this.value = e.value; }
        public DataType intern() { for (DataType e : values()) if (e.value == value) return e; return this; }
        @Override public String toString() { return intern().name(); }
    }

    public native StorageOrder order(); public native TensorInfo order(StorageOrder setter);
    public native DataType dataType(); public native TensorInfo dataType(DataType setter);
    public native @Cast("unsigned int") int numDimensions(); public native TensorInfo numDimensions(int setter);
    public native @Cast("unsigned*") @StdVector IntPointer dims(); public native TensorInfo dims(IntPointer setter);
    public native @Cast("unsigned*") @StdVector IntPointer strides(); public native TensorInfo strides(IntPointer setter);
    public native @StdString BytePointer name(); public native TensorInfo name(BytePointer setter);
    public native @Cast("unsigned int") int offset(); public native TensorInfo offset(int setter);
}

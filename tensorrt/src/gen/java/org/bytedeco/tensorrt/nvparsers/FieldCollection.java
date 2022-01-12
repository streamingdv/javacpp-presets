// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvparsers;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.cuda.cublas.*;
import static org.bytedeco.cuda.global.cublas.*;
import org.bytedeco.cuda.cudnn.*;
import static org.bytedeco.cuda.global.cudnn.*;
import org.bytedeco.cuda.nvrtc.*;
import static org.bytedeco.cuda.global.nvrtc.*;
import org.bytedeco.tensorrt.nvinfer.*;
import static org.bytedeco.tensorrt.global.nvinfer.*;
import org.bytedeco.tensorrt.nvinfer_plugin.*;
import static org.bytedeco.tensorrt.global.nvinfer_plugin.*;

import static org.bytedeco.tensorrt.global.nvparsers.*;


@Namespace("nvuffparser") @Properties(inherit = org.bytedeco.tensorrt.presets.nvparsers.class)
public class FieldCollection extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public FieldCollection() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public FieldCollection(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FieldCollection(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public FieldCollection position(long position) {
        return (FieldCollection)super.position(position);
    }
    @Override public FieldCollection getPointer(long i) {
        return new FieldCollection((Pointer)this).offsetAddress(i);
    }

    public native int nbFields(); public native FieldCollection nbFields(int setter);
    public native @Const FieldMap fields(); public native FieldCollection fields(FieldMap setter);
}

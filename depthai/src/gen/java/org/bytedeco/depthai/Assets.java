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


// This is a serializable class, which acts as readonly access to assets
@Namespace("dai") @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class Assets extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public Assets() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Assets(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Assets(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public Assets position(long position) {
        return (Assets)super.position(position);
    }
    @Override public Assets getPointer(long i) {
        return new Assets((Pointer)this).offsetAddress(i);
    }

    public native void setStorage(@Cast("std::uint8_t*") BytePointer ps);
    public native void setStorage(@Cast("std::uint8_t*") ByteBuffer ps);
    public native void setStorage(@Cast("std::uint8_t*") byte[] ps);

    public native @Cast("bool") boolean has(@StdString BytePointer key);
    public native @Cast("bool") boolean has(@StdString ByteBuffer key);
    public native @Cast("bool") boolean has(@StdString String key);

    public native @ByVal AssetView get(@StdString BytePointer key);
    public native @ByVal AssetView get(@StdString ByteBuffer key);
    public native @ByVal AssetView get(@StdString String key);

    public native @ByVal StringAssetViewPairVector getAll();
}

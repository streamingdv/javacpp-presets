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


/** RawSpatialLocations structure */
@Namespace("dai") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class RawSpatialLocations extends RawBuffer {
    static { Loader.load(); }
    /** Default native constructor. */
    public RawSpatialLocations() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public RawSpatialLocations(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RawSpatialLocations(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public RawSpatialLocations position(long position) {
        return (RawSpatialLocations)super.position(position);
    }
    @Override public RawSpatialLocations getPointer(long i) {
        return new RawSpatialLocations((Pointer)this).offsetAddress(i);
    }

    public native @StdVector SpatialLocations spatialLocations(); public native RawSpatialLocations spatialLocations(SpatialLocations setter);

    public native @Override void serialize(@Cast("std::uint8_t*") @StdVector BytePointer metadata, @ByRef @Cast("dai::DatatypeEnum*") IntPointer datatype);
    public native @Override void serialize(@Cast("std::uint8_t*") @StdVector ByteBuffer metadata, @ByRef @Cast("dai::DatatypeEnum*") IntBuffer datatype);
    public native @Override void serialize(@Cast("std::uint8_t*") @StdVector byte[] metadata, @ByRef @Cast("dai::DatatypeEnum*") int[] datatype);

    public native @Override DatatypeEnum getType();
}

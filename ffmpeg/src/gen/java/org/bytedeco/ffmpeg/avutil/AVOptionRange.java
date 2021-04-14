// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.avutil;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.ffmpeg.global.avutil.*;


/**
 * A single allowed range of values, or a single allowed value.
 */
@Properties(inherit = org.bytedeco.ffmpeg.presets.avutil.class)
public class AVOptionRange extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVOptionRange() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AVOptionRange(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVOptionRange(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AVOptionRange position(long position) {
        return (AVOptionRange)super.position(position);
    }
    @Override public AVOptionRange getPointer(long i) {
        return new AVOptionRange((Pointer)this).position(position + i);
    }

    public native @Cast("const char*") BytePointer str(); public native AVOptionRange str(BytePointer setter);
    /**
     * Value range.
     * For string ranges this represents the min/max length.
     * For dimensions this represents the min/max pixel count or width/height in multi-component case.
     */
    public native double value_min(); public native AVOptionRange value_min(double setter);
    public native double value_max(); public native AVOptionRange value_max(double setter);
    /**
     * Value's component range.
     * For string this represents the unicode range for chars, 0-127 limits to ASCII.
     */
    public native double component_min(); public native AVOptionRange component_min(double setter);
    public native double component_max(); public native AVOptionRange component_max(double setter);
    /**
     * Range flag.
     * If set to 1 the struct encodes a range, if set to 0 a single value.
     */
    public native int is_range(); public native AVOptionRange is_range(int setter);
}

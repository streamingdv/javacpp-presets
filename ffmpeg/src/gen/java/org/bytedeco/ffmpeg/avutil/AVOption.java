// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.avutil;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.ffmpeg.global.avutil.*;


/**
 * AVOption
 */
@Properties(inherit = org.bytedeco.ffmpeg.presets.avutil.class)
public class AVOption extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVOption() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AVOption(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVOption(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AVOption position(long position) {
        return (AVOption)super.position(position);
    }
    @Override public AVOption getPointer(long i) {
        return new AVOption((Pointer)this).offsetAddress(i);
    }

    public native @Cast("const char*") BytePointer name(); public native AVOption name(BytePointer setter);

    /**
     * short English help text
     * \todo What about other languages?
     */
    public native @Cast("const char*") BytePointer help(); public native AVOption help(BytePointer setter);

    /**
     * The offset relative to the context structure where the option
     * value is stored. It should be 0 for named constants.
     */
    public native int offset(); public native AVOption offset(int setter);
    public native @Cast("AVOptionType") int type(); public native AVOption type(int setter);

    /**
     * the default value for scalar options
     */
        @Name("default_val.i64") public native @Cast("int64_t") long default_val_i64(); public native AVOption default_val_i64(long setter);
        @Name("default_val.dbl") public native double default_val_dbl(); public native AVOption default_val_dbl(double setter);
        @Name("default_val.str") public native @Cast("const char*") BytePointer default_val_str(); public native AVOption default_val_str(BytePointer setter);
        /* TODO those are unused now */
        @Name("default_val.q") public native @ByRef AVRational default_val_q(); public native AVOption default_val_q(AVRational setter);
    /** minimum valid value for the option */
    public native double min(); public native AVOption min(double setter);
    /** maximum valid value for the option */
    public native double max(); public native AVOption max(double setter);

    public native int flags(); public native AVOption flags(int setter);
/** a generic parameter which can be set by the user for muxing or encoding */
public static final int AV_OPT_FLAG_ENCODING_PARAM =  1;
/** a generic parameter which can be set by the user for demuxing or decoding */
public static final int AV_OPT_FLAG_DECODING_PARAM =  2;
public static final int AV_OPT_FLAG_AUDIO_PARAM =     8;
public static final int AV_OPT_FLAG_VIDEO_PARAM =     16;
public static final int AV_OPT_FLAG_SUBTITLE_PARAM =  32;
/**
 * The option is intended for exporting values to the caller.
 */
public static final int AV_OPT_FLAG_EXPORT =          64;
/**
 * The option may not be set through the AVOptions API, only read.
 * This flag only makes sense when AV_OPT_FLAG_EXPORT is also set.
 */
public static final int AV_OPT_FLAG_READONLY =        128;
/** a generic parameter which can be set by the user for bit stream filtering */
public static final int AV_OPT_FLAG_BSF_PARAM =       (1<<8);
/** a generic parameter which can be set by the user at runtime */
public static final int AV_OPT_FLAG_RUNTIME_PARAM =   (1<<15);
/** a generic parameter which can be set by the user for filtering */
public static final int AV_OPT_FLAG_FILTERING_PARAM = (1<<16);
/** set if option is deprecated, users should refer to AVOption.help text for more information */
public static final int AV_OPT_FLAG_DEPRECATED =      (1<<17);
/** set if option constants can also reside in child objects */
public static final int AV_OPT_FLAG_CHILD_CONSTS =    (1<<18);
//FIXME think about enc-audio, ... style flags

    /**
     * The logical unit to which the option belongs. Non-constant
     * options and corresponding named constants share the same
     * unit. May be NULL.
     */
    public native @Cast("const char*") BytePointer unit(); public native AVOption unit(BytePointer setter);
}

// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.avutil;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.ffmpeg.global.avutil.*;


/**
 * Set the logging callback
 *
 * \note The callback must be thread safe, even if the application does not use
 *       threads itself as some codecs are multithreaded.
 *
 * @see av_log_default_callback
 *
 * @param callback A logging function with a compatible signature.
 */
@Properties(inherit = org.bytedeco.ffmpeg.presets.avutil.class)
public class Callback_Pointer_int_BytePointer_Pointer extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    Callback_Pointer_int_BytePointer_Pointer(Pointer p) { super(p); }
    protected Callback_Pointer_int_BytePointer_Pointer() { allocate(); }
    private native void allocate();
    public native void call(Pointer arg0, int arg1, @Cast("const char*") BytePointer arg2, @ByVal @Cast("va_list*") Pointer arg3);
}

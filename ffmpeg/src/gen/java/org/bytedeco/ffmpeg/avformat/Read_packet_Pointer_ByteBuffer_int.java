// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.avformat;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.ffmpeg.avutil.*;
import static org.bytedeco.ffmpeg.global.avutil.*;
import org.bytedeco.ffmpeg.swresample.*;
import static org.bytedeco.ffmpeg.global.swresample.*;
import org.bytedeco.ffmpeg.avcodec.*;
import static org.bytedeco.ffmpeg.global.avcodec.*;

import static org.bytedeco.ffmpeg.global.avformat.*;

@Properties(inherit = org.bytedeco.ffmpeg.presets.avformat.class)
public class Read_packet_Pointer_ByteBuffer_int extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    Read_packet_Pointer_ByteBuffer_int(Pointer p) { super(p); }
    protected Read_packet_Pointer_ByteBuffer_int() { allocate(); }
    private native void allocate();
    public native int call(Pointer opaque, @Cast("uint8_t*") ByteBuffer buf, int buf_size);
}

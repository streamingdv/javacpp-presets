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


/**
 * Allocate and initialize an AVIOContext for buffered I/O. It must be later
 * freed with avio_context_free().
 *
 * @param buffer Memory block for input/output operations via AVIOContext.
 *        The buffer must be allocated with av_malloc() and friends.
 *        It may be freed and replaced with a new buffer by libavformat.
 *        AVIOContext.buffer holds the buffer currently in use,
 *        which must be later freed with av_free().
 * @param buffer_size The buffer size is very important for performance.
 *        For protocols with fixed blocksize it should be set to this blocksize.
 *        For others a typical size is a cache page, e.g. 4kb.
 * @param write_flag Set to 1 if the buffer should be writable, 0 otherwise.
 * @param opaque An opaque pointer to user-specific data.
 * @param read_packet  A function for refilling the buffer, may be NULL.
 *                     For stream protocols, must never return 0 but rather
 *                     a proper AVERROR code.
 * @param write_packet A function for writing the buffer contents, may be NULL.
 *        The function may not change the input buffers content.
 * @param seek A function for seeking to specified byte position, may be NULL.
 *
 * @return Allocated AVIOContext or NULL on failure.
 */
@Properties(inherit = org.bytedeco.ffmpeg.presets.avformat.class)
public class Read_packet_Pointer_BytePointer_int extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    Read_packet_Pointer_BytePointer_int(Pointer p) { super(p); }
    protected Read_packet_Pointer_BytePointer_int() { allocate(); }
    private native void allocate();
    public native int call(Pointer opaque, @Cast("uint8_t*") BytePointer buf, int buf_size);
}

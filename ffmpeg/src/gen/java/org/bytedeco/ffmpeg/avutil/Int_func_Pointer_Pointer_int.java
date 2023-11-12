// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.avutil;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.ffmpeg.global.avutil.*;


/**
 * Feed data from a user-supplied callback to an AVFifoBuffer.
 * @param f AVFifoBuffer to write to
 * @param src data source; non-const since it may be used as a
 * modifiable context by the function defined in func
 * @param size number of bytes to write
 * @param func generic write function; the first parameter is src,
 * the second is dest_buf, the third is dest_buf_size.
 * func must return the number of bytes written to dest_buf, or <= 0 to
 * indicate no more data available to write.
 * If func is NULL, src is interpreted as a simple byte array for source data.
 * @return the number of bytes written to the FIFO or a negative error code on failure
 *
 * @deprecated use the new AVFifo-API with av_fifo_write() when func == NULL,
 *             av_fifo_write_from_cb() otherwise
 */
@Properties(inherit = org.bytedeco.ffmpeg.presets.avutil.class)
public class Int_func_Pointer_Pointer_int extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    Int_func_Pointer_Pointer_int(Pointer p) { super(p); }
    protected Int_func_Pointer_Pointer_int() { allocate(); }
    private native void allocate();
    public native int call(Pointer arg0, Pointer arg1, int arg2);
}

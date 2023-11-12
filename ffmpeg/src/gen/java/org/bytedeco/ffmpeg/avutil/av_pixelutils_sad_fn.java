// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.avutil;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.ffmpeg.global.avutil.*;


/**
 * Sum of abs(src1[x] - src2[x])
 */
@Properties(inherit = org.bytedeco.ffmpeg.presets.avutil.class)
public class av_pixelutils_sad_fn extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    av_pixelutils_sad_fn(Pointer p) { super(p); }
    protected av_pixelutils_sad_fn() { allocate(); }
    private native void allocate();
    public native int call(@Cast("const uint8_t*") BytePointer src1, @Cast("ptrdiff_t") long stride1,
                                    @Cast("const uint8_t*") BytePointer src2, @Cast("ptrdiff_t") long stride2);
}

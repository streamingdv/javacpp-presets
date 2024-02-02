// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nvjpeg;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nvjpeg.*;


///////////////////////////////////////////////////////////////////////////////////
// JPEG stream parameters //
///////////////////////////////////////////////////////////////////////////////////

// handle that stores stream information - metadata, encoded image parameters, encoded stream parameters
// stores everything on CPU side. This allows us parse header separately from implementation
// and retrieve more information on the stream. Also can be used for transcoding and transfering 
// metadata to encoder
@Opaque @Properties(inherit = org.bytedeco.cuda.presets.nvjpeg.class)
public class nvjpegJpegStream extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public nvjpegJpegStream() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public nvjpegJpegStream(Pointer p) { super(p); }
}

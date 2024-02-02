// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.nvcodec.nvencodeapi;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.nvcodec.nvcuvid.*;
import static org.bytedeco.nvcodec.global.nvcuvid.*;

import static org.bytedeco.nvcodec.global.nvencodeapi.*;


// #endif // _WIN32

/** \} */ /* End of GUID and NVENC_RECT structure grouping*/

/** NVENCODE API input buffer                              */
@Namespace @Name("void") @Opaque @Properties(inherit = org.bytedeco.nvcodec.presets.nvencodeapi.class)
public class NV_ENC_INPUT_PTR extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public NV_ENC_INPUT_PTR() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NV_ENC_INPUT_PTR(Pointer p) { super(p); }
}

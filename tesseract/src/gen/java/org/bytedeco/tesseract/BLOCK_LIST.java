// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.tesseract;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.leptonica.*;
import static org.bytedeco.leptonica.global.leptonica.*;

import static org.bytedeco.tesseract.global.tesseract.*;

@Namespace("tesseract") @Opaque @Properties(inherit = org.bytedeco.tesseract.presets.tesseract.class)
public class BLOCK_LIST extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public BLOCK_LIST() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BLOCK_LIST(Pointer p) { super(p); }
}

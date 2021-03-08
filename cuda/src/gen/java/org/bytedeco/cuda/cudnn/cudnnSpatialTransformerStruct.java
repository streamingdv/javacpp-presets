// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudnn;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.cudnn.*;

@Opaque @Properties(inherit = org.bytedeco.cuda.presets.cudnn.class)
public class cudnnSpatialTransformerStruct extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public cudnnSpatialTransformerStruct() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudnnSpatialTransformerStruct(Pointer p) { super(p); }
}

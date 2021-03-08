// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.curand;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.curand.*;

@Opaque @Properties(inherit = org.bytedeco.cuda.presets.curand.class)
public class curandHistogramM2_st extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public curandHistogramM2_st() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public curandHistogramM2_st(Pointer p) { super(p); }
}

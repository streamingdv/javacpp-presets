// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;

/** CUDA graph */
@Opaque @Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class CUgraph_st extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public CUgraph_st() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUgraph_st(Pointer p) { super(p); }
}

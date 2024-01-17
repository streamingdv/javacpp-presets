// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.opencl.global.OpenCL.*;

// #endif

/******************************************************************************/

@Opaque @Properties(inherit = org.bytedeco.opencl.presets.OpenCL.class)
public class _cl_platform_id extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public _cl_platform_id() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public _cl_platform_id(Pointer p) { super(p); }
}

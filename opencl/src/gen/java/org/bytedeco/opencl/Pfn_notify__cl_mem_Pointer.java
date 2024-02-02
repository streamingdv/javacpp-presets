// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.opencl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.opencl.global.OpenCL.*;


// #endif

// #ifdef CL_VERSION_1_1

@Properties(inherit = org.bytedeco.opencl.presets.OpenCL.class)
public class Pfn_notify__cl_mem_Pointer extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    Pfn_notify__cl_mem_Pointer(Pointer p) { super(p); }
    protected Pfn_notify__cl_mem_Pointer() { allocate(); }
    private native void allocate();
    public native void call(_cl_mem memobj,
                                                                 Pointer user_data);
}

// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.nvcodec.nvcuvid;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.nvcodec.global.nvcuvid.*;


// Callback for packet delivery
@Convention("CUDAAPI") @Properties(inherit = org.bytedeco.nvcodec.presets.nvcuvid.class)
public class PFNVIDSOURCECALLBACK extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    PFNVIDSOURCECALLBACK(Pointer p) { super(p); }
    protected PFNVIDSOURCECALLBACK() { allocate(); }
    private native void allocate();
    public native int call(Pointer arg0, CUVIDSOURCEDATAPACKET arg1);
}

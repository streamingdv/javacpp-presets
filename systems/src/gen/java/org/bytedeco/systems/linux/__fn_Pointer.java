// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.systems.linux;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.linux.*;


// #ifdef __USE_GNU
/* Clone current process.  */
@Properties(inherit = org.bytedeco.systems.presets.linux.class)
public class __fn_Pointer extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    __fn_Pointer(Pointer p) { super(p); }
    protected __fn_Pointer() { allocate(); }
    private native void allocate();
    public native int call(Pointer __arg);
}

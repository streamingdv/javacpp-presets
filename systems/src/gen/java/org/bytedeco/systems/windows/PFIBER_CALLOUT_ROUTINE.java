// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Convention("__stdcall") @Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class PFIBER_CALLOUT_ROUTINE extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    PFIBER_CALLOUT_ROUTINE(Pointer p) { super(p); }
    protected PFIBER_CALLOUT_ROUTINE() { allocate(); }
    private native void allocate();
    public native @Cast("LPVOID") Pointer call(
    @Cast("LPVOID") Pointer lpParameter
    );
}

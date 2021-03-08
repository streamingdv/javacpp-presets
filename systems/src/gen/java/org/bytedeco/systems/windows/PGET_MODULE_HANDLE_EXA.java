// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Convention("__stdcall") @Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class PGET_MODULE_HANDLE_EXA extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    PGET_MODULE_HANDLE_EXA(Pointer p) { super(p); }
    protected PGET_MODULE_HANDLE_EXA() { allocate(); }
    private native void allocate();
    public native @Cast("BOOL") boolean call(
    @Cast("DWORD") int dwFlags,
    @Cast("LPCSTR") BytePointer lpModuleName,
    @Cast("HMODULE*") PointerPointer phModule
    );
}

// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.LLVM;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.llvm.global.LLVM.*;


/**
 * A function for inspecting/mutating IR modules, suitable for use with
 * LLVMOrcThreadSafeModuleWithModuleDo.
 */
@Properties(inherit = org.bytedeco.llvm.presets.LLVM.class)
public class LLVMOrcGenericIRModuleOperationFunction extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    LLVMOrcGenericIRModuleOperationFunction(Pointer p) { super(p); }
    protected LLVMOrcGenericIRModuleOperationFunction() { allocate(); }
    private native void allocate();
    public native LLVMErrorRef call(
    Pointer Ctx, LLVMModuleRef M);
}

// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.LLVM;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.llvm.global.LLVM.*;


/**
 * Represents a pair of a symbol name and SymbolAliasMapEntry.
 */
@Properties(inherit = org.bytedeco.llvm.presets.LLVM.class)
public class LLVMOrcCSymbolAliasMapPair extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public LLVMOrcCSymbolAliasMapPair() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public LLVMOrcCSymbolAliasMapPair(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LLVMOrcCSymbolAliasMapPair(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public LLVMOrcCSymbolAliasMapPair position(long position) {
        return (LLVMOrcCSymbolAliasMapPair)super.position(position);
    }
    @Override public LLVMOrcCSymbolAliasMapPair getPointer(long i) {
        return new LLVMOrcCSymbolAliasMapPair((Pointer)this).offsetAddress(i);
    }

  public native LLVMOrcSymbolStringPoolEntryRef Name(); public native LLVMOrcCSymbolAliasMapPair Name(LLVMOrcSymbolStringPoolEntryRef setter);
  public native @ByRef LLVMOrcCSymbolAliasMapEntry Entry(); public native LLVMOrcCSymbolAliasMapPair Entry(LLVMOrcCSymbolAliasMapEntry setter);
}

// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class ACTCTX_SECTION_KEYED_DATA_ASSEMBLY_METADATA extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ACTCTX_SECTION_KEYED_DATA_ASSEMBLY_METADATA() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ACTCTX_SECTION_KEYED_DATA_ASSEMBLY_METADATA(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ACTCTX_SECTION_KEYED_DATA_ASSEMBLY_METADATA(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ACTCTX_SECTION_KEYED_DATA_ASSEMBLY_METADATA position(long position) {
        return (ACTCTX_SECTION_KEYED_DATA_ASSEMBLY_METADATA)super.position(position);
    }
    @Override public ACTCTX_SECTION_KEYED_DATA_ASSEMBLY_METADATA getPointer(long i) {
        return new ACTCTX_SECTION_KEYED_DATA_ASSEMBLY_METADATA((Pointer)this).offsetAddress(i);
    }

    public native @Cast("PVOID") Pointer lpInformation(); public native ACTCTX_SECTION_KEYED_DATA_ASSEMBLY_METADATA lpInformation(Pointer setter);
    public native @Cast("PVOID") Pointer lpSectionBase(); public native ACTCTX_SECTION_KEYED_DATA_ASSEMBLY_METADATA lpSectionBase(Pointer setter);
    public native @Cast("ULONG") long ulSectionLength(); public native ACTCTX_SECTION_KEYED_DATA_ASSEMBLY_METADATA ulSectionLength(long setter);
    public native @Cast("PVOID") Pointer lpSectionGlobalDataBase(); public native ACTCTX_SECTION_KEYED_DATA_ASSEMBLY_METADATA lpSectionGlobalDataBase(Pointer setter);
    public native @Cast("ULONG") long ulSectionGlobalDataLength(); public native ACTCTX_SECTION_KEYED_DATA_ASSEMBLY_METADATA ulSectionGlobalDataLength(long setter);
}

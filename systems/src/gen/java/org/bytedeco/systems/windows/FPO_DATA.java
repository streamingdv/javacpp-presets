// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class FPO_DATA extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public FPO_DATA() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public FPO_DATA(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FPO_DATA(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public FPO_DATA position(long position) {
        return (FPO_DATA)super.position(position);
    }
    @Override public FPO_DATA getPointer(long i) {
        return new FPO_DATA((Pointer)this).offsetAddress(i);
    }

    public native @Cast("DWORD") int ulOffStart(); public native FPO_DATA ulOffStart(int setter);             // offset 1st byte of function code
    public native @Cast("DWORD") int cbProcSize(); public native FPO_DATA cbProcSize(int setter);             // # bytes in function
    public native @Cast("DWORD") int cdwLocals(); public native FPO_DATA cdwLocals(int setter);              // # bytes in locals/4
    public native @Cast("WORD") short cdwParams(); public native FPO_DATA cdwParams(short setter);              // # bytes in params/4
    public native @Cast("WORD") @NoOffset short cbProlog(); public native FPO_DATA cbProlog(short setter);           // # bytes in prolog
    public native @Cast("WORD") @NoOffset short cbRegs(); public native FPO_DATA cbRegs(short setter);           // # regs saved
    public native @Cast("WORD") @NoOffset short fHasSEH(); public native FPO_DATA fHasSEH(short setter);           // TRUE if SEH in func
    public native @Cast("WORD") @NoOffset short fUseBP(); public native FPO_DATA fUseBP(short setter);           // TRUE if EBP has been allocated
    public native @Cast("WORD") @NoOffset short reserved(); public native FPO_DATA reserved(short setter);           // reserved for future use
    public native @Cast("WORD") @NoOffset short cbFrame(); public native FPO_DATA cbFrame(short setter);           // frame type
}

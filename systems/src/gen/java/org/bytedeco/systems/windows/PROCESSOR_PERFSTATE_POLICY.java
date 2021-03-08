// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


//
// Processor Perf State Policy.
//

@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class PROCESSOR_PERFSTATE_POLICY extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PROCESSOR_PERFSTATE_POLICY() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PROCESSOR_PERFSTATE_POLICY(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PROCESSOR_PERFSTATE_POLICY(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PROCESSOR_PERFSTATE_POLICY position(long position) {
        return (PROCESSOR_PERFSTATE_POLICY)super.position(position);
    }
    @Override public PROCESSOR_PERFSTATE_POLICY getPointer(long i) {
        return new PROCESSOR_PERFSTATE_POLICY((Pointer)this).position(position + i);
    }

    public native @Cast("DWORD") int Revision(); public native PROCESSOR_PERFSTATE_POLICY Revision(int setter);
    public native @Cast("BYTE") byte MaxThrottle(); public native PROCESSOR_PERFSTATE_POLICY MaxThrottle(byte setter);
    public native @Cast("BYTE") byte MinThrottle(); public native PROCESSOR_PERFSTATE_POLICY MinThrottle(byte setter);
    public native @Cast("BYTE") byte BusyAdjThreshold(); public native PROCESSOR_PERFSTATE_POLICY BusyAdjThreshold(byte setter);
        public native @Cast("BYTE") byte Spare(); public native PROCESSOR_PERFSTATE_POLICY Spare(byte setter);
            @Name("Flags.AsBYTE") public native @Cast("BYTE") byte Flags_AsBYTE(); public native PROCESSOR_PERFSTATE_POLICY Flags_AsBYTE(byte setter);
                @Name("Flags.NoDomainAccounting") public native @Cast("BYTE") @NoOffset byte Flags_NoDomainAccounting(); public native PROCESSOR_PERFSTATE_POLICY Flags_NoDomainAccounting(byte setter);
                @Name("Flags.IncreasePolicy") public native @Cast("BYTE") @NoOffset byte Flags_IncreasePolicy(); public native PROCESSOR_PERFSTATE_POLICY Flags_IncreasePolicy(byte setter);
                @Name("Flags.DecreasePolicy") public native @Cast("BYTE") @NoOffset byte Flags_DecreasePolicy(); public native PROCESSOR_PERFSTATE_POLICY Flags_DecreasePolicy(byte setter);
                @Name("Flags.Reserved") public native @Cast("BYTE") @NoOffset byte Flags_Reserved(); public native PROCESSOR_PERFSTATE_POLICY Flags_Reserved(byte setter);  

    public native @Cast("DWORD") int TimeCheck(); public native PROCESSOR_PERFSTATE_POLICY TimeCheck(int setter);
    public native @Cast("DWORD") int IncreaseTime(); public native PROCESSOR_PERFSTATE_POLICY IncreaseTime(int setter);
    public native @Cast("DWORD") int DecreaseTime(); public native PROCESSOR_PERFSTATE_POLICY DecreaseTime(int setter);
    public native @Cast("DWORD") int IncreasePercent(); public native PROCESSOR_PERFSTATE_POLICY IncreasePercent(int setter);
    public native @Cast("DWORD") int DecreasePercent(); public native PROCESSOR_PERFSTATE_POLICY DecreasePercent(int setter);
}

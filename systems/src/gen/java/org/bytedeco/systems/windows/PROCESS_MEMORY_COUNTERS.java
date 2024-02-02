// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


// #ifdef UNICODE
// #else
// #endif // !UNICODE

// Structure for GetProcessMemoryInfo()

@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class PROCESS_MEMORY_COUNTERS extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PROCESS_MEMORY_COUNTERS() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PROCESS_MEMORY_COUNTERS(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PROCESS_MEMORY_COUNTERS(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PROCESS_MEMORY_COUNTERS position(long position) {
        return (PROCESS_MEMORY_COUNTERS)super.position(position);
    }
    @Override public PROCESS_MEMORY_COUNTERS getPointer(long i) {
        return new PROCESS_MEMORY_COUNTERS((Pointer)this).offsetAddress(i);
    }

    public native @Cast("DWORD") int cb(); public native PROCESS_MEMORY_COUNTERS cb(int setter);
    public native @Cast("DWORD") int PageFaultCount(); public native PROCESS_MEMORY_COUNTERS PageFaultCount(int setter);
    public native @Cast("SIZE_T") long PeakWorkingSetSize(); public native PROCESS_MEMORY_COUNTERS PeakWorkingSetSize(long setter);
    public native @Cast("SIZE_T") long WorkingSetSize(); public native PROCESS_MEMORY_COUNTERS WorkingSetSize(long setter);
    public native @Cast("SIZE_T") long QuotaPeakPagedPoolUsage(); public native PROCESS_MEMORY_COUNTERS QuotaPeakPagedPoolUsage(long setter);
    public native @Cast("SIZE_T") long QuotaPagedPoolUsage(); public native PROCESS_MEMORY_COUNTERS QuotaPagedPoolUsage(long setter);
    public native @Cast("SIZE_T") long QuotaPeakNonPagedPoolUsage(); public native PROCESS_MEMORY_COUNTERS QuotaPeakNonPagedPoolUsage(long setter);
    public native @Cast("SIZE_T") long QuotaNonPagedPoolUsage(); public native PROCESS_MEMORY_COUNTERS QuotaNonPagedPoolUsage(long setter);
    public native @Cast("SIZE_T") long PagefileUsage(); public native PROCESS_MEMORY_COUNTERS PagefileUsage(long setter);
    public native @Cast("SIZE_T") long PeakPagefileUsage(); public native PROCESS_MEMORY_COUNTERS PeakPagefileUsage(long setter);
}

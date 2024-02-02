// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nvml;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nvml.*;


/**
 * Union to represent the vGPU Scheduler Parameters
 */
@Properties(inherit = org.bytedeco.cuda.presets.nvml.class)
public class nvmlVgpuSchedulerParams_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public nvmlVgpuSchedulerParams_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public nvmlVgpuSchedulerParams_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public nvmlVgpuSchedulerParams_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public nvmlVgpuSchedulerParams_t position(long position) {
        return (nvmlVgpuSchedulerParams_t)super.position(position);
    }
    @Override public nvmlVgpuSchedulerParams_t getPointer(long i) {
        return new nvmlVgpuSchedulerParams_t((Pointer)this).offsetAddress(i);
    }

        /** Average factor in compensating the timeslice for Adaptive Round Robin mode */
        @Name("vgpuSchedDataWithARR.avgFactor") public native @Cast("unsigned int") int vgpuSchedDataWithARR_avgFactor(); public native nvmlVgpuSchedulerParams_t vgpuSchedDataWithARR_avgFactor(int setter);
        /** The timeslice in ns for each software run list as configured, or the default value otherwise */
        @Name("vgpuSchedDataWithARR.timeslice") public native @Cast("unsigned int") int vgpuSchedDataWithARR_timeslice(); public native nvmlVgpuSchedulerParams_t vgpuSchedDataWithARR_timeslice(int setter);

        /** The timeslice in ns for each software run list as configured, or the default value otherwise */
        @Name("vgpuSchedData.timeslice") public native @Cast("unsigned int") int vgpuSchedData_timeslice(); public native nvmlVgpuSchedulerParams_t vgpuSchedData_timeslice(int setter);

}

// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.systems.macosx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.macosx.*;
 /* Reset the footprint interval counter to zero */

@Properties(inherit = org.bytedeco.systems.presets.macosx.class)
public class proc_rlimit_control_wakeupmon extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public proc_rlimit_control_wakeupmon() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public proc_rlimit_control_wakeupmon(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public proc_rlimit_control_wakeupmon(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public proc_rlimit_control_wakeupmon position(long position) {
        return (proc_rlimit_control_wakeupmon)super.position(position);
    }
    @Override public proc_rlimit_control_wakeupmon getPointer(long i) {
        return new proc_rlimit_control_wakeupmon((Pointer)this).position(position + i);
    }

	public native @Cast("uint32_t") int wm_flags(); public native proc_rlimit_control_wakeupmon wm_flags(int setter);
	public native int wm_rate(); public native proc_rlimit_control_wakeupmon wm_rate(int setter);
}

// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


//
// Do not manipulate this structure directly!  Allocate space for it
// and use the inline interfaces below.
//

// #if (_WIN32_WINNT >= _WIN32_WINNT_WIN7)

@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class TP_CALLBACK_ENVIRON_V3 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TP_CALLBACK_ENVIRON_V3() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TP_CALLBACK_ENVIRON_V3(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TP_CALLBACK_ENVIRON_V3(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TP_CALLBACK_ENVIRON_V3 position(long position) {
        return (TP_CALLBACK_ENVIRON_V3)super.position(position);
    }
    @Override public TP_CALLBACK_ENVIRON_V3 getPointer(long i) {
        return new TP_CALLBACK_ENVIRON_V3((Pointer)this).position(position + i);
    }

    public native @Cast("TP_VERSION") int Version(); public native TP_CALLBACK_ENVIRON_V3 Version(int setter);
    public native @Cast("PTP_POOL") TP_POOL Pool(); public native TP_CALLBACK_ENVIRON_V3 Pool(TP_POOL setter);
    public native @Cast("PTP_CLEANUP_GROUP") TP_CLEANUP_GROUP CleanupGroup(); public native TP_CALLBACK_ENVIRON_V3 CleanupGroup(TP_CLEANUP_GROUP setter);
    public native PTP_CLEANUP_GROUP_CANCEL_CALLBACK CleanupGroupCancelCallback(); public native TP_CALLBACK_ENVIRON_V3 CleanupGroupCancelCallback(PTP_CLEANUP_GROUP_CANCEL_CALLBACK setter);
    public native @Cast("PVOID") Pointer RaceDll(); public native TP_CALLBACK_ENVIRON_V3 RaceDll(Pointer setter);
    public native @Cast("_ACTIVATION_CONTEXT*") Pointer ActivationContext(); public native TP_CALLBACK_ENVIRON_V3 ActivationContext(Pointer setter);
    public native PTP_SIMPLE_CALLBACK FinalizationCallback(); public native TP_CALLBACK_ENVIRON_V3 FinalizationCallback(PTP_SIMPLE_CALLBACK setter);
        @Name("u.Flags") public native @Cast("DWORD") int u_Flags(); public native TP_CALLBACK_ENVIRON_V3 u_Flags(int setter);
            @Name("u.s.LongFunction") public native @Cast("DWORD") @NoOffset int u_s_LongFunction(); public native TP_CALLBACK_ENVIRON_V3 u_s_LongFunction(int setter);
            @Name("u.s.Persistent") public native @Cast("DWORD") @NoOffset int u_s_Persistent(); public native TP_CALLBACK_ENVIRON_V3 u_s_Persistent(int setter);
            @Name("u.s.Private") public native @Cast("DWORD") @NoOffset int u_s_Private(); public native TP_CALLBACK_ENVIRON_V3 u_s_Private(int setter);
    public native @Cast("TP_CALLBACK_PRIORITY") int CallbackPriority(); public native TP_CALLBACK_ENVIRON_V3 CallbackPriority(int setter);
    public native @Cast("DWORD") int Size(); public native TP_CALLBACK_ENVIRON_V3 Size(int setter);
}

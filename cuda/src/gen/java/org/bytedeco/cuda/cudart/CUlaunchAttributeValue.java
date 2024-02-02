// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * Launch attributes union; used as value field of ::CUlaunchAttribute
 */
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class CUlaunchAttributeValue extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUlaunchAttributeValue() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUlaunchAttributeValue(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUlaunchAttributeValue(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUlaunchAttributeValue position(long position) {
        return (CUlaunchAttributeValue)super.position(position);
    }
    @Override public CUlaunchAttributeValue getPointer(long i) {
        return new CUlaunchAttributeValue((Pointer)this).offsetAddress(i);
    }

    public native @Cast("char") byte pad(int i); public native CUlaunchAttributeValue pad(int i, byte setter);
    @MemberGetter public native @Cast("char*") BytePointer pad(); /* Pad to 64 bytes */
    /** Value of launch attribute ::CU_LAUNCH_ATTRIBUTE_ACCESS_POLICY_WINDOW. */
    public native @ByRef @Cast("CUaccessPolicyWindow*") CUaccessPolicyWindow_v1 accessPolicyWindow(); public native CUlaunchAttributeValue accessPolicyWindow(CUaccessPolicyWindow_v1 setter);
    /** Value of launch attribute ::CU_LAUNCH_ATTRIBUTE_COOPERATIVE. Nonzero indicates a cooperative
                            kernel (see ::cuLaunchCooperativeKernel). */
    public native int cooperative(); public native CUlaunchAttributeValue cooperative(int setter);
    /** Value of launch attribute
                                               ::CU_LAUNCH_ATTRIBUTE_SYNCHRONIZATION_POLICY. ::CUsynchronizationPolicy for
                                               work queued up in this stream */
    public native @Cast("CUsynchronizationPolicy") int syncPolicy(); public native CUlaunchAttributeValue syncPolicy(int setter);

    /**
     *  Value of launch attribute ::CU_LAUNCH_ATTRIBUTE_CLUSTER_DIMENSION that
     *  represents the desired cluster dimensions for the kernel. Opaque type
     *  with the following fields:
     *      - \p x - The X dimension of the cluster, in blocks. Must be a divisor
     *               of the grid X dimension.
     *      - \p y - The Y dimension of the cluster, in blocks. Must be a divisor
     *               of the grid Y dimension.
     *      - \p z - The Z dimension of the cluster, in blocks. Must be a divisor
     *               of the grid Z dimension.
     */
        @Name("clusterDim.x") public native @Cast("unsigned int") int clusterDim_x(); public native CUlaunchAttributeValue clusterDim_x(int setter);
        @Name("clusterDim.y") public native @Cast("unsigned int") int clusterDim_y(); public native CUlaunchAttributeValue clusterDim_y(int setter);
        @Name("clusterDim.z") public native @Cast("unsigned int") int clusterDim_z(); public native CUlaunchAttributeValue clusterDim_z(int setter);
    /** Value of launch attribute
                                                                        ::CU_LAUNCH_ATTRIBUTE_CLUSTER_SCHEDULING_POLICY_PREFERENCE. Cluster
                                                                        scheduling policy preference for the kernel. */
    public native @Cast("CUclusterSchedulingPolicy") int clusterSchedulingPolicyPreference(); public native CUlaunchAttributeValue clusterSchedulingPolicyPreference(int setter);
    /** Value of launch attribute
                                                       ::CU_LAUNCH_ATTRIBUTE_PROGRAMMATIC_STREAM_SERIALIZATION. */
    public native int programmaticStreamSerializationAllowed(); public native CUlaunchAttributeValue programmaticStreamSerializationAllowed(int setter);
        /** Event to fire when all blocks trigger it */
        @Name("programmaticEvent.event") public native CUevent_st programmaticEvent_event(); public native CUlaunchAttributeValue programmaticEvent_event(CUevent_st setter);
        /** Event record flags, see ::cuEventRecordWithFlags. Does not accept
                                            ::CU_EVENT_RECORD_EXTERNAL. */
        @Name("programmaticEvent.flags") public native int programmaticEvent_flags(); public native CUlaunchAttributeValue programmaticEvent_flags(int setter);
        /** If this is set to non-0, each block launch will automatically trigger the event */
        @Name("programmaticEvent.triggerAtBlockStart") public native int programmaticEvent_triggerAtBlockStart(); public native CUlaunchAttributeValue programmaticEvent_triggerAtBlockStart(int setter);
        /** Event to fire when the last block launches */
        @Name("launchCompletionEvent.event") public native CUevent_st launchCompletionEvent_event(); public native CUlaunchAttributeValue launchCompletionEvent_event(CUevent_st setter);
        /** Event record flags, see ::cuEventRecordWithFlags. Does not accept ::CU_EVENT_RECORD_EXTERNAL. */
        @Name("launchCompletionEvent.flags") public native int launchCompletionEvent_flags(); public native CUlaunchAttributeValue launchCompletionEvent_flags(int setter);
    /** Value of launch attribute ::CU_LAUNCH_ATTRIBUTE_PRIORITY. Execution priority of the kernel. */
    public native int priority(); public native CUlaunchAttributeValue priority(int setter);
    /** Value of launch attribute
                                                      ::CU_LAUNCH_ATTRIBUTE_MEM_SYNC_DOMAIN_MAP. See
                                                      ::CUlaunchMemSyncDomainMap. */
    public native @ByRef CUlaunchMemSyncDomainMap memSyncDomainMap(); public native CUlaunchAttributeValue memSyncDomainMap(CUlaunchMemSyncDomainMap setter);
    /** Value of launch attribute
                                                      ::CU_LAUNCH_ATTRIBUTE_MEM_SYNC_DOMAIN. See::CUlaunchMemSyncDomain */
    public native @Cast("CUlaunchMemSyncDomain") int memSyncDomain(); public native CUlaunchAttributeValue memSyncDomain(int setter);
}

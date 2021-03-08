// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nvml;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nvml.*;


/**
 * This structure stores the complete Hierarchy of the Bridge Chip within the board. The immediate 
 * bridge is stored at index 0 of bridgeInfoList, parent to immediate bridge is at index 1 and so forth.
 */
@Properties(inherit = org.bytedeco.cuda.presets.nvml.class)
public class nvmlBridgeChipHierarchy_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public nvmlBridgeChipHierarchy_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public nvmlBridgeChipHierarchy_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public nvmlBridgeChipHierarchy_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public nvmlBridgeChipHierarchy_t position(long position) {
        return (nvmlBridgeChipHierarchy_t)super.position(position);
    }
    @Override public nvmlBridgeChipHierarchy_t getPointer(long i) {
        return new nvmlBridgeChipHierarchy_t((Pointer)this).position(position + i);
    }

    /** Number of Bridge Chips on the Board */
    public native @Cast("unsigned char") byte bridgeCount(); public native nvmlBridgeChipHierarchy_t bridgeCount(byte setter);
    /** Hierarchy of Bridge Chips on the board */
    public native @ByRef nvmlBridgeChipInfo_t bridgeChipInfo(int i); public native nvmlBridgeChipHierarchy_t bridgeChipInfo(int i, nvmlBridgeChipInfo_t setter);
    @MemberGetter public native nvmlBridgeChipInfo_t bridgeChipInfo();
}

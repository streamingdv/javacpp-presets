// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nvml;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nvml.*;


/**
 * Structure to store the vGPU license expiry details
 */
@Properties(inherit = org.bytedeco.cuda.presets.nvml.class)
public class nvmlVgpuLicenseExpiry_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public nvmlVgpuLicenseExpiry_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public nvmlVgpuLicenseExpiry_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public nvmlVgpuLicenseExpiry_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public nvmlVgpuLicenseExpiry_t position(long position) {
        return (nvmlVgpuLicenseExpiry_t)super.position(position);
    }
    @Override public nvmlVgpuLicenseExpiry_t getPointer(long i) {
        return new nvmlVgpuLicenseExpiry_t((Pointer)this).offsetAddress(i);
    }

    /** Year of license expiry */
    public native @Cast("unsigned int") int year(); public native nvmlVgpuLicenseExpiry_t year(int setter);
    /** Month of license expiry */
    public native @Cast("unsigned short") short month(); public native nvmlVgpuLicenseExpiry_t month(short setter);
    /** Day of license expiry */
    public native @Cast("unsigned short") short day(); public native nvmlVgpuLicenseExpiry_t day(short setter);
    /** Hour of license expiry */
    public native @Cast("unsigned short") short hour(); public native nvmlVgpuLicenseExpiry_t hour(short setter);
    /** Minutes of license expiry */
    public native @Cast("unsigned short") short min(); public native nvmlVgpuLicenseExpiry_t min(short setter);
    /** Seconds of license expiry */
    public native @Cast("unsigned short") short sec(); public native nvmlVgpuLicenseExpiry_t sec(short setter);
    /** License expiry status */
    public native @Cast("unsigned char") byte status(); public native nvmlVgpuLicenseExpiry_t status(byte setter);
}

// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.flycapture.FlyCapture2_C;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.flycapture.FlyCapture2.*;
import static org.bytedeco.flycapture.global.FlyCapture2.*;

import static org.bytedeco.flycapture.global.FlyCapture2_C.*;


    /**
     * Configuration for a GigE camera.  These options are options that are
     * generally should be set before starting isochronous transfer.
     */
    @Properties(inherit = org.bytedeco.flycapture.presets.FlyCapture2_C.class)
public class fc2GigEConfig extends Pointer {
        static { Loader.load(); }
        /** Default native constructor. */
        public fc2GigEConfig() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public fc2GigEConfig(long size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public fc2GigEConfig(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(long size);
        @Override public fc2GigEConfig position(long position) {
            return (fc2GigEConfig)super.position(position);
        }
        @Override public fc2GigEConfig getPointer(long i) {
            return new fc2GigEConfig((Pointer)this).position(position + i);
        }
    
        /** Turn on/off packet resend functionality */
        public native @Cast("BOOL") int enablePacketResend(); public native fc2GigEConfig enablePacketResend(int setter);

        /**
         * Number of retries to perform when a register read/write timeout
         * is received by the library. The default value is 0.
         */
        public native @Cast("unsigned int") int registerTimeoutRetries(); public native fc2GigEConfig registerTimeoutRetries(int setter);

        /**
         * Register read/write timeout value, in microseconds.
         * The default value is dependent on the interface type.
         */
        public native @Cast("unsigned int") int registerTimeout(); public native fc2GigEConfig registerTimeout(int setter);

        public native @Cast("unsigned int") int reserved(int i); public native fc2GigEConfig reserved(int i, int setter);
        @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();
    }

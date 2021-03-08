// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.librealsense;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.librealsense.global.RealSense.*;

@Properties(inherit = org.bytedeco.librealsense.presets.RealSense.class)
public class rs_timestamp_callback_ptr extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    rs_timestamp_callback_ptr(Pointer p) { super(p); }
    protected rs_timestamp_callback_ptr() { allocate(); }
    private native void allocate();
    public native void call(rs_device arg0, @ByVal rs_timestamp_data arg1, Pointer arg2 );
}

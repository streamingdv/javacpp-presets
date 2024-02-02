// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.depthai;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;

import static org.bytedeco.depthai.global.depthai.*;


/**
 * Specify properties for MonoCamera such as camera ID, ...
 */
@Namespace("dai") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class MonoCameraProperties extends MonoCameraPropertiesSerializable {
    static { Loader.load(); }
    /** Default native constructor. */
    public MonoCameraProperties() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public MonoCameraProperties(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MonoCameraProperties(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public MonoCameraProperties position(long position) {
        return (MonoCameraProperties)super.position(position);
    }
    @Override public MonoCameraProperties getPointer(long i) {
        return new MonoCameraProperties((Pointer)this).offsetAddress(i);
    }

    @MemberGetter public static native int AUTO();
    public static final int AUTO = AUTO();

    /**
     * Select the camera sensor resolution: 1280×720, 1280×800, 640×400, 640×480, 1920×1200
     */
    public enum SensorResolution { THE_720_P(0), THE_800_P(1), THE_400_P(2), THE_480_P(3), THE_1200_P(4);

        public final int value;
        private SensorResolution(int v) { this.value = v; }
        private SensorResolution(SensorResolution e) { this.value = e.value; }
        public SensorResolution intern() { for (SensorResolution e : values()) if (e.value == value) return e; return this; }
        @Override public String toString() { return intern().name(); }
    }

    /*
     * Initial controls applied to MonoCamera node
     */
    public native @ByRef RawCameraControl initialControl(); public native MonoCameraProperties initialControl(RawCameraControl setter);

    /**
     * Which socket will mono camera use
     */
    public native CameraBoardSocket boardSocket(); public native MonoCameraProperties boardSocket(CameraBoardSocket setter);

    /**
     * Which camera name will mono camera use
     */
    public native @StdString BytePointer cameraName(); public native MonoCameraProperties cameraName(BytePointer setter);

    /**
     * Camera sensor image orientation / pixel readout
     */
    public native CameraImageOrientation imageOrientation(); public native MonoCameraProperties imageOrientation(CameraImageOrientation setter);

    /**
     * Select the camera sensor resolution
     */
    public native SensorResolution resolution(); public native MonoCameraProperties resolution(SensorResolution setter);
    /**
     * Camera sensor FPS
     */
    public native float fps(); public native MonoCameraProperties fps(float setter);
    /**
     * Isp 3A rate (auto focus, auto exposure, auto white balance, camera controls etc.).
     * Default (0) matches the camera FPS, meaning that 3A is running on each frame.
     * Reducing the rate of 3A reduces the CPU usage on CSS, but also increases the convergence rate of 3A.
     * Note that camera controls will be processed at this rate. E.g. if camera is running at 30 fps, and camera control is sent at every frame,
     * but 3A fps is set to 15, the camera control messages will be processed at 15 fps rate, which will lead to queueing.
     <p>
     */
    public native int isp3aFps(); public native MonoCameraProperties isp3aFps(int setter);
    /**
     * Frame pool size for the main output, ISP processed
     */
    public native int numFramesPool(); public native MonoCameraProperties numFramesPool(int setter);
    /**
     * Frame pool size for the {@code raw} output
     */
    public native int numFramesPoolRaw(); public native MonoCameraProperties numFramesPoolRaw(int setter);
    /**
     * List of events to receive, the rest will be ignored
     */
    public native @StdVector @Cast("dai::FrameEvent*") IntPointer eventFilter(); public native MonoCameraProperties eventFilter(IntPointer setter);

    /**
     * Configures whether the camera {@code raw} frames are saved as MIPI-packed to memory.
     * The packed format is more efficient, consuming less memory on device, and less data
     * to send to host: RAW10: 4 pixels saved on 5 bytes, RAW12: 2 pixels saved on 3 bytes.
     * When packing is disabled ({@code false}), data is saved lsb-aligned, e.g. a RAW10 pixel
     * will be stored as uint16, on bits 9..0: 0b0000'00pp'pppp'pppp.
     * Default is auto: enabled for standard color/monochrome cameras where ISP can work
     * with both packed/unpacked, but disabled for other cameras like ToF.
     */
    public native @ByRef BoolOptional rawPacked(); public native MonoCameraProperties rawPacked(BoolOptional setter);
}

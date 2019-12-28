// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;

@Convention("CV_STDCALL") @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class Cv_iplCloneImage extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    Cv_iplCloneImage(Pointer p) { super(p); }
    protected Cv_iplCloneImage() { allocate(); }
    private native void allocate();
    public native IplImage call(@Const IplImage arg0);
}

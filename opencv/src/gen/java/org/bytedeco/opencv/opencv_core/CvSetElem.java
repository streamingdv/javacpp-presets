// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;


@Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class CvSetElem extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CvSetElem() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CvSetElem(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvSetElem(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CvSetElem position(long position) {
        return (CvSetElem)super.position(position);
    }

    public native int flags(); public native CvSetElem flags(int setter);
    public native CvSetElem next_free(); public native CvSetElem next_free(CvSetElem setter);
}

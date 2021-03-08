// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;

// #endif

@NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class CvSize2D32f extends AbstractCvSize2D32f {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvSize2D32f(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CvSize2D32f(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public CvSize2D32f position(long position) {
        return (CvSize2D32f)super.position(position);
    }
    @Override public CvSize2D32f getPointer(long i) {
        return new CvSize2D32f((Pointer)this).position(position + i);
    }

    public native float width(); public native CvSize2D32f width(float setter);
    public native float height(); public native CvSize2D32f height(float setter);

// #ifdef CV__VALIDATE_UNUNITIALIZED_VARS
    public CvSize2D32f() { super((Pointer)null); allocate(); }
    private native void allocate();
// #elif defined(CV__ENABLE_C_API_CTORS) && defined(__cplusplus)
// #endif
// #ifdef __cplusplus
// #endif
}

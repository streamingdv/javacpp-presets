// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;

@Name("cv::Scalar_<float>") @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class Scalar4f extends FloatPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Scalar4f(Pointer p) { super(p); }

    /** default constructor */
    public Scalar4f() { super((Pointer)null); allocate(); }
    private native void allocate();
    public Scalar4f(float v0, float v1, float v2/*=0*/, float v3/*=0*/) { super((Pointer)null); allocate(v0, v1, v2, v3); }
    private native void allocate(float v0, float v1, float v2/*=0*/, float v3/*=0*/);
    public Scalar4f(float v0, float v1) { super((Pointer)null); allocate(v0, v1); }
    private native void allocate(float v0, float v1);
    public Scalar4f(float v0) { super((Pointer)null); allocate(v0); }
    private native void allocate(float v0);

    public Scalar4f(@Const @ByRef Scalar4f s) { super((Pointer)null); allocate(s); }
    private native void allocate(@Const @ByRef Scalar4f s);

    public native @ByRef @Name("operator =") Scalar4f put(@Const @ByRef Scalar4f s);

    /** returns a scalar with all elements set to v0 */
    public static native @ByVal Scalar4f all(float v0);

    /** conversion to another data type */

    /** per-element product */
    public native @ByVal Scalar4f mul(@Const @ByRef Scalar4f a, double scale/*=1*/ );
    public native @ByVal Scalar4f mul(@Const @ByRef Scalar4f a );

    /** returns (v0, -v1, -v2, -v3) */
    public native @ByVal Scalar4f conj();

    /** returns true iff v1 == v2 == v3 == 0 */
    public native @Cast("bool") boolean isReal();
}

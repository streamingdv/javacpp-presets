// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;


/** \brief Mersenne Twister random number generator
<p>
Inspired by http://www.math.sci.hiroshima-u.ac.jp/~m-mat/MT/MT2002/CODES/mt19937ar.c
\todo document
*/
@Namespace("cv") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class RNG_MT19937 extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RNG_MT19937(Pointer p) { super(p); }

    public RNG_MT19937() { super((Pointer)null); allocate(); }
    private native void allocate();
    public RNG_MT19937(@Cast("unsigned") int s) { super((Pointer)null); allocate(s); }
    private native void allocate(@Cast("unsigned") int s);
    public native void seed(@Cast("unsigned") int s);

    public native @Cast("unsigned") int next();

    public native @Name("operator int") int asInt();
    public native @Name("operator float") float asFloat();
    public native @Name("operator double") double asDouble();

    public native @Cast("unsigned") @Name("operator ()") int apply(@Cast("unsigned") int N);
    public native @Cast("unsigned") @Name("operator ()") int apply();

    /** \brief returns uniformly distributed integer random number from [a,b) range*/
    public native int uniform(int a, int b);
    /** \brief returns uniformly distributed floating-point random number from [a,b) range*/
    public native float uniform(float a, float b);
    /** \brief returns uniformly distributed double-precision floating-point random number from [a,b) range*/
    public native double uniform(double a, double b);
}

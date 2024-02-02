// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;


/** \addtogroup core_basic
 *  \{
<p>
//////////////////////////////// Complex //////////////////////////////
<p>
/** \brief  A complex number class.
  <p>
  The template class is similar and compatible with std::complex, however it provides slightly
  more convenient access to the real and imaginary parts using through the simple field access, as opposite
  to std::complex::real() and std::complex::imag().
*/
@Name("cv::Complex<float>") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class Complexf extends FloatPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Complexf(Pointer p) { super(p); }


    /** default constructor */
    public Complexf() { super((Pointer)null); allocate(); }
    private native void allocate();
    public Complexf( float _re, float _im/*=0*/ ) { super((Pointer)null); allocate(_re, _im); }
    private native void allocate( float _re, float _im/*=0*/ );
    public Complexf( float _re ) { super((Pointer)null); allocate(_re); }
    private native void allocate( float _re );

    /** conversion to another data type */
    /** conjugation */
    public native @ByVal Complexf conj();

    /** the real and the imaginary parts */
    public native float re(); public native Complexf re(float setter);
    public native float im(); public native Complexf im(float setter);
}

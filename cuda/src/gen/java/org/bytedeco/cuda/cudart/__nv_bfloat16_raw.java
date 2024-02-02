// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;

// #endif

/**
 * \ingroup CUDA_MATH_INTRINSIC_BFLOAT16
 * \brief __nv_bfloat16_raw data type
 * \details Type allows static initialization of \p nv_bfloat16 until it becomes
 * a builtin type.
 * 
 * - Note: this initialization is as a bit-field representation of \p nv_bfloat16,
 * and not a conversion from \p short to \p nv_bfloat16.
 * Such representation will be deprecated in a future version of CUDA.
 * 
 * - Note: this is visible to non-nvcc compilers, including C-only compilations
 */
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class __nv_bfloat16_raw extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public __nv_bfloat16_raw() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public __nv_bfloat16_raw(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public __nv_bfloat16_raw(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public __nv_bfloat16_raw position(long position) {
        return (__nv_bfloat16_raw)super.position(position);
    }
    @Override public __nv_bfloat16_raw getPointer(long i) {
        return new __nv_bfloat16_raw((Pointer)this).offsetAddress(i);
    }

    public native @Cast("unsigned short") short x(); public native __nv_bfloat16_raw x(short setter);
}

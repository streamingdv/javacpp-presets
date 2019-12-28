// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;


@Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class CvSparseMat extends AbstractCvSparseMat {
    static { Loader.load(); }
    /** Default native constructor. */
    public CvSparseMat() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CvSparseMat(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvSparseMat(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CvSparseMat position(long position) {
        return (CvSparseMat)super.position(position);
    }

    public native int type(); public native CvSparseMat type(int setter);
    public native int dims(); public native CvSparseMat dims(int setter);
    public native IntPointer refcount(); public native CvSparseMat refcount(IntPointer setter);
    public native int hdr_refcount(); public native CvSparseMat hdr_refcount(int setter);

    public native CvSet heap(); public native CvSparseMat heap(CvSet setter);
    public native Pointer hashtable(int i); public native CvSparseMat hashtable(int i, Pointer setter);
    public native @Cast("void**") PointerPointer hashtable(); public native CvSparseMat hashtable(PointerPointer setter);
    public native int hashsize(); public native CvSparseMat hashsize(int setter);
    public native int valoffset(); public native CvSparseMat valoffset(int setter);
    public native int idxoffset(); public native CvSparseMat idxoffset(int setter);
    public native int size(int i); public native CvSparseMat size(int i, int setter);
    @MemberGetter public native IntPointer size();

// #ifdef __cplusplus
    public native void copyToSparseMat(@ByRef SparseMat m);
// #endif
}

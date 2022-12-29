// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;

@Name("std::vector<std::pair<cv::UMat,uchar> >") @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class UMatBytePairVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public UMatBytePairVector(Pointer p) { super(p); }
    public UMatBytePairVector(UMat[] firstValue, byte[] secondValue) { this(Math.min(firstValue.length, secondValue.length)); put(firstValue, secondValue); }
    public UMatBytePairVector()       { allocate();  }
    public UMatBytePairVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator =") @ByRef UMatBytePairVector put(@ByRef UMatBytePairVector x);

    public boolean empty() { return size() == 0; }
    public native long size();
    public void clear() { resize(0); }
    public native void resize(@Cast("size_t") long n);

    @Index(function = "at") public native @ByRef UMat first(@Cast("size_t") long i); public native UMatBytePairVector first(@Cast("size_t") long i, UMat first);
    @Index(function = "at") public native @Cast("uchar") byte second(@Cast("size_t") long i);  public native UMatBytePairVector second(@Cast("size_t") long i, byte second);

    public UMatBytePairVector put(UMat[] firstValue, byte[] secondValue) {
        for (int i = 0; i < firstValue.length && i < secondValue.length; i++) {
            first(i, firstValue[i]);
            second(i, secondValue[i]);
        }
        return this;
    }
}


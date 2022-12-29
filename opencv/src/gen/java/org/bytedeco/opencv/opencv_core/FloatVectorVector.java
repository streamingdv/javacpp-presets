// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;

@Name("std::vector<std::vector<float> >") @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class FloatVectorVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FloatVectorVector(Pointer p) { super(p); }
    public FloatVectorVector(float[] ... array) { this(array.length); put(array); }
    public FloatVectorVector()       { allocate();  }
    public FloatVectorVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator =") @ByRef FloatVectorVector put(@ByRef FloatVectorVector x);

    public boolean empty() { return size() == 0; }
    public native long size();
    public void clear() { resize(0); }
    public native void resize(@Cast("size_t") long n);
    public boolean empty(@Cast("size_t") long i) { return size(i) == 0; }
    public native @Index(function = "at") long size(@Cast("size_t") long i);
    public void clear(@Cast("size_t") long i) { resize(i, 0); }
    public native @Index(function = "at") void resize(@Cast("size_t") long i, @Cast("size_t") long n);

    @Index(function = "at") public native float get(@Cast("size_t") long i, @Cast("size_t") long j);
    public native FloatVectorVector put(@Cast("size_t") long i, @Cast("size_t") long j, float value);

    public float[][] get() {
        float[][] array = new float[size() < Integer.MAX_VALUE ? (int)size() : Integer.MAX_VALUE][];
        for (int i = 0; i < array.length; i++) {
            array[i] = new float[size(i) < Integer.MAX_VALUE ? (int)size(i) : Integer.MAX_VALUE];
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = get(i, j);
            }
        }
        return array;
    }
    @Override public String toString() {
        return java.util.Arrays.deepToString(get());
    }

    public FloatVectorVector put(float[] ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            if (size(i) != array[i].length) { resize(i, array[i].length); }
            for (int j = 0; j < array[i].length; j++) {
                put(i, j, array[i][j]);
            }
        }
        return this;
    }
}


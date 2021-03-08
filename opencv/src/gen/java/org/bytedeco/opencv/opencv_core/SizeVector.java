// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;

@Name("std::vector<cv::Size>") @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class SizeVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SizeVector(Pointer p) { super(p); }
    public SizeVector(Size value) { this(1); put(0, value); }
    public SizeVector(Size ... array) { this(array.length); put(array); }
    public SizeVector()       { allocate();  }
    public SizeVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator =") @ByRef SizeVector put(@ByRef SizeVector x);

    public boolean empty() { return size() == 0; }
    public native long size();
    public void clear() { resize(0); }
    public native void resize(@Cast("size_t") long n);

    @Index(function = "at") public native @ByRef Size get(@Cast("size_t") long i);
    public native SizeVector put(@Cast("size_t") long i, Size value);

    public native @ByVal Iterator insert(@ByVal Iterator pos, @ByRef Size value);
    public native @ByVal Iterator erase(@ByVal Iterator pos);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *") @ByRef @Const Size get();
    }

    public Size[] get() {
        Size[] array = new Size[size() < Integer.MAX_VALUE ? (int)size() : Integer.MAX_VALUE];
        for (int i = 0; i < array.length; i++) {
            array[i] = get(i);
        }
        return array;
    }
    @Override public String toString() {
        return java.util.Arrays.toString(get());
    }

    public Size pop_back() {
        long size = size();
        Size value = get(size - 1);
        resize(size - 1);
        return value;
    }
    public SizeVector push_back(Size value) {
        long size = size();
        resize(size + 1);
        return put(size, value);
    }
    public SizeVector put(Size value) {
        if (size() != 1) { resize(1); }
        return put(0, value);
    }
    public SizeVector put(Size ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }
}


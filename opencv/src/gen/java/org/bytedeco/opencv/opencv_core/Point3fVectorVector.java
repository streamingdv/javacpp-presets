// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;

@Name("std::vector<std::vector<cv::Point3f> >") @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class Point3fVectorVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Point3fVectorVector(Pointer p) { super(p); }
    public Point3fVectorVector(Point3fVector value) { this(1); put(0, value); }
    public Point3fVectorVector(Point3fVector ... array) { this(array.length); put(array); }
    public Point3fVectorVector()       { allocate();  }
    public Point3fVectorVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator =") @ByRef Point3fVectorVector put(@ByRef Point3fVectorVector x);

    public boolean empty() { return size() == 0; }
    public native long size();
    public void clear() { resize(0); }
    public native void resize(@Cast("size_t") long n);

    @Index(function = "at") public native @Cast("std::vector<cv::Point3f>*") @ByRef Point3fVector get(@Cast("size_t") long i);
    public native Point3fVectorVector put(@Cast("size_t") long i, Point3fVector value);

    public native @ByVal Iterator insert(@ByVal Iterator pos, @Cast("std::vector<cv::Point3f>*") @ByRef Point3fVector value);
    public native @ByVal Iterator erase(@ByVal Iterator pos);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *") @Cast("std::vector<cv::Point3f>*") @ByRef @Const Point3fVector get();
    }

    public Point3fVector[] get() {
        Point3fVector[] array = new Point3fVector[size() < Integer.MAX_VALUE ? (int)size() : Integer.MAX_VALUE];
        for (int i = 0; i < array.length; i++) {
            array[i] = get(i);
        }
        return array;
    }
    @Override public String toString() {
        return java.util.Arrays.toString(get());
    }

    public Point3fVector pop_back() {
        long size = size();
        Point3fVector value = get(size - 1);
        resize(size - 1);
        return value;
    }
    public Point3fVectorVector push_back(Point3fVector value) {
        long size = size();
        resize(size + 1);
        return put(size, value);
    }
    public Point3fVectorVector put(Point3fVector value) {
        if (size() != 1) { resize(1); }
        return put(0, value);
    }
    public Point3fVectorVector put(Point3fVector ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }
}


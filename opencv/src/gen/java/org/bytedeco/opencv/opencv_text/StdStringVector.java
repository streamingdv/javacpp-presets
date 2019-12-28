// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_text;

import org.bytedeco.javacpp.annotation.Index;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
import org.bytedeco.opencv.opencv_dnn.*;
import static org.bytedeco.opencv.global.opencv_dnn.*;
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.opencv.opencv_flann.*;
import static org.bytedeco.opencv.global.opencv_flann.*;
import org.bytedeco.opencv.opencv_features2d.*;
import static org.bytedeco.opencv.global.opencv_features2d.*;
import org.bytedeco.opencv.opencv_ml.*;
import static org.bytedeco.opencv.global.opencv_ml.*;

import static org.bytedeco.opencv.global.opencv_text.*;

@Name("std::vector<std::string>") @Properties(inherit = org.bytedeco.opencv.presets.opencv_text.class)
public class StdStringVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StdStringVector(Pointer p) { super(p); }
    public StdStringVector(BytePointer value) { this(1); put(0, value); }
    public StdStringVector(BytePointer ... array) { this(array.length); put(array); }
    public StdStringVector(String value) { this(1); put(0, value); }
    public StdStringVector(String ... array) { this(array.length); put(array); }
    public StdStringVector()       { allocate();  }
    public StdStringVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator=") @ByRef StdStringVector put(@ByRef StdStringVector x);

    public boolean empty() { return size() == 0; }
    public native long size();
    public void clear() { resize(0); }
    public native void resize(@Cast("size_t") long n);

    @Index(function = "at") public native @StdString BytePointer get(@Cast("size_t") long i);
    public native StdStringVector put(@Cast("size_t") long i, BytePointer value);
    @ValueSetter @Index(function = "at") public native StdStringVector put(@Cast("size_t") long i, @StdString String value);

    public native @ByVal Iterator insert(@ByVal Iterator pos, @StdString BytePointer value);
    public native @ByVal Iterator erase(@ByVal Iterator pos);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator++") @ByRef Iterator increment();
        public native @Name("operator==") boolean equals(@ByRef Iterator it);
        public native @Name("operator*") @StdString BytePointer get();
    }

    public BytePointer[] get() {
        BytePointer[] array = new BytePointer[size() < Integer.MAX_VALUE ? (int)size() : Integer.MAX_VALUE];
        for (int i = 0; i < array.length; i++) {
            array[i] = get(i);
        }
        return array;
    }
    @Override public String toString() {
        return java.util.Arrays.toString(get());
    }

    public BytePointer pop_back() {
        long size = size();
        BytePointer value = get(size - 1);
        resize(size - 1);
        return value;
    }
    public StdStringVector push_back(BytePointer value) {
        long size = size();
        resize(size + 1);
        return put(size, value);
    }
    public StdStringVector put(BytePointer value) {
        if (size() != 1) { resize(1); }
        return put(0, value);
    }
    public StdStringVector put(BytePointer ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }

    public StdStringVector push_back(String value) {
        long size = size();
        resize(size + 1);
        return put(size, value);
    }
    public StdStringVector put(String value) {
        if (size() != 1) { resize(1); }
        return put(0, value);
    }
    public StdStringVector put(String ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }
}


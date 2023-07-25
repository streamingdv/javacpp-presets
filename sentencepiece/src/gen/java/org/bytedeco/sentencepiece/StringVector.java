// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.sentencepiece;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.sentencepiece.global.sentencepiece.*;

@Name("std::vector<std::string>") @Properties(inherit = org.bytedeco.sentencepiece.presets.sentencepiece.class)
public class StringVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StringVector(Pointer p) { super(p); }
    public StringVector(String value) { this(1); put(0, value); }
    public StringVector(String ... array) { this(array.length); put(array); }
    public StringVector()       { allocate();  }
    public StringVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator =") @ByRef StringVector put(@ByRef StringVector x);

    public boolean empty() { return size() == 0; }
    public native long size();
    public void clear() { resize(0); }
    public native void resize(@Cast("size_t") long n);

    public String front() { return get(0); }
    public String back() { return get(size() - 1); }
    @Index(function = "at") public native @StdString String get(@Cast("size_t") long i);
    public native StringVector put(@Cast("size_t") long i, String value);

    public native @ByVal Iterator insert(@ByVal Iterator pos, @StdString String value);
    public native @ByVal Iterator erase(@ByVal Iterator pos);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *") @StdString String get();
    }

    public String[] get() {
        String[] array = new String[size() < Integer.MAX_VALUE ? (int)size() : Integer.MAX_VALUE];
        for (int i = 0; i < array.length; i++) {
            array[i] = get(i);
        }
        return array;
    }
    @Override public String toString() {
        return java.util.Arrays.toString(get());
    }

    public String pop_back() {
        long size = size();
        String value = get(size - 1);
        resize(size - 1);
        return value;
    }
    public StringVector push_back(String value) {
        long size = size();
        resize(size + 1);
        return put(size, value);
    }
    public StringVector put(String value) {
        if (size() != 1) { resize(1); }
        return put(0, value);
    }
    public StringVector put(String ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }
}


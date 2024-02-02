// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflowlite;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflowlite.global.tensorflowlite.*;

@Name("std::vector<const std::string*>") @Properties(inherit = org.bytedeco.tensorflowlite.presets.tensorflowlite.class)
public class StringVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StringVector(Pointer p) { super(p); }
    public StringVector(@Cast({"char*", "std::string*"}) BytePointer value) { this(1); put(0, value); }
    public StringVector(@Cast({"char*", "std::string*"}) BytePointer ... array) { this(array.length); put(array); }
    public StringVector()       { allocate();  }
    public StringVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator =") @ByRef StringVector put(@ByRef StringVector x);

    public boolean empty() { return size() == 0; }
    public native long size();
    public void clear() { resize(0); }
    public native void resize(@Cast("size_t") long n);

    public BytePointer front() { return get(0); }
    public BytePointer back() { return get(size() - 1); }
    @Index(function = "at") public native @StdString @Cast({"char*", "std::string*"}) BytePointer get(@Cast("size_t") long i);
    public native StringVector put(@Cast("size_t") long i, BytePointer value);

    public native @ByVal Iterator insert(@ByVal Iterator pos, @StdString @Cast({"char*", "std::string*"}) BytePointer value);
    public native @ByVal Iterator erase(@ByVal Iterator pos);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *") @StdString @Const @Cast({"char*", "std::string*"}) BytePointer get();
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
    public StringVector push_back(BytePointer value) {
        long size = size();
        resize(size + 1);
        return put(size, value);
    }
    public StringVector put(BytePointer value) {
        if (size() != 1) { resize(1); }
        return put(0, value);
    }
    public StringVector put(BytePointer ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }
}


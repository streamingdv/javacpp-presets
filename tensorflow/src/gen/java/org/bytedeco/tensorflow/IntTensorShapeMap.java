// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

@Name("std::unordered_map<int,tensorflow::TensorShape>") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class IntTensorShapeMap extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IntTensorShapeMap(Pointer p) { super(p); }
    public IntTensorShapeMap()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef IntTensorShapeMap put(@ByRef IntTensorShapeMap x);

    public boolean empty() { return size() == 0; }
    public native long size();

    @Index public native @ByRef TensorShape get(int i);
    public native IntTensorShapeMap put(int i, TensorShape value);

    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *().first") @MemberGetter int first();
        public native @Name("operator *().second") @MemberGetter @ByRef @Const TensorShape second();
    }
}


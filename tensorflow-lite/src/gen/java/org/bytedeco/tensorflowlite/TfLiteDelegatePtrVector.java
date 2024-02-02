// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflowlite;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflowlite.global.tensorflowlite.*;

@Name("std::vector<std::unique_ptr<TfLiteDelegate,void(*)(TfLiteDelegate*)> >") @Properties(inherit = org.bytedeco.tensorflowlite.presets.tensorflowlite.class)
public class TfLiteDelegatePtrVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TfLiteDelegatePtrVector(Pointer p) { super(p); }
    public TfLiteDelegatePtrVector()       { allocate();  }
    private native void allocate();


    public boolean empty() { return size() == 0; }
    public native long size();

    public TfLiteDelegate front() { return get(0); }
    public TfLiteDelegate back() { return get(size() - 1); }
    @Index(function = "at") public native @UniquePtr("TfLiteDelegate,void(*)(TfLiteDelegate*)") TfLiteDelegate get(@Cast("size_t") long i);

    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *") @UniquePtr("TfLiteDelegate,void(*)(TfLiteDelegate*)") @Const TfLiteDelegate get();
    }
}


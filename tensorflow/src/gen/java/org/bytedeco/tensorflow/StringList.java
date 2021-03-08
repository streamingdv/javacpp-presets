// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

@Name("std::list<tensorflow::string>") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class StringList extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StringList(Pointer p) { super(p); }
    public StringList()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef StringList put(@ByRef StringList x);

    public boolean empty() { return size() == 0; }
    public native long size();

    public native @ByVal Iterator insert(@ByVal Iterator pos, @StdString BytePointer value);
    public native @ByVal Iterator erase(@ByVal Iterator pos);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *") @StdString BytePointer get();
    }
}


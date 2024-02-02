// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.onnxruntime;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;
import org.bytedeco.dnnl.*;
import static org.bytedeco.dnnl.global.dnnl.*;

import static org.bytedeco.onnxruntime.global.onnxruntime.*;

@Name("std::unordered_map<std::string,std::string>") @Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class StringStringMap extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StringStringMap(Pointer p) { super(p); }
    public StringStringMap()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef StringStringMap put(@ByRef StringStringMap x);

    public boolean empty() { return size() == 0; }
    public native long size();

    @Index public native @StdString BytePointer get(@StdString BytePointer i);
    public native StringStringMap put(@StdString BytePointer i, BytePointer value);
    @ValueSetter @Index public native StringStringMap put(@StdString BytePointer i, @StdString String value);

    public native void erase(@ByVal Iterator pos);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *().first") @MemberGetter @StdString BytePointer first();
        public native @Name("operator *().second") @MemberGetter @StdString BytePointer second();
    }
}


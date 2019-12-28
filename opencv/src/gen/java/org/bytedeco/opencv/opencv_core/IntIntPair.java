// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;

@NoOffset @Name("std::pair<int,int>") @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class IntIntPair extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IntIntPair(Pointer p) { super(p); }
    public IntIntPair(int firstValue, int secondValue) { this(); put(firstValue, secondValue); }
    public IntIntPair()       { allocate();  }
    private native void allocate();
    public native @Name("operator=") @ByRef IntIntPair put(@ByRef IntIntPair x);


    @MemberGetter public native int first(); public native IntIntPair first(int first);
    @MemberGetter public native int second();  public native IntIntPair second(int second);

    public IntIntPair put(int firstValue, int secondValue) {
        first(firstValue);
        second(secondValue);
        return this;
    }
}


// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.functions.*;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;

@NoOffset @Name("c10::optional<std::pair<void*,void*> >") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class PointerPairOptional extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PointerPairOptional(Pointer p) { super(p); }
    public PointerPairOptional(PointerPair value) { this(); put(value); }
    public PointerPairOptional()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef PointerPairOptional put(@ByRef PointerPairOptional x);

    public native boolean has_value();
    public native void reset();
    public native @Name("value") @ByRef PointerPair get();
    @ValueSetter public native PointerPairOptional put(@ByRef PointerPair value);
}


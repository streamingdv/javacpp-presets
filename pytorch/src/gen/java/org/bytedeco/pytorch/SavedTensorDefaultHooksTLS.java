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


@Namespace("at::impl") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class SavedTensorDefaultHooksTLS extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public SavedTensorDefaultHooksTLS() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SavedTensorDefaultHooksTLS(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SavedTensorDefaultHooksTLS(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public SavedTensorDefaultHooksTLS position(long position) {
        return (SavedTensorDefaultHooksTLS)super.position(position);
    }
    @Override public SavedTensorDefaultHooksTLS getPointer(long i) {
        return new SavedTensorDefaultHooksTLS((Pointer)this).offsetAddress(i);
    }

  // PyObject is defined in c10/util/python_stub.h
  public native @ByRef @Cast("std::stack<std::pair<PyObject*,PyObject*> >*") Pointer stack(); public native SavedTensorDefaultHooksTLS stack(Pointer setter);

  // See NOTE: [Disabling SavedTensorDefaultHooks] for context
  // NOTE: [disabled_error_message invariant]
  // disabled_error_message is nullopt IFF Saved Tensor hooks is enabled
  // We did this for efficiency (so we didn't have to keep a separate bool
  // around)
  public native @ByRef StringOptional disabled_error_message(); public native SavedTensorDefaultHooksTLS disabled_error_message(StringOptional setter);
}

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


@Name("torch::jit::ListIterator<torch::jit::Attribute>") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class AttributeListIterator extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AttributeListIterator(Pointer p) { super(p); }

  public AttributeListIterator(@ByVal @Cast("torch::jit::TreeList::const_iterator*") TreeRef it) { super((Pointer)null); allocate(it); }
  private native void allocate(@ByVal @Cast("torch::jit::TreeList::const_iterator*") TreeRef it);
  public native @Cast("bool") @Name("operator !=") boolean notEquals(@Const @ByRef AttributeListIterator rhs);
  public native @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef AttributeListIterator rhs);
  public native @ByVal @Name("operator *") Attribute multiply();
  public native @ByRef @Name("operator +=") AttributeListIterator addPut(@Cast("std::ptrdiff_t") long n);
  public native @ByRef @Name("operator ++") AttributeListIterator increment();
  public native @ByRef @Name("operator --") AttributeListIterator decrement();
}

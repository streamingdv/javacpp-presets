// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.plasma;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;

import static org.bytedeco.arrow.global.plasma.*;


@Namespace("plasma") @Properties(inherit = org.bytedeco.arrow.presets.plasma.class)
public class UniqueID extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public UniqueID() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public UniqueID(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public UniqueID(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public UniqueID position(long position) {
        return (UniqueID)super.position(position);
    }
    @Override public UniqueID getPointer(long i) {
        return new UniqueID((Pointer)this).position(position + i);
    }

  public static native @ByVal UniqueID from_binary(@StdString String binary);
  public static native @ByVal UniqueID from_binary(@StdString BytePointer binary);
  public native @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef UniqueID rhs);
  public native @Cast("const uint8_t*") BytePointer data();
  public native @Cast("uint8_t*") BytePointer mutable_data();
  public native @StdString String binary();
  public native @StdString String hex();
  public native @Cast("size_t") long hash();
  public static native @Cast("int64_t") long size();
}

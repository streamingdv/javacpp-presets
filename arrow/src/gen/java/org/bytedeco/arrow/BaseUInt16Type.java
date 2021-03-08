// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


@Name("arrow::NumericScalar<arrow::UInt16Type>") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class BaseUInt16Type extends PrimitiveScalarBase {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BaseUInt16Type(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public BaseUInt16Type(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public BaseUInt16Type position(long position) {
        return (BaseUInt16Type)super.position(position);
    }
    @Override public BaseUInt16Type getPointer(long i) {
        return new BaseUInt16Type((Pointer)this).position(position + i);
    }


  public BaseUInt16Type(@Cast("arrow::NumericScalar<arrow::UInt16Type>::ValueType") short value) { super((Pointer)null); allocate(value); }
  private native void allocate(@Cast("arrow::NumericScalar<arrow::UInt16Type>::ValueType") short value);

  public BaseUInt16Type() { super((Pointer)null); allocate(); }
  private native void allocate();
}

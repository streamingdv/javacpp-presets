// Targeted by JavaCPP version 1.5.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.parquet;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;

import static org.bytedeco.arrow.global.parquet.*;


@Namespace("parquet::schema") @Properties(inherit = org.bytedeco.arrow.presets.parquet.class)
public class DecimalMetadata extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public DecimalMetadata() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public DecimalMetadata(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DecimalMetadata(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public DecimalMetadata position(long position) {
        return (DecimalMetadata)super.position(position);
    }
    @Override public DecimalMetadata getPointer(long i) {
        return new DecimalMetadata(this).position(position + i);
    }

  public native @Cast("bool") boolean isset(); public native DecimalMetadata isset(boolean setter);
  public native int scale(); public native DecimalMetadata scale(int setter);
  public native int precision(); public native DecimalMetadata precision(int setter);
}

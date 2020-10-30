// Targeted by JavaCPP version 1.5.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.parquet;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;

import static org.bytedeco.arrow.global.parquet.*;


// Mirrors parquet::ConvertedType
@Namespace("parquet") @Properties(inherit = org.bytedeco.arrow.presets.parquet.class)
public class ConvertedType extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ConvertedType() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ConvertedType(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ConvertedType(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ConvertedType position(long position) {
        return (ConvertedType)super.position(position);
    }
    @Override public ConvertedType getPointer(long i) {
        return new ConvertedType(this).position(position + i);
    }

  public enum type {
    NONE(0),
    UTF8(1),
    MAP(2),
    MAP_KEY_VALUE(3),
    LIST(4),
    ENUM(5),
    DECIMAL(6),
    DATE(7),
    TIME_MILLIS(8),
    TIME_MICROS(9),
    TIMESTAMP_MILLIS(10),
    TIMESTAMP_MICROS(11),
    UINT_8(12),
    UINT_16(13),
    UINT_32(14),
    UINT_64(15),
    INT_8(16),
    INT_16(17),
    INT_32(18),
    INT_64(19),
    JSON(20),
    BSON(21),
    INTERVAL(22),
    NA(25),
    // Should always be last element.
    UNDEFINED(26);

      public final int value;
      private type(int v) { this.value = v; }
      private type(type e) { this.value = e.value; }
      public type intern() { for (type e : values()) if (e.value == value) return e; return this; }
      @Override public String toString() { return intern().name(); }
  }
}

// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.parquet;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;

import static org.bytedeco.arrow.global.parquet.*;


@Namespace("parquet") @Properties(inherit = org.bytedeco.arrow.presets.parquet.class)
public class ParquetVersion extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ParquetVersion() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ParquetVersion(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ParquetVersion(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ParquetVersion position(long position) {
        return (ParquetVersion)super.position(position);
    }
    @Override public ParquetVersion getPointer(long i) {
        return new ParquetVersion((Pointer)this).position(position + i);
    }

  public enum type { PARQUET_1_0(0), PARQUET_2_0(1);

      public final int value;
      private type(int v) { this.value = v; }
      private type(type e) { this.value = e.value; }
      public type intern() { for (type e : values()) if (e.value == value) return e; return this; }
      @Override public String toString() { return intern().name(); }
  }
}

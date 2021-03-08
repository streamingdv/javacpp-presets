// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.parquet;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;

import static org.bytedeco.arrow.global.parquet.*;


@Namespace("parquet") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.parquet.class)
public class ParquetFilePrinter extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ParquetFilePrinter(Pointer p) { super(p); }

  public ParquetFilePrinter(ParquetFileReader reader) { super((Pointer)null); allocate(reader); }
  private native void allocate(ParquetFileReader reader);

  public native void DebugPrint(@Cast("std::ostream*") @ByRef Pointer stream, @ByVal IntList selected_columns,
                    @Cast("bool") boolean print_values/*=false*/, @Cast("bool") boolean format_dump/*=false*/,
                    @Cast("bool") boolean print_key_value_metadata/*=false*/,
                    String filename/*="No Name"*/);
  public native void DebugPrint(@Cast("std::ostream*") @ByRef Pointer stream, @ByVal IntList selected_columns);
  public native void DebugPrint(@Cast("std::ostream*") @ByRef Pointer stream, @ByVal IntList selected_columns,
                    @Cast("bool") boolean print_values/*=false*/, @Cast("bool") boolean format_dump/*=false*/,
                    @Cast("bool") boolean print_key_value_metadata/*=false*/,
                    @Cast("const char*") BytePointer filename/*="No Name"*/);

  public native void JSONPrint(@Cast("std::ostream*") @ByRef Pointer stream, @ByVal IntList selected_columns,
                   String filename/*="No Name"*/);
  public native void JSONPrint(@Cast("std::ostream*") @ByRef Pointer stream, @ByVal IntList selected_columns);
  public native void JSONPrint(@Cast("std::ostream*") @ByRef Pointer stream, @ByVal IntList selected_columns,
                   @Cast("const char*") BytePointer filename/*="No Name"*/);
}

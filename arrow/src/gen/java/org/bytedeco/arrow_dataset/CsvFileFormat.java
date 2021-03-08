// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.arrow_dataset;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;
import org.bytedeco.parquet.*;
import static org.bytedeco.arrow.global.parquet.*;

import static org.bytedeco.arrow.global.arrow_dataset.*;


/** \brief A FileFormat implementation that reads from and writes to Csv files */
@Namespace("arrow::dataset") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow_dataset.class)
public class CsvFileFormat extends FileFormat {
    static { Loader.load(); }
    /** Default native constructor. */
    public CsvFileFormat() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CsvFileFormat(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CsvFileFormat(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CsvFileFormat position(long position) {
        return (CsvFileFormat)super.position(position);
    }
    @Override public CsvFileFormat getPointer(long i) {
        return new CsvFileFormat((Pointer)this).position(position + i);
    }

  /** Options affecting the parsing of CSV files */
  public native @ByRef CsvParseOptions parse_options(); public native CsvFileFormat parse_options(CsvParseOptions setter);

  public native @StdString String type_name();

  public native @Cast("bool") boolean Equals(@Const @ByRef FileFormat other);

  public native @ByVal BoolResult IsSupported(@Const @ByRef FileSource source);

  /** \brief Return the schema of the file if possible. */
  public native @ByVal SchemaResult Inspect(@Const @ByRef FileSource source);

  /** \brief Open a file for scanning */
  public native @ByVal ScanTaskIteratorResult ScanFile(@SharedPtr ScanOptions options,
                                      @SharedPtr ScanContext context,
                                      FileFragment fragment);

  public native @ByVal FileWriterResult MakeWriter(
        @SharedPtr OutputStream destination, @SharedPtr @ByVal Schema schema,
        @SharedPtr FileWriteOptions options);

  public native @SharedPtr FileWriteOptions DefaultWriteOptions();
}

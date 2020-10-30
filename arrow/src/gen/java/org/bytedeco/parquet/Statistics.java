// Targeted by JavaCPP version 1.5.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.parquet;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;

import static org.bytedeco.arrow.global.parquet.*;


/** \brief Base type for computing column statistics while writing a file */
@Namespace("parquet") @Properties(inherit = org.bytedeco.arrow.presets.parquet.class)
public class Statistics extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Statistics(Pointer p) { super(p); }


  /** \brief Create a new statistics instance given a column schema
   *  definition
   *  @param descr [in] the column schema
   *  @param pool [in] a memory pool to use for any memory allocations, optional */
  public static native @SharedPtr Statistics Make(
        @Const ColumnDescriptor descr,
        MemoryPool pool/*=arrow::default_memory_pool()*/);
  public static native @SharedPtr Statistics Make(
        @Const ColumnDescriptor descr);

  /** \brief Create a new statistics instance given a column schema
   *  definition and pre-existing state
   *  @param descr [in] the column schema
   *  @param encoded_min [in] the encoded minimum value
   *  @param encoded_max [in] the encoded maximum value
   *  @param num_values [in] total number of values
   *  @param null_count [in] number of null values
   *  @param distinct_count [in] number of distinct values
   *  @param has_min_max [in] whether the min/max statistics are set
   *  @param pool [in] a memory pool to use for any memory allocations, optional */
  public static native @SharedPtr Statistics Make(
        @Const ColumnDescriptor descr, @StdString String encoded_min,
        @StdString String encoded_max, @Cast("int64_t") long num_values, @Cast("int64_t") long null_count,
        @Cast("int64_t") long distinct_count, @Cast("bool") boolean has_min_max,
        MemoryPool pool/*=arrow::default_memory_pool()*/);
  public static native @SharedPtr Statistics Make(
        @Const ColumnDescriptor descr, @StdString String encoded_min,
        @StdString String encoded_max, @Cast("int64_t") long num_values, @Cast("int64_t") long null_count,
        @Cast("int64_t") long distinct_count, @Cast("bool") boolean has_min_max);
  public static native @SharedPtr Statistics Make(
        @Const ColumnDescriptor descr, @StdString BytePointer encoded_min,
        @StdString BytePointer encoded_max, @Cast("int64_t") long num_values, @Cast("int64_t") long null_count,
        @Cast("int64_t") long distinct_count, @Cast("bool") boolean has_min_max,
        MemoryPool pool/*=arrow::default_memory_pool()*/);
  public static native @SharedPtr Statistics Make(
        @Const ColumnDescriptor descr, @StdString BytePointer encoded_min,
        @StdString BytePointer encoded_max, @Cast("int64_t") long num_values, @Cast("int64_t") long null_count,
        @Cast("int64_t") long distinct_count, @Cast("bool") boolean has_min_max);

  /** \brief The number of null values, may not be set */
  public native @Cast("int64_t") long null_count();

  /** \brief The number of distinct values, may not be set */
  public native @Cast("int64_t") long distinct_count();

  /** \brief The total number of values in the column */
  public native @Cast("int64_t") long num_values();

  /** \brief Return true if the min and max statistics are set. Obtain
   *  with TypedStatistics<T>::min and max */
  public native @Cast("bool") boolean HasMinMax();

  /** \brief Reset state of object to initial (no data observed) state */
  public native void Reset();

  /** \brief Plain-encoded minimum value */
  public native @StdString String EncodeMin();

  /** \brief Plain-encoded maximum value */
  public native @StdString String EncodeMax();

  /** \brief The finalized encoded form of the statistics for transport */
  public native @ByVal EncodedStatistics Encode();

  /** \brief The physical type of the column schema */
  public native org.bytedeco.parquet.Type.type physical_type();

  /** \brief The full type descriptor from the column schema */
  public native @Const ColumnDescriptor descr();
}

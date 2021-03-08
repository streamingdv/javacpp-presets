// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \class Table
 *  \brief Logical table as sequence of chunked arrays */
@Namespace("arrow") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class Table extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Table(Pointer p) { super(p); }


  /** \brief Construct a Table from schema and columns
   * 
   *  If columns is zero-length, the table's number of rows is zero
   * 
   *  @param schema [in] The table schema (column types)
   *  @param columns [in] The table's columns as chunked arrays
   *  @param num_rows [in] number of rows in table, -1 (default) to infer from columns */
  
  ///
  public static native @SharedPtr @Cast({"", "std::shared_ptr<arrow::Table>"}) Table Make(@SharedPtr @ByVal Schema schema,
                                       @ByVal ChunkedArrayVector columns,
                                       @Cast("int64_t") long num_rows/*=-1*/);
  public static native @SharedPtr @Cast({"", "std::shared_ptr<arrow::Table>"}) Table Make(@SharedPtr @ByVal Schema schema,
                                       @ByVal ChunkedArrayVector columns);

  /** \brief Construct a Table from schema and arrays
   * 
   *  @param schema [in] The table schema (column types)
   *  @param arrays [in] The table's columns as arrays
   *  @param num_rows [in] number of rows in table, -1 (default) to infer from columns */
  
  ///
  public static native @SharedPtr @Cast({"", "std::shared_ptr<arrow::Table>"}) Table Make(@SharedPtr @ByVal Schema schema,
                                       @Const @ByRef ArrayVector arrays,
                                       @Cast("int64_t") long num_rows/*=-1*/);
  public static native @SharedPtr @Cast({"", "std::shared_ptr<arrow::Table>"}) Table Make(@SharedPtr @ByVal Schema schema,
                                       @Const @ByRef ArrayVector arrays);

  /** \brief Construct a Table from a RecordBatchReader.
   * 
   *  @param reader [in] the arrow::Schema for each batch */
  
  ///
  public static native @ByVal TableResult FromRecordBatchReader(RecordBatchReader reader);

  /** \brief Construct a Table from RecordBatches, using schema supplied by the first
   *  RecordBatch.
   * 
   *  @param batches [in] a std::vector of record batches */
  
  ///
  public static native @ByVal TableResult FromRecordBatches(
        @Const @ByRef RecordBatchVector batches);

  /** \brief Construct a Table from RecordBatches, using supplied schema. There may be
   *  zero record batches
   * 
   *  @param schema [in] the arrow::Schema for each batch
   *  @param batches [in] a std::vector of record batches */
  
  ///
  public static native @ByVal TableResult FromRecordBatches(
        @SharedPtr @ByVal Schema schema,
        @Const @ByRef RecordBatchVector batches);

  /** \brief Construct a Table from a chunked StructArray. One column will be produced
   *  for each field of the StructArray.
   * 
   *  @param array [in] a chunked StructArray */
  public static native @ByVal TableResult FromChunkedStructArray(
        @SharedPtr @Cast({"", "std::shared_ptr<arrow::ChunkedArray>"}) ChunkedArray array);

  /** \brief Return the table schema */
  public native @SharedPtr @ByVal Schema schema();

  /** \brief Return a column by index */
  public native @SharedPtr @Cast({"", "std::shared_ptr<arrow::ChunkedArray>"}) ChunkedArray column(int i);

  /** \brief Return vector of all columns for table */
  public native @ByVal ChunkedArrayVector columns();

  /** Return a column's field by index */
  public native @SharedPtr @Cast({"", "std::shared_ptr<arrow::Field>"}) Field field(int i);

  /** \brief Return vector of all fields for table */
  
  ///
  ///
  public native @ByVal FieldVector fields();

  /** \brief Construct a zero-copy slice of the table with the
   *  indicated offset and length
   * 
   *  @param offset [in] the index of the first row in the constructed
   *  slice
   *  @param length [in] the number of rows of the slice. If there are not enough
   *  rows in the table, the length will be adjusted accordingly
   * 
   *  @return a new object wrapped in std::shared_ptr<Table> */
  public native @SharedPtr @Cast({"", "std::shared_ptr<arrow::Table>"}) Table Slice(@Cast("int64_t") long offset, @Cast("int64_t") long length);

  /** \brief Slice from first row at offset until end of the table */
  public native @SharedPtr @Cast({"", "std::shared_ptr<arrow::Table>"}) Table Slice(@Cast("int64_t") long offset);

  /** \brief Return a column by name
   *  @param name [in] field name
   *  @return an Array or null if no field was found */
  public native @SharedPtr @Cast({"", "std::shared_ptr<arrow::ChunkedArray>"}) ChunkedArray GetColumnByName(@StdString String name);
  public native @SharedPtr @Cast({"", "std::shared_ptr<arrow::ChunkedArray>"}) ChunkedArray GetColumnByName(@StdString BytePointer name);

  /** \brief Remove column from the table, producing a new Table */
  public native @ByVal TableResult RemoveColumn(int i);

  /** \brief Add column to the table, producing a new Table */
  public native @ByVal TableResult AddColumn(
        int i, @SharedPtr @Cast({"", "std::shared_ptr<arrow::Field>"}) Field field_arg,
        @SharedPtr @Cast({"", "std::shared_ptr<arrow::ChunkedArray>"}) ChunkedArray column);

  /** \brief Replace a column in the table, producing a new Table */
  public native @ByVal TableResult SetColumn(
        int i, @SharedPtr @Cast({"", "std::shared_ptr<arrow::Field>"}) Field field_arg,
        @SharedPtr @Cast({"", "std::shared_ptr<arrow::ChunkedArray>"}) ChunkedArray column);

  /** \brief Return names of all columns */
  public native @ByVal StringVector ColumnNames();

  /** \brief Rename columns with provided names */
  public native @ByVal TableResult RenameColumns(
        @Const @ByRef StringVector names);

  /** \brief Return new table with specified columns */
  
  ///
  public native @ByVal TableResult SelectColumns(@StdVector IntPointer indices);
  public native @ByVal TableResult SelectColumns(@StdVector IntBuffer indices);
  public native @ByVal TableResult SelectColumns(@StdVector int[] indices);

  /** \brief Replace schema key-value metadata with new metadata (EXPERIMENTAL)
   *  @since 0.5.0
   * 
   *  @param metadata [in] new KeyValueMetadata
   *  @return new Table */
  
  ///
  public native @SharedPtr @Cast({"", "std::shared_ptr<arrow::Table>"}) Table ReplaceSchemaMetadata(
        @Const @Cast("const arrow::KeyValueMetadata*") @SharedPtr @ByRef KeyValueMetadata metadata);

  /** \brief Flatten the table, producing a new Table.  Any column with a
   *  struct type will be flattened into multiple columns
   * 
   *  @param pool [in] The pool for buffer allocations, if any */
  public native @ByVal TableResult Flatten(
        MemoryPool pool/*=arrow::default_memory_pool()*/);
  public native @ByVal TableResult Flatten();

  /** @return PrettyPrint representation suitable for debugging */
  
  ///
  ///
  public native @StdString String ToString();

  /** \brief Perform cheap validation checks to determine obvious inconsistencies
   *  within the table's schema and internal data.
   * 
   *  This is O(k*m) where k is the total number of field descendents,
   *  and m is the number of chunks.
   * 
   *  @return Status */
  
  ///
  ///
  public native @ByVal Status Validate();

  /** \brief Perform extensive validation checks to determine inconsistencies
   *  within the table's schema and internal data.
   * 
   *  This is O(k*n) where k is the total number of field descendents,
   *  and n is the number of rows.
   * 
   *  @return Status */
  public native @ByVal Status ValidateFull();

  /** \brief Return the number of columns in the table */
  public native int num_columns();

  /** \brief Return the number of rows (equal to each column's logical length) */
  
  ///
  public native @Cast("int64_t") long num_rows();

  /** \brief Determine if tables are equal
   * 
   *  Two tables can be equal only if they have equal schemas.
   *  However, they may be equal even if they have different chunkings. */
  
  ///
  ///
  public native @Cast("bool") boolean Equals(@Const @ByRef Table other, @Cast("bool") boolean check_metadata/*=false*/);
  public native @Cast("bool") boolean Equals(@Const @ByRef Table other);

  /** \brief Make a new table by combining the chunks this table has.
   * 
   *  All the underlying chunks in the ChunkedArray of each column are
   *  concatenated into zero or one chunk.
   * 
   *  @param pool [in] The pool for buffer allocations */
  public native @ByVal TableResult CombineChunks(
        MemoryPool pool/*=arrow::default_memory_pool()*/);
  public native @ByVal TableResult CombineChunks();
}

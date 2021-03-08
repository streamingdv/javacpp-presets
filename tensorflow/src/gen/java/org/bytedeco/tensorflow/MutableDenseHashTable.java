// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Creates an empty hash table that uses tensors as the backing store.
 * 
 *  It uses "open addressing" with quadratic reprobing to resolve
 *  collisions.
 * 
 *  This op creates a mutable hash table, specifying the type of its keys and
 *  values. Each value must be a scalar. Data can be inserted into the table using
 *  the insert operations. It does not support the initialization operation.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * empty_key: The key used to represent empty key buckets internally. Must not
 *  be used in insert or lookup operations.
 *  * value_dtype: Type of the table values.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * container: If non-empty, this table is placed in the given container.
 *  Otherwise, a default container is used.
 *  * shared_name: If non-empty, this table is shared under the given name across
 *  multiple sessions.
 *  * value_shape: The shape of each value.
 *  * initial_num_buckets: The initial number of hash table buckets. Must be a power
 *  to 2.
 *  * max_load_factor: The maximum ratio between number of entries and number of
 *  buckets before growing the table. Must be between 0 and 1.
 * 
 *  Returns:
 *  * {@code Output}: Handle to a table. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class MutableDenseHashTable extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MutableDenseHashTable(Pointer p) { super(p); }

  /** Optional attribute setters for MutableDenseHashTable */
  public static class Attrs extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public Attrs() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Attrs(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Attrs(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public Attrs position(long position) {
          return (Attrs)super.position(position);
      }
      @Override public Attrs getPointer(long i) {
          return new Attrs((Pointer)this).position(position + i);
      }
  
    /** If non-empty, this table is placed in the given container.
     *  Otherwise, a default container is used.
     * 
     *  Defaults to "" */
    
    ///
    public native @ByVal Attrs Container(@StringPiece BytePointer x);
    public native @ByVal Attrs Container(@StringPiece String x);

    /** If non-empty, this table is shared under the given name across
     *  multiple sessions.
     * 
     *  Defaults to "" */
    public native @ByVal Attrs SharedName(@StringPiece BytePointer x);
    public native @ByVal Attrs SharedName(@StringPiece String x);

    /** Defaults to false */
    
    ///
    public native @ByVal Attrs UseNodeNameSharing(@Cast("bool") boolean x);

    /** The shape of each value.
     * 
     *  Defaults to [] */
    
    ///
    public native @ByVal Attrs ValueShape(@ByVal PartialTensorShape x);

    /** The initial number of hash table buckets. Must be a power
     *  to 2.
     * 
     *  Defaults to 131072 */
    
    ///
    public native @ByVal Attrs InitialNumBuckets(@Cast("tensorflow::int64") long x);

    /** The maximum ratio between number of entries and number of
     *  buckets before growing the table. Must be between 0 and 1.
     * 
     *  Defaults to 0.8 */
    public native @ByVal Attrs MaxLoadFactor(float x);

    public native @StringPiece BytePointer container_(); public native Attrs container_(BytePointer setter);
    public native @StringPiece BytePointer shared_name_(); public native Attrs shared_name_(BytePointer setter);
    public native @Cast("bool") boolean use_node_name_sharing_(); public native Attrs use_node_name_sharing_(boolean setter);
    public native @ByRef PartialTensorShape value_shape_(); public native Attrs value_shape_(PartialTensorShape setter);
    public native @Cast("tensorflow::int64") long initial_num_buckets_(); public native Attrs initial_num_buckets_(long setter);
    public native float max_load_factor_(); public native Attrs max_load_factor_(float setter);
  }
  public MutableDenseHashTable(@Const @ByRef Scope scope, @ByVal Input empty_key, @ByVal Input deleted_key, @Cast("tensorflow::DataType") int value_dtype) { super((Pointer)null); allocate(scope, empty_key, deleted_key, value_dtype); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input empty_key, @ByVal Input deleted_key, @Cast("tensorflow::DataType") int value_dtype);
  public MutableDenseHashTable(@Const @ByRef Scope scope, @ByVal Input empty_key, @ByVal Input deleted_key, @Cast("tensorflow::DataType") int value_dtype, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, empty_key, deleted_key, value_dtype, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input empty_key, @ByVal Input deleted_key, @Cast("tensorflow::DataType") int value_dtype, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs Container(@StringPiece BytePointer x);
  public static native @ByVal Attrs Container(@StringPiece String x);
  public static native @ByVal Attrs SharedName(@StringPiece BytePointer x);
  public static native @ByVal Attrs SharedName(@StringPiece String x);
  public static native @ByVal Attrs UseNodeNameSharing(@Cast("bool") boolean x);
  public static native @ByVal Attrs ValueShape(@ByVal PartialTensorShape x);
  public static native @ByVal Attrs InitialNumBuckets(@Cast("tensorflow::int64") long x);
  public static native @ByVal Attrs MaxLoadFactor(float x);

  public native @ByRef Operation operation(); public native MutableDenseHashTable operation(Operation setter);
  public native @ByRef Output table_handle(); public native MutableDenseHashTable table_handle(Output setter);
}

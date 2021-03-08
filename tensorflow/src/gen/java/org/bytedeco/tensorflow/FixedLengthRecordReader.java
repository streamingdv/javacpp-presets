// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** \defgroup io_ops Io Ops
 *  \{
 <p>
 *  A Reader that outputs fixed-length records from a file.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * record_bytes: Number of bytes in the record.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * header_bytes: Number of bytes in the header, defaults to 0.
 *  * footer_bytes: Number of bytes in the footer, defaults to 0.
 *  * hop_bytes: Number of bytes to hop before each read. Default of 0 means using
 *  record_bytes.
 *  * container: If non-empty, this reader is placed in the given container.
 *  Otherwise, a default container is used.
 *  * shared_name: If non-empty, this reader is named in the given bucket
 *  with this shared_name. Otherwise, the node name is used instead.
 *  * encoding: The type of encoding for the file. Currently ZLIB and GZIP
 *  are supported. Defaults to none.
 * 
 *  Returns:
 *  * {@code Output}: The handle to reference the Reader. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class FixedLengthRecordReader extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FixedLengthRecordReader(Pointer p) { super(p); }

  /** Optional attribute setters for FixedLengthRecordReader */
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
  
    /** Number of bytes in the header, defaults to 0.
     * 
     *  Defaults to 0 */
    
    ///
    public native @ByVal Attrs HeaderBytes(@Cast("tensorflow::int64") long x);

    /** Number of bytes in the footer, defaults to 0.
     * 
     *  Defaults to 0 */
    
    ///
    public native @ByVal Attrs FooterBytes(@Cast("tensorflow::int64") long x);

    /** Number of bytes to hop before each read. Default of 0 means using
     *  record_bytes.
     * 
     *  Defaults to 0 */
    
    ///
    public native @ByVal Attrs HopBytes(@Cast("tensorflow::int64") long x);

    /** If non-empty, this reader is placed in the given container.
     *  Otherwise, a default container is used.
     * 
     *  Defaults to "" */
    
    ///
    public native @ByVal Attrs Container(@StringPiece BytePointer x);
    public native @ByVal Attrs Container(@StringPiece String x);

    /** If non-empty, this reader is named in the given bucket
     *  with this shared_name. Otherwise, the node name is used instead.
     * 
     *  Defaults to "" */
    
    ///
    public native @ByVal Attrs SharedName(@StringPiece BytePointer x);
    public native @ByVal Attrs SharedName(@StringPiece String x);

    /** The type of encoding for the file. Currently ZLIB and GZIP
     *  are supported. Defaults to none.
     * 
     *  Defaults to "" */
    public native @ByVal Attrs Encoding(@StringPiece BytePointer x);
    public native @ByVal Attrs Encoding(@StringPiece String x);

    public native @Cast("tensorflow::int64") long header_bytes_(); public native Attrs header_bytes_(long setter);
    public native @Cast("tensorflow::int64") long footer_bytes_(); public native Attrs footer_bytes_(long setter);
    public native @Cast("tensorflow::int64") long hop_bytes_(); public native Attrs hop_bytes_(long setter);
    public native @StringPiece BytePointer container_(); public native Attrs container_(BytePointer setter);
    public native @StringPiece BytePointer shared_name_(); public native Attrs shared_name_(BytePointer setter);
    public native @StringPiece BytePointer encoding_(); public native Attrs encoding_(BytePointer setter);
  }
  public FixedLengthRecordReader(@Const @ByRef Scope scope, @Cast("tensorflow::int64") long record_bytes) { super((Pointer)null); allocate(scope, record_bytes); }
  private native void allocate(@Const @ByRef Scope scope, @Cast("tensorflow::int64") long record_bytes);
  public FixedLengthRecordReader(@Const @ByRef Scope scope, @Cast("tensorflow::int64") long record_bytes,
                          @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, record_bytes, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @Cast("tensorflow::int64") long record_bytes,
                          @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs HeaderBytes(@Cast("tensorflow::int64") long x);
  public static native @ByVal Attrs FooterBytes(@Cast("tensorflow::int64") long x);
  public static native @ByVal Attrs HopBytes(@Cast("tensorflow::int64") long x);
  public static native @ByVal Attrs Container(@StringPiece BytePointer x);
  public static native @ByVal Attrs Container(@StringPiece String x);
  public static native @ByVal Attrs SharedName(@StringPiece BytePointer x);
  public static native @ByVal Attrs SharedName(@StringPiece String x);
  public static native @ByVal Attrs Encoding(@StringPiece BytePointer x);
  public static native @ByVal Attrs Encoding(@StringPiece String x);

  public native @ByRef Operation operation(); public native FixedLengthRecordReader operation(Operation setter);
  public native @ByRef Output reader_handle(); public native FixedLengthRecordReader reader_handle(Output setter);
}

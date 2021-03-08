// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Converts each string in the input Tensor to its hash mod by a number of buckets.
 * 
 *  The hash function is deterministic on the content of the string within the
 *  process.
 * 
 *  Note that the hash function may change from time to time.
 *  This functionality will be deprecated and it's recommended to use
 *  {@code tf.string_to_hash_bucket_fast()} or {@code tf.string_to_hash_bucket_strong()}.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * num_buckets: The number of buckets.
 * 
 *  Returns:
 *  * {@code Output}: A Tensor of the same shape as the input {@code string_tensor}. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class StringToHashBucket extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StringToHashBucket(Pointer p) { super(p); }

  public StringToHashBucket(@Const @ByRef Scope scope, @ByVal Input string_tensor, @Cast("tensorflow::int64") long num_buckets) { super((Pointer)null); allocate(scope, string_tensor, num_buckets); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input string_tensor, @Cast("tensorflow::int64") long num_buckets);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native StringToHashBucket operation(Operation setter);
  public native @ByRef Output output(); public native StringToHashBucket output(Output setter);
}

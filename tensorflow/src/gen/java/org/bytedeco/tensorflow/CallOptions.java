// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// Options passed to interface calls. This class provides portable
// functionality across different RPC systems on top of
// platform-specific mechanisms (for client and server contexts,
// cancellation, etc.).
//
// TODO(zhifengc): Maybe change all RPC methods to take CallOptions.
@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class CallOptions extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CallOptions(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CallOptions(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public CallOptions position(long position) {
        return (CallOptions)super.position(position);
    }
    @Override public CallOptions getPointer(long i) {
        return new CallOptions((Pointer)this).position(position + i);
    }

  public CallOptions() { super((Pointer)null); allocate(); }
  private native void allocate();

  // Cancellation.
  //
  // The caller may call StartCancel() anytime as long as this
  // CallOptions object is alive. The callee may or may not receive
  // the cancellation notification depending on the rpc layer
  // implementation.
  public native void StartCancel();

  // The callee (the rpc layer implementation) must set a cancellation
  // notifier before its blocking operation and clear the notifier
  // before the call returns.
  //
  // "cancel_func" may be called zero, once or more time. Therefore, it
  // should _not_ be responsible for memory management of any objects.
  //
  // "cancel_func" must be very light-weight. It should not block on
  // IO or locking. Typically, it just calls the rpc implementation
  // layer's specific cancellation mechanism and does nothing else.
  //
  // NOTE: "cancel_func" itself is pass-by-value. Therefore, we do not
  // worry about its ownership here.
  public native void SetCancelCallback(@ByVal @Cast("tensorflow::CallOptions::CancelFunction*") Fn cancel_func);
  public native void ClearCancelCallback();

  // Get and set operation timeout. Timeout value is in milliseconds.
  public native @Cast("tensorflow::int64") long GetTimeout();
  public native void SetTimeout(@Cast("tensorflow::int64") long ms);
}

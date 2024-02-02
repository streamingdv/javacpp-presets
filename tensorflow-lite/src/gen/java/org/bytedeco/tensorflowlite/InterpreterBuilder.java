// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflowlite;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflowlite.global.tensorflowlite.*;


@Namespace("tflite::impl") @NoOffset @Properties(inherit = org.bytedeco.tensorflowlite.presets.tensorflowlite.class)
public class InterpreterBuilder extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public InterpreterBuilder(Pointer p) { super(p); }

  /** For this constructor, the ErrorReporter will be extracted from the
   *  FlatBufferModel.
   *  {@code options} object is copied during construction. So caller can release it */
  // after calling the constructor.
  public InterpreterBuilder(@Const @ByRef FlatBufferModel model,
                       @Const @ByRef OpResolver op_resolver,
                       @Const InterpreterOptions options_experimental/*=nullptr*/) { super((Pointer)null); allocate(model, op_resolver, options_experimental); }
  private native void allocate(@Const @ByRef FlatBufferModel model,
                       @Const @ByRef OpResolver op_resolver,
                       @Const InterpreterOptions options_experimental/*=nullptr*/);
  public InterpreterBuilder(@Const @ByRef FlatBufferModel model,
                       @Const @ByRef OpResolver op_resolver) { super((Pointer)null); allocate(model, op_resolver); }
  private native void allocate(@Const @ByRef FlatBufferModel model,
                       @Const @ByRef OpResolver op_resolver);
  /** Builds an interpreter given only the raw flatbuffer Model object (instead
   *  of a FlatBufferModel). Mostly used for testing.
   *  If {@code error_reporter} is null, then DefaultErrorReporter() is used.
   *  {@code options} object is copied during construction. So caller can release it */
  // after calling the constructor.
  public InterpreterBuilder(@Cast("const tflite::Model*") Pointer model,
                       @Const @ByRef OpResolver op_resolver,
                       ErrorReporter error_reporter/*=tflite::DefaultErrorReporter()*/,
                       @Const InterpreterOptions options_experimental/*=nullptr*/,
                       @Const Allocation allocation/*=nullptr*/) { super((Pointer)null); allocate(model, op_resolver, error_reporter, options_experimental, allocation); }
  private native void allocate(@Cast("const tflite::Model*") Pointer model,
                       @Const @ByRef OpResolver op_resolver,
                       ErrorReporter error_reporter/*=tflite::DefaultErrorReporter()*/,
                       @Const InterpreterOptions options_experimental/*=nullptr*/,
                       @Const Allocation allocation/*=nullptr*/);
  public InterpreterBuilder(@Cast("const tflite::Model*") Pointer model,
                       @Const @ByRef OpResolver op_resolver) { super((Pointer)null); allocate(model, op_resolver); }
  private native void allocate(@Cast("const tflite::Model*") Pointer model,
                       @Const @ByRef OpResolver op_resolver);
  
  

  /** Builds an interpreter and stores it in {@code *interpreter}.
   *  On success, returns kTfLiteOk and sets {@code *interpreter} to a valid
   *  Interpreter.
   *  On failure, returns an error status and sets {@code *interpreter} to nullptr. */
  public native @Cast("TfLiteStatus") @Name("operator ()") int apply(@UniquePtr Interpreter interpreter);

  /** Same as above, but also sets the number of CPU threads to use
   *  (overriding any previous call to SetNumThreads).
   *  Deprecated: use the SetNumThreads method instead. */
  public native @Cast("TfLiteStatus") @Name("operator ()") int apply(@UniquePtr Interpreter interpreter,
                            int num_threads);

  /** Sets the number of CPU threads to use for the interpreter.
   *  Returns kTfLiteOk on success, kTfLiteError on error. */
  public native @Cast("TfLiteStatus") int SetNumThreads(int num_threads);

  /** Any delegates added with AddDelegate will be applied to the Interpreter
   *  generated by operator(), in the order that they were added.  (The delegate
   *  parameter passed to AddDelegate should be non-null, otherwise an error
   *  will be reported, and the call to AddDelegate will have no other effect.)
   *  The lifetime of the delegate must be at least as long as the lifetime of
   *  any Interpreter generated by this InterpreterBuilder. */
  public native void AddDelegate(TfLiteDelegate delegate);
  public native void AddDelegate(TfLiteOpaqueDelegateStruct opaque_delegate);

  // Registers a telemetry profiler.
  // Transfers the ownership to the InterpreterOptions.
  // WARNING: This is an experimental API and subject to change.
  public native void SetTelemetryProfiler(
        @UniquePtr TelemetryProfiler profiler);
}

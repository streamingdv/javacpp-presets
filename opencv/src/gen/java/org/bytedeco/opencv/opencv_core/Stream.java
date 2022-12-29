// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;


//===================================================================================
// Stream
//===================================================================================

/** \brief This class encapsulates a queue of asynchronous calls.
<p>
\note Currently, you may face problems if an operation is enqueued twice with different data. Some
functions use the constant GPU memory, and next call may update the memory before the previous one
has been finished. But calling different operations asynchronously is safe because each operation
has its own constant buffer. Memory copy/upload/download/set operations to the buffers you hold are
also safe.
<p>
\note The Stream class is not thread-safe. Please use different Stream objects for different CPU threads.
<p>
<pre>{@code
void thread1()
{
    cv::cuda::Stream stream1;
    cv::cuda::func1(..., stream1);
}

void thread2()
{
    cv::cuda::Stream stream2;
    cv::cuda::func2(..., stream2);
}
}</pre>
<p>
\note By default all CUDA routines are launched in Stream::Null() object, if the stream is not specified by user.
In multi-threading environment the stream objects must be passed explicitly (see previous note).
 */
@Namespace("cv::cuda") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class Stream extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Stream(Pointer p) { super(p); }

    public static class StreamCallback extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    StreamCallback(Pointer p) { super(p); }
        protected StreamCallback() { allocate(); }
        private native void allocate();
        public native void call(int status, Pointer userData);
    }

    /** creates a new asynchronous stream */
    public Stream() { super((Pointer)null); allocate(); }
    private native void allocate();

    /** creates a new asynchronous stream with custom allocator */
    public Stream(@Ptr GpuMat.Allocator allocator) { super((Pointer)null); allocate(allocator); }
    private native void allocate(@Ptr GpuMat.Allocator allocator);

    /** \brief creates a new Stream using the cudaFlags argument to determine the behaviors of the stream
    <p>
    \note The cudaFlags parameter is passed to the underlying api cudaStreamCreateWithFlags() and
    supports the same parameter values.
    <pre>{@code
        // creates an OpenCV cuda::Stream that manages an asynchronous, non-blocking,
        // non-default CUDA stream
        cv::cuda::Stream cvStream(cudaStreamNonBlocking);
    }</pre>
     */
    public Stream(@Cast("const size_t") long cudaFlags) { super((Pointer)null); allocate(cudaFlags); }
    private native void allocate(@Cast("const size_t") long cudaFlags);

    /** \brief Returns true if the current stream queue is finished. Otherwise, it returns false.
    */
    public native @Cast("bool") boolean queryIfComplete();

    /** \brief Blocks the current CPU thread until all operations in the stream are complete.
    */
    public native void waitForCompletion();

    /** \brief Makes a compute stream wait on an event.
    */
    public native void waitEvent(@Const @ByRef Event event);

    /** \brief Adds a callback to be called on the host after all currently enqueued items in the stream have
    completed.
    <p>
    \note Callbacks must not make any CUDA API calls. Callbacks must not perform any synchronization
    that may depend on outstanding device work or other callbacks that are not mandated to run earlier.
    Callbacks without a mandated order (in independent streams) execute in undefined order and may be
    serialized.
     */
    public native void enqueueHostCallback(StreamCallback callback, Pointer userData);

    /** return Stream object for default CUDA stream */
    public static native @ByRef Stream Null();

    /** returns true if stream object is not default (!= 0) */
    

    /** return Pointer to CUDA stream */
    public native Pointer cudaPtr();

    @Opaque public static class Impl extends Pointer {
        /** Empty constructor. Calls {@code super((Pointer)null)}. */
        public Impl() { super((Pointer)null); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public Impl(Pointer p) { super(p); }
    }
}

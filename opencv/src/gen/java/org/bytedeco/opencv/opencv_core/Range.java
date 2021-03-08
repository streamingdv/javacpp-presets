// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;
 // namespace


//////////////////////////////// Range /////////////////////////////////

/** \brief Template class specifying a continuous subsequence (slice) of a sequence.
<p>
The class is used to specify a row or a column span in a matrix ( Mat ) and for many other purposes.
Range(a,b) is basically the same as a:b in Matlab or a..b in Python. As in Python, start is an
inclusive left boundary of the range and end is an exclusive right boundary of the range. Such a
half-opened interval is usually denoted as {@code [start,end)} .
<p>
The static method Range::all() returns a special variable that means "the whole sequence" or "the
whole range", just like " : " in Matlab or " ... " in Python. All the methods and functions in
OpenCV that take Range support this special Range::all() value. But, of course, in case of your own
custom processing, you will probably have to check and handle it explicitly:
<pre>{@code
    void my_function(..., const Range& r, ....)
    {
        if(r == Range::all()) {
            // process all the data
        }
        else {
            // process [r.start, r.end)
        }
    }
}</pre>
*/
@Namespace("cv") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class Range extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Range(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Range(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Range position(long position) {
        return (Range)super.position(position);
    }
    @Override public Range getPointer(long i) {
        return new Range((Pointer)this).position(position + i);
    }

    public Range() { super((Pointer)null); allocate(); }
    private native void allocate();
    public Range(int _start, int _end) { super((Pointer)null); allocate(_start, _end); }
    private native void allocate(int _start, int _end);
    public native int size();
    public native @Cast("bool") boolean empty();
    public static native @ByVal Range all();

    public native int start(); public native Range start(int setter);
    public native int end(); public native Range end(int setter);
}

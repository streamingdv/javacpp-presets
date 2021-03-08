// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;


/** \} */

/*********************************** Chain/Contour *************************************/

@Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class CvChain extends CvSeq {
    static { Loader.load(); }
    /** Default native constructor. */
    public CvChain() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CvChain(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvChain(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CvChain position(long position) {
        return (CvChain)super.position(position);
    }
    @Override public CvChain getPointer(long i) {
        return new CvChain((Pointer)this).position(position + i);
    }

    /** Miscellaneous flags.     */
    public native int flags(); public native CvChain flags(int setter);
    /** Size of sequence header. */
    public native int header_size(); public native CvChain header_size(int setter);
    /** Previous sequence.       */
    public native CvSeq h_prev(); public native CvChain h_prev(CvSeq setter);
    /** Next sequence.           */
    public native CvSeq h_next(); public native CvChain h_next(CvSeq setter);
    /** 2nd previous sequence.   */
    public native CvSeq v_prev(); public native CvChain v_prev(CvSeq setter);
    public native CvSeq v_next(); public native CvChain v_next(CvSeq setter);
    /** Total number of elements.            */
    public native int total(); public native CvChain total(int setter);
    /** Size of sequence element in bytes.   */
    public native int elem_size(); public native CvChain elem_size(int setter);
    /** Maximal bound of the last block.     */
    public native @Cast("schar*") BytePointer block_max(); public native CvChain block_max(BytePointer setter);
    /** Current write pointer.               */
    public native @Cast("schar*") BytePointer ptr(); public native CvChain ptr(BytePointer setter);
    /** Grow seq this many at a time.        */
    public native int delta_elems(); public native CvChain delta_elems(int setter);
    /** Where the seq is stored.             */
    public native CvMemStorage storage(); public native CvChain storage(CvMemStorage setter);
    /** Free blocks list.                    */
    public native CvSeqBlock free_blocks(); public native CvChain free_blocks(CvSeqBlock setter);
    /** Pointer to the first sequence block. */
    public native CvSeqBlock first(); public native CvChain first(CvSeqBlock setter);
    public native @ByRef CvPoint origin(); public native CvChain origin(CvPoint setter);
}

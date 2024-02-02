// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;


@Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class CvGraph extends AbstractCvGraph {
    static { Loader.load(); }
    /** Default native constructor. */
    public CvGraph() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CvGraph(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvGraph(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CvGraph position(long position) {
        return (CvGraph)super.position(position);
    }
    @Override public CvGraph getPointer(long i) {
        return new CvGraph((Pointer)this).offsetAddress(i);
    }

    /** Miscellaneous flags.     */
    public native int flags(); public native CvGraph flags(int setter);
    /** Size of sequence header. */
    public native int header_size(); public native CvGraph header_size(int setter);
    /** Previous sequence.       */
    public native CvSeq h_prev(); public native CvGraph h_prev(CvSeq setter);
    /** Next sequence.           */
    public native CvSeq h_next(); public native CvGraph h_next(CvSeq setter);
    /** 2nd previous sequence.   */
    public native CvSeq v_prev(); public native CvGraph v_prev(CvSeq setter);
    public native CvSeq v_next(); public native CvGraph v_next(CvSeq setter);
    /** Total number of elements.            */
    public native int total(); public native CvGraph total(int setter);
    /** Size of sequence element in bytes.   */
    public native int elem_size(); public native CvGraph elem_size(int setter);
    /** Maximal bound of the last block.     */
    public native @Cast("schar*") BytePointer block_max(); public native CvGraph block_max(BytePointer setter);
    /** Current write pointer.               */
    public native @Cast("schar*") BytePointer ptr(); public native CvGraph ptr(BytePointer setter);
    /** Grow seq this many at a time.        */
    public native int delta_elems(); public native CvGraph delta_elems(int setter);
    /** Where the seq is stored.             */
    public native CvMemStorage storage(); public native CvGraph storage(CvMemStorage setter);
    /** Free blocks list.                    */
    public native CvSeqBlock free_blocks(); public native CvGraph free_blocks(CvSeqBlock setter);
    /** Pointer to the first sequence block. */
    public native CvSeqBlock first(); public native CvGraph first(CvSeqBlock setter);
    public native CvSetElem free_elems(); public native CvGraph free_elems(CvSetElem setter);
    public native int active_count(); public native CvGraph active_count(int setter);
    public native CvSet edges(); public native CvGraph edges(CvSet setter);
}

// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;



/////////////////////////// multi-dimensional sparse matrix //////////////////////////

/** \brief The class SparseMat represents multi-dimensional sparse numerical arrays.
<p>
Such a sparse array can store elements of any type that Mat can store. *Sparse* means that only
non-zero elements are stored (though, as a result of operations on a sparse matrix, some of its
stored elements can actually become 0. It is up to you to detect such elements and delete them
using SparseMat::erase ). The non-zero elements are stored in a hash table that grows when it is
filled so that the search time is O(1) in average (regardless of whether element is there or not).
Elements can be accessed using the following methods:
-   Query operations (SparseMat::ptr and the higher-level SparseMat::ref, SparseMat::value and
    SparseMat::find), for example:
    <pre>{@code
        const int dims = 5;
        int size[5] = {10, 10, 10, 10, 10};
        SparseMat sparse_mat(dims, size, CV_32F);
        for(int i = 0; i < 1000; i++)
        {
            int idx[dims];
            for(int k = 0; k < dims; k++)
                idx[k] = rand() % size[k];
            sparse_mat.ref<float>(idx) += 1.f;
        }
        cout << "nnz = " << sparse_mat.nzcount() << endl;
    }</pre>
-   Sparse matrix iterators. They are similar to MatIterator but different from NAryMatIterator.
    That is, the iteration loop is familiar to STL users:
    <pre>{@code
        // prints elements of a sparse floating-point matrix
        // and the sum of elements.
        SparseMatConstIterator_<float>
            it = sparse_mat.begin<float>(),
            it_end = sparse_mat.end<float>();
        double s = 0;
        int dims = sparse_mat.dims();
        for(; it != it_end; ++it)
        {
            // print element indices and the element value
            const SparseMat::Node* n = it.node();
            printf("(");
            for(int i = 0; i < dims; i++)
                printf("%d%s", n->idx[i], i < dims-1 ? ", " : ")");
            printf(": %g\n", it.value<float>());
            s += *it;
        }
        printf("Element sum is %g\n", s);
    }</pre>
    If you run this loop, you will notice that elements are not enumerated in a logical order
    (lexicographical, and so on). They come in the same order as they are stored in the hash table
    (semi-randomly). You may collect pointers to the nodes and sort them to get the proper ordering.
    Note, however, that pointers to the nodes may become invalid when you add more elements to the
    matrix. This may happen due to possible buffer reallocation.
-   Combination of the above 2 methods when you need to process 2 or more sparse matrices
    simultaneously. For example, this is how you can compute unnormalized cross-correlation of the 2
    floating-point sparse matrices:
    <pre>{@code
        double cross_corr(const SparseMat& a, const SparseMat& b)
        {
            const SparseMat *_a = &a, *_b = &b;
            // if b contains less elements than a,
            // it is faster to iterate through b
            if(_a->nzcount() > _b->nzcount())
                std::swap(_a, _b);
            SparseMatConstIterator_<float> it = _a->begin<float>(),
                                           it_end = _a->end<float>();
            double ccorr = 0;
            for(; it != it_end; ++it)
            {
                // take the next element from the first matrix
                float avalue = *it;
                const Node* anode = it.node();
                // and try to find an element with the same index in the second matrix.
                // since the hash value depends only on the element index,
                // reuse the hash value stored in the node
                float bvalue = _b->value<float>(anode->idx,&anode->hashval);
                ccorr += avalue*bvalue;
            }
            return ccorr;
        }
    }</pre>
 */
@Namespace("cv") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class SparseMat extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SparseMat(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SparseMat(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public SparseMat position(long position) {
        return (SparseMat)super.position(position);
    }


    /** enum cv::SparseMat:: */
    public static final int MAGIC_VAL = 0x42FD0000, MAX_DIM = 32, HASH_SCALE = 0x5bd1e995, HASH_BIT = 0x80000000;

    /** the sparse matrix header */
    @NoOffset public static class Hdr extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public Hdr(Pointer p) { super(p); }
    
        public Hdr(int _dims, @Const IntPointer _sizes, int _type) { super((Pointer)null); allocate(_dims, _sizes, _type); }
        private native void allocate(int _dims, @Const IntPointer _sizes, int _type);
        public Hdr(int _dims, @Const IntBuffer _sizes, int _type) { super((Pointer)null); allocate(_dims, _sizes, _type); }
        private native void allocate(int _dims, @Const IntBuffer _sizes, int _type);
        public Hdr(int _dims, @Const int[] _sizes, int _type) { super((Pointer)null); allocate(_dims, _sizes, _type); }
        private native void allocate(int _dims, @Const int[] _sizes, int _type);
        public native void clear();
        public native int refcount(); public native Hdr refcount(int setter);
        public native int dims(); public native Hdr dims(int setter);
        public native int valueOffset(); public native Hdr valueOffset(int setter);
        public native @Cast("size_t") long nodeSize(); public native Hdr nodeSize(long setter);
        public native @Cast("size_t") long nodeCount(); public native Hdr nodeCount(long setter);
        public native @Cast("size_t") long freeList(); public native Hdr freeList(long setter);
        public native @Cast("uchar*") @StdVector BytePointer pool(); public native Hdr pool(BytePointer setter);
        public native @Cast("size_t*") @StdVector SizeTPointer hashtab(); public native Hdr hashtab(SizeTPointer setter);
        public native int size(int i); public native Hdr size(int i, int setter);
        @MemberGetter public native IntPointer size();
    }

    /** sparse matrix node - element of a hash table */
    public static class Node extends Pointer {
        static { Loader.load(); }
        /** Default native constructor. */
        public Node() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public Node(long size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public Node(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(long size);
        @Override public Node position(long position) {
            return (Node)super.position(position);
        }
    
        /** hash value */
        public native @Cast("size_t") long hashval(); public native Node hashval(long setter);
        /** index of the next node in the same hash table entry */
        public native @Cast("size_t") long next(); public native Node next(long setter);
        /** index of the matrix element */
        public native int idx(int i); public native Node idx(int i, int setter);
        @MemberGetter public native IntPointer idx();
    }

    /** \brief Various SparseMat constructors.
     */
    public SparseMat() { super((Pointer)null); allocate(); }
    private native void allocate();

    /** \overload
    @param dims Array dimensionality.
    @param _sizes Sparce matrix size on all dementions.
    @param _type Sparse matrix data type.
    */
    public SparseMat(int dims, @Const IntPointer _sizes, int _type) { super((Pointer)null); allocate(dims, _sizes, _type); }
    private native void allocate(int dims, @Const IntPointer _sizes, int _type);
    public SparseMat(int dims, @Const IntBuffer _sizes, int _type) { super((Pointer)null); allocate(dims, _sizes, _type); }
    private native void allocate(int dims, @Const IntBuffer _sizes, int _type);
    public SparseMat(int dims, @Const int[] _sizes, int _type) { super((Pointer)null); allocate(dims, _sizes, _type); }
    private native void allocate(int dims, @Const int[] _sizes, int _type);

    /** \overload
    @param m Source matrix for copy constructor. If m is dense matrix (ocvMat) then it will be converted
    to sparse representation.
    */
    public SparseMat(@Const @ByRef SparseMat m) { super((Pointer)null); allocate(m); }
    private native void allocate(@Const @ByRef SparseMat m);

    /** \overload
    @param m Source matrix for copy constructor. If m is dense matrix (ocvMat) then it will be converted
    to sparse representation.
    */
    public SparseMat(@Const @ByRef Mat m) { super((Pointer)null); allocate(m); }
    private native void allocate(@Const @ByRef Mat m);

    /** the destructor */

    /** assignment operator. This is O(1) operation, i.e. no data is copied */
    public native @ByRef @Name("operator =") SparseMat put(@Const @ByRef SparseMat m);
    /** equivalent to the corresponding constructor */
    public native @ByRef @Name("operator =") SparseMat put(@Const @ByRef Mat m);

    /** creates full copy of the matrix */
    public native @ByVal SparseMat clone();

    /** copies all the data to the destination matrix. All the previous content of m is erased */
    public native void copyTo( @ByRef SparseMat m );
    /** converts sparse matrix to dense matrix. */
    public native void copyTo( @ByRef Mat m );
    /** multiplies all the matrix elements by the specified scale factor alpha and converts the results to the specified data type */
    public native void convertTo( @ByRef SparseMat m, int rtype, double alpha/*=1*/ );
    public native void convertTo( @ByRef SparseMat m, int rtype );
    /** converts sparse matrix to dense n-dim matrix with optional type conversion and scaling.
    /**
        @param m [out] - output matrix; if it does not have a proper size or type before the operation,
            it is reallocated
        @param rtype [in] - desired output matrix type or, rather, the depth since the number of channels
            are the same as the input has; if rtype is negative, the output matrix will have the
            same type as the input.
        @param alpha [in] - optional scale factor
        @param beta [in] - optional delta added to the scaled values
    */
    public native void convertTo( @ByRef Mat m, int rtype, double alpha/*=1*/, double beta/*=0*/ );
    public native void convertTo( @ByRef Mat m, int rtype );

    // not used now
    public native void assignTo( @ByRef SparseMat m, int type/*=-1*/ );
    public native void assignTo( @ByRef SparseMat m );

    /** reallocates sparse matrix.
    /**
        If the matrix already had the proper size and type,
        it is simply cleared with clear(), otherwise,
        the old matrix is released (using release()) and the new one is allocated.
    */
    public native void create(int dims, @Const IntPointer _sizes, int _type);
    public native void create(int dims, @Const IntBuffer _sizes, int _type);
    public native void create(int dims, @Const int[] _sizes, int _type);
    /** sets all the sparse matrix elements to 0, which means clearing the hash table. */
    public native void clear();
    /** manually increments the reference counter to the header. */
    public native void addref();
    // decrements the header reference counter. When the counter reaches 0, the header and all the underlying data are deallocated.
    public native void release();

    /** converts sparse matrix to the old-style representation; all the elements are copied. */
    //operator CvSparseMat*() const;
    /** returns the size of each element in bytes (not including the overhead - the space occupied by SparseMat::Node elements) */
    public native @Cast("size_t") long elemSize();
    /** returns elemSize()/channels() */
    public native @Cast("size_t") long elemSize1();

    /** returns type of sparse matrix elements */
    public native int type();
    /** returns the depth of sparse matrix elements */
    public native int depth();
    /** returns the number of channels */
    public native int channels();

    /** returns the array of sizes, or NULL if the matrix is not allocated */
    public native @Const IntPointer size();
    /** returns the size of i-th matrix dimension (or 0) */
    public native int size(int i);
    /** returns the matrix dimensionality */
    public native int dims();
    /** returns the number of non-zero elements (=the number of hash table nodes) */
    public native @Cast("size_t") long nzcount();

    /** computes the element hash value (1D case) */
    public native @Cast("size_t") long hash(int i0);
    /** computes the element hash value (2D case) */
    public native @Cast("size_t") long hash(int i0, int i1);
    /** computes the element hash value (3D case) */
    public native @Cast("size_t") long hash(int i0, int i1, int i2);
    /** computes the element hash value (nD case) */
    public native @Cast("size_t") long hash(@Const IntPointer idx);
    public native @Cast("size_t") long hash(@Const IntBuffer idx);
    public native @Cast("size_t") long hash(@Const int[] idx);

    /**\{
    /**
     specialized variants for 1D, 2D, 3D cases and the generic_type one for n-D case.
     return pointer to the matrix element.
      - if the element is there (it's non-zero), the pointer to it is returned
      - if it's not there and createMissing=false, NULL pointer is returned
      - if it's not there and createMissing=true, then the new element
        is created and initialized with 0. Pointer to it is returned
      - if the optional hashval pointer is not NULL, the element hash value is
        not computed, but *hashval is taken instead.
    */
    /** returns pointer to the specified element (1D case) */
    public native @Cast("uchar*") BytePointer ptr(int i0, @Cast("bool") boolean createMissing, @Cast("size_t*") SizeTPointer hashval/*=0*/);
    public native @Cast("uchar*") BytePointer ptr(int i0, @Cast("bool") boolean createMissing);
    /** returns pointer to the specified element (2D case) */
    public native @Cast("uchar*") BytePointer ptr(int i0, int i1, @Cast("bool") boolean createMissing, @Cast("size_t*") SizeTPointer hashval/*=0*/);
    public native @Cast("uchar*") BytePointer ptr(int i0, int i1, @Cast("bool") boolean createMissing);
    /** returns pointer to the specified element (3D case) */
    public native @Cast("uchar*") BytePointer ptr(int i0, int i1, int i2, @Cast("bool") boolean createMissing, @Cast("size_t*") SizeTPointer hashval/*=0*/);
    public native @Cast("uchar*") BytePointer ptr(int i0, int i1, int i2, @Cast("bool") boolean createMissing);
    /** returns pointer to the specified element (nD case) */
    public native @Cast("uchar*") BytePointer ptr(@Const IntPointer idx, @Cast("bool") boolean createMissing, @Cast("size_t*") SizeTPointer hashval/*=0*/);
    public native @Cast("uchar*") BytePointer ptr(@Const IntPointer idx, @Cast("bool") boolean createMissing);
    public native @Cast("uchar*") ByteBuffer ptr(@Const IntBuffer idx, @Cast("bool") boolean createMissing, @Cast("size_t*") SizeTPointer hashval/*=0*/);
    public native @Cast("uchar*") ByteBuffer ptr(@Const IntBuffer idx, @Cast("bool") boolean createMissing);
    public native @Cast("uchar*") byte[] ptr(@Const int[] idx, @Cast("bool") boolean createMissing, @Cast("size_t*") SizeTPointer hashval/*=0*/);
    public native @Cast("uchar*") byte[] ptr(@Const int[] idx, @Cast("bool") boolean createMissing);
    /**\}
     <p>
     * \{
    /**
     return read-write reference to the specified sparse matrix element.
     <p>
     {@code ref<_Tp>(i0,...[,hashval])} is equivalent to {@code *(_Tp*)ptr(i0,...,true[,hashval])}.
     The methods always return a valid reference.
     If the element did not exist, it is created and initialized with 0.
    */
    /** returns reference to the specified element (1D case) */
    /** returns reference to the specified element (2D case) */
    /** returns reference to the specified element (3D case) */
    /** returns reference to the specified element (nD case) */
    /**\}
     <p>
     * \{
    /**
     return value of the specified sparse matrix element.
     <p>
     {@code value<_Tp>(i0,...[,hashval])} is equivalent to
     <pre>{@code
     { const _Tp* p = find<_Tp>(i0,...[,hashval]); return p ? *p : _Tp(); }
     }</pre>
     <p>
     That is, if the element did not exist, the methods return 0.
     */
    /** returns value of the specified element (1D case) */
    /** returns value of the specified element (2D case) */
    /** returns value of the specified element (3D case) */
    /** returns value of the specified element (nD case) */
    /**\}
     <p>
     * \{
    /**
     Return pointer to the specified sparse matrix element if it exists
     <p>
     {@code find<_Tp>(i0,...[,hashval])} is equivalent to {@code (_const Tp*)ptr(i0,...false[,hashval])}.
     <p>
     If the specified element does not exist, the methods return NULL.
    */
    /** returns pointer to the specified element (1D case) */
    /** returns pointer to the specified element (2D case) */
    /** returns pointer to the specified element (3D case) */
    /** returns pointer to the specified element (nD case) */
    /**\}
     <p>
     *  erases the specified element (2D case) */
    public native void erase(int i0, int i1, @Cast("size_t*") SizeTPointer hashval/*=0*/);
    public native void erase(int i0, int i1);
    /** erases the specified element (3D case) */
    public native void erase(int i0, int i1, int i2, @Cast("size_t*") SizeTPointer hashval/*=0*/);
    public native void erase(int i0, int i1, int i2);
    /** erases the specified element (nD case) */
    public native void erase(@Const IntPointer idx, @Cast("size_t*") SizeTPointer hashval/*=0*/);
    public native void erase(@Const IntPointer idx);
    public native void erase(@Const IntBuffer idx, @Cast("size_t*") SizeTPointer hashval/*=0*/);
    public native void erase(@Const IntBuffer idx);
    public native void erase(@Const int[] idx, @Cast("size_t*") SizeTPointer hashval/*=0*/);
    public native void erase(@Const int[] idx);

    /**\{
    /**
       return the sparse matrix iterator pointing to the first sparse matrix element
    */
    /** returns the sparse matrix iterator at the matrix beginning */
    public native @ByVal SparseMatIterator begin();
    /** returns the sparse matrix iterator at the matrix beginning */
    /** returns the read-only sparse matrix iterator at the matrix beginning */
    /** returns the read-only sparse matrix iterator at the matrix beginning */
    /**\}
    /**
       return the sparse matrix iterator pointing to the element following the last sparse matrix element
    */
    /** returns the sparse matrix iterator at the matrix end */
    public native @ByVal SparseMatIterator end();
    /** returns the read-only sparse matrix iterator at the matrix end */
    /** returns the typed sparse matrix iterator at the matrix end */
    /** returns the typed read-only sparse matrix iterator at the matrix end */

    /** returns the value stored in the sparse martix node */
    /** returns the value stored in the sparse martix node */

    ////////////// some internal-use methods ///////////////
    public native Node node(@Cast("size_t") long nidx);

    public native @Cast("uchar*") BytePointer newNode(@Const IntPointer idx, @Cast("size_t") long hashval);
    public native @Cast("uchar*") ByteBuffer newNode(@Const IntBuffer idx, @Cast("size_t") long hashval);
    public native @Cast("uchar*") byte[] newNode(@Const int[] idx, @Cast("size_t") long hashval);
    public native void removeNode(@Cast("size_t") long hidx, @Cast("size_t") long nidx, @Cast("size_t") long previdx);
    public native void resizeHashTab(@Cast("size_t") long newsize);

    public native int flags(); public native SparseMat flags(int setter);
    public native Hdr hdr(); public native SparseMat hdr(Hdr setter);
}

// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.LinearMath;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.bullet.global.LinearMath.*;

// #else
// #endif  //BT_USE_DOUBLE_PRECISION

// #if defined BT_USE_SSE

// #endif

// #ifdef BT_USE_NEON

// #endif

/**\brief btVector3 can be used to represent 3D points and vectors.
 * It has an un-used w component to suit 16-byte alignment when btVector3 is stored in containers. This extra component can be used by derived classes (Quaternion?) or by user
 * Ideally, this class should be replaced by a platform optimized SIMD version that keeps the data in registers
 */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.LinearMath.class)
public class btVector3 extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btVector3(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btVector3(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public btVector3 position(long position) {
        return (btVector3)super.position(position);
    }
    @Override public btVector3 getPointer(long i) {
        return new btVector3((Pointer)this).offsetAddress(i);
    }


// #if defined(__SPU__) && defined(__CELLOS_LV2__)
// #else                                            //__CELLOS_LV2__ __SPU__
// #if defined(BT_USE_SSE) || defined(BT_USE_NEON)  // _WIN32 || ARM
// #else
	public native @Cast("btScalar") double m_floats(int i); public native btVector3 m_floats(int i, double setter);
	@MemberGetter public native @Cast("btScalar*") DoublePointer m_floats();
	/**\brief No initialization constructor */
	public btVector3() { super((Pointer)null); allocate(); }
	private native void allocate();

	/**\brief Constructor from scalars 
   * @param x X value
   * @param y Y value 
   * @param z Z value 
   */
	public btVector3(@Cast("const btScalar") double _x, @Cast("const btScalar") double _y, @Cast("const btScalar") double _z) { super((Pointer)null); allocate(_x, _y, _z); }
	private native void allocate(@Cast("const btScalar") double _x, @Cast("const btScalar") double _y, @Cast("const btScalar") double _z);

// #if (defined(BT_USE_SSE_IN_API) && defined(BT_USE_SSE)) || defined(BT_USE_NEON)
// #endif  // #if defined (BT_USE_SSE_IN_API) || defined (BT_USE_NEON)

	/**\brief Add a vector to this one 
 * @param The vector to add to this one */
	public native @ByRef @Name("operator +=") btVector3 addPut(@Const @ByRef btVector3 v);

	/**\brief Subtract a vector from this one
   * @param The vector to subtract */
	public native @ByRef @Name("operator -=") btVector3 subtractPut(@Const @ByRef btVector3 v);

	/**\brief Scale the vector
   * @param s Scale factor */
	public native @ByRef @Name("operator *=") btVector3 multiplyPut(@Cast("const btScalar") double s);

	/**\brief Inversely scale the vector 
   * @param s Scale factor to divide by */
	public native @ByRef @Name("operator /=") btVector3 dividePut(@Cast("const btScalar") double s);

	/**\brief Return the dot product
   * @param v The other vector in the dot product */
	public native @Cast("btScalar") double dot(@Const @ByRef btVector3 v);

	/**\brief Return the length of the vector squared */
	public native @Cast("btScalar") double length2();

	/**\brief Return the length of the vector */
	public native @Cast("btScalar") double length();

	/**\brief Return the norm (length) of the vector */
	public native @Cast("btScalar") double norm();

	/**\brief Return the norm (length) of the vector */
	public native @Cast("btScalar") double safeNorm();

	/**\brief Return the distance squared between the ends of this and another vector
   * This is symantically treating the vector like a point */
	public native @Cast("btScalar") double distance2(@Const @ByRef btVector3 v);

	/**\brief Return the distance between the ends of this and another vector
   * This is symantically treating the vector like a point */
	public native @Cast("btScalar") double distance(@Const @ByRef btVector3 v);

	public native @ByRef btVector3 safeNormalize();

	/**\brief Normalize this vector 
   * x^2 + y^2 + z^2 = 1 */
	public native @ByRef btVector3 normalize();

	/**\brief Return a normalized version of this vector */
	public native @ByVal btVector3 normalized();

	/**\brief Return a rotated version of this vector
   * @param wAxis The axis to rotate about 
   * @param angle The angle to rotate by */
	public native @ByVal btVector3 rotate(@Const @ByRef btVector3 wAxis, @Cast("const btScalar") double angle);

	/**\brief Return the angle between this and another vector
   * @param v The other vector */
	public native @Cast("btScalar") double angle(@Const @ByRef btVector3 v);

	/**\brief Return a vector with the absolute values of each element */
	public native @ByVal btVector3 absolute();

	/**\brief Return the cross product between this and another vector 
   * @param v The other vector */
	public native @ByVal btVector3 cross(@Const @ByRef btVector3 v);

	public native @Cast("btScalar") double triple(@Const @ByRef btVector3 v1, @Const @ByRef btVector3 v2);

	/**\brief Return the axis with the smallest value 
   * Note return values are 0,1,2 for x, y, or z */
	public native int minAxis();

	/**\brief Return the axis with the largest value 
   * Note return values are 0,1,2 for x, y, or z */
	public native int maxAxis();

	public native int furthestAxis();

	public native int closestAxis();

	public native void setInterpolate3(@Const @ByRef btVector3 v0, @Const @ByRef btVector3 v1, @Cast("btScalar") double rt);

	/**\brief Return the linear interpolation between this and another vector 
   * @param v The other vector 
   * @param t The ration of this to v (t = 0 => return this, t=1 => return other) */
	public native @ByVal btVector3 lerp(@Const @ByRef btVector3 v, @Cast("const btScalar") double t);

	/**\brief Elementwise multiply this vector by the other 
   * @param v The other vector */
	public native @ByRef @Name("operator *=") btVector3 multiplyPut(@Const @ByRef btVector3 v);

	/**\brief Return the x value */
	public native @Cast("const btScalar") double getX();
	/**\brief Return the y value */
	public native @Cast("const btScalar") double getY();
	/**\brief Return the z value */
	public native @Cast("const btScalar") double getZ();
	/**\brief Set the x value */
	public native void setX(@Cast("btScalar") double _x);
	/**\brief Set the y value */
	public native void setY(@Cast("btScalar") double _y);
	/**\brief Set the z value */
	public native void setZ(@Cast("btScalar") double _z);
	/**\brief Set the w value */
	public native void setW(@Cast("btScalar") double _w);
	/**\brief Return the x value */
	public native @Cast("const btScalar") double x();
	/**\brief Return the y value */
	public native @Cast("const btScalar") double y();
	/**\brief Return the z value */
	public native @Cast("const btScalar") double z();
	/**\brief Return the w value */
	public native @Cast("const btScalar") double w();

	//SIMD_FORCE_INLINE btScalar&       operator[](int i)       { return (&m_floats[0])[i];	}
	//SIMD_FORCE_INLINE const btScalar& operator[](int i) const { return (&m_floats[0])[i]; }
	/**operator btScalar*() replaces operator[], using implicit conversion. We added operator != and operator == to avoid pointer comparisons. */
	public native @Cast("btScalar*") @Name("operator btScalar*") DoublePointer asDoublePointer();

	public native @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef btVector3 other);

	public native @Cast("bool") @Name("operator !=") boolean notEquals(@Const @ByRef btVector3 other);

	/**\brief Set each element to the max of the current values and the values of another btVector3
   * @param other The other btVector3 to compare with 
   */
	public native void setMax(@Const @ByRef btVector3 other);

	/**\brief Set each element to the min of the current values and the values of another btVector3
   * @param other The other btVector3 to compare with 
   */
	public native void setMin(@Const @ByRef btVector3 other);

	public native void setValue(@Cast("const btScalar") double _x, @Cast("const btScalar") double _y, @Cast("const btScalar") double _z);

	public native void getSkewSymmetricMatrix(btVector3 v0, btVector3 v1, btVector3 v2);

	public native void setZero();

	public native @Cast("bool") boolean isZero();

	public native @Cast("bool") boolean fuzzyZero();

	public native void serialize(@ByRef btVector3DoubleData dataOut);

	public native void deSerialize(@Const @ByRef btVector3DoubleData dataIn);

	public native void deSerialize(@Const @ByRef btVector3FloatData dataIn);

	public native void serializeFloat(@ByRef btVector3FloatData dataOut);

	public native void deSerializeFloat(@Const @ByRef btVector3FloatData dataIn);

	public native void serializeDouble(@ByRef btVector3DoubleData dataOut);

	public native void deSerializeDouble(@Const @ByRef btVector3DoubleData dataIn);

	/**\brief returns index of maximum dot product between this and vectors in array[]
         * @param array The other vectors 
         * @param array_count The number of other vectors 
         * @param dotOut The maximum dot product */
	public native long maxDot(@Const btVector3 array, long array_count, @Cast("btScalar*") @ByRef DoublePointer dotOut);
	public native long maxDot(@Const btVector3 array, long array_count, @Cast("btScalar*") @ByRef DoubleBuffer dotOut);
	public native long maxDot(@Const btVector3 array, long array_count, @Cast("btScalar*") @ByRef double[] dotOut);

	/**\brief returns index of minimum dot product between this and vectors in array[]
         * @param array The other vectors 
         * @param array_count The number of other vectors 
         * @param dotOut The minimum dot product */
	public native long minDot(@Const btVector3 array, long array_count, @Cast("btScalar*") @ByRef DoublePointer dotOut);
	public native long minDot(@Const btVector3 array, long array_count, @Cast("btScalar*") @ByRef DoubleBuffer dotOut);
	public native long minDot(@Const btVector3 array, long array_count, @Cast("btScalar*") @ByRef double[] dotOut);

	/* create a vector as  btVector3( this->dot( btVector3 v0 ), this->dot( btVector3 v1), this->dot( btVector3 v2 ))  */
	public native @ByVal btVector3 dot3(@Const @ByRef btVector3 v0, @Const @ByRef btVector3 v1, @Const @ByRef btVector3 v2);
}

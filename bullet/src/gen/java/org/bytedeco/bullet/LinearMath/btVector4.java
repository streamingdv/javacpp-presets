// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.LinearMath;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.bullet.global.LinearMath.*;


@Properties(inherit = org.bytedeco.bullet.presets.LinearMath.class)
public class btVector4 extends btVector3 {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btVector4(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btVector4(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public btVector4 position(long position) {
        return (btVector4)super.position(position);
    }
    @Override public btVector4 getPointer(long i) {
        return new btVector4((Pointer)this).offsetAddress(i);
    }

	public btVector4() { super((Pointer)null); allocate(); }
	private native void allocate();

	public btVector4(@Cast("const btScalar") double _x, @Cast("const btScalar") double _y, @Cast("const btScalar") double _z, @Cast("const btScalar") double _w) { super((Pointer)null); allocate(_x, _y, _z, _w); }
	private native void allocate(@Cast("const btScalar") double _x, @Cast("const btScalar") double _y, @Cast("const btScalar") double _z, @Cast("const btScalar") double _w);

// #if (defined(BT_USE_SSE_IN_API) && defined(BT_USE_SSE)) || defined(BT_USE_NEON)
// #endif  // #if defined (BT_USE_SSE_IN_API) || defined (BT_USE_NEON)

	public native @ByVal btVector4 absolute4();

	public native @Cast("btScalar") double getW();

	public native int maxAxis4();

	public native int minAxis4();

	public native int closestAxis4();

	/**\brief Set x,y,z and zero w 
   * @param x Value of x
   * @param y Value of y
   * @param z Value of z
   */

	/*		void getValue(btScalar *m) const 
		{
			m[0] = m_floats[0];
			m[1] = m_floats[1];
			m[2] =m_floats[2];
		}
*/
	/**\brief Set the values 
   * @param x Value of x
   * @param y Value of y
   * @param z Value of z
   * @param w Value of w
   */
	public native void setValue(@Cast("const btScalar") double _x, @Cast("const btScalar") double _y, @Cast("const btScalar") double _z, @Cast("const btScalar") double _w);
}

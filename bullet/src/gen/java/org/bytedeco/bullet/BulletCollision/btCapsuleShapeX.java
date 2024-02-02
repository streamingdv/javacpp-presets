// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


/**btCapsuleShapeX represents a capsule around the Z axis
 * the total height is height+2*radius, so the height is just the height between the center of each 'sphere' of the capsule caps. */
@Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btCapsuleShapeX extends btCapsuleShape {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btCapsuleShapeX(Pointer p) { super(p); }

	public btCapsuleShapeX(@Cast("btScalar") double radius, @Cast("btScalar") double height) { super((Pointer)null); allocate(radius, height); }
	private native void allocate(@Cast("btScalar") double radius, @Cast("btScalar") double height);

	//debugging
	public native @Cast("const char*") BytePointer getName();
}

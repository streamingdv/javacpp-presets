// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletDynamics;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;
import org.bytedeco.bullet.BulletCollision.*;
import static org.bytedeco.bullet.global.BulletCollision.*;

import static org.bytedeco.bullet.global.BulletDynamics.*;

// #else
// #endif  //BT_USE_DOUBLE_PRECISION

/** Generic 6 DOF constraint that allows to set spring motors to any translational and rotational DOF
 <p>
 *  DOF index used in enableSpring() and setStiffness() means:
 *  0 : translation X
 *  1 : translation Y
 *  2 : translation Z
 *  3 : rotation X (3rd Euler rotational around new position of X axis, range [-PI+epsilon, PI-epsilon] )
 *  4 : rotation Y (2nd Euler rotational around new position of Y axis, range [-PI/2+epsilon, PI/2-epsilon] )
 *  5 : rotation Z (1st Euler rotational around Z axis, range [-PI+epsilon, PI-epsilon] ) */

@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletDynamics.class)
public class btGeneric6DofSpringConstraint extends btGeneric6DofConstraint {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btGeneric6DofSpringConstraint(Pointer p) { super(p); }


	public btGeneric6DofSpringConstraint(@ByRef btRigidBody rbA, @ByRef btRigidBody rbB, @Const @ByRef btTransform frameInA, @Const @ByRef btTransform frameInB, @Cast("bool") boolean useLinearReferenceFrameA) { super((Pointer)null); allocate(rbA, rbB, frameInA, frameInB, useLinearReferenceFrameA); }
	private native void allocate(@ByRef btRigidBody rbA, @ByRef btRigidBody rbB, @Const @ByRef btTransform frameInA, @Const @ByRef btTransform frameInB, @Cast("bool") boolean useLinearReferenceFrameA);
	public btGeneric6DofSpringConstraint(@ByRef btRigidBody rbB, @Const @ByRef btTransform frameInB, @Cast("bool") boolean useLinearReferenceFrameB) { super((Pointer)null); allocate(rbB, frameInB, useLinearReferenceFrameB); }
	private native void allocate(@ByRef btRigidBody rbB, @Const @ByRef btTransform frameInB, @Cast("bool") boolean useLinearReferenceFrameB);
	public native void enableSpring(int index, @Cast("bool") boolean onOff);
	public native void setStiffness(int index, @Cast("btScalar") double stiffness);
	public native void setDamping(int index, @Cast("btScalar") double damping);
	public native void setEquilibriumPoint();           // set the current constraint position/orientation as an equilibrium point for all DOF
	public native void setEquilibriumPoint(int index);  // set the current constraint position/orientation as an equilibrium point for given DOF
	public native void setEquilibriumPoint(int index, @Cast("btScalar") double val);

	public native @Cast("bool") boolean isSpringEnabled(int index);

	public native @Cast("btScalar") double getStiffness(int index);

	public native @Cast("btScalar") double getDamping(int index);

	public native @Cast("btScalar") double getEquilibriumPoint(int index);

	public native void setAxis(@Const @ByRef btVector3 axis1, @Const @ByRef btVector3 axis2);

	public native void getInfo2(btConstraintInfo2 info);

	public native int calculateSerializeBufferSize();
	/**fills the dataBuffer and returns the struct name (and 0 on failure) */
	public native @Cast("const char*") BytePointer serialize(Pointer dataBuffer, btSerializer serializer);
}

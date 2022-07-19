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


@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletDynamics.class)
public class btTranslationalLimitMotor extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btTranslationalLimitMotor(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btTranslationalLimitMotor(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public btTranslationalLimitMotor position(long position) {
        return (btTranslationalLimitMotor)super.position(position);
    }
    @Override public btTranslationalLimitMotor getPointer(long i) {
        return new btTranslationalLimitMotor((Pointer)this).offsetAddress(i);
    }

	/** the constraint lower limits */
	public native @ByRef btVector3 m_lowerLimit(); public native btTranslationalLimitMotor m_lowerLimit(btVector3 setter);
	/** the constraint upper limits */
	public native @ByRef btVector3 m_upperLimit(); public native btTranslationalLimitMotor m_upperLimit(btVector3 setter);
	public native @ByRef btVector3 m_accumulatedImpulse(); public native btTranslationalLimitMotor m_accumulatedImpulse(btVector3 setter);
	/** Linear_Limit_parameters
	 * \{ */
	/** Softness for linear limit */
	public native @Cast("btScalar") double m_limitSoftness(); public native btTranslationalLimitMotor m_limitSoftness(double setter);
	/** Damping for linear limit */
	public native @Cast("btScalar") double m_damping(); public native btTranslationalLimitMotor m_damping(double setter);
	public native @Cast("btScalar") double m_restitution(); public native btTranslationalLimitMotor m_restitution(double setter);    /** Bounce parameter for linear limit */
	/** Constraint force mixing factor */
	public native @ByRef btVector3 m_normalCFM(); public native btTranslationalLimitMotor m_normalCFM(btVector3 setter);
	/** Error tolerance factor when joint is at limit */
	public native @ByRef btVector3 m_stopERP(); public native btTranslationalLimitMotor m_stopERP(btVector3 setter);
	/** Constraint force mixing factor when joint is at limit */
	public native @ByRef btVector3 m_stopCFM(); public native btTranslationalLimitMotor m_stopCFM(btVector3 setter);
							   /**\} */
	public native @Cast("bool") boolean m_enableMotor(int i); public native btTranslationalLimitMotor m_enableMotor(int i, boolean setter);
	@MemberGetter public native @Cast("bool*") BoolPointer m_enableMotor();
	/** target motor velocity */
	public native @ByRef btVector3 m_targetVelocity(); public native btTranslationalLimitMotor m_targetVelocity(btVector3 setter);
	/** max force on motor */
	public native @ByRef btVector3 m_maxMotorForce(); public native btTranslationalLimitMotor m_maxMotorForce(btVector3 setter);
	public native @ByRef btVector3 m_currentLimitError(); public native btTranslationalLimitMotor m_currentLimitError(btVector3 setter);  /**  How much is violated this limit */
	public native @ByRef btVector3 m_currentLinearDiff(); public native btTranslationalLimitMotor m_currentLinearDiff(btVector3 setter);  /**  Current relative offset of constraint frames */
	/** 0=free, 1=at lower limit, 2=at upper limit */
	public native int m_currentLimit(int i); public native btTranslationalLimitMotor m_currentLimit(int i, int setter);
	@MemberGetter public native IntPointer m_currentLimit();

	public btTranslationalLimitMotor() { super((Pointer)null); allocate(); }
	private native void allocate();

	public btTranslationalLimitMotor(@Const @ByRef btTranslationalLimitMotor other) { super((Pointer)null); allocate(other); }
	private native void allocate(@Const @ByRef btTranslationalLimitMotor other);

	/** Test limit
	/**
    - free means upper < lower,
    - locked means upper == lower
    - limited means upper > lower
    - limitIndex: first 3 are linear, next 3 are angular
    */
	public native @Cast("bool") boolean isLimited(int limitIndex);
	public native @Cast("bool") boolean needApplyForce(int limitIndex);
	public native int testLimitValue(int limitIndex, @Cast("btScalar") double test_value);

	public native @Cast("btScalar") double solveLinearAxis(
			@Cast("btScalar") double timeStep,
			@Cast("btScalar") double jacDiagABInv,
			@ByRef btRigidBody body1, @Const @ByRef btVector3 pointInA,
			@ByRef btRigidBody body2, @Const @ByRef btVector3 pointInB,
			int limit_index,
			@Const @ByRef btVector3 axis_normal_on_a,
			@Const @ByRef btVector3 anchorPos);
}

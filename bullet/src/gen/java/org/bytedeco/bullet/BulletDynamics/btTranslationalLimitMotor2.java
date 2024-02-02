// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

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
public class btTranslationalLimitMotor2 extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btTranslationalLimitMotor2(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btTranslationalLimitMotor2(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public btTranslationalLimitMotor2 position(long position) {
        return (btTranslationalLimitMotor2)super.position(position);
    }
    @Override public btTranslationalLimitMotor2 getPointer(long i) {
        return new btTranslationalLimitMotor2((Pointer)this).offsetAddress(i);
    }

	// upper < lower means free
	// upper == lower means locked
	// upper > lower means limited
	public native @ByRef btVector3 m_lowerLimit(); public native btTranslationalLimitMotor2 m_lowerLimit(btVector3 setter);
	public native @ByRef btVector3 m_upperLimit(); public native btTranslationalLimitMotor2 m_upperLimit(btVector3 setter);
	public native @ByRef btVector3 m_bounce(); public native btTranslationalLimitMotor2 m_bounce(btVector3 setter);
	public native @ByRef btVector3 m_stopERP(); public native btTranslationalLimitMotor2 m_stopERP(btVector3 setter);
	public native @ByRef btVector3 m_stopCFM(); public native btTranslationalLimitMotor2 m_stopCFM(btVector3 setter);
	public native @ByRef btVector3 m_motorERP(); public native btTranslationalLimitMotor2 m_motorERP(btVector3 setter);
	public native @ByRef btVector3 m_motorCFM(); public native btTranslationalLimitMotor2 m_motorCFM(btVector3 setter);
	public native @Cast("bool") boolean m_enableMotor(int i); public native btTranslationalLimitMotor2 m_enableMotor(int i, boolean setter);
	@MemberGetter public native @Cast("bool*") BoolPointer m_enableMotor();
	public native @Cast("bool") boolean m_servoMotor(int i); public native btTranslationalLimitMotor2 m_servoMotor(int i, boolean setter);
	@MemberGetter public native @Cast("bool*") BoolPointer m_servoMotor();
	public native @Cast("bool") boolean m_enableSpring(int i); public native btTranslationalLimitMotor2 m_enableSpring(int i, boolean setter);
	@MemberGetter public native @Cast("bool*") BoolPointer m_enableSpring();
	public native @ByRef btVector3 m_servoTarget(); public native btTranslationalLimitMotor2 m_servoTarget(btVector3 setter);
	public native @ByRef btVector3 m_springStiffness(); public native btTranslationalLimitMotor2 m_springStiffness(btVector3 setter);
	public native @Cast("bool") boolean m_springStiffnessLimited(int i); public native btTranslationalLimitMotor2 m_springStiffnessLimited(int i, boolean setter);
	@MemberGetter public native @Cast("bool*") BoolPointer m_springStiffnessLimited();
	public native @ByRef btVector3 m_springDamping(); public native btTranslationalLimitMotor2 m_springDamping(btVector3 setter);
	public native @Cast("bool") boolean m_springDampingLimited(int i); public native btTranslationalLimitMotor2 m_springDampingLimited(int i, boolean setter);
	@MemberGetter public native @Cast("bool*") BoolPointer m_springDampingLimited();
	public native @ByRef btVector3 m_equilibriumPoint(); public native btTranslationalLimitMotor2 m_equilibriumPoint(btVector3 setter);
	public native @ByRef btVector3 m_targetVelocity(); public native btTranslationalLimitMotor2 m_targetVelocity(btVector3 setter);
	public native @ByRef btVector3 m_maxMotorForce(); public native btTranslationalLimitMotor2 m_maxMotorForce(btVector3 setter);

	public native @ByRef btVector3 m_currentLimitError(); public native btTranslationalLimitMotor2 m_currentLimitError(btVector3 setter);
	public native @ByRef btVector3 m_currentLimitErrorHi(); public native btTranslationalLimitMotor2 m_currentLimitErrorHi(btVector3 setter);
	public native @ByRef btVector3 m_currentLinearDiff(); public native btTranslationalLimitMotor2 m_currentLinearDiff(btVector3 setter);
	public native int m_currentLimit(int i); public native btTranslationalLimitMotor2 m_currentLimit(int i, int setter);
	@MemberGetter public native IntPointer m_currentLimit();

	public btTranslationalLimitMotor2() { super((Pointer)null); allocate(); }
	private native void allocate();

	public btTranslationalLimitMotor2(@Const @ByRef btTranslationalLimitMotor2 other) { super((Pointer)null); allocate(other); }
	private native void allocate(@Const @ByRef btTranslationalLimitMotor2 other);

	public native @Cast("bool") boolean isLimited(int limitIndex);

	public native void testLimitValue(int limitIndex, @Cast("btScalar") double test_value);
}

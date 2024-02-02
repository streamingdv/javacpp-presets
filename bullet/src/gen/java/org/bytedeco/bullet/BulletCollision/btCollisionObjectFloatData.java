// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


/**do not change those serialization structures, it requires an updated sBulletDNAstr/sBulletDNAstr64 */
@Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btCollisionObjectFloatData extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public btCollisionObjectFloatData() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btCollisionObjectFloatData(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btCollisionObjectFloatData(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public btCollisionObjectFloatData position(long position) {
        return (btCollisionObjectFloatData)super.position(position);
    }
    @Override public btCollisionObjectFloatData getPointer(long i) {
        return new btCollisionObjectFloatData((Pointer)this).offsetAddress(i);
    }

	public native Pointer m_broadphaseHandle(); public native btCollisionObjectFloatData m_broadphaseHandle(Pointer setter);
	public native Pointer m_collisionShape(); public native btCollisionObjectFloatData m_collisionShape(Pointer setter);
	public native btCollisionShapeData m_rootCollisionShape(); public native btCollisionObjectFloatData m_rootCollisionShape(btCollisionShapeData setter);
	public native @Cast("char*") BytePointer m_name(); public native btCollisionObjectFloatData m_name(BytePointer setter);

	public native @ByRef btTransformFloatData m_worldTransform(); public native btCollisionObjectFloatData m_worldTransform(btTransformFloatData setter);
	public native @ByRef btTransformFloatData m_interpolationWorldTransform(); public native btCollisionObjectFloatData m_interpolationWorldTransform(btTransformFloatData setter);
	public native @ByRef btVector3FloatData m_interpolationLinearVelocity(); public native btCollisionObjectFloatData m_interpolationLinearVelocity(btVector3FloatData setter);
	public native @ByRef btVector3FloatData m_interpolationAngularVelocity(); public native btCollisionObjectFloatData m_interpolationAngularVelocity(btVector3FloatData setter);
	public native @ByRef btVector3FloatData m_anisotropicFriction(); public native btCollisionObjectFloatData m_anisotropicFriction(btVector3FloatData setter);
	public native float m_contactProcessingThreshold(); public native btCollisionObjectFloatData m_contactProcessingThreshold(float setter);	
	public native float m_deactivationTime(); public native btCollisionObjectFloatData m_deactivationTime(float setter);
	public native float m_friction(); public native btCollisionObjectFloatData m_friction(float setter);
	public native float m_rollingFriction(); public native btCollisionObjectFloatData m_rollingFriction(float setter);
	public native float m_contactDamping(); public native btCollisionObjectFloatData m_contactDamping(float setter);
    public native float m_contactStiffness(); public native btCollisionObjectFloatData m_contactStiffness(float setter);
	public native float m_restitution(); public native btCollisionObjectFloatData m_restitution(float setter);
	public native float m_hitFraction(); public native btCollisionObjectFloatData m_hitFraction(float setter); 
	public native float m_ccdSweptSphereRadius(); public native btCollisionObjectFloatData m_ccdSweptSphereRadius(float setter);
	public native float m_ccdMotionThreshold(); public native btCollisionObjectFloatData m_ccdMotionThreshold(float setter);
	public native int m_hasAnisotropicFriction(); public native btCollisionObjectFloatData m_hasAnisotropicFriction(int setter);
	public native int m_collisionFlags(); public native btCollisionObjectFloatData m_collisionFlags(int setter);
	public native int m_islandTag1(); public native btCollisionObjectFloatData m_islandTag1(int setter);
	public native int m_companionId(); public native btCollisionObjectFloatData m_companionId(int setter);
	public native int m_activationState1(); public native btCollisionObjectFloatData m_activationState1(int setter);
	public native int m_internalType(); public native btCollisionObjectFloatData m_internalType(int setter);
	public native int m_checkCollideWith(); public native btCollisionObjectFloatData m_checkCollideWith(int setter);
	public native int m_collisionFilterGroup(); public native btCollisionObjectFloatData m_collisionFilterGroup(int setter);
	public native int m_collisionFilterMask(); public native btCollisionObjectFloatData m_collisionFilterMask(int setter);
	public native int m_uniqueId(); public native btCollisionObjectFloatData m_uniqueId(int setter);
}

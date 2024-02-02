// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletSoftBody;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;
import org.bytedeco.bullet.BulletCollision.*;
import static org.bytedeco.bullet.global.BulletCollision.*;
import org.bytedeco.bullet.BulletDynamics.*;
import static org.bytedeco.bullet.global.BulletDynamics.*;

import static org.bytedeco.bullet.global.BulletSoftBody.*;


@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletSoftBody.class)
public class btDeformableMultiBodyDynamicsWorld extends btMultiBodyDynamicsWorld {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btDeformableMultiBodyDynamicsWorld(Pointer p) { super(p); }
 public static class btSolverCallback extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    btSolverCallback(Pointer p) { super(p); }
    protected btSolverCallback() { allocate(); }
    private native void allocate();
    public native void call(@Cast("btScalar") double time, btDeformableMultiBodyDynamicsWorld world);
}
	public btDeformableMultiBodyDynamicsWorld(btDispatcher dispatcher, btBroadphaseInterface pairCache, btDeformableMultiBodyConstraintSolver constraintSolver, btCollisionConfiguration collisionConfiguration, btDeformableBodySolver deformableBodySolver/*=0*/) { super((Pointer)null); allocate(dispatcher, pairCache, constraintSolver, collisionConfiguration, deformableBodySolver); }
	private native void allocate(btDispatcher dispatcher, btBroadphaseInterface pairCache, btDeformableMultiBodyConstraintSolver constraintSolver, btCollisionConfiguration collisionConfiguration, btDeformableBodySolver deformableBodySolver/*=0*/);
	public btDeformableMultiBodyDynamicsWorld(btDispatcher dispatcher, btBroadphaseInterface pairCache, btDeformableMultiBodyConstraintSolver constraintSolver, btCollisionConfiguration collisionConfiguration) { super((Pointer)null); allocate(dispatcher, pairCache, constraintSolver, collisionConfiguration); }
	private native void allocate(btDispatcher dispatcher, btBroadphaseInterface pairCache, btDeformableMultiBodyConstraintSolver constraintSolver, btCollisionConfiguration collisionConfiguration);

	public native int stepSimulation(@Cast("btScalar") double timeStep, int maxSubSteps/*=1*/, @Cast("btScalar") double fixedTimeStep/*=btScalar(1.) / btScalar(60.)*/);
	public native int stepSimulation(@Cast("btScalar") double timeStep);

	public native void debugDrawWorld();

	public native void setSolverCallback(btSolverCallback cb);

	public native btMultiBodyDynamicsWorld getMultiBodyDynamicsWorld();

	public native @Cast("btDynamicsWorldType") int getWorldType();

	public native void predictUnconstraintMotion(@Cast("btScalar") double timeStep);

	public native void addSoftBody(btSoftBody body, int collisionFilterGroup/*=btBroadphaseProxy::DefaultFilter*/, int collisionFilterMask/*=btBroadphaseProxy::AllFilter*/);
	public native void addSoftBody(btSoftBody body);

	public native @ByRef btSoftBodyArray getSoftBodyArray();

	public native @ByRef btSoftBodyWorldInfo getWorldInfo();

	public native void setGravity(@Const @ByRef btVector3 gravity);

	public native void reinitialize(@Cast("btScalar") double timeStep);

	public native void applyRigidBodyGravity(@Cast("btScalar") double timeStep);

	public native void beforeSolverCallbacks(@Cast("btScalar") double timeStep);

	public native void afterSolverCallbacks(@Cast("btScalar") double timeStep);

	public native void addForce(btSoftBody psb, btDeformableLagrangianForce force);

	public native void removeForce(btSoftBody psb, btDeformableLagrangianForce force);

	public native void removeSoftBodyForce(btSoftBody psb);

	public native void removeSoftBody(btSoftBody body);

	public native void removeCollisionObject(btCollisionObject collisionObject);

	public native int getDrawFlags();
	public native void setDrawFlags(int f);

	public native void setupConstraints();

	public native void performDeformableCollisionDetection();

	

	public native void solveContactConstraints();

	public native void sortConstraints();

	public native void softBodySelfCollision();

	public native void setImplicit(@Cast("bool") boolean implicit);

	public native void setLineSearch(@Cast("bool") boolean lineSearch);

	public native void setUseProjection(@Cast("bool") boolean useProjection);

	public native void applyRepulsionForce(@Cast("btScalar") double timeStep);

	public native void performGeometricCollisions(@Cast("btScalar") double timeStep);

	@NoOffset public static class btDeformableSingleRayCallback extends btBroadphaseRayCallback {
	    static { Loader.load(); }
	    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
	    public btDeformableSingleRayCallback(Pointer p) { super(p); }
	
		public native @ByRef btVector3 m_rayFromWorld(); public native btDeformableSingleRayCallback m_rayFromWorld(btVector3 setter);
		public native @ByRef btVector3 m_rayToWorld(); public native btDeformableSingleRayCallback m_rayToWorld(btVector3 setter);
		public native @ByRef btTransform m_rayFromTrans(); public native btDeformableSingleRayCallback m_rayFromTrans(btTransform setter);
		public native @ByRef btTransform m_rayToTrans(); public native btDeformableSingleRayCallback m_rayToTrans(btTransform setter);
		public native @ByRef btVector3 m_hitNormal(); public native btDeformableSingleRayCallback m_hitNormal(btVector3 setter);

		public native @Const btDeformableMultiBodyDynamicsWorld m_world(); public native btDeformableSingleRayCallback m_world(btDeformableMultiBodyDynamicsWorld setter);
		public native @ByRef btCollisionWorld.RayResultCallback m_resultCallback(); public native btDeformableSingleRayCallback m_resultCallback(btCollisionWorld.RayResultCallback setter);

		public btDeformableSingleRayCallback(@Const @ByRef btVector3 rayFromWorld, @Const @ByRef btVector3 rayToWorld, @Const btDeformableMultiBodyDynamicsWorld world, @ByRef btCollisionWorld.RayResultCallback resultCallback) { super((Pointer)null); allocate(rayFromWorld, rayToWorld, world, resultCallback); }
		private native void allocate(@Const @ByRef btVector3 rayFromWorld, @Const @ByRef btVector3 rayToWorld, @Const btDeformableMultiBodyDynamicsWorld world, @ByRef btCollisionWorld.RayResultCallback resultCallback);

		public native @Cast("bool") boolean process(@Const btBroadphaseProxy proxy);
	}

	public native void rayTest(@Const @ByRef btVector3 rayFromWorld, @Const @ByRef btVector3 rayToWorld, @ByRef RayResultCallback resultCallback);

	
}

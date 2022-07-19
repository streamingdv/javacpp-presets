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


/**The btSimpleDynamicsWorld serves as unit-test and to verify more complicated and optimized dynamics worlds.
 * Please use btDiscreteDynamicsWorld instead */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletDynamics.class)
public class btSimpleDynamicsWorld extends btDynamicsWorld {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btSimpleDynamicsWorld(Pointer p) { super(p); }

	/**this btSimpleDynamicsWorld constructor creates dispatcher, broadphase pairCache and constraintSolver */
	public btSimpleDynamicsWorld(btDispatcher dispatcher, btBroadphaseInterface pairCache, btConstraintSolver constraintSolver, btCollisionConfiguration collisionConfiguration) { super((Pointer)null); allocate(dispatcher, pairCache, constraintSolver, collisionConfiguration); }
	private native void allocate(btDispatcher dispatcher, btBroadphaseInterface pairCache, btConstraintSolver constraintSolver, btCollisionConfiguration collisionConfiguration);

	/**maxSubSteps/fixedTimeStep for interpolation is currently ignored for btSimpleDynamicsWorld, use btDiscreteDynamicsWorld instead */
	public native int stepSimulation(@Cast("btScalar") double timeStep, int maxSubSteps/*=1*/, @Cast("btScalar") double fixedTimeStep/*=btScalar(1.) / btScalar(60.)*/);
	public native int stepSimulation(@Cast("btScalar") double timeStep);

	public native void setGravity(@Const @ByRef btVector3 gravity);

	public native @ByVal btVector3 getGravity();

	public native void addRigidBody(btRigidBody body);

	public native void addRigidBody(btRigidBody body, int group, int mask);

	public native void removeRigidBody(btRigidBody body);

	public native void debugDrawWorld();

	public native void addAction(btActionInterface action);

	public native void removeAction(btActionInterface action);

	/**removeCollisionObject will first check if it is a rigid body, if so call removeRigidBody otherwise call btCollisionWorld::removeCollisionObject */
	public native void removeCollisionObject(btCollisionObject collisionObject);

	public native void updateAabbs();

	public native void synchronizeMotionStates();

	public native void setConstraintSolver(btConstraintSolver solver);

	public native btConstraintSolver getConstraintSolver();

	public native @Cast("btDynamicsWorldType") int getWorldType();

	public native void clearForces();
}

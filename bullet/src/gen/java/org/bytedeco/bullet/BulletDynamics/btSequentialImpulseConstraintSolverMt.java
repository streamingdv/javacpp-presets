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


/**
 *  btSequentialImpulseConstraintSolverMt
 * 
 *   A multithreaded variant of the sequential impulse constraint solver. The constraints to be solved are grouped into
 *   batches and phases where each batch of constraints within a given phase can be solved in parallel with the rest.
 *   Ideally we want as few phases as possible, and each phase should have many batches, and all of the batches should
 *   have about the same number of constraints.
 *   This method works best on a large island of many constraints.
 * 
 *   Supports all of the features of the normal sequential impulse solver such as:
 *     - split penetration impulse
 *     - rolling friction
 *     - interleaving constraints
 *     - warmstarting
 *     - 2 friction directions
 *     - randomized constraint ordering
 *     - early termination when leastSquaresResidualThreshold is satisfied
 * 
 *   When the SOLVER_INTERLEAVE_CONTACT_AND_FRICTION_CONSTRAINTS flag is enabled, unlike the normal SequentialImpulse solver,
 *   the rolling friction is interleaved as well.
 *   Interleaving the contact penetration constraints with friction reduces the number of parallel loops that need to be done,
 *   which reduces threading overhead so it can be a performance win, however, it does seem to produce a less stable simulation,
 *   at least on stacks of blocks.
 * 
 *   When the SOLVER_RANDMIZE_ORDER flag is enabled, the ordering of phases, and the ordering of constraints within each batch
 *   is randomized, however it does not swap constraints between batches.
 *   This is to avoid regenerating the batches for each solver iteration which would be quite costly in performance.
 * 
 *   Note that a non-zero leastSquaresResidualThreshold could possibly affect the determinism of the simulation
 *   if the task scheduler's parallelSum operation is non-deterministic. The parallelSum operation can be non-deterministic
 *   because floating point addition is not associative due to rounding errors.
 *   The task scheduler can and should ensure that the result of any parallelSum operation is deterministic.
 *  */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletDynamics.class)
public class btSequentialImpulseConstraintSolverMt extends btSequentialImpulseConstraintSolver {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btSequentialImpulseConstraintSolverMt(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btSequentialImpulseConstraintSolverMt(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public btSequentialImpulseConstraintSolverMt position(long position) {
        return (btSequentialImpulseConstraintSolverMt)super.position(position);
    }
    @Override public btSequentialImpulseConstraintSolverMt getPointer(long i) {
        return new btSequentialImpulseConstraintSolverMt((Pointer)this).offsetAddress(i);
    }

	public native void solveGroupCacheFriendlySplitImpulseIterations(@Cast("btCollisionObject**") PointerPointer bodies, int numBodies, @Cast("btPersistentManifold**") PointerPointer manifoldPtr, int numManifolds, @Cast("btTypedConstraint**") PointerPointer constraints, int numConstraints, @Const @ByRef btContactSolverInfo infoGlobal, btIDebugDraw debugDrawer);
	public native void solveGroupCacheFriendlySplitImpulseIterations(@ByPtrPtr btCollisionObject bodies, int numBodies, @ByPtrPtr btPersistentManifold manifoldPtr, int numManifolds, @ByPtrPtr btTypedConstraint constraints, int numConstraints, @Const @ByRef btContactSolverInfo infoGlobal, btIDebugDraw debugDrawer);
	public native @Cast("btScalar") double solveSingleIteration(int iteration, @Cast("btCollisionObject**") PointerPointer bodies, int numBodies, @Cast("btPersistentManifold**") PointerPointer manifoldPtr, int numManifolds, @Cast("btTypedConstraint**") PointerPointer constraints, int numConstraints, @Const @ByRef btContactSolverInfo infoGlobal, btIDebugDraw debugDrawer);
	public native @Cast("btScalar") double solveSingleIteration(int iteration, @ByPtrPtr btCollisionObject bodies, int numBodies, @ByPtrPtr btPersistentManifold manifoldPtr, int numManifolds, @ByPtrPtr btTypedConstraint constraints, int numConstraints, @Const @ByRef btContactSolverInfo infoGlobal, btIDebugDraw debugDrawer);
	public native @Cast("btScalar") double solveGroupCacheFriendlySetup(@Cast("btCollisionObject**") PointerPointer bodies, int numBodies, @Cast("btPersistentManifold**") PointerPointer manifoldPtr, int numManifolds, @Cast("btTypedConstraint**") PointerPointer constraints, int numConstraints, @Const @ByRef btContactSolverInfo infoGlobal, btIDebugDraw debugDrawer);
	public native @Cast("btScalar") double solveGroupCacheFriendlySetup(@ByPtrPtr btCollisionObject bodies, int numBodies, @ByPtrPtr btPersistentManifold manifoldPtr, int numManifolds, @ByPtrPtr btTypedConstraint constraints, int numConstraints, @Const @ByRef btContactSolverInfo infoGlobal, btIDebugDraw debugDrawer);
	public native @Cast("btScalar") double solveGroupCacheFriendlyFinish(@Cast("btCollisionObject**") PointerPointer bodies, int numBodies, @Const @ByRef btContactSolverInfo infoGlobal);
	public native @Cast("btScalar") double solveGroupCacheFriendlyFinish(@ByPtrPtr btCollisionObject bodies, int numBodies, @Const @ByRef btContactSolverInfo infoGlobal);

	// temp struct used to collect info from persistent manifolds into a cache-friendly struct using multiple threads
	public static class btContactManifoldCachedInfo extends Pointer {
	    static { Loader.load(); }
	    /** Default native constructor. */
	    public btContactManifoldCachedInfo() { super((Pointer)null); allocate(); }
	    /** Native array allocator. Access with {@link Pointer#position(long)}. */
	    public btContactManifoldCachedInfo(long size) { super((Pointer)null); allocateArray(size); }
	    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
	    public btContactManifoldCachedInfo(Pointer p) { super(p); }
	    private native void allocate();
	    private native void allocateArray(long size);
	    @Override public btContactManifoldCachedInfo position(long position) {
	        return (btContactManifoldCachedInfo)super.position(position);
	    }
	    @Override public btContactManifoldCachedInfo getPointer(long i) {
	        return new btContactManifoldCachedInfo((Pointer)this).offsetAddress(i);
	    }
	
		@MemberGetter public static native int MAX_NUM_CONTACT_POINTS();
		public static final int MAX_NUM_CONTACT_POINTS = MAX_NUM_CONTACT_POINTS();

		public native int numTouchingContacts(); public native btContactManifoldCachedInfo numTouchingContacts(int setter);
		public native int solverBodyIds(int i); public native btContactManifoldCachedInfo solverBodyIds(int i, int setter);
		@MemberGetter public native IntPointer solverBodyIds();
		public native int contactIndex(); public native btContactManifoldCachedInfo contactIndex(int setter);
		public native int rollingFrictionIndex(); public native btContactManifoldCachedInfo rollingFrictionIndex(int setter);
		public native @Cast("bool") boolean contactHasRollingFriction(int i); public native btContactManifoldCachedInfo contactHasRollingFriction(int i, boolean setter);
		@MemberGetter public native @Cast("bool*") BoolPointer contactHasRollingFriction();
		public native btManifoldPoint contactPoints(int i); public native btContactManifoldCachedInfo contactPoints(int i, btManifoldPoint setter);
		@MemberGetter public native @Cast("btManifoldPoint**") PointerPointer contactPoints();
	}
	// temp struct used for setting up joint constraints in parallel
	public static class JointParams extends Pointer {
	    static { Loader.load(); }
	    /** Default native constructor. */
	    public JointParams() { super((Pointer)null); allocate(); }
	    /** Native array allocator. Access with {@link Pointer#position(long)}. */
	    public JointParams(long size) { super((Pointer)null); allocateArray(size); }
	    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
	    public JointParams(Pointer p) { super(p); }
	    private native void allocate();
	    private native void allocateArray(long size);
	    @Override public JointParams position(long position) {
	        return (JointParams)super.position(position);
	    }
	    @Override public JointParams getPointer(long i) {
	        return new JointParams((Pointer)this).offsetAddress(i);
	    }
	
		public native int m_solverConstraint(); public native JointParams m_solverConstraint(int setter);
		public native int m_solverBodyA(); public native JointParams m_solverBodyA(int setter);
		public native int m_solverBodyB(); public native JointParams m_solverBodyB(int setter);
	}
	public native void internalInitMultipleJoints(@Cast("btTypedConstraint**") PointerPointer constraints, int iBegin, int iEnd);
	public native void internalInitMultipleJoints(@ByPtrPtr btTypedConstraint constraints, int iBegin, int iEnd);
	public native void internalConvertMultipleJoints(@Const @ByRef JointParamsArray jointParamsArray, @Cast("btTypedConstraint**") PointerPointer constraints, int iBegin, int iEnd, @Const @ByRef btContactSolverInfo infoGlobal);
	public native void internalConvertMultipleJoints(@Const @ByRef JointParamsArray jointParamsArray, @ByPtrPtr btTypedConstraint constraints, int iBegin, int iEnd, @Const @ByRef btContactSolverInfo infoGlobal);

	// parameters to control batching
	public static native @Cast("bool") boolean s_allowNestedParallelForLoops(); public static native void s_allowNestedParallelForLoops(boolean setter);        // whether to allow nested parallel operations
	public static native int s_minimumContactManifoldsForBatching(); public static native void s_minimumContactManifoldsForBatching(int setter);  // don't even try to batch if fewer manifolds than this
	public static native @Cast("btBatchedConstraints::BatchingMethod") int s_contactBatchingMethod(); public static native void s_contactBatchingMethod(int setter);
	public static native @Cast("btBatchedConstraints::BatchingMethod") int s_jointBatchingMethod(); public static native void s_jointBatchingMethod(int setter);
	public static native int s_minBatchSize(); public static native void s_minBatchSize(int setter);  // desired number of constraints per batch
	public static native int s_maxBatchSize(); public static native void s_maxBatchSize(int setter);

	public btSequentialImpulseConstraintSolverMt() { super((Pointer)null); allocate(); }
	private native void allocate();

	public native @Cast("btScalar") double resolveMultipleJointConstraints(@Const @ByRef btIntArray consIndices, int batchBegin, int batchEnd, int iteration);
	public native @Cast("btScalar") double resolveMultipleContactConstraints(@Const @ByRef btIntArray consIndices, int batchBegin, int batchEnd);
	public native @Cast("btScalar") double resolveMultipleContactSplitPenetrationImpulseConstraints(@Const @ByRef btIntArray consIndices, int batchBegin, int batchEnd);
	public native @Cast("btScalar") double resolveMultipleContactFrictionConstraints(@Const @ByRef btIntArray consIndices, int batchBegin, int batchEnd);
	public native @Cast("btScalar") double resolveMultipleContactRollingFrictionConstraints(@Const @ByRef btIntArray consIndices, int batchBegin, int batchEnd);
	public native @Cast("btScalar") double resolveMultipleContactConstraintsInterleaved(@Const @ByRef btIntArray contactIndices, int batchBegin, int batchEnd);

	public native void internalCollectContactManifoldCachedInfo(btContactManifoldCachedInfo cachedInfoArray, @Cast("btPersistentManifold**") PointerPointer manifoldPtr, int numManifolds, @Const @ByRef btContactSolverInfo infoGlobal);
	public native void internalCollectContactManifoldCachedInfo(btContactManifoldCachedInfo cachedInfoArray, @ByPtrPtr btPersistentManifold manifoldPtr, int numManifolds, @Const @ByRef btContactSolverInfo infoGlobal);
	public native void internalAllocContactConstraints(@Const btContactManifoldCachedInfo cachedInfoArray, int numManifolds);
	public native void internalSetupContactConstraints(int iContactConstraint, @Const @ByRef btContactSolverInfo infoGlobal);
	public native void internalConvertBodies(@Cast("btCollisionObject**") PointerPointer bodies, int iBegin, int iEnd, @Const @ByRef btContactSolverInfo infoGlobal);
	public native void internalConvertBodies(@ByPtrPtr btCollisionObject bodies, int iBegin, int iEnd, @Const @ByRef btContactSolverInfo infoGlobal);
	public native void internalWriteBackContacts(int iBegin, int iEnd, @Const @ByRef btContactSolverInfo infoGlobal);
	public native void internalWriteBackJoints(int iBegin, int iEnd, @Const @ByRef btContactSolverInfo infoGlobal);
	public native void internalWriteBackBodies(int iBegin, int iEnd, @Const @ByRef btContactSolverInfo infoGlobal);
}

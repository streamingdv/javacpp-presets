// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

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


//
// btSoftColliders
//
@Properties(inherit = org.bytedeco.bullet.presets.BulletSoftBody.class)
public class btSoftColliders extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public btSoftColliders() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btSoftColliders(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btSoftColliders(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public btSoftColliders position(long position) {
        return (btSoftColliders)super.position(position);
    }
    @Override public btSoftColliders getPointer(long i) {
        return new btSoftColliders((Pointer)this).offsetAddress(i);
    }

	//
	// ClusterBase
	//
	@NoOffset public static class ClusterBase extends btDbvt.ICollide {
	    static { Loader.load(); }
	    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
	    public ClusterBase(Pointer p) { super(p); }
	    /** Native array allocator. Access with {@link Pointer#position(long)}. */
	    public ClusterBase(long size) { super((Pointer)null); allocateArray(size); }
	    private native void allocateArray(long size);
	    @Override public ClusterBase position(long position) {
	        return (ClusterBase)super.position(position);
	    }
	    @Override public ClusterBase getPointer(long i) {
	        return new ClusterBase((Pointer)this).offsetAddress(i);
	    }
	
		public native @Cast("btScalar") double erp(); public native ClusterBase erp(double setter);
		public native @Cast("btScalar") double idt(); public native ClusterBase idt(double setter);
		public native @Cast("btScalar") double m_margin(); public native ClusterBase m_margin(double setter);
		public native @Cast("btScalar") double friction(); public native ClusterBase friction(double setter);
		public native @Cast("btScalar") double threshold(); public native ClusterBase threshold(double setter);
		public ClusterBase() { super((Pointer)null); allocate(); }
		private native void allocate();
		public native @Cast("bool") boolean SolveContact(@Const @ByRef btGjkEpaSolver2.sResults res,
								  @ByVal btSoftBody.Body ba, @Const @ByVal btSoftBody.Body bb,
								  @ByRef btSoftBody.CJoint joint);
	}
	//
	// CollideCL_RS
	//
	@NoOffset public static class CollideCL_RS extends ClusterBase {
	    static { Loader.load(); }
	    /** Default native constructor. */
	    public CollideCL_RS() { super((Pointer)null); allocate(); }
	    /** Native array allocator. Access with {@link Pointer#position(long)}. */
	    public CollideCL_RS(long size) { super((Pointer)null); allocateArray(size); }
	    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
	    public CollideCL_RS(Pointer p) { super(p); }
	    private native void allocate();
	    private native void allocateArray(long size);
	    @Override public CollideCL_RS position(long position) {
	        return (CollideCL_RS)super.position(position);
	    }
	    @Override public CollideCL_RS getPointer(long i) {
	        return new CollideCL_RS((Pointer)this).offsetAddress(i);
	    }
	
		public native btSoftBody psb(); public native CollideCL_RS psb(btSoftBody setter);
		public native @Const btCollisionObjectWrapper m_colObjWrap(); public native CollideCL_RS m_colObjWrap(btCollisionObjectWrapper setter);

		public native void Process(@Const btDbvtNode leaf);
		public native void ProcessColObj(btSoftBody ps, @Const btCollisionObjectWrapper colObWrap);
	}
	//
	// CollideCL_SS
	//
	@NoOffset public static class CollideCL_SS extends ClusterBase {
	    static { Loader.load(); }
	    /** Default native constructor. */
	    public CollideCL_SS() { super((Pointer)null); allocate(); }
	    /** Native array allocator. Access with {@link Pointer#position(long)}. */
	    public CollideCL_SS(long size) { super((Pointer)null); allocateArray(size); }
	    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
	    public CollideCL_SS(Pointer p) { super(p); }
	    private native void allocate();
	    private native void allocateArray(long size);
	    @Override public CollideCL_SS position(long position) {
	        return (CollideCL_SS)super.position(position);
	    }
	    @Override public CollideCL_SS getPointer(long i) {
	        return new CollideCL_SS((Pointer)this).offsetAddress(i);
	    }
	
		public native btSoftBody bodies(int i); public native CollideCL_SS bodies(int i, btSoftBody setter);
		@MemberGetter public native @Cast("btSoftBody**") PointerPointer bodies();
		public native void Process(@Const btDbvtNode la, @Const btDbvtNode lb);
		public native void ProcessSoftSoft(btSoftBody psa, btSoftBody psb);
	}
	//
	// CollideSDF_RS
	//
	@NoOffset public static class CollideSDF_RS extends btDbvt.ICollide {
	    static { Loader.load(); }
	    /** Default native constructor. */
	    public CollideSDF_RS() { super((Pointer)null); allocate(); }
	    /** Native array allocator. Access with {@link Pointer#position(long)}. */
	    public CollideSDF_RS(long size) { super((Pointer)null); allocateArray(size); }
	    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
	    public CollideSDF_RS(Pointer p) { super(p); }
	    private native void allocate();
	    private native void allocateArray(long size);
	    @Override public CollideSDF_RS position(long position) {
	        return (CollideSDF_RS)super.position(position);
	    }
	    @Override public CollideSDF_RS getPointer(long i) {
	        return new CollideSDF_RS((Pointer)this).offsetAddress(i);
	    }
	
		public native void Process(@Const btDbvtNode leaf);
		public native void DoNode(@ByRef btSoftBody.Node n);
		public native btSoftBody psb(); public native CollideSDF_RS psb(btSoftBody setter);
		public native @Const btCollisionObjectWrapper m_colObj1Wrap(); public native CollideSDF_RS m_colObj1Wrap(btCollisionObjectWrapper setter);
		public native btRigidBody m_rigidBody(); public native CollideSDF_RS m_rigidBody(btRigidBody setter);
		public native @Cast("btScalar") double dynmargin(); public native CollideSDF_RS dynmargin(double setter);
		public native @Cast("btScalar") double stamargin(); public native CollideSDF_RS stamargin(double setter);
	}

	//
	// CollideSDF_RD
	//
	@NoOffset public static class CollideSDF_RD extends btDbvt.ICollide {
	    static { Loader.load(); }
	    /** Default native constructor. */
	    public CollideSDF_RD() { super((Pointer)null); allocate(); }
	    /** Native array allocator. Access with {@link Pointer#position(long)}. */
	    public CollideSDF_RD(long size) { super((Pointer)null); allocateArray(size); }
	    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
	    public CollideSDF_RD(Pointer p) { super(p); }
	    private native void allocate();
	    private native void allocateArray(long size);
	    @Override public CollideSDF_RD position(long position) {
	        return (CollideSDF_RD)super.position(position);
	    }
	    @Override public CollideSDF_RD getPointer(long i) {
	        return new CollideSDF_RD((Pointer)this).offsetAddress(i);
	    }
	
		public native void Process(@Const btDbvtNode leaf);
		public native void DoNode(@ByRef btSoftBody.Node n);
		public native btSoftBody psb(); public native CollideSDF_RD psb(btSoftBody setter);
		public native @Const btCollisionObjectWrapper m_colObj1Wrap(); public native CollideSDF_RD m_colObj1Wrap(btCollisionObjectWrapper setter);
		public native btRigidBody m_rigidBody(); public native CollideSDF_RD m_rigidBody(btRigidBody setter);
		public native @Cast("btScalar") double dynmargin(); public native CollideSDF_RD dynmargin(double setter);
		public native @Cast("btScalar") double stamargin(); public native CollideSDF_RD stamargin(double setter);
	}

	//
	// CollideSDF_RDF
	//
	@NoOffset public static class CollideSDF_RDF extends btDbvt.ICollide {
	    static { Loader.load(); }
	    /** Default native constructor. */
	    public CollideSDF_RDF() { super((Pointer)null); allocate(); }
	    /** Native array allocator. Access with {@link Pointer#position(long)}. */
	    public CollideSDF_RDF(long size) { super((Pointer)null); allocateArray(size); }
	    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
	    public CollideSDF_RDF(Pointer p) { super(p); }
	    private native void allocate();
	    private native void allocateArray(long size);
	    @Override public CollideSDF_RDF position(long position) {
	        return (CollideSDF_RDF)super.position(position);
	    }
	    @Override public CollideSDF_RDF getPointer(long i) {
	        return new CollideSDF_RDF((Pointer)this).offsetAddress(i);
	    }
	
		public native void Process(@Const btDbvtNode leaf);
		public native void DoNode(@ByRef btSoftBody.Face f);
		public native btSoftBody psb(); public native CollideSDF_RDF psb(btSoftBody setter);
		public native @Const btCollisionObjectWrapper m_colObj1Wrap(); public native CollideSDF_RDF m_colObj1Wrap(btCollisionObjectWrapper setter);
		public native btRigidBody m_rigidBody(); public native CollideSDF_RDF m_rigidBody(btRigidBody setter);
		public native @Cast("btScalar") double dynmargin(); public native CollideSDF_RDF dynmargin(double setter);
		public native @Cast("btScalar") double stamargin(); public native CollideSDF_RDF stamargin(double setter);
	}

	//
	// CollideVF_SS
	//
	@NoOffset public static class CollideVF_SS extends btDbvt.ICollide {
	    static { Loader.load(); }
	    /** Default native constructor. */
	    public CollideVF_SS() { super((Pointer)null); allocate(); }
	    /** Native array allocator. Access with {@link Pointer#position(long)}. */
	    public CollideVF_SS(long size) { super((Pointer)null); allocateArray(size); }
	    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
	    public CollideVF_SS(Pointer p) { super(p); }
	    private native void allocate();
	    private native void allocateArray(long size);
	    @Override public CollideVF_SS position(long position) {
	        return (CollideVF_SS)super.position(position);
	    }
	    @Override public CollideVF_SS getPointer(long i) {
	        return new CollideVF_SS((Pointer)this).offsetAddress(i);
	    }
	
		public native void Process(@Const btDbvtNode lnode,
							 @Const btDbvtNode lface);
		public native btSoftBody psb(int i); public native CollideVF_SS psb(int i, btSoftBody setter);
		@MemberGetter public native @Cast("btSoftBody**") PointerPointer psb();
		public native @Cast("btScalar") double mrg(); public native CollideVF_SS mrg(double setter);
	}

	//
	// CollideVF_DD
	//
	@NoOffset public static class CollideVF_DD extends btDbvt.ICollide {
	    static { Loader.load(); }
	    /** Default native constructor. */
	    public CollideVF_DD() { super((Pointer)null); allocate(); }
	    /** Native array allocator. Access with {@link Pointer#position(long)}. */
	    public CollideVF_DD(long size) { super((Pointer)null); allocateArray(size); }
	    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
	    public CollideVF_DD(Pointer p) { super(p); }
	    private native void allocate();
	    private native void allocateArray(long size);
	    @Override public CollideVF_DD position(long position) {
	        return (CollideVF_DD)super.position(position);
	    }
	    @Override public CollideVF_DD getPointer(long i) {
	        return new CollideVF_DD((Pointer)this).offsetAddress(i);
	    }
	
		public native void Process(@Const btDbvtNode lnode,
							 @Const btDbvtNode lface);
		public native btSoftBody psb(int i); public native CollideVF_DD psb(int i, btSoftBody setter);
		@MemberGetter public native @Cast("btSoftBody**") PointerPointer psb();
		public native @Cast("btScalar") double mrg(); public native CollideVF_DD mrg(double setter);
		public native @Cast("bool") boolean useFaceNormal(); public native CollideVF_DD useFaceNormal(boolean setter);
	}

	//
	// CollideFF_DD
	//
	@NoOffset public static class CollideFF_DD extends btDbvt.ICollide {
	    static { Loader.load(); }
	    /** Default native constructor. */
	    public CollideFF_DD() { super((Pointer)null); allocate(); }
	    /** Native array allocator. Access with {@link Pointer#position(long)}. */
	    public CollideFF_DD(long size) { super((Pointer)null); allocateArray(size); }
	    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
	    public CollideFF_DD(Pointer p) { super(p); }
	    private native void allocate();
	    private native void allocateArray(long size);
	    @Override public CollideFF_DD position(long position) {
	        return (CollideFF_DD)super.position(position);
	    }
	    @Override public CollideFF_DD getPointer(long i) {
	        return new CollideFF_DD((Pointer)this).offsetAddress(i);
	    }
	
		public native void Process(@Const btDbvntNode lface1,
							 @Const btDbvntNode lface2);
		public native void Repel(btSoftBody.Face f1, btSoftBody.Face f2);
		public native btSoftBody psb(int i); public native CollideFF_DD psb(int i, btSoftBody setter);
		@MemberGetter public native @Cast("btSoftBody**") PointerPointer psb();
		public native @Cast("btScalar") double mrg(); public native CollideFF_DD mrg(double setter);
		public native @Cast("bool") boolean useFaceNormal(); public native CollideFF_DD useFaceNormal(boolean setter);
	}

	@NoOffset public static class CollideCCD extends btDbvt.ICollide {
	    static { Loader.load(); }
	    /** Default native constructor. */
	    public CollideCCD() { super((Pointer)null); allocate(); }
	    /** Native array allocator. Access with {@link Pointer#position(long)}. */
	    public CollideCCD(long size) { super((Pointer)null); allocateArray(size); }
	    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
	    public CollideCCD(Pointer p) { super(p); }
	    private native void allocate();
	    private native void allocateArray(long size);
	    @Override public CollideCCD position(long position) {
	        return (CollideCCD)super.position(position);
	    }
	    @Override public CollideCCD getPointer(long i) {
	        return new CollideCCD((Pointer)this).offsetAddress(i);
	    }
	
		public native void Process(@Const btDbvtNode lnode,
							 @Const btDbvtNode lface);
		public native void Process(@Const btDbvntNode lface1,
							 @Const btDbvntNode lface2);
		public native void Repel(btSoftBody.Face f1, btSoftBody.Face f2);
		public native btSoftBody psb(int i); public native CollideCCD psb(int i, btSoftBody setter);
		@MemberGetter public native @Cast("btSoftBody**") PointerPointer psb();
		public native @Cast("btScalar") double dt(); public native CollideCCD dt(double setter);
		public native @Cast("btScalar") double mrg(); public native CollideCCD mrg(double setter);
		public native @Cast("bool") boolean useFaceNormal(); public native CollideCCD useFaceNormal(boolean setter);
	}
}

// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


@Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btTriangleInfoMapData extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public btTriangleInfoMapData() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btTriangleInfoMapData(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btTriangleInfoMapData(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public btTriangleInfoMapData position(long position) {
        return (btTriangleInfoMapData)super.position(position);
    }
    @Override public btTriangleInfoMapData getPointer(long i) {
        return new btTriangleInfoMapData((Pointer)this).offsetAddress(i);
    }

	public native IntPointer m_hashTablePtr(); public native btTriangleInfoMapData m_hashTablePtr(IntPointer setter);
	public native IntPointer m_nextPtr(); public native btTriangleInfoMapData m_nextPtr(IntPointer setter);
	public native btTriangleInfoData m_valueArrayPtr(); public native btTriangleInfoMapData m_valueArrayPtr(btTriangleInfoData setter);
	public native IntPointer m_keyArrayPtr(); public native btTriangleInfoMapData m_keyArrayPtr(IntPointer setter);

	public native float m_convexEpsilon(); public native btTriangleInfoMapData m_convexEpsilon(float setter);
	public native float m_planarEpsilon(); public native btTriangleInfoMapData m_planarEpsilon(float setter);
	public native float m_equalVertexThreshold(); public native btTriangleInfoMapData m_equalVertexThreshold(float setter); 
	public native float m_edgeDistanceThreshold(); public native btTriangleInfoMapData m_edgeDistanceThreshold(float setter);
	public native float m_zeroAreaThreshold(); public native btTriangleInfoMapData m_zeroAreaThreshold(float setter);

	public native int m_nextSize(); public native btTriangleInfoMapData m_nextSize(int setter);
	public native int m_hashTableSize(); public native btTriangleInfoMapData m_hashTableSize(int setter);
	public native int m_numValues(); public native btTriangleInfoMapData m_numValues(int setter);
	public native int m_numKeys(); public native btTriangleInfoMapData m_numKeys(int setter);
	public native @Cast("char") byte m_padding(int i); public native btTriangleInfoMapData m_padding(int i, byte setter);
	@MemberGetter public native @Cast("char*") BytePointer m_padding();
}

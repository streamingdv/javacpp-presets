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


@Properties(inherit = org.bytedeco.bullet.presets.BulletSoftBody.class)
public class SoftBodyMaterialData extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public SoftBodyMaterialData() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SoftBodyMaterialData(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SoftBodyMaterialData(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public SoftBodyMaterialData position(long position) {
        return (SoftBodyMaterialData)super.position(position);
    }
    @Override public SoftBodyMaterialData getPointer(long i) {
        return new SoftBodyMaterialData((Pointer)this).offsetAddress(i);
    }

	public native float m_linearStiffness(); public native SoftBodyMaterialData m_linearStiffness(float setter);
	public native float m_angularStiffness(); public native SoftBodyMaterialData m_angularStiffness(float setter);
	public native float m_volumeStiffness(); public native SoftBodyMaterialData m_volumeStiffness(float setter);
	public native int m_flags(); public native SoftBodyMaterialData m_flags(int setter);
}

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


/** Type for the callback for each tick */
@Properties(inherit = org.bytedeco.bullet.presets.BulletDynamics.class)
public class btInternalTickCallback extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    btInternalTickCallback(Pointer p) { super(p); }
    protected btInternalTickCallback() { allocate(); }
    private native void allocate();
    public native void call(btDynamicsWorld world, @Cast("btScalar") double timeStep);
}

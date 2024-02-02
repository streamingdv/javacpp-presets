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
public class ContactEndedCallback extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    ContactEndedCallback(Pointer p) { super(p); }
    protected ContactEndedCallback() { allocate(); }
    private native void allocate();
    public native void call(@ByPtrRef btPersistentManifold manifold);
}

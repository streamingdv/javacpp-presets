// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.functions.*;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


// This abstract class contains only user-facing APIs, and will be shared
// between jit and distributed to implement TorchScript support.
@Namespace("c10") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class RRefInterface extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RRefInterface(Pointer p) { super(p); }

  // RRef is made NOT copyable NOT movable to prevent messing up reference
  // counting.
  
  
  

  // returns the worker id of the owner
  public native @Cast("c10::worker_id_t") short owner();

  // returns the worker name of the owner
  public native @StdString BytePointer ownerName();

  // Returns true if this is the ``OwnerRRef``
  public native @Cast("bool") boolean isOwner();

  // Returns true if this is an ``OwnerRRef`` or if this ``UserRRef`` has been
  // confirmed by its owner.
  public native @Cast("bool") boolean confirmedByOwner();

  public native @Const @ByVal Type.TypePtr type();
}

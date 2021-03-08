// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// Interface that provides resolution of device localities.
@Namespace("tensorflow") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class DeviceResolverInterface extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DeviceResolverInterface(Pointer p) { super(p); }


  // Collects DeviceAttributes protobufs from all of the devices identified
  // in 'col_params'.
  public native void GetAllDeviceAttributesAsync(
        @Const @ByRef StringVector devices, @Const @ByRef StringVector tasks,
        @StdVector DeviceAttributes attributes,
        @Cast("const tensorflow::StatusCallback*") @ByRef Pointer done);

  // Populate *attributes with the DeviceAttributes of the specified
  // device.
  public native void GetDeviceAttributesAsync(@StdString BytePointer device,
                                          @StdString BytePointer task,
                                          DeviceAttributes attributes,
                                          @Cast("const tensorflow::StatusCallback*") @ByRef Pointer done);
  public native void GetDeviceAttributesAsync(@StdString String device,
                                          @StdString String task,
                                          DeviceAttributes attributes,
                                          @Cast("const tensorflow::StatusCallback*") @ByRef Pointer done);

  // Clear the cache of device data belonging to the specified task.
  public native void ClearTask(@StdString BytePointer task);
  public native void ClearTask(@StdString String task);

  // Clear the cache of all device data.
  public native void ClearCache();
}

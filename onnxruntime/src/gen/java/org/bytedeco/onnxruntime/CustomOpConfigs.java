// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.onnxruntime;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;
import org.bytedeco.dnnl.*;
import static org.bytedeco.dnnl.global.dnnl.*;

import static org.bytedeco.onnxruntime.global.onnxruntime.*;
  // namespace detail

/** <summary>
 *  Class that represents session configuration entries for one or more custom operators.
 * 
 *  Example:
 *    Ort::CustomOpConfigs op_configs;
 *    op_configs.AddConfig("my_custom_op", "device_type", "CPU");
 * 
 *  Passed to Ort::SessionOptions::RegisterCustomOpsLibrary.
 *  </summary> */
@Namespace("Ort") @NoOffset @Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class CustomOpConfigs extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CustomOpConfigs(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CustomOpConfigs(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public CustomOpConfigs position(long position) {
        return (CustomOpConfigs)super.position(position);
    }
    @Override public CustomOpConfigs getPointer(long i) {
        return new CustomOpConfigs((Pointer)this).offsetAddress(i);
    }

  public CustomOpConfigs() { super((Pointer)null); allocate(); }
  private native void allocate();
  public CustomOpConfigs(@Const @ByRef CustomOpConfigs arg0) { super((Pointer)null); allocate(arg0); }
  private native void allocate(@Const @ByRef CustomOpConfigs arg0);
  public native @ByRef @Name("operator =") CustomOpConfigs put(@Const @ByRef CustomOpConfigs arg0);

  /** \brief Adds a session configuration entry/value for a specific custom operator.
   *
   * @param custom_op_name The name of the custom operator for which to add a configuration entry.
   *                       Must match the name returned by the CustomOp's GetName() method.
   * @param config_key The name of the configuration entry.
   * @param config_value The value of the configuration entry.
   * @return A reference to this object to enable call chaining.
   */
  public native @ByRef CustomOpConfigs AddConfig(@Cast("const char*") BytePointer custom_op_name, @Cast("const char*") BytePointer config_key, @Cast("const char*") BytePointer config_value);
  public native @ByRef CustomOpConfigs AddConfig(String custom_op_name, String config_key, String config_value);

  /** \brief Returns a flattened map of custom operator configuration entries and their values.
   *
   * The keys has been flattened to include both the custom operator name and the configuration entry key name.
   * For example, a prior call to AddConfig("my_op", "key", "value") corresponds to the flattened key/value pair
   * {"my_op.key", "value"}.
   *
   * @return An unordered map of flattened configurations.
   */
  public native @Const @ByRef StringStringMap GetFlattenedConfigs();
}

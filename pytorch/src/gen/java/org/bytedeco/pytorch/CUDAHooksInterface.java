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

// #endif

// The CUDAHooksInterface is an omnibus interface for any CUDA functionality
// which we may want to call into from CPU code (and thus must be dynamically
// dispatched, to allow for separate compilation of CUDA code).  How do I
// decide if a function should live in this class?  There are two tests:
//
//  1. Does the *implementation* of this function require linking against
//     CUDA libraries?
//
//  2. Is this function *called* from non-CUDA ATen code?
//
// (2) should filter out many ostensible use-cases, since many times a CUDA
// function provided by ATen is only really ever used by actual CUDA code.
//
// TODO: Consider putting the stub definitions in another class, so that one
// never forgets to implement each virtual function in the real implementation
// in CUDAHooks.  This probably doesn't buy us much though.
@Namespace("at") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class CUDAHooksInterface extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUDAHooksInterface() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUDAHooksInterface(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUDAHooksInterface(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUDAHooksInterface position(long position) {
        return (CUDAHooksInterface)super.position(position);
    }
    @Override public CUDAHooksInterface getPointer(long i) {
        return new CUDAHooksInterface((Pointer)this).offsetAddress(i);
    }

  // This should never actually be implemented, but it is used to
  // squelch -Werror=non-virtual-dtor

  // Initialize THCState and, transitively, the CUDA state
  public native void initCUDA();

  public native @Const @ByRef Generator getDefaultCUDAGenerator(@Cast("c10::DeviceIndex") byte device_index/*=-1*/);
  public native @Const @ByRef Generator getDefaultCUDAGenerator();

  public native @ByVal Device getDeviceFromPtr(Pointer arg0);

  public native @Cast("bool") boolean isPinnedPtr(@Const Pointer arg0);

  public native @Cast("bool") boolean hasCUDA();

  public native @Cast("bool") boolean hasCUDART();

  public native @Cast("bool") boolean hasMAGMA();

  public native @Cast("bool") boolean hasCuDNN();

  public native @Cast("bool") boolean hasCuSOLVER();

  public native @Cast("bool") boolean hasROCM();

  public native @Cast("const at::cuda::NVRTC*") @ByRef Pointer nvrtc();

  public native @Cast("bool") boolean hasPrimaryContext(@Cast("c10::DeviceIndex") byte device_index);

  public native @Cast("c10::DeviceIndex") byte current_device();

  public native Allocator getPinnedMemoryAllocator();

  public native Allocator getCUDADeviceAllocator();

  public native @Cast("bool") boolean compiledWithCuDNN();

  public native @Cast("bool") boolean compiledWithMIOpen();

  public native @Cast("bool") boolean supportsDilatedConvolutionWithCuDNN();

  public native @Cast("bool") boolean supportsDepthwiseConvolutionWithCuDNN();

  public native @Cast("bool") boolean supportsBFloat16ConvolutionWithCuDNNv8();

  public native long versionCuDNN();

  public native long versionCUDART();

  public native @StdString BytePointer showConfig();

  public native double batchnormMinEpsilonCuDNN();

  public native @Cast("int64_t") long cuFFTGetPlanCacheMaxSize(@Cast("c10::DeviceIndex") byte arg0);

  public native void cuFFTSetPlanCacheMaxSize(@Cast("c10::DeviceIndex") byte arg0, @Cast("int64_t") long arg1);

  public native @Cast("int64_t") long cuFFTGetPlanCacheSize(@Cast("c10::DeviceIndex") byte arg0);

  public native void cuFFTClearPlanCache(@Cast("c10::DeviceIndex") byte arg0);

  public native int getNumGPUs();

  public native void deviceSynchronize(@Cast("c10::DeviceIndex") byte arg0);
}

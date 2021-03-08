// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.ngraph;

import org.bytedeco.ngraph.Allocator;
import org.bytedeco.ngraph.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.ngraph.global.ngraph.*;

        // Describes an output tensor of an op
        @Namespace("ngraph::descriptor") @NoOffset @Properties(inherit = org.bytedeco.ngraph.presets.ngraph.class)
public class Output extends Pointer {
            static { Loader.load(); }
            /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
            public Output(Pointer p) { super(p); }
        
            /** @param node Node that owns this output.
             *  @param index Position of the output tensor in all output tensors
             *  @param tensor The tensor where the value will be written */
            public Output(Node node, @Cast("size_t") long index, @Const @SharedPtr @ByRef DescriptorTensor tensor) { super((Pointer)null); allocate(node, index, tensor); }
            private native void allocate(Node node, @Cast("size_t") long index, @Const @SharedPtr @ByRef DescriptorTensor tensor);

            public native @SharedPtr @ByVal Node get_node();
            public native @Cast("size_t") long get_index();
            public native @SharedPtr @ByVal DescriptorTensor get_tensor_ptr();
            public native void set_tensor_ptr(@Const @SharedPtr @ByRef DescriptorTensor tensor);
            public native void add_input(Input input);
            public native void remove_input(Input input);
            public native @Const @ByRef DescriptorInputVector get_inputs();
            public native @ByRef DescriptorTensor get_tensor();

            /** @return the shape of the output */
            public native @Const @ByRef Shape get_shape();

            /** @return the partial shape of the output */
            public native @Const @ByRef PartialShape get_partial_shape();

            /** @return the element type of the output */
            public native @Const @ByRef Type get_element_type();
        }

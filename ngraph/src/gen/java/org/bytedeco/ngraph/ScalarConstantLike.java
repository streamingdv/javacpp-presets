// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.ngraph;

import org.bytedeco.ngraph.Allocator;
import org.bytedeco.ngraph.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.ngraph.global.ngraph.*;


        /** \brief A scalar constant whose element type is the same as like. */
        @Namespace("ngraph::op") @NoOffset @Properties(inherit = org.bytedeco.ngraph.presets.ngraph.class)
public class ScalarConstantLike extends ScalarConstantLikeBase {
            static { Loader.load(); }
            /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
            public ScalarConstantLike(Pointer p) { super(p); }
        
            /** \brief A scalar constant whose element type is the same as like.
             * 
             *  Once the element type is known, the dependency on like will be removed and
             *  this node will be replaced with an equivalent constant.
             * 
             *  @param like A tensor that will supply the element type.
             *  @param value The value of the scalar. */

            public native @SharedPtr @ByVal Node copy_with_new_args(@Const @ByRef NodeVector new_args);
        }

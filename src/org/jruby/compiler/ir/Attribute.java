package org.jruby.compiler.ir;

// Attribute represents some fact discovered during dataflow analysis.
//
// The attribute makes explicit the dataflow value which is normally stored and
// carried around in external tables.  This lets us capture path-specific information
// for a variable.  For example, the type of a variable can be different along two
// different paths.  By adding an attribute along each path, we convert the path-specific
// state into a path-independent state constant which lets us analyze this via standard
// constant propagation algorithms like SCCP
//
// Example: v = BOXED_FIXNUM(n)
//          v = HAS_TPE(Fixnum)
//
public class Attribute extends Operand
{
    Operand        _target;    // The operand that this attribute targets
    AttributeValue _val;       // Attribute value
}

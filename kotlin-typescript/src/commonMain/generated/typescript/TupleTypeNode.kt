// Automatically generated - do not modify!

package typescript

sealed external interface TupleTypeNode :
    TypeNode,
    TypeReferenceNodeField {
    override val kind: SyntaxKind.TupleType
    val elements: NodeArray<TupleTypeNodeElementsItem>
}

// Automatically generated - do not modify!

package typescript

sealed external interface ImportClause :
    NamedDeclaration,
    TypeOnlyCompatibleAliasDeclaration {
    override val kind: SyntaxKind.ImportClause
    override val parent: ImportClauseParent
    val isTypeOnly: Boolean
    override val name: Identifier?
    val namedBindings: NamedImportBindings?
}

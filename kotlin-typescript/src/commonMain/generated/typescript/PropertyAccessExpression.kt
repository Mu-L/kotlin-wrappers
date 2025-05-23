// Automatically generated - do not modify!

package typescript

sealed external interface PropertyAccessExpression :
    MemberExpression,
    NamedDeclaration,
    JSDocContainer,
    FlowContainer,
    HasJSDoc,
    BindingOrAssignmentElementTarget,
    AccessExpression,
    IsPropertyAccessOrQualifiedNameResultPredicate {
    override val kind: SyntaxKind.PropertyAccessExpression
    val expression: LeftHandSideExpression
    val questionDotToken: QuestionDotToken?
    override val name: MemberName
}

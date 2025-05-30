// Automatically generated - do not modify!

package typescript

sealed external interface TypeChecker {
    fun getTypeOfSymbolAtLocation(
        symbol: Symbol,
        node: Node,
    ): Type

    fun getTypeOfSymbol(symbol: Symbol): Type

    fun getDeclaredTypeOfSymbol(symbol: Symbol): Type

    fun getPropertiesOfType(type: Type): js.array.ReadonlyArray<Symbol>

    fun getPropertyOfType(
        type: Type,
        propertyName: String,
    ): Symbol?

    fun getPrivateIdentifierPropertyOfType(
        leftType: Type,
        name: String,
        location: Node,
    ): Symbol?

    fun getIndexInfoOfType(
        type: Type,
        kind: IndexKind,
    ): IndexInfo?

    fun getIndexInfosOfType(type: Type): js.array.ReadonlyArray<IndexInfo>

    var getIndexInfosOfIndexSymbol:
                (
        indexSymbol: Symbol,
        siblingSymbols: js.array.ReadonlyArray<Symbol>?, // use undefined for default
    ) -> js.array.ReadonlyArray<IndexInfo>

    fun getSignaturesOfType(
        type: Type,
        kind: SignatureKind,
    ): js.array.ReadonlyArray<Signature>

    fun getIndexTypeOfType(
        type: Type,
        kind: IndexKind,
    ): Type?

    fun getBaseTypes(type: InterfaceType): js.array.ReadonlyArray<BaseType>

    fun getBaseTypeOfLiteralType(type: Type): Type

    fun getWidenedType(type: Type): Type

    /**
     * Gets the "awaited type" of a type.
     *
     * If an expression has a Promise-like type, the "awaited type" of the expression is
     * derived from the type of the first argument of the fulfillment callback for that
     * Promise's `then` method. If the "awaited type" is itself a Promise-like, it is
     * recursively unwrapped in the same manner until a non-promise type is found.
     *
     * If an expression does not have a Promise-like type, its "awaited type" is the type
     * of the expression.
     *
     * If the resulting "awaited type" is a generic object type, then it is wrapped in
     * an `Awaited<T>`.
     *
     * In the event the "awaited type" circularly references itself, or is a non-Promise
     * object-type with a callable `then()` method, an "awaited type" cannot be determined
     * and the value `undefined` will be returned.
     *
     * This is used to reflect the runtime behavior of the `await` keyword.
     */
    fun getAwaitedType(type: Type): Type?

    fun getReturnTypeOfSignature(signature: Signature): Type

    fun getNullableType(
        type: Type,
        flags: TypeFlags,
    ): Type

    fun getNonNullableType(type: Type): Type

    fun getTypeArguments(type: TypeReference): js.array.ReadonlyArray<Type>

    /** Note that the resulting nodes cannot be checked. */
    fun typeToTypeNode(
        type: Type,
        enclosingDeclaration: Node?,
        flags: NodeBuilderFlags?,
    ): TypeNode?

    /** Note that the resulting nodes cannot be checked. */
    fun signatureToSignatureDeclaration(
        signature: Signature,
        kind: SyntaxKind,
        enclosingDeclaration: Node?,
        flags: NodeBuilderFlags?,
    ): (TypeCheckerSignatureToSignatureDeclarationResult)?

    /** Note that the resulting nodes cannot be checked. */
    fun indexInfoToIndexSignatureDeclaration(
        indexInfo: IndexInfo,
        enclosingDeclaration: Node?,
        flags: NodeBuilderFlags?,
    ): IndexSignatureDeclaration?

    /** Note that the resulting nodes cannot be checked. */
    fun symbolToEntityName(
        symbol: Symbol,
        meaning: SymbolFlags,
        enclosingDeclaration: Node?,
        flags: NodeBuilderFlags?,
    ): EntityName?

    /** Note that the resulting nodes cannot be checked. */
    fun symbolToExpression(
        symbol: Symbol,
        meaning: SymbolFlags,
        enclosingDeclaration: Node?,
        flags: NodeBuilderFlags?,
    ): Expression?

    /** Note that the resulting nodes cannot be checked. */
    fun symbolToTypeParameterDeclarations(
        symbol: Symbol,
        enclosingDeclaration: Node?,
        flags: NodeBuilderFlags?,
    ): NodeArray<TypeParameterDeclaration>?

    /** Note that the resulting nodes cannot be checked. */
    fun symbolToParameterDeclaration(
        symbol: Symbol,
        enclosingDeclaration: Node?,
        flags: NodeBuilderFlags?,
    ): ParameterDeclaration?

    /** Note that the resulting nodes cannot be checked. */
    fun typeParameterToDeclaration(
        parameter: TypeParameter,
        enclosingDeclaration: Node?,
        flags: NodeBuilderFlags?,
    ): TypeParameterDeclaration?

    fun getSymbolsInScope(
        location: Node,
        meaning: SymbolFlags,
    ): js.array.ReadonlyArray<Symbol>

    fun getSymbolAtLocation(node: Node): Symbol?

    fun getSymbolsOfParameterPropertyDeclaration(
        parameter: ParameterDeclaration,
        parameterName: String,
    ): js.array.ReadonlyArray<Symbol>

    /**
     * The function returns the value (local variable) symbol of an identifier in the short-hand property assignment.
     * This is necessary as an identifier in short-hand property assignment can contains two meaning: property name and property value.
     */
    fun getShorthandAssignmentValueSymbol(location: Node?): Symbol?

    fun getExportSpecifierLocalTargetSymbol(location: ExportSpecifier): Symbol?

    fun getExportSpecifierLocalTargetSymbol(location: Identifier): Symbol?

    /**
     * If a symbol is a local symbol with an associated exported symbol, returns the exported symbol.
     * Otherwise returns its input.
     * For example, at `export type T = number;`:
     *     - `getSymbolAtLocation` at the location `T` will return the exported symbol for `T`.
     *     - But the result of `getSymbolsInScope` will contain the *local* symbol for `T`, not the exported symbol.
     *     - Calling `getExportSymbolOfSymbol` on that local symbol will return the exported symbol.
     */
    fun getExportSymbolOfSymbol(symbol: Symbol): Symbol

    fun getPropertySymbolOfDestructuringAssignment(location: Identifier): Symbol?

    fun getTypeOfAssignmentPattern(pattern: AssignmentPattern): Type

    fun getTypeAtLocation(node: Node): Type

    fun getTypeFromTypeNode(node: TypeNode): Type

    fun signatureToString(
        signature: Signature,
        enclosingDeclaration: Node = definedExternally,
        flags: TypeFormatFlags = definedExternally,
        kind: SignatureKind = definedExternally,
    ): String

    fun typeToString(
        type: Type,
        enclosingDeclaration: Node = definedExternally,
        flags: TypeFormatFlags = definedExternally,
    ): String

    fun symbolToString(
        symbol: Symbol,
        enclosingDeclaration: Node = definedExternally,
        meaning: SymbolFlags = definedExternally,
        flags: SymbolFormatFlags = definedExternally,
    ): String

    fun typePredicateToString(
        predicate: TypePredicate,
        enclosingDeclaration: Node = definedExternally,
        flags: TypeFormatFlags = definedExternally,
    ): String

    fun getFullyQualifiedName(symbol: Symbol): String

    fun getAugmentedPropertiesOfType(type: Type): js.array.ReadonlyArray<Symbol>

    fun getRootSymbols(symbol: Symbol): js.array.ReadonlyArray<Symbol>

    fun getSymbolOfExpando(
        node: Node,
        allowDeclaration: Boolean,
    ): Symbol?

    fun getContextualType(node: Expression): Type?

    /**
     * returns unknownSignature in the case of an error.
     * returns undefined if the node is not valid.
     * @param argumentCount Apparent number of arguments, passed in case of a possibly incomplete call. This should come from an ArgumentListInfo. See `signatureHelp.ts`.
     */
    fun getResolvedSignature(
        node: CallLikeExpression,
        candidatesOutArray: js.array.ReadonlyArray<Signature> = definedExternally,
        argumentCount: Double = definedExternally,
    ): Signature?

    fun getSignatureFromDeclaration(declaration: SignatureDeclaration): Signature?

    fun isImplementationOfOverload(node: SignatureDeclaration): Boolean?

    fun isUndefinedSymbol(symbol: Symbol): Boolean

    fun isArgumentsSymbol(symbol: Symbol): Boolean

    fun isUnknownSymbol(symbol: Symbol): Boolean

    fun getMergedSymbol(symbol: Symbol): Symbol

    fun getConstantValue(node: EnumMember): Any? // string | number | undefined

    fun getConstantValue(node: PropertyAccessExpression): Any? // string | number | undefined

    fun getConstantValue(node: ElementAccessExpression): Any? // string | number | undefined

    fun isValidPropertyAccess(
        node: PropertyAccessExpression,
        propertyName: String,
    ): Boolean

    fun isValidPropertyAccess(
        node: QualifiedName,
        propertyName: String,
    ): Boolean

    fun isValidPropertyAccess(
        node: ImportTypeNode,
        propertyName: String,
    ): Boolean

    /** Follow all aliases to get the original symbol. */
    fun getAliasedSymbol(symbol: Symbol): Symbol

    /** Follow a *single* alias to get the immediately aliased symbol. */
    fun getImmediateAliasedSymbol(symbol: Symbol): Symbol?

    fun getExportsOfModule(moduleSymbol: Symbol): js.array.ReadonlyArray<Symbol>

    fun getJsxIntrinsicTagNamesAt(location: Node): js.array.ReadonlyArray<Symbol>

    fun isOptionalParameter(node: ParameterDeclaration): Boolean

    fun getAmbientModules(): js.array.ReadonlyArray<Symbol>

    fun tryGetMemberInModuleExports(
        memberName: String,
        moduleSymbol: Symbol,
    ): Symbol?

    fun getApparentType(type: Type): Type

    fun getBaseConstraintOfType(type: Type): Type?

    fun getDefaultFromTypeParameter(type: Type): Type?

    /**
     * Gets the intrinsic `any` type. There are multiple types that act as `any` used internally in the compiler,
     * so the type returned by this function should not be used in equality checks to determine if another type
     * is `any`. Instead, use `type.flags & TypeFlags.Any`.
     */
    fun getAnyType(): Type

    fun getStringType(): Type

    fun getStringLiteralType(value: String): StringLiteralType

    fun getNumberType(): Type

    fun getNumberLiteralType(value: Double): NumberLiteralType

    fun getBigIntType(): Type

    fun getBigIntLiteralType(value: PseudoBigInt): BigIntLiteralType

    fun getBooleanType(): Type

    fun getFalseType(): Type

    fun getTrueType(): Type

    fun getVoidType(): Type

    /**
     * Gets the intrinsic `undefined` type. There are multiple types that act as `undefined` used internally in the compiler
     * depending on compiler options, so the type returned by this function should not be used in equality checks to determine
     * if another type is `undefined`. Instead, use `type.flags & TypeFlags.Undefined`.
     */
    fun getUndefinedType(): Type

    /**
     * Gets the intrinsic `null` type. There are multiple types that act as `null` used internally in the compiler,
     * so the type returned by this function should not be used in equality checks to determine if another type
     * is `null`. Instead, use `type.flags & TypeFlags.Null`.
     */
    fun getNullType(): Type

    fun getESSymbolType(): Type

    /**
     * Gets the intrinsic `never` type. There are multiple types that act as `never` used internally in the compiler,
     * so the type returned by this function should not be used in equality checks to determine if another type
     * is `never`. Instead, use `type.flags & TypeFlags.Never`.
     */
    fun getNeverType(): Type

    /**
     * Returns true if the "source" type is assignable to the "target" type.
     *
     * ```ts
     * declare const abcLiteral: ts.Type; // Type of "abc"
     * declare const stringType: ts.Type; // Type of string
     *
     * isTypeAssignableTo(abcLiteral, abcLiteral); // true; "abc" is assignable to "abc"
     * isTypeAssignableTo(abcLiteral, stringType); // true; "abc" is assignable to string
     * isTypeAssignableTo(stringType, abcLiteral); // false; string is not assignable to "abc"
     * isTypeAssignableTo(stringType, stringType); // true; string is assignable to string
     * ```
     */
    fun isTypeAssignableTo(
        source: Type,
        target: Type,
    ): Boolean

    /**
     * True if this type is the `Array` or `ReadonlyArray` type from lib.d.ts.
     * This function will _not_ return true if passed a type which
     * extends `Array` (for example, the TypeScript AST's `NodeArray` type).
     */
    fun isArrayType(type: Type): Boolean

    /**
     * True if this type is a tuple type. This function will _not_ return true if
     * passed a type which extends from a tuple.
     */
    fun isTupleType(type: Type): Boolean

    /**
     * True if this type is assignable to `ReadonlyArray<any>`.
     */
    fun isArrayLikeType(type: Type): Boolean

    fun resolveName(
        name: String,
        location: Node?,
        meaning: SymbolFlags,
        excludeGlobals: Boolean,
    ): Symbol?

    fun getTypePredicateOfSignature(signature: Signature): TypePredicate?

    /**
     * Depending on the operation performed, it may be appropriate to throw away the checker
     * if the cancellation token is triggered. Typically, if it is used for error checking
     * and the operation is cancelled, then it should be discarded, otherwise it is safe to keep.
     */
    fun <T> runWithCancellationToken(
        token: CancellationToken,
        cb: (checker: TypeChecker) -> T,
    ): T
}

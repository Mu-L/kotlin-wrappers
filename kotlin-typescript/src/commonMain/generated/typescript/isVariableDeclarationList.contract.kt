// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE", "CANNOT_CHECK_FOR_ERASED", "ERROR_IN_CONTRACT_DESCRIPTION")
inline fun isVariableDeclarationList(node: Node): Boolean /* node is VariableDeclarationList */ {
    contract {
        returns(true) implies (node is VariableDeclarationList)
    }

    return isVariableDeclarationListRaw(node)
}

// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE", "CANNOT_CHECK_FOR_ERASED", "ERROR_IN_CONTRACT_DESCRIPTION")
inline fun isOptionalChain(
    node: Node,
): Boolean /* node is PropertyAccessChain | ElementAccessChain | CallChain | NonNullChain */ {
    contract {
        returns(true) implies (node is IsOptionalChainResultPredicate)
    }

    return isOptionalChainRaw(node)
}

// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE", "CANNOT_CHECK_FOR_ERASED", "ERROR_IN_CONTRACT_DESCRIPTION")
inline fun isJsxSelfClosingElement(node: Node): Boolean /* node is JsxSelfClosingElement */ {
    contract {
        returns(true) implies (node is JsxSelfClosingElement)
    }

    return isJsxSelfClosingElementRaw(node)
}

// Generated by Karakum - do not modify it manually!

package node.util.types

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isArrayBufferView(value: Any?): Boolean /* object is NodeJS.ArrayBufferView */ {
    contract {
        returns(true) implies (value is js.buffer.ArrayBufferView<*>)
    }

    return isArrayBufferViewRaw(value)
}

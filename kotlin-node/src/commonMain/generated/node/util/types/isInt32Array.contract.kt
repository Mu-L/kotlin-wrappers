// Generated by Karakum - do not modify it manually!

package node.util.types

import js.typedarrays.Int32Array
import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isInt32Array(value: Any?): Boolean /* object is Int32Array */ {
    contract {
        returns(true) implies (value is Int32Array<*>)
    }

    return isInt32ArrayRaw(value)
}

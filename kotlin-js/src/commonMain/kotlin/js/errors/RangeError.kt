package js.errors

import js.serialization.Serializable
import kotlin.js.definedExternally

open external class RangeError(
    override val message: String? = definedExternally,
    options: ErrorOptions? = definedExternally,
) : JsError,
    Serializable

package js.errors

import js.array.ReadonlyArray
import js.serialization.Serializable
import kotlin.js.definedExternally

open external class AggregateError(
    val errors: ReadonlyArray<JsError>,
    override val message: String? = definedExternally,
    options: ErrorOptions? = definedExternally,
) : JsError,
    Serializable

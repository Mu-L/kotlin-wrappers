package js.typedarrays

import js.array.ReadonlyArray
import js.buffer.ArrayBuffer
import js.buffer.ArrayBufferLike
import js.core.BigInt
import js.iterable.JsIterable
import js.serialization.Serializable
import kotlin.js.definedExternally

open external class BigInt64Array<B : ArrayBufferLike>(
    override val buffer: B,
    override val byteOffset: Int = definedExternally,
    override val length: Int = definedExternally,
) : TypedArray<BigInt64Array<B>, BigInt64Array<ArrayBuffer>, B, BigInt>,
    Serializable {
    constructor()
    constructor(length: Int)
    constructor(elements: JsIterable<BigInt>)
    constructor(elements: ReadonlyArray<BigInt>)

    companion object : TypedArrayCompanion<BigInt64Array<ArrayBuffer>, BigInt>
}

// Automatically generated - do not modify!

package web.fonts

import js.buffer.BufferSource
import js.promise.Promise
import seskar.js.JsAsync
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * The **`FontFace`** interface of the CSS Font Loading API represents a single usable font face.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace)
 */
open external class FontFace(
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/family)
     */
    var family: String,
    source: String,
    descriptors: FontFaceDescriptors = definedExternally,
) {
    constructor(
        family: String,
        source: BufferSource,
        descriptors: FontFaceDescriptors = definedExternally,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/ascentOverride)
     */
    var ascentOverride: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/descentOverride)
     */
    var descentOverride: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/display)
     */
    var display: FontDisplay

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/featureSettings)
     */
    var featureSettings: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/lineGapOverride)
     */
    var lineGapOverride: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/loaded)
     */
    val loaded: Promise<FontFace>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/status)
     */
    val status: FontFaceLoadStatus

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/stretch)
     */
    var stretch: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/style)
     */
    var style: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/unicodeRange)
     */
    var unicodeRange: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/weight)
     */
    var weight: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/load)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun load(): FontFace

    @JsName("load")
    fun loadAsync(): Promise<FontFace>
}

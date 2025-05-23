// Automatically generated - do not modify!

package web.geometry

import js.serialization.Serializable
import kotlin.js.definedExternally

/**
 * A **`DOMRect`** describes the size and position of a rectangle.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRect)
 */
open external class DOMRect(
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRect/x)
     */
    override var x: Double = definedExternally,
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRect/y)
     */
    override var y: Double = definedExternally,
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRect/width)
     */
    override var width: Double = definedExternally,
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRect/height)
     */
    override var height: Double = definedExternally,
) : DOMRectReadOnly,
    Serializable {
    companion object {
        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRect/fromRect_static)
         */
        fun fromRect(other: DOMRectReadOnly = definedExternally): DOMRect
    }
}

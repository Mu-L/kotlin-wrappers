// Automatically generated - do not modify!

package web.dom

import js.array.ArrayLike
import js.iterable.JsIterable

/**
 * The **`NamedNodeMap`** interface represents a collection of Attr objects.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NamedNodeMap)
 */
external class NamedNodeMap
private constructor() :
    ArrayLike<Attr>,
    JsIterable<Attr> {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NamedNodeMap/length)
     */
    override val length: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NamedNodeMap/getNamedItem)
     */
    fun getNamedItem(qualifiedName: String): Attr?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NamedNodeMap/getNamedItemNS)
     */
    fun getNamedItemNS(
        namespace: String?,
        localName: String,
    ): Attr?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NamedNodeMap/item)
     */
    fun item(index: Int): Attr?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NamedNodeMap/removeNamedItem)
     */
    fun removeNamedItem(qualifiedName: String): Attr

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NamedNodeMap/removeNamedItemNS)
     */
    fun removeNamedItemNS(
        namespace: String?,
        localName: String,
    ): Attr

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NamedNodeMap/setNamedItem)
     */
    fun setNamedItem(attr: Attr): Attr?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NamedNodeMap/setNamedItemNS)
     */
    fun setNamedItemNS(attr: Attr): Attr?
}

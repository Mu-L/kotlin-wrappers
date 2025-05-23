// Automatically generated - do not modify!

package web.selection

import js.array.ReadonlyArray
import web.dom.Node
import web.ranges.Range
import web.ranges.StaticRange
import kotlin.js.definedExternally

/**
 * A **`Selection`** object represents the range of text selected by the user or the current position of the caret.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection)
 */
external class Selection
private constructor() {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/anchorNode)
     */
    val anchorNode: Node?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/anchorOffset)
     */
    val anchorOffset: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/direction)
     */
    val direction: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/focusNode)
     */
    val focusNode: Node?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/focusOffset)
     */
    val focusOffset: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/isCollapsed)
     */
    val isCollapsed: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/rangeCount)
     */
    val rangeCount: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/type)
     */
    val type: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/addRange)
     */
    fun addRange(range: Range)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/collapse)
     */
    fun collapse(
        node: Node?,
        offset: Int = definedExternally,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/collapseToEnd)
     */
    fun collapseToEnd()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/collapseToStart)
     */
    fun collapseToStart()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/containsNode)
     */
    fun containsNode(
        node: Node,
        allowPartialContainment: Boolean = definedExternally,
    ): Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/deleteFromDocument)
     */
    fun deleteFromDocument()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/empty)
     */
    fun empty()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/extend)
     */
    fun extend(
        node: Node,
        offset: Int = definedExternally,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/getComposedRanges)
     */
    fun getComposedRanges(options: GetComposedRangesOptions = definedExternally): ReadonlyArray<StaticRange>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/getRangeAt)
     */
    fun getRangeAt(index: Int): Range

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/modify)
     */
    fun modify(
        alter: String = definedExternally,
        direction: String = definedExternally,
        granularity: String = definedExternally,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/removeAllRanges)
     */
    fun removeAllRanges()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/removeRange)
     */
    fun removeRange(range: Range)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/selectAllChildren)
     */
    fun selectAllChildren(node: Node)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/setBaseAndExtent)
     */
    fun setBaseAndExtent(
        anchorNode: Node,
        anchorOffset: Int,
        focusNode: Node,
        focusOffset: Int,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/setPosition)
     */
    fun setPosition(
        node: Node?,
        offset: Int = definedExternally,
    )
}

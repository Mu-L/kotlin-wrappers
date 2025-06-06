// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.dom

import js.array.ReadonlyArray
import web.animations.Animation
import web.cssom.CSSStyleSheet
import web.cssom.StyleSheetList
import kotlin.js.definedExternally

external interface DocumentOrShadowRoot {
    /**
     * Returns the deepest element in the document through which or to which key events are being routed. This is, roughly speaking, the focused element in the document.
     *
     * For the purposes of this API, when a child browsing context is focused, its container is focused in the parent browsing context. For example, if the user moves the focus to a text control in an iframe, the iframe is the element returned by the activeElement API in the iframe's node document.
     *
     * Similarly, when the focused element is in a different node tree than documentOrShadowRoot, the element returned will be the host that's located in the same node tree as documentOrShadowRoot if documentOrShadowRoot is a shadow-including inclusive ancestor of the focused element, and null if not.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/activeElement)
     */
    val activeElement: Element?
        get() = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/adoptedStyleSheets)
     */
    var adoptedStyleSheets: ReadonlyArray<CSSStyleSheet>
        get() = definedExternally
        set(value) = definedExternally

    /**
     * Returns document's fullscreen element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/fullscreenElement)
     */
    val fullscreenElement: Element?
        get() = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/pictureInPictureElement)
     */
    val pictureInPictureElement: Element?
        get() = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/pointerLockElement)
     */
    val pointerLockElement: Element?
        get() = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/styleSheets)
     */
    val styleSheets: StyleSheetList
        get() = definedExternally

    fun elementFromPoint(
        x: Double,
        y: Double,
    ): Element? = definedExternally

    fun elementsFromPoint(
        x: Double,
        y: Double,
    ): ReadonlyArray<Element> = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/getAnimations)
     */
    fun getAnimations(): ReadonlyArray<Animation> = definedExternally
}

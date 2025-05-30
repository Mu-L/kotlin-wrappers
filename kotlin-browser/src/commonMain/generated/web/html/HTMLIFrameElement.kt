// Automatically generated - do not modify!

package web.html

import js.core.JsString
import web.dom.DOMTokenList
import web.dom.Document
import web.http.ReferrerPolicy
import web.window.WindowProxy

/**
 * The **`HTMLIFrameElement`** interface provides special properties and methods (beyond those of the HTMLElement interface it also has available to it by inheritance) for manipulating the layout and presentation of inline frame elements.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLIFrameElement)
 */
open external class HTMLIFrameElement
protected constructor() :
    HTMLElement {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLIFrameElement/allow)
     */
    var allow: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLIFrameElement/allowFullscreen)
     */
    var allowFullscreen: Boolean

    /**
     * Retrieves the document object of the page or frame.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLIFrameElement/contentDocument)
     */
    val contentDocument: Document?

    /**
     * Retrieves the object of the specified.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLIFrameElement/contentWindow)
     */
    val contentWindow: WindowProxy?

    /**
     * Sets or retrieves the height of the object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLIFrameElement/height)
     */
    var height: String

    /**
     * Sets or retrieves the policy for loading iframe elements that are outside the viewport.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLIFrameElement/loading)
     */
    var loading: Loading

    /**
     * Sets or retrieves the frame name.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLIFrameElement/name)
     */
    var name: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLIFrameElement/referrerPolicy)
     */
    var referrerPolicy: ReferrerPolicy

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLIFrameElement/sandbox)
     */
    val sandbox: DOMTokenList<JsString>

    /**
     * Sets or retrieves a URL to be loaded by the object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLIFrameElement/src)
     */
    var src: String

    /**
     * Sets or retrives the content of the page that is to contain.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLIFrameElement/srcdoc)
     */
    var srcdoc: String

    /**
     * Sets or retrieves the width of the object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLIFrameElement/width)
     */
    var width: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLIFrameElement/getSVGDocument)
     */
    fun getSVGDocument(): Document?
}

// Automatically generated - do not modify!

package web.dom

import js.array.ReadonlyArray
import js.core.JsString
import js.core.Void
import js.promise.Promise
import seskar.js.JsAsync
import web.aria.ARIAMixin
import web.components.ShadowRoot
import web.components.ShadowRootInit
import web.components.Slottable
import web.cssom.ClassName
import web.cssom.StylePropertyMapReadOnly
import web.events.Event
import web.events.EventHandler
import web.events.EventInstance
import web.events.JsEvent
import web.fullscreen.FullscreenOptions
import web.geometry.DOMRect
import web.geometry.DOMRectList
import web.html.HTMLCollection
import web.html.HTMLElement
import web.html.HtmlTagName
import web.mathml.MATHML_NAMESPACE
import web.mathml.MathMLElement
import web.mathml.MathMLTagName
import web.scroll.ScrollIntoViewOptions
import web.scroll.ScrollToOptions
import web.svg.SVGElement
import web.svg.SVG_NAMESPACE
import web.svg.SvgTagName
import web.uievents.*
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * **`Element`** is the most general base class from which all element objects (i.e., objects that represent elements) in a Document inherit.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element)
 */
open external class Element
private constructor() :
    Node,
    ARIAMixin,
    Animatable,
    ChildNode,
    NonDocumentTypeChildNode,
    ParentNode,
    Slottable {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/attributes)
     */
    val attributes: NamedNodeMap

    /**
     * Allows for manipulation of element's class content attribute as a set of whitespace-separated tokens through a DOMTokenList object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/classList)
     */
    val classList: DOMTokenList<ClassName>

    /**
     * Returns the value of element's class content attribute. Can be set to change it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/className)
     */
    var className: ClassName

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/clientHeight)
     */
    val clientHeight: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/clientLeft)
     */
    val clientLeft: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/clientTop)
     */
    val clientTop: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/clientWidth)
     */
    val clientWidth: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/currentCSSZoom)
     */
    val currentCSSZoom: Double

    /**
     * Returns the value of element's id content attribute. Can be set to change it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/id)
     */
    var id: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/innerHTML)
     */
    var innerHTML: String

    /**
     * Returns the local name.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/localName)
     */
    val localName: String

    /**
     * Returns the namespace.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/namespaceURI)
     */
    val namespaceURI: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/fullscreenchange_event)
     */
    var onfullscreenchange: EventHandler<Event, Element, Node>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/fullscreenerror_event)
     */
    var onfullscreenerror: EventHandler<Event, Element, Node>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/outerHTML)
     */
    var outerHTML: String
    override val ownerDocument: Document

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/part)
     */
    val part: DOMTokenList<JsString>

    /**
     * Returns the namespace prefix.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/prefix)
     */
    val prefix: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/scrollHeight)
     */
    val scrollHeight: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/scrollLeft)
     */
    var scrollLeft: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/scrollTop)
     */
    var scrollTop: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/scrollWidth)
     */
    val scrollWidth: Int

    /**
     * Returns element's shadow root, if any, and if shadow root's mode is "open", and null otherwise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/shadowRoot)
     */
    val shadowRoot: ShadowRoot?

    /**
     * Returns the value of element's slot content attribute. Can be set to change it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/slot)
     */
    var slot: String

    /**
     * Returns the HTML-uppercased qualified name.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/tagName)
     */
    val tagName: String

    /**
     * Creates a shadow root for element and returns it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/attachShadow)
     */
    fun attachShadow(init: ShadowRootInit): ShadowRoot

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/checkVisibility)
     */
    fun checkVisibility(options: CheckVisibilityOptions = definedExternally): Boolean

    /**
     * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/closest)
     */
    fun <T : HTMLElement> closest(selector: HtmlTagName<T>): T?
    fun <T : SVGElement> closest(selector: SvgTagName<T>): T?
    fun <T : MathMLElement> closest(selector: MathMLTagName<T>): T?
    fun closest(selector: String): Element?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/computedStyleMap)
     */
    fun computedStyleMap(): StylePropertyMapReadOnly

    /**
     * Returns element's first attribute whose qualified name is qualifiedName, and null if there is no such attribute otherwise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/getAttribute)
     */
    fun getAttribute(qualifiedName: String): String?

    /**
     * Returns element's attribute whose namespace is namespace and local name is localName, and null if there is no such attribute otherwise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/getAttributeNS)
     */
    fun getAttributeNS(
        namespace: String?,
        localName: String,
    ): String?

    /**
     * Returns the qualified names of all element's attributes. Can contain duplicates.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/getAttributeNames)
     */
    fun getAttributeNames(): ReadonlyArray<JsString>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/getAttributeNode)
     */
    fun getAttributeNode(qualifiedName: String): Attr?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/getAttributeNodeNS)
     */
    fun getAttributeNodeNS(
        namespace: String?,
        localName: String,
    ): Attr?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/getBoundingClientRect)
     */
    fun getBoundingClientRect(): DOMRect

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/getClientRects)
     */
    fun getClientRects(): DOMRectList

    /**
     * Returns a HTMLCollection of the elements in the object on which the method was invoked (a document or an element) that have all the classes given by classNames. The classNames argument is interpreted as a space-separated list of classes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/getElementsByClassName)
     */
    fun getElementsByClassName(classNames: ClassName): HTMLCollection<Element>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/getElementsByTagName)
     */
    fun <T : HTMLElement> getElementsByTagName(qualifiedName: HtmlTagName<T>): HTMLCollection<T>
    fun <T : SVGElement> getElementsByTagName(qualifiedName: SvgTagName<T>): HTMLCollection<T>
    fun <T : MathMLElement> getElementsByTagName(qualifiedName: MathMLTagName<T>): HTMLCollection<T>
    fun getElementsByTagName(qualifiedName: String): HTMLCollection<Element>
    fun <T : SVGElement> getElementsByTagNameNS(
        namespaceURI: SVG_NAMESPACE,
        localName: SvgTagName<T>,
    ): HTMLCollection<T>

    fun <T : MathMLElement> getElementsByTagNameNS(
        namespaceURI: MATHML_NAMESPACE,
        localName: MathMLTagName<T>,
    ): HTMLCollection<T>

    fun getElementsByTagNameNS(
        namespace: String?,
        localName: String,
    ): HTMLCollection<Element>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/getHTML)
     */
    fun getHTML(options: GetHTMLOptions = definedExternally): String

    /**
     * Returns true if element has an attribute whose qualified name is qualifiedName, and false otherwise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/hasAttribute)
     */
    fun hasAttribute(qualifiedName: String): Boolean

    /**
     * Returns true if element has an attribute whose namespace is namespace and local name is localName.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/hasAttributeNS)
     */
    fun hasAttributeNS(
        namespace: String?,
        localName: String,
    ): Boolean

    /**
     * Returns true if element has attributes, and false otherwise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/hasAttributes)
     */
    fun hasAttributes(): Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/hasPointerCapture)
     */
    fun hasPointerCapture(pointerId: Int): Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/insertAdjacentElement)
     */
    fun insertAdjacentElement(
        where: InsertPosition,
        element: Element,
    ): Element?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/insertAdjacentHTML)
     */
    fun insertAdjacentHTML(
        position: InsertPosition,
        string: String,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/insertAdjacentText)
     */
    fun insertAdjacentText(
        where: InsertPosition,
        data: String,
    )

    /**
     * Returns true if matching selectors against element's root yields element, and false otherwise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/matches)
     */
    fun matches(selectors: String): Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/releasePointerCapture)
     */
    fun releasePointerCapture(pointerId: Int)

    /**
     * Removes element's first attribute whose qualified name is qualifiedName.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/removeAttribute)
     */
    fun removeAttribute(qualifiedName: String)

    /**
     * Removes element's attribute whose namespace is namespace and local name is localName.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/removeAttributeNS)
     */
    fun removeAttributeNS(
        namespace: String?,
        localName: String,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/removeAttributeNode)
     */
    fun removeAttributeNode(attr: Attr): Attr

    /**
     * Displays element fullscreen and resolves promise when done.
     *
     * When supplied, options's navigationUI member indicates whether showing navigation UI while in fullscreen is preferred or not. If set to "show", navigation simplicity is preferred over screen space, and if set to "hide", more screen space is preferred. User agents are always free to honor user preference over the application's. The default value "auto" indicates no application preference.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/requestFullscreen)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun requestFullscreen(options: FullscreenOptions = definedExternally)

    @JsName("requestFullscreen")
    fun requestFullscreenAsync(options: FullscreenOptions = definedExternally): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/requestPointerLock)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun requestPointerLock(options: PointerLockOptions = definedExternally)

    @JsName("requestPointerLock")
    fun requestPointerLockAsync(options: PointerLockOptions = definedExternally): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/scroll)
     */
    fun scroll(options: ScrollToOptions = definedExternally)
    fun scroll(
        x: Double,
        y: Double,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/scrollBy)
     */
    fun scrollBy(options: ScrollToOptions = definedExternally)
    fun scrollBy(
        x: Double,
        y: Double,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/scrollIntoView)
     */
    fun scrollIntoView(options: ScrollIntoViewOptions = definedExternally)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/scrollTo)
     */
    fun scrollTo(options: ScrollToOptions = definedExternally)
    fun scrollTo(
        x: Double,
        y: Double,
    )

    /**
     * Sets the value of element's first attribute whose qualified name is qualifiedName to value.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/setAttribute)
     */
    fun setAttribute(
        qualifiedName: String,
        value: String,
    )

    /**
     * Sets the value of element's attribute whose namespace is namespace and local name is localName to value.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/setAttributeNS)
     */
    fun setAttributeNS(
        namespace: String?,
        qualifiedName: String,
        value: String,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/setAttributeNode)
     */
    fun setAttributeNode(attr: Attr): Attr?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/setAttributeNodeNS)
     */
    fun setAttributeNodeNS(attr: Attr): Attr?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/setHTMLUnsafe)
     */
    fun setHTMLUnsafe(html: String)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/setPointerCapture)
     */
    fun setPointerCapture(pointerId: Int)

    /**
     * If force is not given, "toggles" qualifiedName, removing it if it is present and adding it if it is not present. If force is true, adds qualifiedName. If force is false, removes qualifiedName.
     *
     * Returns true if qualifiedName is now present, and false otherwise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/toggleAttribute)
     */
    fun toggleAttribute(
        qualifiedName: String,
        force: Boolean = definedExternally,
    ): Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/abort_event)
     */
    @JsEvent("abort")
    open val abortEvent: EventInstance<Event, Element /* this */, Element /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/auxclick_event)
     */
    @JsEvent("auxclick")
    open val auxClickEvent: EventInstance<MouseEvent, Element /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/beforeinput_event)
     */
    @JsEvent("beforeinput")
    open val beforeInputEvent: EventInstance<InputEvent, Element /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/blur_event)
     */
    @JsEvent("blur")
    open val blurEvent: EventInstance<FocusEvent, Element /* this */, Element /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/click_event)
     */
    @JsEvent("click")
    open val clickEvent: EventInstance<MouseEvent, Element /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/compositionend_event)
     */
    @JsEvent("compositionend")
    open val compositionEndEvent: EventInstance<CompositionEvent, Element /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/compositionstart_event)
     */
    @JsEvent("compositionstart")
    open val compositionStartEvent: EventInstance<CompositionEvent, Element /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/compositionupdate_event)
     */
    @JsEvent("compositionupdate")
    open val compositionUpdateEvent: EventInstance<CompositionEvent, Element /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/contextmenu_event)
     */
    @JsEvent("contextmenu")
    open val contextMenuEvent: EventInstance<MouseEvent, Element /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/dblclick_event)
     */
    @JsEvent("dblclick")
    open val dblClickEvent: EventInstance<MouseEvent, Element /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/error_event)
     */
    @JsEvent("error")
    open val errorEvent: EventInstance<Event, Element /* this */, Element /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/focus_event)
     */
    @JsEvent("focus")
    open val focusEvent: EventInstance<FocusEvent, Element /* this */, Element /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/focusin_event)
     */
    @JsEvent("focusin")
    open val focusInEvent: EventInstance<FocusEvent, Element /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/focusout_event)
     */
    @JsEvent("focusout")
    open val focusOutEvent: EventInstance<FocusEvent, Element /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/fullscreenchange_event)
     */
    @JsEvent("fullscreenchange")
    open val fullscreenChangeEvent: EventInstance<Event, Element /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/fullscreenerror_event)
     */
    @JsEvent("fullscreenerror")
    open val fullscreenErrorEvent: EventInstance<Event, Element /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/input_event)
     */
    @JsEvent("input")
    open val inputEvent: EventInstance<InputEvent, Element /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/keydown_event)
     */
    @JsEvent("keydown")
    open val keyDownEvent: EventInstance<KeyboardEvent, Element /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/keypress_event)
     */
    @JsEvent("keypress")
    open val keyPressEvent: EventInstance<KeyboardEvent, Element /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/keyup_event)
     */
    @JsEvent("keyup")
    open val keyUpEvent: EventInstance<KeyboardEvent, Element /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/load_event)
     */
    @JsEvent("load")
    open val loadEvent: EventInstance<Event, Element /* this */, Element /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/mousedown_event)
     */
    @JsEvent("mousedown")
    open val mouseDownEvent: EventInstance<MouseEvent, Element /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/mouseenter_event)
     */
    @JsEvent("mouseenter")
    open val mouseEnterEvent: EventInstance<MouseEvent, Element /* this */, Element /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/mouseleave_event)
     */
    @JsEvent("mouseleave")
    open val mouseLeaveEvent: EventInstance<MouseEvent, Element /* this */, Element /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/mousemove_event)
     */
    @JsEvent("mousemove")
    open val mouseMoveEvent: EventInstance<MouseEvent, Element /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/mouseout_event)
     */
    @JsEvent("mouseout")
    open val mouseOutEvent: EventInstance<MouseEvent, Element /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/mouseover_event)
     */
    @JsEvent("mouseover")
    open val mouseOverEvent: EventInstance<MouseEvent, Element /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/mouseup_event)
     */
    @JsEvent("mouseup")
    open val mouseUpEvent: EventInstance<MouseEvent, Element /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/scroll_event)
     */
    @JsEvent("scroll")
    open val scrollEvent: EventInstance<Event, Element /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/scrollend_event)
     */
    @JsEvent("scrollend")
    open val scrollEndEvent: EventInstance<Event, Element /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/select_event)
     */
    @JsEvent("select")
    open val selectEvent: EventInstance<Event, Element /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/touchcancel_event)
     */
    @JsEvent("touchcancel")
    open val touchCancelEvent: EventInstance<TouchEvent, Element /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/touchend_event)
     */
    @JsEvent("touchend")
    open val touchEndEvent: EventInstance<TouchEvent, Element /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/touchmove_event)
     */
    @JsEvent("touchmove")
    open val touchMoveEvent: EventInstance<TouchEvent, Element /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/touchstart_event)
     */
    @JsEvent("touchstart")
    open val touchStartEvent: EventInstance<TouchEvent, Element /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/unload_event)
     */
    @JsEvent("unload")
    open val unloadEvent: EventInstance<Event, Element /* this */, Element /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/wheel_event)
     */
    @JsEvent("wheel")
    open val wheelEvent: EventInstance<WheelEvent, Element /* this */, Node>
}

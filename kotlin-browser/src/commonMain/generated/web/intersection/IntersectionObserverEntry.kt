// Automatically generated - do not modify!

package web.intersection

import web.dom.Element
import web.geometry.DOMRectReadOnly
import web.time.DOMHighResTimeStamp

/**
 * The **`IntersectionObserverEntry`** interface of the Intersection Observer API describes the intersection between the target element and its root container at a specific moment of transition.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserverEntry)
 */
external class IntersectionObserverEntry
private constructor() {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserverEntry/boundingClientRect)
     */
    val boundingClientRect: DOMRectReadOnly

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserverEntry/intersectionRatio)
     */
    val intersectionRatio: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserverEntry/intersectionRect)
     */
    val intersectionRect: DOMRectReadOnly

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserverEntry/isIntersecting)
     */
    val isIntersecting: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserverEntry/rootBounds)
     */
    val rootBounds: DOMRectReadOnly?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserverEntry/target)
     */
    val target: Element

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserverEntry/time)
     */
    val time: DOMHighResTimeStamp
}

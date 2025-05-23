// Automatically generated - do not modify!

package web.uievents

import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import seskar.js.JsValue
import web.events.EventType
import kotlin.js.definedExternally

/**
 * The **`TouchEvent`** interface represents an UIEvent which is sent when the state of contacts with a touch-sensitive surface changes.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TouchEvent)
 */
open external class TouchEvent(
    override val type: EventType<TouchEvent>,
    init: TouchEventInit = definedExternally,
) : UIEvent {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TouchEvent/altKey)
     */
    val altKey: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TouchEvent/changedTouches)
     */
    val changedTouches: TouchList

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TouchEvent/ctrlKey)
     */
    val ctrlKey: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TouchEvent/metaKey)
     */
    val metaKey: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TouchEvent/shiftKey)
     */
    val shiftKey: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TouchEvent/targetTouches)
     */
    val targetTouches: TouchList

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TouchEvent/touches)
     */
    val touches: TouchList

    @JsAlias(THIS)
    override fun asInit(): TouchEventInit

    companion object {
        @JsValue("touchcancel")
        val TOUCH_CANCEL: EventType<TouchEvent>

        @JsValue("touchend")
        val TOUCH_END: EventType<TouchEvent>

        @JsValue("touchmove")
        val TOUCH_MOVE: EventType<TouchEvent>

        @JsValue("touchstart")
        val TOUCH_START: EventType<TouchEvent>
    }
}

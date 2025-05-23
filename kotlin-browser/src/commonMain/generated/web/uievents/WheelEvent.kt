// Automatically generated - do not modify!

package web.uievents

import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import seskar.js.JsValue
import web.events.EventType
import kotlin.js.definedExternally

/**
 * The **`WheelEvent`** interface represents events that occur due to the user moving a mouse wheel or similar input device.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WheelEvent)
 */
open external class WheelEvent(
    override val type: EventType<WheelEvent>,
    init: WheelEventInit = definedExternally,
) : MouseEvent {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WheelEvent/deltaMode)
     */
    val deltaMode: DeltaMode

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WheelEvent/deltaX)
     */
    val deltaX: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WheelEvent/deltaY)
     */
    val deltaY: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WheelEvent/deltaZ)
     */
    val deltaZ: Double
    val DOM_DELTA_PIXEL: DeltaMode
    val DOM_DELTA_LINE: DeltaMode
    val DOM_DELTA_PAGE: DeltaMode

    @JsAlias(THIS)
    override fun asInit(): WheelEventInit

    companion object {
        val DOM_DELTA_PIXEL: DeltaMode
        val DOM_DELTA_LINE: DeltaMode
        val DOM_DELTA_PAGE: DeltaMode

        @JsValue("wheel")
        val WHEEL: EventType<WheelEvent>
    }
}

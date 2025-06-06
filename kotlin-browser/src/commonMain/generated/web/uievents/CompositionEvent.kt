// Automatically generated - do not modify!

package web.uievents

import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import seskar.js.JsValue
import web.events.EventType
import kotlin.js.definedExternally

/**
 * The DOM **`CompositionEvent`** represents events that occur due to the user indirectly entering text.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CompositionEvent)
 */
open external class CompositionEvent(
    override val type: EventType<CompositionEvent>,
    init: CompositionEventInit = definedExternally,
) : UIEvent {
    /**
     * The **`data`** read-only property of the method that raised the event; its exact nature varies depending on the type of event that generated the `CompositionEvent` object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CompositionEvent/data)
     */
    val data: String

    @JsAlias(THIS)
    override fun asInit(): CompositionEventInit

    companion object {
        @JsValue("compositionend")
        val COMPOSITION_END: EventType<CompositionEvent>

        @JsValue("compositionstart")
        val COMPOSITION_START: EventType<CompositionEvent>

        @JsValue("compositionupdate")
        val COMPOSITION_UPDATE: EventType<CompositionEvent>
    }
}

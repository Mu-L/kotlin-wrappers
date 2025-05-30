// Automatically generated - do not modify!

package web.history

import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import seskar.js.JsValue
import web.events.Event
import web.events.EventType
import kotlin.js.definedExternally

/**
 * The **`PageTransitionEvent`** event object is available inside handler functions for the `pageshow` and `pagehide` events, fired when a document is being loaded or unloaded.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PageTransitionEvent)
 */
open external class PageTransitionEvent(
    override val type: EventType<PageTransitionEvent>,
    init: PageTransitionEventInit = definedExternally,
) : Event {
    /**
     * For the pageshow event, returns false if the page is newly being loaded (and the load event will fire). Otherwise, returns true.
     *
     * For the pagehide event, returns false if the page is going away for the last time. Otherwise, returns true, meaning that (if nothing conspires to make the page unsalvageable) the page might be reused if the user navigates back to this page.
     *
     * Things that can cause the page to be unsalvageable include:
     *
     * The user agent decided to not keep the Document alive in a session history entry after unload
     * Having iframes that are not salvageable
     * Active WebSocket objects
     * Aborting a Document
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PageTransitionEvent/persisted)
     */
    val persisted: Boolean

    @JsAlias(THIS)
    override fun asInit(): PageTransitionEventInit

    companion object {
        @JsValue("pagehide")
        val PAGE_HIDE: EventType<PageTransitionEvent>

        @JsValue("pageshow")
        val PAGE_SHOW: EventType<PageTransitionEvent>
    }
}

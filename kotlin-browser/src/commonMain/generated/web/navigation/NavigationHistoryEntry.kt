// Automatically generated - do not modify!

package web.navigation

import js.core.Int53
import js.core.JsAny
import web.events.*

/**
 * The **`NavigationHistoryEntry`** interface of the Navigation API represents a single navigation history entry.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationHistoryEntry)
 */
external class NavigationHistoryEntry
private constructor() :
    EventTarget {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationHistoryEntry/id)
     */
    val id: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationHistoryEntry/index)
     */
    val index: Int53

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationHistoryEntry/key)
     */
    val key: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationHistoryEntry/dispose_event)
     */
    var ondispose: EventHandler<Event, NavigationHistoryEntry, NavigationHistoryEntry>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationHistoryEntry/sameDocument)
     */
    val sameDocument: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationHistoryEntry/url)
     */
    val url: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationHistoryEntry/getState)
     */
    fun getState(): JsAny

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationHistoryEntry/dispose_event)
     */
    @JsEvent("dispose")
    val disposeEvent: EventInstance<Event, NavigationHistoryEntry /* this */, NavigationHistoryEntry /* this */>
}

// Automatically generated - do not modify!

package web.serviceworker

import js.core.Void
import js.promise.Promise
import seskar.js.JsAsync
import kotlin.js.JsName

/**
 * The **`NavigationPreloadManager`** interface of the Service Worker API provides methods for managing the preloading of resources in parallel with service worker bootup.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationPreloadManager)
 */
external class NavigationPreloadManager
private constructor() {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationPreloadManager/disable)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun disable()

    @JsName("disable")
    fun disableAsync(): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationPreloadManager/enable)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun enable()

    @JsName("enable")
    fun enableAsync(): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationPreloadManager/getState)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun getState(): NavigationPreloadState

    @JsName("getState")
    fun getStateAsync(): Promise<NavigationPreloadState>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationPreloadManager/setHeaderValue)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun setHeaderValue(value: String)

    @JsName("setHeaderValue")
    fun setHeaderValueAsync(value: String): Promise<Void>
}

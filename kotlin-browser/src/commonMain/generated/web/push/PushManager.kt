// Automatically generated - do not modify!

package web.push

import js.array.ReadonlyArray
import js.core.JsString
import js.promise.Promise
import seskar.js.JsAsync
import web.permissions.PermissionState
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * The **`PushManager`** interface of the Push API provides a way to receive notifications from third-party servers as well as request URLs for push notifications.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushManager)
 */
external class PushManager
private constructor() {
    /**
     * The **`PushManager.getSubscription()`** method of the PushManager interface retrieves an existing push subscription.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushManager/getSubscription)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun getSubscription(): PushSubscription?

    @JsName("getSubscription")
    fun getSubscriptionAsync(): Promise<PushSubscription?>

    /**
     * The **`permissionState()`** method of the string indicating the permission state of the push manager.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushManager/permissionState)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun permissionState(options: PushSubscriptionOptionsInit = definedExternally): PermissionState

    @JsName("permissionState")
    fun permissionStateAsync(options: PushSubscriptionOptionsInit = definedExternally): Promise<PermissionState>

    /**
     * The **`subscribe()`** method of the PushManager interface subscribes to a push service.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushManager/subscribe)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun subscribe(options: PushSubscriptionOptionsInit = definedExternally): PushSubscription

    @JsName("subscribe")
    fun subscribeAsync(options: PushSubscriptionOptionsInit = definedExternally): Promise<PushSubscription>

    companion object {
        /**
         * The **`supportedContentEncodings`** read-only static property of the PushManager interface returns an array of supported content codings that can be used to encrypt the payload of a push message.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushManager/supportedContentEncodings_static)
         */
        val supportedContentEncodings: ReadonlyArray<JsString>
    }
}

// Automatically generated - do not modify!

package web.push

import js.buffer.ArrayBuffer
import js.core.JsBoolean
import js.promise.Promise
import seskar.js.JsAsync
import web.time.EpochTimeStamp
import kotlin.js.JsName

/**
 * The `PushSubscription` interface of the Push API provides a subscription's URL endpoint along with the public key and secrets that should be used for encrypting push messages to this subscription.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushSubscription)
 */
external class PushSubscription
private constructor() {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushSubscription/endpoint)
     */
    val endpoint: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushSubscription/expirationTime)
     */
    val expirationTime: EpochTimeStamp?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushSubscription/options)
     */
    val options: PushSubscriptionOptions

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushSubscription/getKey)
     */
    fun getKey(name: PushEncryptionKeyName): ArrayBuffer?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushSubscription/toJSON)
     */
    fun toJSON(): PushSubscriptionJSON

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushSubscription/unsubscribe)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun unsubscribe(): Boolean

    @JsName("unsubscribe")
    fun unsubscribeAsync(): Promise<JsBoolean>
}

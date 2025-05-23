// Automatically generated - do not modify!

package web.media.key

import js.buffer.BufferSource
import js.core.JsBoolean
import js.core.Void
import js.promise.Promise
import seskar.js.JsAsync
import web.events.*
import web.time.EpochTimeStamp
import kotlin.js.JsName

/**
 * The **`MediaKeySession`** interface of the Encrypted Media Extensions API represents a context for message exchange with a content decryption module (CDM).
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeySession)
 */
external class MediaKeySession
private constructor() :
    EventTarget {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeySession/closed)
     */
    val closed: Promise<MediaKeySessionClosedReason>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeySession/expiration)
     */
    val expiration: EpochTimeStamp

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeySession/keyStatuses)
     */
    val keyStatuses: MediaKeyStatusMap

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeySession/keystatuseschange_event)
     */
    var onkeystatuseschange: EventHandler<Event, MediaKeySession, MediaKeySession>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeySession/message_event)
     */
    var onmessage: EventHandler<MediaKeyMessageEvent, MediaKeySession, MediaKeySession>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeySession/sessionId)
     */
    val sessionId: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeySession/close)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun close()

    @JsName("close")
    fun closeAsync(): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeySession/generateRequest)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun generateRequest(
        initDataType: String,
        initData: BufferSource,
    )

    @JsName("generateRequest")
    fun generateRequestAsync(
        initDataType: String,
        initData: BufferSource,
    ): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeySession/load)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun load(sessionId: String): Boolean

    @JsName("load")
    fun loadAsync(sessionId: String): Promise<JsBoolean>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeySession/remove)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun remove()

    @JsName("remove")
    fun removeAsync(): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeySession/update)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun update(response: BufferSource)

    @JsName("update")
    fun updateAsync(response: BufferSource): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeySession/keystatuseschange_event)
     */
    @JsEvent("keystatuseschange")
    val keyStatusesChangeEvent: EventInstance<Event, MediaKeySession /* this */, MediaKeySession /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeySession/message_event)
     */
    @JsEvent("message")
    val messageEvent: EventInstance<MediaKeyMessageEvent, MediaKeySession /* this */, MediaKeySession /* this */>
}

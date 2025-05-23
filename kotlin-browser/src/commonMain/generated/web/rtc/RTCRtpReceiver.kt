// Automatically generated - do not modify!

package web.rtc

import js.array.ReadonlyArray
import js.promise.Promise
import seskar.js.JsAsync
import web.media.streams.MediaStreamTrack
import web.time.DOMHighResTimeStamp
import kotlin.js.JsName

/**
 * The **`RTCRtpReceiver`** interface of the WebRTC API manages the reception and decoding of data for a MediaStreamTrack on an RTCPeerConnection.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpReceiver)
 */
external class RTCRtpReceiver
private constructor() {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpReceiver/jitterBufferTarget)
     */
    var jitterBufferTarget: DOMHighResTimeStamp?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpReceiver/track)
     */
    val track: MediaStreamTrack

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpReceiver/transform)
     */
    var transform: RTCRtpTransform?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpReceiver/transport)
     */
    val transport: RTCDtlsTransport?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpReceiver/getContributingSources)
     */
    fun getContributingSources(): ReadonlyArray<RTCRtpContributingSource>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpReceiver/getParameters)
     */
    fun getParameters(): RTCRtpReceiveParameters

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpReceiver/getStats)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun getStats(): RTCStatsReport

    @JsName("getStats")
    fun getStatsAsync(): Promise<RTCStatsReport>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpReceiver/getSynchronizationSources)
     */
    fun getSynchronizationSources(): ReadonlyArray<RTCRtpSynchronizationSource>

    companion object {
        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpReceiver/getCapabilities_static)
         */
        fun getCapabilities(kind: String): RTCRtpCapabilities?
    }
}

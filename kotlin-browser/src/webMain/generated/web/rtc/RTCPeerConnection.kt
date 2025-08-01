// Automatically generated - do not modify!

package web.rtc

import js.array.ReadonlyArray
import js.core.Void
import js.promise.Promise
import js.promise.await
import web.crypto.Algorithm
import web.events.Event
import web.events.EventHandler
import web.events.EventInstance
import web.events.EventTarget
import web.mediastreams.MediaStream
import web.mediastreams.MediaStreamTrack
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * The **`RTCPeerConnection`** interface represents a WebRTC connection between the local computer and a remote peer.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection)
 */
open external class RTCPeerConnection(
    configuration: RTCConfiguration = definedExternally,
) : EventTarget {
    /**
     * The **`canTrickleIceCandidates`** read-only property of the RTCPeerConnection interface returns a boolean value which indicates whether or not the remote peer can accept trickled ICE candidates.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/canTrickleIceCandidates)
     */
    val canTrickleIceCandidates: Boolean?

    /**
     * The **`connectionState`** read-only property of the RTCPeerConnection interface indicates the current state of the peer connection by returning one of the following string values: `new`, `connecting`, `connected`, `disconnected`, `failed`, or `closed`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/connectionState)
     */
    val connectionState: RTCPeerConnectionState

    /**
     * The **`currentLocalDescription`** read-only property of the RTCPeerConnection interface returns an RTCSessionDescription object describing the local end of the connection as it was most recently successfully negotiated since the last time the RTCPeerConnection finished negotiating and connecting to a remote peer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/currentLocalDescription)
     */
    val currentLocalDescription: RTCSessionDescription?

    /**
     * The **`currentRemoteDescription`** read-only property of the RTCPeerConnection interface returns an RTCSessionDescription object describing the remote end of the connection as it was most recently successfully negotiated since the last time the RTCPeerConnection finished negotiating and connecting to a remote peer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/currentRemoteDescription)
     */
    val currentRemoteDescription: RTCSessionDescription?

    /**
     * The **`iceConnectionState`** read-only property of the RTCPeerConnection interface returns a string which state of the ICE agent associated with the RTCPeerConnection: `new`, `checking`, `connected`, `completed`, `failed`, `disconnected`, and `closed`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/iceConnectionState)
     */
    val iceConnectionState: RTCIceConnectionState

    /**
     * The **`iceGatheringState`** read-only property of the RTCPeerConnection interface returns a string that describes the overall ICE gathering state for this connection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/iceGatheringState)
     */
    val iceGatheringState: RTCIceGatheringState

    /**
     * The **`localDescription`** read-only property of the RTCPeerConnection interface returns an RTCSessionDescription describing the session for the local end of the connection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/localDescription)
     */
    val localDescription: RTCSessionDescription?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/connectionstatechange_event)
     */
    var onconnectionstatechange: EventHandler<Event, RTCPeerConnection, RTCPeerConnection>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/datachannel_event)
     */
    var ondatachannel: EventHandler<RTCDataChannelEvent, RTCPeerConnection, RTCPeerConnection>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/icecandidate_event)
     */
    var onicecandidate: EventHandler<RTCPeerConnectionIceEvent, RTCPeerConnection, RTCPeerConnection>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/icecandidateerror_event)
     */
    var onicecandidateerror: EventHandler<RTCPeerConnectionIceErrorEvent, RTCPeerConnection, RTCPeerConnection>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/iceconnectionstatechange_event)
     */
    var oniceconnectionstatechange: EventHandler<Event, RTCPeerConnection, RTCPeerConnection>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/icegatheringstatechange_event)
     */
    var onicegatheringstatechange: EventHandler<Event, RTCPeerConnection, RTCPeerConnection>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/negotiationneeded_event)
     */
    var onnegotiationneeded: EventHandler<Event, RTCPeerConnection, RTCPeerConnection>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/signalingstatechange_event)
     */
    var onsignalingstatechange: EventHandler<Event, RTCPeerConnection, RTCPeerConnection>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/track_event)
     */
    var ontrack: EventHandler<RTCTrackEvent, RTCPeerConnection, RTCPeerConnection>?

    /**
     * The **`pendingLocalDescription`** read-only property of the RTCPeerConnection interface returns an RTCSessionDescription object describing a pending configuration change for the local end of the connection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/pendingLocalDescription)
     */
    val pendingLocalDescription: RTCSessionDescription?

    /**
     * The **`pendingRemoteDescription`** read-only property of the RTCPeerConnection interface returns an RTCSessionDescription object describing a pending configuration change for the remote end of the connection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/pendingRemoteDescription)
     */
    val pendingRemoteDescription: RTCSessionDescription?

    /**
     * The **`remoteDescription`** read-only property of the RTCPeerConnection interface returns a RTCSessionDescription describing the session (which includes configuration and media information) for the remote end of the connection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/remoteDescription)
     */
    val remoteDescription: RTCSessionDescription?

    /**
     * The **`sctp`** read-only property of the RTCPeerConnection interface returns an RTCSctpTransport describing the SCTP transport over which SCTP data is being sent and received.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/sctp)
     */
    val sctp: RTCSctpTransport?

    /**
     * The **`signalingState`** read-only property of the RTCPeerConnection interface returns a string value describing the state of the signaling process on the local end of the connection while connecting or reconnecting to another peer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/signalingState)
     */
    val signalingState: RTCSignalingState

    /**
     * The **`addIceCandidate()`** method of the RTCPeerConnection interface adds a new remote candidate to the connection's remote description, which describes the state of the remote end of the connection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/addIceCandidate)
     */
    @JsName("addIceCandidate")
    fun addIceCandidateAsync(candidate: RTCIceCandidateInit? = definedExternally): Promise<Void>

    /**
     * The **`addTrack()`** method of the RTCPeerConnection interface adds a new media track to the set of tracks which will be transmitted to the other peer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/addTrack)
     */
    fun addTrack(
        track: MediaStreamTrack,
        vararg streams: MediaStream,
    ): RTCRtpSender

    /**
     * The **`addTransceiver()`** method of the RTCPeerConnection interface creates a new RTCRtpTransceiver and adds it to the set of transceivers associated with the `RTCPeerConnection`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/addTransceiver)
     */
    fun addTransceiver(
        trackOrKind: MediaStreamTrack,
        init: RTCRtpTransceiverInit = definedExternally,
    ): RTCRtpTransceiver

    fun addTransceiver(
        trackOrKind: String,
        init: RTCRtpTransceiverInit = definedExternally,
    ): RTCRtpTransceiver

    /**
     * The **`close()`** method of the RTCPeerConnection interface closes the current peer connection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/close)
     */
    fun close()

    /**
     * The **`createAnswer()`** method of the RTCPeerConnection interface creates an SDP answer to an offer received from a remote peer during the offer/answer negotiation of a WebRTC connection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/createAnswer)
     */
    @JsName("createAnswer")
    fun createAnswerAsync(options: RTCAnswerOptions = definedExternally): Promise<RTCSessionDescriptionInit>

    /**
     * The **`createDataChannel()`** method of the RTCPeerConnection interface creates a new channel linked with the remote peer, over which any kind of data may be transmitted.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/createDataChannel)
     */
    fun createDataChannel(
        label: String,
        dataChannelDict: RTCDataChannelInit = definedExternally,
    ): RTCDataChannel

    /**
     * The **`createOffer()`** method of the RTCPeerConnection interface initiates the creation of an SDP offer for the purpose of starting a new WebRTC connection to a remote peer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/createOffer)
     */
    @JsName("createOffer")
    fun createOfferAsync(options: RTCOfferOptions = definedExternally): Promise<RTCSessionDescriptionInit>

    /**
     * The **`getConfiguration()`** method of the RTCPeerConnection interface returns an object which indicates the current configuration of the RTCPeerConnection on which the method is called.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/getConfiguration)
     */
    fun getConfiguration(): RTCConfiguration

    /**
     * The **`getReceivers()`** method of the RTCPeerConnection interface returns an array of RTCRtpReceiver objects, each of which represents one RTP receiver.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/getReceivers)
     */
    fun getReceivers(): ReadonlyArray<RTCRtpReceiver>

    /**
     * The **`getSenders()`** method of the RTCPeerConnection interface returns an array of RTCRtpSender objects, each of which represents the RTP sender responsible for transmitting one track's data.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/getSenders)
     */
    fun getSenders(): ReadonlyArray<RTCRtpSender>

    /**
     * The **`getStats()`** method of the RTCPeerConnection interface returns a promise which resolves with data providing statistics about either the overall connection or about the specified MediaStreamTrack.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/getStats)
     */
    @JsName("getStats")
    fun getStatsAsync(selector: MediaStreamTrack? = definedExternally): Promise<RTCStatsReport>

    /**
     * The **`getTransceivers()`** method of the RTCPeerConnection interface returns a list of the RTCRtpTransceiver objects being used to send and receive data on the connection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/getTransceivers)
     */
    fun getTransceivers(): ReadonlyArray<RTCRtpTransceiver>

    /**
     * The **`removeTrack()`** method of the RTCPeerConnection interface tells the local end of the connection to stop sending media from the specified track, without actually removing the corresponding RTCRtpSender from the list of senders as reported by RTCPeerConnection.getSenders().
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/removeTrack)
     */
    fun removeTrack(sender: RTCRtpSender)

    /**
     * The **`restartIce()`** method of the RTCPeerConnection interface allows a web application to request that ICE candidate gathering be redone on both ends of the connection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/restartIce)
     */
    fun restartIce()

    /**
     * The **`setConfiguration()`** method of the RTCPeerConnection interface sets the current configuration of the connection based on the values included in the specified object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/setConfiguration)
     */
    fun setConfiguration(configuration: RTCConfiguration = definedExternally)

    /**
     * The **`setLocalDescription()`** method of the RTCPeerConnection interface changes the local description associated with the connection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/setLocalDescription)
     */
    @JsName("setLocalDescription")
    fun setLocalDescriptionAsync(description: RTCLocalSessionDescriptionInit = definedExternally): Promise<Void>

    /**
     * The **`setRemoteDescription()`** method of the RTCPeerConnection interface sets the specified session description as the remote peer's current offer or answer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/setRemoteDescription)
     */
    @JsName("setRemoteDescription")
    fun setRemoteDescriptionAsync(description: RTCSessionDescriptionInit): Promise<Void>

    companion object {
        /**
         * The **`generateCertificate()`** static function of the RTCPeerConnection interface creates an X.509 certificate and corresponding private key, returning a promise that resolves with the new RTCCertificate once it's generated.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/generateCertificate_static)
         */
        @JsName("generateCertificate")
        fun generateCertificateAsync(keygenAlgorithm: Algorithm): Promise<RTCCertificate>

        @JsName("generateCertificate")
        fun generateCertificateAsync(keygenAlgorithm: String): Promise<RTCCertificate>
    }
}

/**
 * The **`addIceCandidate()`** method of the RTCPeerConnection interface adds a new remote candidate to the connection's remote description, which describes the state of the remote end of the connection.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/addIceCandidate)
 */
suspend inline fun RTCPeerConnection.addIceCandidate(candidate: RTCIceCandidateInit?) {
    addIceCandidateAsync(
        candidate = candidate,
    ).await()
}

/**
 * The **`addIceCandidate()`** method of the RTCPeerConnection interface adds a new remote candidate to the connection's remote description, which describes the state of the remote end of the connection.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/addIceCandidate)
 */
suspend inline fun RTCPeerConnection.addIceCandidate() {
    addIceCandidateAsync().await()
}

/**
 * The **`createAnswer()`** method of the RTCPeerConnection interface creates an SDP answer to an offer received from a remote peer during the offer/answer negotiation of a WebRTC connection.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/createAnswer)
 */
suspend inline fun RTCPeerConnection.createAnswer(options: RTCAnswerOptions): RTCSessionDescriptionInit {
    return createAnswerAsync(
        options = options,
    ).await()
}

/**
 * The **`createAnswer()`** method of the RTCPeerConnection interface creates an SDP answer to an offer received from a remote peer during the offer/answer negotiation of a WebRTC connection.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/createAnswer)
 */
suspend inline fun RTCPeerConnection.createAnswer(): RTCSessionDescriptionInit {
    return createAnswerAsync().await()
}

/**
 * The **`createOffer()`** method of the RTCPeerConnection interface initiates the creation of an SDP offer for the purpose of starting a new WebRTC connection to a remote peer.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/createOffer)
 */
suspend inline fun RTCPeerConnection.createOffer(options: RTCOfferOptions): RTCSessionDescriptionInit {
    return createOfferAsync(
        options = options,
    ).await()
}

/**
 * The **`createOffer()`** method of the RTCPeerConnection interface initiates the creation of an SDP offer for the purpose of starting a new WebRTC connection to a remote peer.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/createOffer)
 */
suspend inline fun RTCPeerConnection.createOffer(): RTCSessionDescriptionInit {
    return createOfferAsync().await()
}

/**
 * The **`getStats()`** method of the RTCPeerConnection interface returns a promise which resolves with data providing statistics about either the overall connection or about the specified MediaStreamTrack.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/getStats)
 */
suspend inline fun RTCPeerConnection.getStats(selector: MediaStreamTrack?): RTCStatsReport {
    return getStatsAsync(
        selector = selector,
    ).await()
}

/**
 * The **`getStats()`** method of the RTCPeerConnection interface returns a promise which resolves with data providing statistics about either the overall connection or about the specified MediaStreamTrack.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/getStats)
 */
suspend inline fun RTCPeerConnection.getStats(): RTCStatsReport {
    return getStatsAsync().await()
}

/**
 * The **`setLocalDescription()`** method of the RTCPeerConnection interface changes the local description associated with the connection.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/setLocalDescription)
 */
suspend inline fun RTCPeerConnection.setLocalDescription(description: RTCLocalSessionDescriptionInit) {
    setLocalDescriptionAsync(
        description = description,
    ).await()
}

/**
 * The **`setLocalDescription()`** method of the RTCPeerConnection interface changes the local description associated with the connection.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/setLocalDescription)
 */
suspend inline fun RTCPeerConnection.setLocalDescription() {
    setLocalDescriptionAsync().await()
}

/**
 * The **`setRemoteDescription()`** method of the RTCPeerConnection interface sets the specified session description as the remote peer's current offer or answer.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/setRemoteDescription)
 */
suspend inline fun RTCPeerConnection.setRemoteDescription(description: RTCSessionDescriptionInit) {
    setRemoteDescriptionAsync(
        description = description,
    ).await()
}

/**
 * The **`generateCertificate()`** static function of the RTCPeerConnection interface creates an X.509 certificate and corresponding private key, returning a promise that resolves with the new RTCCertificate once it's generated.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/generateCertificate_static)
 */
suspend inline fun RTCPeerConnection.Companion.generateCertificate(keygenAlgorithm: Algorithm): RTCCertificate {
    return generateCertificateAsync(
        keygenAlgorithm = keygenAlgorithm,
    ).await()
}

suspend inline fun RTCPeerConnection.Companion.generateCertificate(keygenAlgorithm: String): RTCCertificate {
    return generateCertificateAsync(
        keygenAlgorithm = keygenAlgorithm,
    ).await()
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/connectionstatechange_event)
 */
inline val <C : RTCPeerConnection> C.connectionStateChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "connectionstatechange")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/datachannel_event)
 */
inline val <C : RTCPeerConnection> C.dataChannelEvent: EventInstance<RTCDataChannelEvent, C, C>
    get() = EventInstance(this, "datachannel")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/icecandidate_event)
 */
inline val <C : RTCPeerConnection> C.iceCandidateEvent: EventInstance<RTCPeerConnectionIceEvent, C, C>
    get() = EventInstance(this, "icecandidate")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/icecandidateerror_event)
 */
inline val <C : RTCPeerConnection> C.iceCandidateErrorEvent: EventInstance<RTCPeerConnectionIceErrorEvent, C, C>
    get() = EventInstance(this, "icecandidateerror")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/iceconnectionstatechange_event)
 */
inline val <C : RTCPeerConnection> C.iceConnectionStateChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "iceconnectionstatechange")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/icegatheringstatechange_event)
 */
inline val <C : RTCPeerConnection> C.iceGatheringStateChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "icegatheringstatechange")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/negotiationneeded_event)
 */
inline val <C : RTCPeerConnection> C.negotiationNeededEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "negotiationneeded")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/signalingstatechange_event)
 */
inline val <C : RTCPeerConnection> C.signalingStateChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "signalingstatechange")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/track_event)
 */
inline val <C : RTCPeerConnection> C.trackEvent: EventInstance<RTCTrackEvent, C, C>
    get() = EventInstance(this, "track")

// Automatically generated - do not modify!

package web.events

import js.array.ReadonlyArray
import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import seskar.js.JsValue
import web.time.DOMHighResTimeStamp
import kotlin.js.definedExternally

/**
 * The **`Event`** interface represents an event which takes place on an `EventTarget`.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Event)
 */
open external class Event(
    open val type: EventType<Event>,
    init: EventInit = definedExternally,
) {
    /**
     * The **`bubbles`** read-only property of the Event interface indicates whether the event bubbles up through the DOM tree or not.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Event/bubbles)
     */
    val bubbles: Boolean

    /**
     * The **`cancelable`** read-only property of the Event interface indicates whether the event can be canceled, and therefore prevented as if the event never happened.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Event/cancelable)
     */
    val cancelable: Boolean

    /**
     * The read-only **`composed`** property of the or not the event will propagate across the shadow DOM boundary into the standard DOM.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Event/composed)
     */
    val composed: Boolean

    /**
     * The **`currentTarget`** read-only property of the Event interface identifies the element to which the event handler has been attached.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Event/currentTarget)
     */
    val currentTarget: EventTarget?

    /**
     * The **`defaultPrevented`** read-only property of the Event interface returns a boolean value indicating whether or not the call to Event.preventDefault() canceled the event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Event/defaultPrevented)
     */
    val defaultPrevented: Boolean

    /**
     * The **`eventPhase`** read-only property of the being evaluated.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Event/eventPhase)
     */
    val eventPhase: EventPhase

    /**
     * The **`isTrusted`** read-only property of the when the event was generated by the user agent (including via user actions and programmatic methods such as HTMLElement.focus()), and `false` when the event was dispatched via The only exception is the `click` event, which initializes the `isTrusted` property to `false` in user agents.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Event/isTrusted)
     */
    val isTrusted: Boolean

    /**
     * The read-only **`target`** property of the dispatched.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Event/target)
     */
    val target: EventTarget?

    /**
     * The **`timeStamp`** read-only property of the Event interface returns the time (in milliseconds) at which the event was created.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Event/timeStamp)
     */
    val timeStamp: DOMHighResTimeStamp
    /**
     * The **`type`** read-only property of the Event interface returns a string containing the event's type.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Event/type)
     */
    // val type: String
    /**
     * The **`composedPath()`** method of the Event interface returns the event's path which is an array of the objects on which listeners will be invoked.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Event/composedPath)
     */
    fun composedPath(): ReadonlyArray<EventTarget>

    /**
     * The **`preventDefault()`** method of the Event interface tells the user agent that if the event does not get explicitly handled, its default action should not be taken as it normally would be.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Event/preventDefault)
     */
    fun preventDefault()

    /**
     * The **`stopImmediatePropagation()`** method of the If several listeners are attached to the same element for the same event type, they are called in the order in which they were added.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Event/stopImmediatePropagation)
     */
    fun stopImmediatePropagation()

    /**
     * The **`stopPropagation()`** method of the Event interface prevents further propagation of the current event in the capturing and bubbling phases.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Event/stopPropagation)
     */
    fun stopPropagation()
    val NONE: EventPhase
    val CAPTURING_PHASE: EventPhase
    val AT_TARGET: EventPhase
    val BUBBLING_PHASE: EventPhase

    @JsAlias(THIS)
    open fun asInit(): EventInit

    companion object {
        val NONE: EventPhase
        val CAPTURING_PHASE: EventPhase
        val AT_TARGET: EventPhase
        val BUBBLING_PHASE: EventPhase

        @JsValue("DOMContentLoaded")
        val DOM_CONTENT_LOADED: EventType<Event>

        @JsValue("abort")
        val ABORT: EventType<Event>

        @JsValue("addsourcebuffer")
        val ADD_SOURCE_BUFFER: EventType<Event>

        @JsValue("afterprint")
        val AFTER_PRINT: EventType<Event>

        @JsValue("beforematch")
        val BEFORE_MATCH: EventType<Event>

        @JsValue("beforeprint")
        val BEFORE_PRINT: EventType<Event>

        @JsValue("bufferedamountlow")
        val BUFFERED_AMOUNT_LOW: EventType<Event>

        @JsValue("cancel")
        val CANCEL: EventType<Event>

        @JsValue("canplay")
        val CAN_PLAY: EventType<Event>

        @JsValue("canplaythrough")
        val CAN_PLAY_THROUGH: EventType<Event>

        @JsValue("change")
        val CHANGE: EventType<Event>

        @JsValue("click")
        val CLICK: EventType<Event>

        @JsValue("close")
        val CLOSE: EventType<Event>

        @JsValue("closing")
        val CLOSING: EventType<Event>

        @JsValue("complete")
        val COMPLETE: EventType<Event>

        @JsValue("connect")
        val CONNECT: EventType<Event>

        @JsValue("connecting")
        val CONNECTING: EventType<Event>

        @JsValue("connectionstatechange")
        val CONNECTION_STATE_CHANGE: EventType<Event>

        @JsValue("contextlost")
        val CONTEXT_LOST: EventType<Event>

        @JsValue("contextrestored")
        val CONTEXT_RESTORED: EventType<Event>

        @JsValue("controllerchange")
        val CONTROLLER_CHANGE: EventType<Event>

        @JsValue("cuechange")
        val CUE_CHANGE: EventType<Event>

        @JsValue("dequeue")
        val DEQUEUE: EventType<Event>

        @JsValue("devicechange")
        val DEVICE_CHANGE: EventType<Event>

        @JsValue("disconnect")
        val DISCONNECT: EventType<Event>

        @JsValue("dispose")
        val DISPOSE: EventType<Event>

        @JsValue("durationchange")
        val DURATION_CHANGE: EventType<Event>

        @JsValue("emptied")
        val EMPTIED: EventType<Event>

        @JsValue("ended")
        val ENDED: EventType<Event>

        @JsValue("enter")
        val ENTER: EventType<Event>

        @JsValue("error")
        val ERROR: EventType<Event>

        @JsValue("exit")
        val EXIT: EventType<Event>

        @JsValue("fullscreenchange")
        val FULLSCREEN_CHANGE: EventType<Event>

        @JsValue("fullscreenerror")
        val FULLSCREEN_ERROR: EventType<Event>

        @JsValue("gatheringstatechange")
        val GATHERING_STATE_CHANGE: EventType<Event>

        @JsValue("iceconnectionstatechange")
        val ICE_CONNECTION_STATE_CHANGE: EventType<Event>

        @JsValue("icegatheringstatechange")
        val ICE_GATHERING_STATE_CHANGE: EventType<Event>

        @JsValue("input")
        val INPUT: EventType<Event>

        @JsValue("invalid")
        val INVALID: EventType<Event>

        @JsValue("keystatuseschange")
        val KEY_STATUSES_CHANGE: EventType<Event>

        @JsValue("languagechange")
        val LANGUAGE_CHANGE: EventType<Event>

        @JsValue("load")
        val LOAD: EventType<Event>

        @JsValue("loadeddata")
        val LOADED_DATA: EventType<Event>

        @JsValue("loadedmetadata")
        val LOADED_METADATA: EventType<Event>

        @JsValue("loadstart")
        val LOAD_START: EventType<Event>

        @JsValue("mute")
        val MUTE: EventType<Event>

        @JsValue("negotiationneeded")
        val NEGOTIATION_NEEDED: EventType<Event>

        @JsValue("offline")
        val OFFLINE: EventType<Event>

        @JsValue("online")
        val ONLINE: EventType<Event>

        @JsValue("open")
        val OPEN: EventType<Event>

        @JsValue("pause")
        val PAUSE: EventType<Event>

        @JsValue("play")
        val PLAY: EventType<Event>

        @JsValue("playing")
        val PLAYING: EventType<Event>

        @JsValue("pointerlockchange")
        val POINTER_LOCK_CHANGE: EventType<Event>

        @JsValue("pointerlockerror")
        val POINTER_LOCK_ERROR: EventType<Event>

        @JsValue("pointerrawupdate")
        val POINTER_RAW_UPDATE: EventType<Event>

        @JsValue("progress")
        val PROGRESS: EventType<Event>

        @JsValue("ratechange")
        val RATE_CHANGE: EventType<Event>

        @JsValue("readystatechange")
        val READY_STATE_CHANGE: EventType<Event>

        @JsValue("release")
        val RELEASE: EventType<Event>

        @JsValue("removesourcebuffer")
        val REMOVE_SOURCE_BUFFER: EventType<Event>

        @JsValue("reset")
        val RESET: EventType<Event>

        @JsValue("resize")
        val RESIZE: EventType<Event>

        @JsValue("resourcetimingbufferfull")
        val RESOURCE_TIMING_BUFFER_FULL: EventType<Event>

        @JsValue("resume")
        val RESUME: EventType<Event>

        @JsValue("scroll")
        val SCROLL: EventType<Event>

        @JsValue("scrollend")
        val SCROLL_END: EventType<Event>

        @JsValue("seeked")
        val SEEKED: EventType<Event>

        @JsValue("seeking")
        val SEEKING: EventType<Event>

        @JsValue("select")
        val SELECT: EventType<Event>

        @JsValue("selectedcandidatepairchange")
        val SELECTED_CANDIDATE_PAIR_CHANGE: EventType<Event>

        @JsValue("selectionchange")
        val SELECTION_CHANGE: EventType<Event>

        @JsValue("selectstart")
        val SELECT_START: EventType<Event>

        @JsValue("show")
        val SHOW: EventType<Event>

        @JsValue("signalingstatechange")
        val SIGNALING_STATE_CHANGE: EventType<Event>

        @JsValue("slotchange")
        val SLOT_CHANGE: EventType<Event>

        @JsValue("sourceclose")
        val SOURCE_CLOSE: EventType<Event>

        @JsValue("sourceended")
        val SOURCE_ENDED: EventType<Event>

        @JsValue("sourceopen")
        val SOURCE_OPEN: EventType<Event>

        @JsValue("stalled")
        val STALLED: EventType<Event>

        @JsValue("start")
        val START: EventType<Event>

        @JsValue("statechange")
        val STATE_CHANGE: EventType<Event>

        @JsValue("stop")
        val STOP: EventType<Event>

        @JsValue("success")
        val SUCCESS: EventType<Event>

        @JsValue("suspend")
        val SUSPEND: EventType<Event>

        @JsValue("timeupdate")
        val TIME_UPDATE: EventType<Event>

        @JsValue("unload")
        val UNLOAD: EventType<Event>

        @JsValue("unmute")
        val UNMUTE: EventType<Event>

        @JsValue("update")
        val UPDATE: EventType<Event>

        @JsValue("updateend")
        val UPDATE_END: EventType<Event>

        @JsValue("updatefound")
        val UPDATE_FOUND: EventType<Event>

        @JsValue("updatestart")
        val UPDATE_START: EventType<Event>

        @JsValue("visibilitychange")
        val VISIBILITY_CHANGE: EventType<Event>

        @JsValue("voiceschanged")
        val VOICES_CHANGED: EventType<Event>

        @JsValue("volumechange")
        val VOLUME_CHANGE: EventType<Event>

        @JsValue("waiting")
        val WAITING: EventType<Event>

        @JsValue("waitingforkey")
        val WAITING_FOR_KEY: EventType<Event>

        @JsValue("webkitanimationend")
        val WEBKIT_ANIMATION_END: EventType<Event>

        @JsValue("webkitanimationiteration")
        val WEBKIT_ANIMATION_ITERATION: EventType<Event>

        @JsValue("webkitanimationstart")
        val WEBKIT_ANIMATION_START: EventType<Event>

        @JsValue("webkitfullscreenchange")
        val WEBKIT_FULLSCREEN_CHANGE: EventType<Event>

        @JsValue("webkittransitionend")
        val WEBKIT_TRANSITION_END: EventType<Event>
    }
}

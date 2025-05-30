// Automatically generated - do not modify!

package web.vtt

import web.events.*

/**
 * The **`TextTrackCue`** interface of the WebVTT API is the abstract base class for the various derived cue types, such as VTTCue; you will work with these derived types rather than the base class.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackCue)
 */
open external class TextTrackCue
private constructor() :
    EventTarget {
    /**
     * Returns the text track cue end time, in seconds.
     *
     * Can be set.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackCue/endTime)
     */
    var endTime: Double

    /**
     * Returns the text track cue identifier.
     *
     * Can be set.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackCue/id)
     */
    var id: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackCue/enter_event)
     */
    var onenter: EventHandler<Event, TextTrackCue, TextTrackCue>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackCue/exit_event)
     */
    var onexit: EventHandler<Event, TextTrackCue, TextTrackCue>?

    /**
     * Returns true if the text track cue pause-on-exit flag is set, false otherwise.
     *
     * Can be set.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackCue/pauseOnExit)
     */
    var pauseOnExit: Boolean

    /**
     * Returns the text track cue start time, in seconds.
     *
     * Can be set.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackCue/startTime)
     */
    var startTime: Double

    /**
     * Returns the TextTrack object to which this text track cue belongs, if any, or null otherwise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackCue/track)
     */
    val track: TextTrack?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackCue/enter_event)
     */
    @JsEvent("enter")
    val enterEvent: EventInstance<Event, TextTrackCue /* this */, TextTrackCue /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackCue/exit_event)
     */
    @JsEvent("exit")
    val exitEvent: EventInstance<Event, TextTrackCue /* this */, TextTrackCue /* this */>
}

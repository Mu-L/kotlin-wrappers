// Automatically generated - do not modify!

package web.midi

import web.events.EventHandler
import web.events.EventInstance
import web.events.JsEvent

/**
 * The **`MIDIInput`** interface of the Web MIDI API receives messages from a MIDI input port.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIInput)
 */
external class MIDIInput
private constructor() :
    MIDIPort {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIInput/midimessage_event)
     */
    var onmidimessage: EventHandler<MIDIMessageEvent, MIDIInput, MIDIInput>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIInput/midimessage_event)
     */
    @JsEvent("midimessage")
    val midiMessageEvent: EventInstance<MIDIMessageEvent, MIDIInput /* this */, MIDIInput /* this */>
}

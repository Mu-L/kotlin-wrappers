package react.internal

import kotlinx.coroutines.test.runTest
import web.events.*
import web.window.clickEvent
import web.window.mouseUpEvent
import web.window.window
import kotlin.test.Test
import kotlin.test.assertEquals

class IsolatedJobTest {
    @Test
    fun launch() = runTest {
        var a = 13

        isolatedJob {
            a = 42
        }

        assertEquals(42, a)
    }

    @Test
    fun launchWithSubscribe() = runTest {
        var a = 13

        isolatedJob {
            window.clickEvent.subscribe { /* do nothing */ }
            window.mouseUpEvent.subscribe { /* do nothing */ }

            a = 42
        }

        assertEquals(42, a)
    }

    // TODO: use common
    private val EventTarget.changeEvent: EventInstance<Event, EventTarget, EventTarget>
        get() = EventInstance(this, Event.CHANGE)

    @Test
    fun launchWithSubscribeCheck() = runTest {
        var a = 13
        val target = EventTarget()

        isolatedJob {
            target.changeEvent.subscribe { a++ }

            a = 42
        }

        assertEquals(42, a)

        target.dispatchEvent(Event(Event.CHANGE))
        assertEquals(43, a)

        target.dispatchEvent(Event(Event.CHANGE))
        assertEquals(44, a)
    }
}

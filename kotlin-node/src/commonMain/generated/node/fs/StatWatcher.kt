// Generated by Karakum - do not modify it manually!

package node.fs

import node.events.EventEmitter

/**
 * Class: fs.StatWatcher
 * @since v14.3.0, v12.20.0
 * Extends `EventEmitter`
 * A successful call to {@link watchFile} method will return a new fs.StatWatcher object.
 */
@Suppress("INTERFACE_WITH_SUPERCLASS")
sealed external interface StatWatcher : EventEmitter {
    /**
     * When called, requests that the Node.js event loop _not_ exit so long as the `fs.StatWatcher` is active. Calling `watcher.ref()` multiple times will have
     * no effect.
     *
     * By default, all `fs.StatWatcher` objects are "ref'ed", making it normally
     * unnecessary to call `watcher.ref()` unless `watcher.unref()` had been
     * called previously.
     * @since v14.3.0, v12.20.0
     */
    fun ref() // this

    /**
     * When called, the active `fs.StatWatcher` object will not require the Node.js
     * event loop to remain active. If there is no other activity keeping the
     * event loop running, the process may exit before the `fs.StatWatcher` object's
     * callback is invoked. Calling `watcher.unref()` multiple times will have
     * no effect.
     * @since v14.3.0, v12.20.0
     */
    fun unref() // this
}

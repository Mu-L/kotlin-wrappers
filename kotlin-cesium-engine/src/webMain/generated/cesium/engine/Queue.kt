// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import js.core.JsAny

/**
 * A queue that can enqueue items at the end, and dequeue items from the front.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Queue.html">Online Documentation</a>
 */
external class Queue() {
    /**
     * The length of the queue.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Queue.html#length">Online Documentation</a>
     */
    val length: Int

    /**
     * Enqueues the specified item.
     * @param [item] The item to enqueue.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Queue.html#enqueue">Online Documentation</a>
     */
    fun enqueue(item: JsAny)

    /**
     * Dequeues an item.  Returns undefined if the queue is empty.
     * @return The the dequeued item.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Queue.html#dequeue">Online Documentation</a>
     */
    fun dequeue(): JsAny

    /**
     * Returns the item at the front of the queue.  Returns undefined if the queue is empty.
     * @return The item at the front of the queue.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Queue.html#peek">Online Documentation</a>
     */
    fun peek(): JsAny

    /**
     * Check whether this queue contains the specified item.
     * @param [item] The item to search for.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Queue.html#contains">Online Documentation</a>
     */
    fun contains(item: JsAny)

    /**
     * Remove all items from the queue.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Queue.html#clear">Online Documentation</a>
     */
    fun clear()

    /**
     * Sort the items in the queue in-place.
     * @param [compareFunction] A function that defines the sort order.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Queue.html#sort">Online Documentation</a>
     */
    fun sort(compareFunction: Comparator)
}

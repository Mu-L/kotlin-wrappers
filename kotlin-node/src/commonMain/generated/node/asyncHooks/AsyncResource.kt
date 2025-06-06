// Generated by Karakum - do not modify it manually!

@file:JsModule("node:async_hooks")

package node.asyncHooks

/**
 * The class `AsyncResource` is designed to be extended by the embedder's async
 * resources. Using this, users can easily trigger the lifetime events of their
 * own resources.
 *
 * The `init` hook will trigger when an `AsyncResource` is instantiated.
 *
 * The following is an overview of the `AsyncResource` API.
 *
 * ```js
 * import { AsyncResource, executionAsyncId } from 'node:async_hooks';
 *
 * // AsyncResource() is meant to be extended. Instantiating a
 * // new AsyncResource() also triggers init. If triggerAsyncId is omitted then
 * // async_hook.executionAsyncId() is used.
 * const asyncResource = new AsyncResource(
 *   type, { triggerAsyncId: executionAsyncId(), requireManualDestroy: false },
 * );
 *
 * // Run a function in the execution context of the resource. This will
 * // * establish the context of the resource
 * // * trigger the AsyncHooks before callbacks
 * // * call the provided function `fn` with the supplied arguments
 * // * trigger the AsyncHooks after callbacks
 * // * restore the original execution context
 * asyncResource.runInAsyncScope(fn, thisArg, ...args);
 *
 * // Call AsyncHooks destroy callbacks.
 * asyncResource.emitDestroy();
 *
 * // Return the unique ID assigned to the AsyncResource instance.
 * asyncResource.asyncId();
 *
 * // Return the trigger ID for the AsyncResource instance.
 * asyncResource.triggerAsyncId();
 * ```
 */
open external class AsyncResource {
    /**
     * AsyncResource() is meant to be extended. Instantiating a
     * new AsyncResource() also triggers init. If triggerAsyncId is omitted then
     * async_hook.executionAsyncId() is used.
     * @param type The type of async event.
     * @param triggerAsyncId The ID of the execution context that created
     *   this async event (default: `executionAsyncId()`), or an
     *   AsyncResourceOptions object (since v9.3.0)
     */
    constructor (type: String)

    /**
     * AsyncResource() is meant to be extended. Instantiating a
     * new AsyncResource() also triggers init. If triggerAsyncId is omitted then
     * async_hook.executionAsyncId() is used.
     * @param type The type of async event.
     * @param triggerAsyncId The ID of the execution context that created
     *   this async event (default: `executionAsyncId()`), or an
     *   AsyncResourceOptions object (since v9.3.0)
     */
    constructor (type: String, triggerAsyncId: Double = definedExternally)

    /**
     * AsyncResource() is meant to be extended. Instantiating a
     * new AsyncResource() also triggers init. If triggerAsyncId is omitted then
     * async_hook.executionAsyncId() is used.
     * @param type The type of async event.
     * @param triggerAsyncId The ID of the execution context that created
     *   this async event (default: `executionAsyncId()`), or an
     *   AsyncResourceOptions object (since v9.3.0)
     */
    constructor (type: String, triggerAsyncId: AsyncResourceOptions = definedExternally)

    /**
     * Binds the given function to execute to this `AsyncResource`'s scope.
     * @since v14.8.0, v12.19.0
     * @param fn The function to bind to the current `AsyncResource`.
     */
    fun <Func : Function<Any?> /* (...args: any[]) => any */> bind(fn: Func): Func

    /**
     * Call the provided function with the provided arguments in the execution context
     * of the async resource. This will establish the context, trigger the AsyncHooks
     * before callbacks, call the function, trigger the AsyncHooks after callbacks, and
     * then restore the original execution context.
     * @since v9.6.0
     * @param fn The function to call in the execution context of this async resource.
     * @param thisArg The receiver to be used for the function call.
     * @param args Optional arguments to pass to the function.
     */
    fun <This, Result> runInAsyncScope(
        fn: Function<Result>, /* (this: This, ...args: any[]) => Result */
        thisArg: This = definedExternally,
        vararg args: Any?,
    ): Result

    /**
     * Call all `destroy` hooks. This should only ever be called once. An error will
     * be thrown if it is called more than once. This **must** be manually called. If
     * the resource is left to be collected by the GC then the `destroy` hooks will
     * never be called.
     * @return A reference to `asyncResource`.
     */
    fun emitDestroy() // this

    /**
     * @return The unique `asyncId` assigned to the resource.
     */
    fun asyncId(): Double

    /**
     * @return The same `triggerAsyncId` that is passed to the `AsyncResource` constructor.
     */
    fun triggerAsyncId(): Double

    companion object {
        /**
         * Binds the given function to the current execution context.
         * @since v14.8.0, v12.19.0
         * @param fn The function to bind to the current execution context.
         * @param type An optional name to associate with the underlying `AsyncResource`.
         */
        fun <Func : Function<Any?> /* (this: ThisArg, ...args: any[]) => any */, ThisArg> bind(
            fn: Func,
            type: String = definedExternally,
            thisArg: ThisArg = definedExternally,
        ): Func
    }
}

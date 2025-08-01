package js.promise.internal

import js.core.JsAny
import js.promise.PromiseLike
import js.promise.PromiseResult
import js.promise.thenTo
import js.promise.toPromise
import kotlin.coroutines.suspendCoroutine

@PublishedApi
internal suspend fun <T : JsAny?> awaitPromiseResult(
    promise: PromiseResult<T>,
): T =
    awaitPromiseLike(promise.toPromise())

@PublishedApi
internal suspend fun <T : JsAny?> awaitPromiseLike(
    promise: PromiseLike<T>,
): T =
    suspendCoroutine(promise::thenTo)

// Used in the compiler plugin
internal suspend fun <T : JsAny?> awaitOptionalPromiseLike(
    promise: PromiseLike<T>?,
): T? =
    if (promise != null) {
        awaitPromiseLike(promise)
    } else null

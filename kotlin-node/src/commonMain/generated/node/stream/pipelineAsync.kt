// Generated by Karakum - do not modify it manually!

@file:JsModule("node:stream/promises")

package node.stream

import js.array.ReadonlyArray
import js.promise.Promise

@JsName("pipeline")
external fun <A : PipelineSource<Any?>, B : PipelineDestination<A, Any?>> pipelineAsync(
    source: A,
    destination: B,
    options: PipelineOptions = definedExternally,
): PipelinePromise<B>

@JsName("pipeline")
external fun <A : PipelineSource<Any?>, T1 : PipelineTransform<A, Any?>, B : PipelineDestination<T1, Any?>> pipelineAsync(
    source: A,
    transform1: T1,
    destination: B,
    options: PipelineOptions = definedExternally,
): PipelinePromise<B>

@JsName("pipeline")
external fun <A : PipelineSource<Any?>, T1 : PipelineTransform<A, Any?>, T2 : PipelineTransform<T1, Any?>, B : PipelineDestination<T2, Any?>> pipelineAsync(
    source: A,
    transform1: T1,
    transform2: T2,
    destination: B,
    options: PipelineOptions = definedExternally,
): PipelinePromise<B>

@JsName("pipeline")
external fun <A : PipelineSource<Any?>, T1 : PipelineTransform<A, Any?>, T2 : PipelineTransform<T1, Any?>, T3 : PipelineTransform<T2, Any?>, B : PipelineDestination<T3, Any?>> pipelineAsync(
    source: A,
    transform1: T1,
    transform2: T2,
    transform3: T3,
    destination: B,
    options: PipelineOptions = definedExternally,
): PipelinePromise<B>

@JsName("pipeline")
external fun <A : PipelineSource<Any?>, T1 : PipelineTransform<A, Any?>, T2 : PipelineTransform<T1, Any?>, T3 : PipelineTransform<T2, Any?>, T4 : PipelineTransform<T3, Any?>, B : PipelineDestination<T4, Any?>> pipelineAsync(
    source: A,
    transform1: T1,
    transform2: T2,
    transform3: T3,
    transform4: T4,
    destination: B,
    options: PipelineOptions = definedExternally,
): PipelinePromise<B>

@JsName("pipeline")
external fun pipelineAsync(
    streams: ReadonlyArray<Any /* NodeJS.ReadableStream | NodeJS.WritableStream | NodeJS.ReadWriteStream */>,
    options: PipelineOptions = definedExternally,
): Promise<js.core.Void>

@JsName("pipeline")
external fun pipelineAsync(
    stream1: node.ReadableStream,
    stream2: node.ReadWriteStream,
    vararg streams: Any, // NodeJS.ReadWriteStream | NodeJS.WritableStream | PipelineOptions
): Promise<js.core.Void>

@JsName("pipeline")
external fun pipelineAsync(
    stream1: node.ReadableStream,
    stream2: node.WritableStream,
    vararg streams: Any, // NodeJS.ReadWriteStream | NodeJS.WritableStream | PipelineOptions
): Promise<js.core.Void>

// Generated by Karakum - do not modify it manually!

package node.stream.consumers

import js.buffer.ArrayBuffer
import js.iterable.AsyncIterable
import node.stream.Readable

@seskar.js.JsAsync
external suspend fun arrayBuffer(stream: node.ReadableStream): ArrayBuffer

@seskar.js.JsAsync
external suspend fun arrayBuffer(stream: Readable): ArrayBuffer

@seskar.js.JsAsync
external suspend fun arrayBuffer(stream: AsyncIterable<Any?>): ArrayBuffer

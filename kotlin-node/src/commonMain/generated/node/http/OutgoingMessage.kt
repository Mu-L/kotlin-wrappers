// Generated by Karakum - do not modify it manually!

@file:JsModule("node:http")

package node.http

import js.array.ReadonlyArray
import node.net.Socket
import web.http.Headers

/**
 * This class serves as the parent class of {@link ClientRequest} and {@link ServerResponse}. It is an abstract outgoing message from
 * the perspective of the participants of an HTTP transaction.
 * @since v0.1.17
 */
open external class OutgoingMessage<Request : IncomingMessage /* default is IncomingMessage */> : node.stream.Writable {
    constructor ()

    val req: Request
    var chunkedEncoding: Boolean
    var shouldKeepAlive: Boolean
    var useChunkedEncodingByDefault: Boolean
    var sendDate: Boolean

    /**
     * @deprecated Use `writableEnded` instead.
     */
    var finished: Boolean

    /**
     * Read-only. `true` if the headers were sent, otherwise `false`.
     * @since v0.9.3
     */
    val headersSent: Boolean

    /**
     * Alias of `outgoingMessage.socket`.
     * @since v0.3.0
     * @deprecated Since v15.12.0,v14.17.1 - Use `socket` instead.
     */
    val connection: Socket?

    /**
     * Reference to the underlying socket. Usually, users will not want to access
     * this property.
     *
     * After calling `outgoingMessage.end()`, this property will be nulled.
     * @since v0.3.0
     */
    val socket: Socket?

    /**
     * Once a socket is associated with the message and is connected, `socket.setTimeout()` will be called with `msecs` as the first parameter.
     * @since v0.9.12
     * @param callback Optional function to be called when a timeout occurs. Same as binding to the `timeout` event.
     */
    open fun setTimeout(msecs: Number, callback: () -> Unit = definedExternally) // this

    /**
     * Sets a single header value. If the header already exists in the to-be-sent
     * headers, its value will be replaced. Use an array of strings to send multiple
     * headers with the same name.
     * @since v0.4.0
     * @param name Header name
     * @param value Header value
     */
    fun setHeader(name: String, value: Double) // this

    /**
     * Sets a single header value. If the header already exists in the to-be-sent
     * headers, its value will be replaced. Use an array of strings to send multiple
     * headers with the same name.
     * @since v0.4.0
     * @param name Header name
     * @param value Header value
     */
    fun setHeader(name: String, value: String) // this

    /**
     * Sets a single header value. If the header already exists in the to-be-sent
     * headers, its value will be replaced. Use an array of strings to send multiple
     * headers with the same name.
     * @since v0.4.0
     * @param name Header name
     * @param value Header value
     */
    fun setHeader(name: String, value: ReadonlyArray<String>) // this

    /**
     * Sets multiple header values for implicit headers. headers must be an instance of
     * `Headers` or `Map`, if a header already exists in the to-be-sent headers, its
     * value will be replaced.
     *
     * ```js
     * const headers = new Headers({ foo: 'bar' });
     * outgoingMessage.setHeaders(headers);
     * ```
     *
     * or
     *
     * ```js
     * const headers = new Map([['foo', 'bar']]);
     * outgoingMessage.setHeaders(headers);
     * ```
     *
     * When headers have been set with `outgoingMessage.setHeaders()`, they will be
     * merged with any headers passed to `response.writeHead()`, with the headers passed
     * to `response.writeHead()` given precedence.
     *
     * ```js
     * // Returns content-type = text/plain
     * const server = http.createServer((req, res) => {
     *   const headers = new Headers({ 'Content-Type': 'text/html' });
     *   res.setHeaders(headers);
     *   res.writeHead(200, { 'Content-Type': 'text/plain' });
     *   res.end('ok');
     * });
     * ```
     *
     * @since v19.6.0, v18.15.0
     * @param name Header name
     * @param value Header value
     */
    fun setHeaders(headers: Headers) // this

    /**
     * Sets multiple header values for implicit headers. headers must be an instance of
     * `Headers` or `Map`, if a header already exists in the to-be-sent headers, its
     * value will be replaced.
     *
     * ```js
     * const headers = new Headers({ foo: 'bar' });
     * outgoingMessage.setHeaders(headers);
     * ```
     *
     * or
     *
     * ```js
     * const headers = new Map([['foo', 'bar']]);
     * outgoingMessage.setHeaders(headers);
     * ```
     *
     * When headers have been set with `outgoingMessage.setHeaders()`, they will be
     * merged with any headers passed to `response.writeHead()`, with the headers passed
     * to `response.writeHead()` given precedence.
     *
     * ```js
     * // Returns content-type = text/plain
     * const server = http.createServer((req, res) => {
     *   const headers = new Headers({ 'Content-Type': 'text/html' });
     *   res.setHeaders(headers);
     *   res.writeHead(200, { 'Content-Type': 'text/plain' });
     *   res.end('ok');
     * });
     * ```
     *
     * @since v19.6.0, v18.15.0
     * @param name Header name
     * @param value Header value
     */
    fun setHeaders(headers: Map<String, Any /* number | string | readonly string[] */>) // this

    /**
     * Append a single header value to the header object.
     *
     * If the value is an array, this is equivalent to calling this method multiple
     * times.
     *
     * If there were no previous values for the header, this is equivalent to calling `outgoingMessage.setHeader(name, value)`.
     *
     * Depending of the value of `options.uniqueHeaders` when the client request or the
     * server were created, this will end up in the header being sent multiple times or
     * a single time with values joined using `; `.
     * @since v18.3.0, v16.17.0
     * @param name Header name
     * @param value Header value
     */
    fun appendHeader(name: String, value: String) // this

    /**
     * Append a single header value to the header object.
     *
     * If the value is an array, this is equivalent to calling this method multiple
     * times.
     *
     * If there were no previous values for the header, this is equivalent to calling `outgoingMessage.setHeader(name, value)`.
     *
     * Depending of the value of `options.uniqueHeaders` when the client request or the
     * server were created, this will end up in the header being sent multiple times or
     * a single time with values joined using `; `.
     * @since v18.3.0, v16.17.0
     * @param name Header name
     * @param value Header value
     */
    fun appendHeader(name: String, value: ReadonlyArray<String>) // this

    /**
     * Gets the value of the HTTP header with the given name. If that header is not
     * set, the returned value will be `undefined`.
     * @since v0.4.0
     * @param name Name of header
     */
    fun getHeader(name: String): Any? // number | string | string[] | undefined

    /**
     * Returns a shallow copy of the current outgoing headers. Since a shallow
     * copy is used, array values may be mutated without additional calls to
     * various header-related HTTP module methods. The keys of the returned
     * object are the header names and the values are the respective header
     * values. All header names are lowercase.
     *
     * The object returned by the `outgoingMessage.getHeaders()` method does
     * not prototypically inherit from the JavaScript `Object`. This means that
     * typical `Object` methods such as `obj.toString()`, `obj.hasOwnProperty()`,
     * and others are not defined and will not work.
     *
     * ```js
     * outgoingMessage.setHeader('Foo', 'bar');
     * outgoingMessage.setHeader('Set-Cookie', ['foo=bar', 'bar=baz']);
     *
     * const headers = outgoingMessage.getHeaders();
     * // headers === { foo: 'bar', 'set-cookie': ['foo=bar', 'bar=baz'] }
     * ```
     * @since v7.7.0
     */
    fun getHeaders(): OutgoingHttpHeaders

    /**
     * Returns an array containing the unique names of the current outgoing headers.
     * All names are lowercase.
     * @since v7.7.0
     */
    fun getHeaderNames(): ReadonlyArray<String>

    /**
     * Returns `true` if the header identified by `name` is currently set in the
     * outgoing headers. The header name is case-insensitive.
     *
     * ```js
     * const hasContentType = outgoingMessage.hasHeader('content-type');
     * ```
     * @since v7.7.0
     */
    fun hasHeader(name: String): Boolean

    /**
     * Removes a header that is queued for implicit sending.
     *
     * ```js
     * outgoingMessage.removeHeader('Content-Encoding');
     * ```
     * @since v0.4.0
     * @param name Header name
     */
    fun removeHeader(name: String)

    /**
     * Adds HTTP trailers (headers but at the end of the message) to the message.
     *
     * Trailers will **only** be emitted if the message is chunked encoded. If not,
     * the trailers will be silently discarded.
     *
     * HTTP requires the `Trailer` header to be sent to emit trailers,
     * with a list of header field names in its value, e.g.
     *
     * ```js
     * message.writeHead(200, { 'Content-Type': 'text/plain',
     *                          'Trailer': 'Content-MD5' });
     * message.write(fileData);
     * message.addTrailers({ 'Content-MD5': '7895bf4b8828b55ceaf47747b4bca667' });
     * message.end();
     * ```
     *
     * Attempting to set a header field name or value that contains invalid characters
     * will result in a `TypeError` being thrown.
     * @since v0.3.0
     */
    fun addTrailers(headers: OutgoingHttpHeaders)

    /**
     * Adds HTTP trailers (headers but at the end of the message) to the message.
     *
     * Trailers will **only** be emitted if the message is chunked encoded. If not,
     * the trailers will be silently discarded.
     *
     * HTTP requires the `Trailer` header to be sent to emit trailers,
     * with a list of header field names in its value, e.g.
     *
     * ```js
     * message.writeHead(200, { 'Content-Type': 'text/plain',
     *                          'Trailer': 'Content-MD5' });
     * message.write(fileData);
     * message.addTrailers({ 'Content-MD5': '7895bf4b8828b55ceaf47747b4bca667' });
     * message.end();
     * ```
     *
     * Attempting to set a header field name or value that contains invalid characters
     * will result in a `TypeError` being thrown.
     * @since v0.3.0
     */
    fun addTrailers(headers: ReadonlyArray<js.array.Tuple2<String, String>>)

    /**
     * Flushes the message headers.
     *
     * For efficiency reason, Node.js normally buffers the message headers
     * until `outgoingMessage.end()` is called or the first chunk of message data
     * is written. It then tries to pack the headers and data into a single TCP
     * packet.
     *
     * It is usually desired (it saves a TCP round-trip), but not when the first
     * data is not sent until possibly much later. `outgoingMessage.flushHeaders()` bypasses the optimization and kickstarts the message.
     * @since v1.6.0
     */
    fun flushHeaders()
}

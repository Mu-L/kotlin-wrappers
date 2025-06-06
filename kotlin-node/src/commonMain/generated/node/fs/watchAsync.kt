// Generated by Karakum - do not modify it manually!

@file:JsModule("node:fs/promises")

package node.fs

import js.iterable.AsyncIterable

/**
 * Returns an async iterator that watches for changes on `filename`, where `filename`is either a file or a directory.
 *
 * ```js
 * import { watch } from 'node:fs/promises';
 *
 * const ac = new AbortController();
 * const { signal } = ac;
 * setTimeout(() => ac.abort(), 10000);
 *
 * (async () => {
 *   try {
 *     const watcher = watch(__filename, { signal });
 *     for await (const event of watcher)
 *       console.log(event);
 *   } catch (err) {
 *     if (err.name === 'AbortError')
 *       return;
 *     throw err;
 *   }
 * })();
 * ```
 *
 * On most platforms, `'rename'` is emitted whenever a filename appears or
 * disappears in the directory.
 *
 * All the `caveats` for `fs.watch()` also apply to `fsPromises.watch()`.
 * @since v15.9.0, v14.18.0
 * @return of objects with the properties:
 */
external fun watch(
    filename: PathLike,
    options: WatchBufferAsyncOptions,
): AsyncIterable<FileChangeInfo<node.buffer.Buffer<*>>>

/**
 * Returns an async iterator that watches for changes on `filename`, where `filename`is either a file or a directory.
 *
 * ```js
 * import { watch } from 'node:fs/promises';
 *
 * const ac = new AbortController();
 * const { signal } = ac;
 * setTimeout(() => ac.abort(), 10000);
 *
 * (async () => {
 *   try {
 *     const watcher = watch(__filename, { signal });
 *     for await (const event of watcher)
 *       console.log(event);
 *   } catch (err) {
 *     if (err.name === 'AbortError')
 *       return;
 *     throw err;
 *   }
 * })();
 * ```
 *
 * On most platforms, `'rename'` is emitted whenever a filename appears or
 * disappears in the directory.
 *
 * All the `caveats` for `fs.watch()` also apply to `fsPromises.watch()`.
 * @since v15.9.0, v14.18.0
 * @return of objects with the properties:
 */

/**
 * Watch for changes on `filename`, where `filename` is either a file or a directory, returning an `FSWatcher`.
 * @param filename A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
 * @param options Either the encoding for the filename provided to the listener, or an object optionally specifying encoding, persistent, and recursive options.
 * If `encoding` is not supplied, the default of `'utf8'` is used.
 * If `persistent` is not supplied, the default of `true` is used.
 * If `recursive` is not supplied, the default of `false` is used.
 */
external fun watch(filename: PathLike): AsyncIterable<FileChangeInfo<String>>

/**
 * Watch for changes on `filename`, where `filename` is either a file or a directory, returning an `FSWatcher`.
 * @param filename A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
 * @param options Either the encoding for the filename provided to the listener, or an object optionally specifying encoding, persistent, and recursive options.
 * If `encoding` is not supplied, the default of `'utf8'` is used.
 * If `persistent` is not supplied, the default of `true` is used.
 * If `recursive` is not supplied, the default of `false` is used.
 */
external fun watch(
    filename: PathLike,
    options: WatchOptions = definedExternally,
): AsyncIterable<FileChangeInfo<String>>

/**
 * Watch for changes on `filename`, where `filename` is either a file or a directory, returning an `FSWatcher`.
 * @param filename A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
 * @param options Either the encoding for the filename provided to the listener, or an object optionally specifying encoding, persistent, and recursive options.
 * If `encoding` is not supplied, the default of `'utf8'` is used.
 * If `persistent` is not supplied, the default of `true` is used.
 * If `recursive` is not supplied, the default of `false` is used.
 */
external fun watch(
    filename: PathLike,
    options: node.buffer.BufferEncoding = definedExternally,
): AsyncIterable<FileChangeInfo<String>>

/**
 * Watch for changes on `filename`, where `filename` is either a file or a directory, returning an `FSWatcher`.
 * @param filename A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
 * @param options Either the encoding for the filename provided to the listener, or an object optionally specifying encoding, persistent, and recursive options.
 * If `encoding` is not supplied, the default of `'utf8'` is used.
 * If `persistent` is not supplied, the default of `true` is used.
 * If `recursive` is not supplied, the default of `false` is used.
 */

/**
 * Watch for changes on `filename`, where `filename` is either a file or a directory, returning an `FSWatcher`.
 * @param filename A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
 * @param options Either the encoding for the filename provided to the listener, or an object optionally specifying encoding, persistent, and recursive options.
 * If `encoding` is not supplied, the default of `'utf8'` is used.
 * If `persistent` is not supplied, the default of `true` is used.
 * If `recursive` is not supplied, the default of `false` is used.
 */
external fun watch(
    filename: PathLike,
    options: String,
): Any // AsyncIterable<FileChangeInfo<string>> | AsyncIterable<FileChangeInfo<Buffer>>

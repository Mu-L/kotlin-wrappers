// Generated by Karakum - do not modify it manually!

@file:JsModule("node:fs")

package node.fs

import js.typedarrays.Uint8Array

/**
 * Asynchronously append data to a file, creating the file if it does not yet
 * exist. `data` can be a string or a `Buffer`.
 *
 * The `mode` option only affects the newly created file. See {@link open} for more details.
 *
 * ```js
 * import { appendFile } from 'node:fs';
 *
 * appendFile('message.txt', 'data to append', (err) => {
 *   if (err) throw err;
 *   console.log('The "data to append" was appended to file!');
 * });
 * ```
 *
 * If `options` is a string, then it specifies the encoding:
 *
 * ```js
 * import { appendFile } from 'node:fs';
 *
 * appendFile('message.txt', 'data to append', 'utf8', callback);
 * ```
 *
 * The `path` may be specified as a numeric file descriptor that has been opened
 * for appending (using `fs.open()` or `fs.openSync()`). The file descriptor will
 * not be closed automatically.
 *
 * ```js
 * import { open, close, appendFile } from 'node:fs';
 *
 * function closeFd(fd) {
 *   close(fd, (err) => {
 *     if (err) throw err;
 *   });
 * }
 *
 * open('message.txt', 'a', (err, fd) => {
 *   if (err) throw err;
 *
 *   try {
 *     appendFile(fd, 'data to append', 'utf8', (err) => {
 *       closeFd(fd);
 *       if (err) throw err;
 *     });
 *   } catch (err) {
 *     closeFd(fd);
 *     throw err;
 *   }
 * });
 * ```
 * @since v0.6.7
 * @param path filename or file descriptor
 */
external fun appendFile(
    path: PathOrFileDescriptor,
    data: String,
    options: WriteFileOptions,
    callback: NoParamCallback,
)

/**
 * Asynchronously append data to a file, creating the file if it does not yet
 * exist. `data` can be a string or a `Buffer`.
 *
 * The `mode` option only affects the newly created file. See {@link open} for more details.
 *
 * ```js
 * import { appendFile } from 'node:fs';
 *
 * appendFile('message.txt', 'data to append', (err) => {
 *   if (err) throw err;
 *   console.log('The "data to append" was appended to file!');
 * });
 * ```
 *
 * If `options` is a string, then it specifies the encoding:
 *
 * ```js
 * import { appendFile } from 'node:fs';
 *
 * appendFile('message.txt', 'data to append', 'utf8', callback);
 * ```
 *
 * The `path` may be specified as a numeric file descriptor that has been opened
 * for appending (using `fs.open()` or `fs.openSync()`). The file descriptor will
 * not be closed automatically.
 *
 * ```js
 * import { open, close, appendFile } from 'node:fs';
 *
 * function closeFd(fd) {
 *   close(fd, (err) => {
 *     if (err) throw err;
 *   });
 * }
 *
 * open('message.txt', 'a', (err, fd) => {
 *   if (err) throw err;
 *
 *   try {
 *     appendFile(fd, 'data to append', 'utf8', (err) => {
 *       closeFd(fd);
 *       if (err) throw err;
 *     });
 *   } catch (err) {
 *     closeFd(fd);
 *     throw err;
 *   }
 * });
 * ```
 * @since v0.6.7
 * @param path filename or file descriptor
 */
external fun appendFile(
    path: PathOrFileDescriptor,
    data: Uint8Array<*>,
    options: WriteFileOptions,
    callback: NoParamCallback,
)

/**
 * Asynchronously append data to a file, creating the file if it does not exist.
 * @param file A path to a file. If a URL is provided, it must use the `file:` protocol.
 * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
 * @param data The data to write. If something other than a Buffer or Uint8Array is provided, the value is coerced to a string.
 */
external fun appendFile(
    file: PathOrFileDescriptor,
    data: String,
    callback: NoParamCallback,
)

/**
 * Asynchronously append data to a file, creating the file if it does not exist.
 * @param file A path to a file. If a URL is provided, it must use the `file:` protocol.
 * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
 * @param data The data to write. If something other than a Buffer or Uint8Array is provided, the value is coerced to a string.
 */
external fun appendFile(
    file: PathOrFileDescriptor,
    data: Uint8Array<*>,
    callback: NoParamCallback,
)

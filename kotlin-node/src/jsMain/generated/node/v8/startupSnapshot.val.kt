// Generated by Karakum - do not modify it manually!

@file:JsModule("node:v8")

package node.v8

/**
 * The `v8.startupSnapshot` interface can be used to add serialization and deserialization hooks for custom startup snapshots.
 *
 * ```bash
 * $ node --snapshot-blob snapshot.blob --build-snapshot entry.js
 * # This launches a process with the snapshot
 * $ node --snapshot-blob snapshot.blob
 * ```
 *
 * In the example above, `entry.js` can use methods from the `v8.startupSnapshot` interface to specify how to save information for custom objects
 * in the snapshot during serialization and how the information can be used to synchronize these objects during deserialization of the snapshot.
 * For example, if the `entry.js` contains the following script:
 *
 * ```js
 * 'use strict';
 *
 * import fs from 'node:fs';
 * import zlib from 'node:zlib';
 * import path from 'node:path';
 * import assert from 'node:assert';
 *
 * import v8 from 'node:v8';
 *
 * class BookShelf {
 *   storage = new Map();
 *
 *   // Reading a series of files from directory and store them into storage.
 *   constructor(directory, books) {
 *     for (const book of books) {
 *       this.storage.set(book, fs.readFileSync(path.join(directory, book)));
 *     }
 *   }
 *
 *   static compressAll(shelf) {
 *     for (const [ book, content ] of shelf.storage) {
 *       shelf.storage.set(book, zlib.gzipSync(content));
 *     }
 *   }
 *
 *   static decompressAll(shelf) {
 *     for (const [ book, content ] of shelf.storage) {
 *       shelf.storage.set(book, zlib.gunzipSync(content));
 *     }
 *   }
 * }
 *
 * // __dirname here is where the snapshot script is placed
 * // during snapshot building time.
 * const shelf = new BookShelf(__dirname, [
 *   'book1.en_US.txt',
 *   'book1.es_ES.txt',
 *   'book2.zh_CN.txt',
 * ]);
 *
 * assert(v8.startupSnapshot.isBuildingSnapshot());
 * // On snapshot serialization, compress the books to reduce size.
 * v8.startupSnapshot.addSerializeCallback(BookShelf.compressAll, shelf);
 * // On snapshot deserialization, decompress the books.
 * v8.startupSnapshot.addDeserializeCallback(BookShelf.decompressAll, shelf);
 * v8.startupSnapshot.setDeserializeMainFunction((shelf) => {
 *   // process.env and process.argv are refreshed during snapshot
 *   // deserialization.
 *   const lang = process.env.BOOK_LANG || 'en_US';
 *   const book = process.argv[1];
 *   const name = `${book}.${lang}.txt`;
 *   console.log(shelf.storage.get(name));
 * }, shelf);
 * ```
 *
 * The resulted binary will get print the data deserialized from the snapshot during start up, using the refreshed `process.env` and `process.argv` of the launched process:
 *
 * ```bash
 * $ BOOK_LANG=es_ES node --snapshot-blob snapshot.blob book1
 * # Prints content of book1.es_ES.txt deserialized from the snapshot.
 * ```
 *
 * Currently the application deserialized from a user-land snapshot cannot be snapshotted again, so these APIs are only available to applications that are not deserialized from a user-land snapshot.
 *
 * @experimental
 * @since v18.6.0, v16.17.0
 */
external val startupSnapshot: StartupSnapshot

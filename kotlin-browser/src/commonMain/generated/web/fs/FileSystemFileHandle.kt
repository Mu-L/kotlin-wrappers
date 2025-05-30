// Automatically generated - do not modify!

package web.fs

import js.promise.Promise
import js.serialization.Serializable
import seskar.js.JsAsync
import web.file.File
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * The **`FileSystemFileHandle`** interface of the File System API represents a handle to a file system entry.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemFileHandle)
 */
external class FileSystemFileHandle
private constructor() :
    FileSystemHandle,
    Serializable {
    override val kind: FileSystemHandleKind.file

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemFileHandle/createSyncAccessHandle)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun createSyncAccessHandle(): FileSystemSyncAccessHandle

    @JsName("createSyncAccessHandle")
    fun createSyncAccessHandleAsync(): Promise<FileSystemSyncAccessHandle>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemFileHandle/createWritable)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun createWritable(options: FileSystemCreateWritableOptions = definedExternally): FileSystemWritableFileStream

    @JsName("createWritable")
    fun createWritableAsync(options: FileSystemCreateWritableOptions = definedExternally): Promise<FileSystemWritableFileStream>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemFileHandle/getFile)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun getFile(): File

    @JsName("getFile")
    fun getFileAsync(): Promise<File>
}

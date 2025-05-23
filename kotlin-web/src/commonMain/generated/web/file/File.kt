// Automatically generated - do not modify!

package web.file

import js.array.ReadonlyArray
import js.serialization.Serializable
import web.blob.Blob
import web.blob.BlobPart
import web.time.EpochTimeStamp
import kotlin.js.definedExternally

/**
 * The **`File`** interface provides information about files and allows JavaScript in a web page to access their content.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/File)
 */
open external class File(
    fileBits: ReadonlyArray<BlobPart>,
    fileName: String,
    options: FilePropertyBag = definedExternally,
) : Blob,
    Serializable {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/File/lastModified)
     */
    val lastModified: EpochTimeStamp

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/File/name)
     */
    val name: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/File/webkitRelativePath)
     */
    val webkitRelativePath: String
}

// Automatically generated - do not modify!

package typescript

sealed external interface ReadBuildProgramHost {
    fun useCaseSensitiveFileNames(): Boolean

    fun getCurrentDirectory(): String

    fun readFile(fileName: String): String?
}

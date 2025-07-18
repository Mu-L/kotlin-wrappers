package karakum.virtual

import karakum.common.ConversionResult

// language=kotlin
private val UPDATABLE_CODE = """
external interface Updatable<T, D>{
    operator fun invoke(): T

    fun updateDeps(newDeps: D)
}
""".trimIndent()

internal val UPDATABLE = ConversionResult(
    name = "Updatable",
    body = UPDATABLE_CODE,
)

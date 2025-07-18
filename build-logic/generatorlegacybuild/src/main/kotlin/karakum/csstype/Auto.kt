package karakum.csstype

import karakum.common.ConversionResult
import karakum.common.JsUnionConverter.sealedUnionBody

internal const val AUTO = "Auto"

internal fun Auto(): ConversionResult =
    ConversionResult(
        name = AUTO,
        body = sealedUnionBody(AUTO, listOf("auto")),
    )

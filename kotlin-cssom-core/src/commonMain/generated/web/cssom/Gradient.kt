// Automatically generated - do not modify!

package web.cssom

import js.reflect.unsafeCast

sealed external interface Gradient :
    Image

inline fun linearGradient(
    vararg stops: LinearColorStop,
): Gradient =
    unsafeCast("linear-gradient(${stops.joinToString(",")})")

inline fun linearGradient(
    angle: Angle,
    vararg stops: LinearColorStop,
): Gradient =
    unsafeCast("linear-gradient($angle,${stops.joinToString(",")})")

inline fun repeatingLinearGradient(
    vararg stops: LinearColorStop,
): Gradient =
    unsafeCast("repeating-linear-gradient(${stops.joinToString(",")})")

inline fun repeatingLinearGradient(
    angle: Angle,
    vararg stops: LinearColorStop,
): Gradient =
    unsafeCast("repeating-linear-gradient($angle,${stops.joinToString(",")})")

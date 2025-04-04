// Automatically generated - do not modify!

package tanstack.table.core

import js.reflect.unsafeCast

sealed external interface StringOrTemplateHeader<TData : RowData, TValue> /* string | ColumnDefTemplate<HeaderContext<TData, TValue>> */

inline fun <TData : RowData, TValue> StringOrTemplateHeader(
    source: String,
): StringOrTemplateHeader<TData, TValue> =
    unsafeCast(source)

inline fun <TData : RowData, TValue> StringOrTemplateHeader(
    source: ColumnDefTemplate<HeaderContext<TData, TValue>>,
): StringOrTemplateHeader<TData, TValue> =
    unsafeCast(source)

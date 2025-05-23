package example.table.base

import js.array.ReadonlyArray
import react.useMemo
import tanstack.react.table.useReactTable
import tanstack.table.core.ColumnDef
import tanstack.table.core.TableMeta
import tanstack.table.core.TableOptions
import tanstack.table.core.getCoreRowModel

fun <D : Any> useTable(
    data: ReadonlyArray<D>,
    columns: ReadonlyArray<ColumnDef<D, *>>,
    meta: TableMeta,
): TableInstance<D> {
    val table = useReactTable(
        options = TableOptions(
            data = data,
            columns = columns,
            meta = meta,
            getCoreRowModel = getCoreRowModel(),
        ),
    )

    return useMemo(table) {
        TableInstance(table)
    }
}

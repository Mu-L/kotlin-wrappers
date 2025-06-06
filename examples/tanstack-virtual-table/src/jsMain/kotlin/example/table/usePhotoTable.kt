package example.table

import example.entities.Photo
import example.hooks.usePhotos
import example.table.base.TableInstance
import example.table.base.useTable
import example.table.selection.createSelectionColumn
import js.array.ReadonlyArray
import js.objects.unsafeJso
import tanstack.table.core.ColumnDef
import tanstack.table.core.StringOrTemplateHeader

private val COLUMNS: ReadonlyArray<ColumnDef<Photo, String>> = arrayOf(
    createSelectionColumn(),
    unsafeJso {
        id = "title"
        header = StringOrTemplateHeader("Title")
        accessorFn = { user, _ -> user.title }
    },
    unsafeJso {
        id = "url"
        header = StringOrTemplateHeader("Url")
        accessorFn = { user, _ -> user.url }
    },
    unsafeJso {
        id = "thumbnail"
        header = StringOrTemplateHeader("Thumbnail")
        accessorFn = { user, _ -> user.thumbnailUrl }
    },
)

internal fun usePhotoTable(): TableInstance<Photo> {
    val users = usePhotos()
    val meta = usePhotoTableMeta()

    val table = useTable(
        data = users,
        columns = COLUMNS,
        meta = meta,
    )

    return table
}

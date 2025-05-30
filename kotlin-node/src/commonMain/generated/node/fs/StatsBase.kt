// Generated by Karakum - do not modify it manually!

package node.fs

import js.date.Date

sealed external interface StatsBase<T> {
    fun isFile(): Boolean

    fun isDirectory(): Boolean

    fun isBlockDevice(): Boolean

    fun isCharacterDevice(): Boolean

    fun isSymbolicLink(): Boolean

    fun isFIFO(): Boolean

    fun isSocket(): Boolean

    var dev: T
    var ino: T
    var mode: T
    var nlink: T
    var uid: T
    var gid: T
    var rdev: T
    var size: T
    var blksize: T
    var blocks: T
    var atimeMs: T
    var mtimeMs: T
    var ctimeMs: T
    var birthtimeMs: T
    var atime: Date
    var mtime: Date
    var ctime: Date
    var birthtime: Date
}

// Generated by Karakum - do not modify it manually!

package node.fs

@seskar.js.JsAsync
external suspend fun stat(
    path: PathLike,
    opts: StatSimpleOpts = definedExternally,
): Stats

@seskar.js.JsAsync
external suspend fun stat(
    path: PathLike,
    opts: StatBigIntOpts,
): BigIntStats

@seskar.js.JsAsync
external suspend fun stat(path: PathLike, opts: StatOptions = definedExternally): Any // Stats | BigIntStats

@seskar.js.JsAsync
external suspend fun stat(path: PathLike): Stats

// Generated by Karakum - do not modify it manually!

@file:JsModule("node:inspector")
@file:JsQualifier("Network")

package node.inspector.network

/**
 * This feature is only available with the `--experimental-network-inspection` flag enabled.
 *
 * Broadcasts the `Network.loadingFailed` event to connected frontends. This event indicates that
 * HTTP request has failed to load.
 * @since v22.7.0
 * @experimental
 */
external fun loadingFailed(params: LoadingFailedEventDataType)

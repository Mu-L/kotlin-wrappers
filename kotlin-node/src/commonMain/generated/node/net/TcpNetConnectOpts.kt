// Generated by Karakum - do not modify it manually!

package node.net

sealed external interface TcpNetConnectOpts :
    TcpSocketConnectOpts,
    SocketConstructorOpts {
    var timeout: Double?
}

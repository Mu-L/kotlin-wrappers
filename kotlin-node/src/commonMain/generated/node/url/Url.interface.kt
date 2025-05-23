// Generated by Karakum - do not modify it manually!

package node.url

// Output of `url.parse`
sealed external interface Url {
    var auth: String?
    var hash: String?
    var host: String?
    var hostname: String?
    var href: String
    var path: String?
    var pathname: String?
    var protocol: String?
    var search: String?
    var slashes: Boolean?
    var port: String?
    var query: Any? // string | null | ParsedUrlQuery
}

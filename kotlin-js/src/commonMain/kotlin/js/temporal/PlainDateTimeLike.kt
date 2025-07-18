package js.temporal

import js.objects.JsPlainObject

@JsPlainObject
external interface PlainDateTimeLike {

    var era: String?
    var eraYear: Int?
    var year: Int?
    var month: Int?
    var monthCode: String?
    var day: Int?
    var hour: Int?
    var minute: Int?
    var second: Int?
    var millisecond: Int?
    var microsecond: Int?
    var nanosecond: Int?
    var calendar: Calendar?
}

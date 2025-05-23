@file:JsQualifier("Temporal")

package js.temporal

import js.import.JsQualifier
import js.objects.JsPlainObject
import kotlin.js.definedExternally

/**
 * A `Temporal.PlainYearMonth` represents a particular month on the calendar. For
 * example, it could be used to represent a particular instance of a monthly
 * recurring event, like "the June 2019 meeting".
 *
 * See https://tc39.es/proposal-temporal/docs/yearmonth.html for more details.
 */
external class PlainYearMonth(
    isoYear: Int,
    isoMonth: Int,
    calendar: Calendar = definedExternally,
    referenceISODay: Int = definedExternally,
) : HasArithmeticOperations<PlainYearMonth, PlainYearMonthLike, DateUnit<* /* year..month */>>,
    LocalizableDateTime {
    val era: String?
    val eraYear: Int?
    val year: Int
    val month: Int
    val monthCode: String
    val calendarId: String
    val daysInMonth: Int
    val daysInYear: Int
    val monthsInYear: Int
    val inLeapYear: Boolean

    // fun equals(other: Temporal.PlainYearMonth | PlainYearMonthLike | String): Boolean;
    fun with(
        yearMonthLike: PlainYearMonthLike,
        options: AssignmentOptions = definedExternally,
    ): PlainYearMonth

    fun toPlainDate(options: ToPlainDateOptions): PlainDate

    @JsPlainObject
    interface ToPlainDateOptions {
        val day: Int
    }

    fun getISOFields(): PlainDateISOFields
    fun toJSON(): String
    fun toString(options: ShowCalendarOption = definedExternally): String

    companion object :
        PlainCompanion<PlainYearMonth, PlainYearMonthLike>
}

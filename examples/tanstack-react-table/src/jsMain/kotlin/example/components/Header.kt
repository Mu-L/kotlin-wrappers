package example.components

import emotion.react.css
import example.theme.Theme
import react.FC
import react.dom.html.ReactHTML.a
import react.dom.html.ReactHTML.div
import web.cssom.FontWeight
import web.cssom.Overflow
import web.cssom.Padding
import web.cssom.px

val Header = FC {
    div {
        css {
            overflow = Overflow.hidden
            backgroundColor = Theme.Background.Gray
            padding = Padding(20.px, 10.px)
        }

        a {
            css {
                fontSize = 25.px
                fontWeight = FontWeight.bold
            }

            +"Kotlin React Table"
        }
    }
}

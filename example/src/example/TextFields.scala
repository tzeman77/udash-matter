package example

import io.udash.css.CssText._
import matter.Matter
import scalatags.Text.all._

object TextFields extends AbstractPage {

  override def tpl: Seq[Modifier] = Seq(
    h2("Filled"),
    p(label(Matter.textfield.filled, input(placeholder:=" "),
      span("Text field"))),
    p(label(Matter.textfield.filled, input(placeholder:=" ", disabled),
      span("Disabled"))),
    p(label(Matter.textfield.filled, textarea(placeholder:=" "),
      span("Text area"))),
    p(label(Matter.textfield.filled, textarea(placeholder:=" ", disabled),
      span("Disabled"))),
    h2("Outlined"),
    p(label(Matter.textfield.outlined, input(placeholder:=" "),
      span("Text field"))),
    p(label(Matter.textfield.outlined, input(placeholder:=" ", disabled),
      span("Disabled"))),
    p(label(Matter.textfield.outlined, textarea(placeholder:=" "),
      span("Text area"))),
    p(label(Matter.textfield.outlined, textarea(placeholder:=" ", disabled),
      span("Disabled"))),
    h2("Standard"),
    p(label(Matter.textfield.standard, input(placeholder:=" "),
      span("Text field"))),
    p(label(Matter.textfield.standard, input(placeholder:=" ", disabled),
      span("Disabled"))),
    p(label(Matter.textfield.standard, textarea(placeholder:=" "),
      span("Text area"))),
    p(label(Matter.textfield.standard, textarea(placeholder:=" ", disabled),
      span("Disabled")))
  )
}

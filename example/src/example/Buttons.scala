package example

import io.udash.css.CssText._
import matter.Matter
import scalatags.Text.all._

object Buttons extends AbstractPage {
  override def tpl: Seq[Modifier] = Seq(
    p(
      button(Matter.button.contained, "Contained"), " ",
      button(Matter.button.contained, Matter.color.primary, "Primary"), " ",
      button(Matter.button.contained, Matter.color.secondary, "Secondary"), " ",
      button(Matter.button.contained, Matter.color.success, "Success")
    ),
    p(
      button(Matter.button.outlined, "Outlined"), " ",
      button(Matter.button.outlined, Matter.color.primary, "Primary"), " ",
      button(Matter.button.outlined, Matter.color.secondary, "Secondary"), " ",
      button(Matter.button.outlined, Matter.color.success, "Success")
    ),
    p(button(Matter.button.text, "Text")),
    p(button(Matter.button.unElevated, "UnElevated"))
  )
}

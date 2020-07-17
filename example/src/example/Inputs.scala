package example

import io.udash.css.CssText._
import matter.Matter
import scalatags.Text.all._

object Inputs extends AbstractPage {
  override def tpl: Seq[Modifier] = Seq(
    p(label(Matter.input.checkbox, input(tpe:="checkbox"), span("Unchecked"))),
    p(label(Matter.input.checkbox, input(tpe:="checkbox", checked),
      span("Checked"))),
    p(label(Matter.input.checkbox, input(tpe:="checkbox", disabled),
      span("Disabled"))),
    p(label(Matter.input.radio, input(tpe:="radio", name:="group", checked),
      span("Radio 1"))),
    p(label(Matter.input.radio, input(tpe:="radio", name:="group"),
      span("Radio 2"))),
    p(label(Matter.input.radio, input(tpe:="radio", name:="dis", checked,
      disabled), span("Disabled 1"))),
    p(label(Matter.input.radio, input(tpe:="radio", name:="dis", disabled),
      span("Disabled 2"))),
    p(label(Matter.input.switch, input(tpe:="checkbox", role:="switch",
      checked), span("Switched On"))),
    p(label(Matter.input.switch, input(tpe:="checkbox", role:="switch"),
      span("Switched Off"))),
    p(label(Matter.input.switch, input(tpe:="checkbox", role:="switch",
      checked, disabled), span("Switched On"))),
    p(label(Matter.input.switch, input(tpe:="checkbox", role:="switch",
      disabled), span("Switched Off"))),
  )
}

package example

import io.udash.css.CssText._
import matter.Matter
import scalatags.Text.all._

object ToolTips extends AbstractPage {

  override def tpl: Seq[Modifier] = Seq(
    p(div(aria.describedby:="div-tooltip", position.relative, width:=120,
      span(Matter.tooltip,
        span(id:="div-tooltip", aria.hidden:=true, "Small help")),
      "I'm a div"
    )),
    p(div(aria.describedby:="top", position.relative, width:=120,
      span(Matter.tooltipTop,
        span(id:="top", aria.hidden:=true, "Small help")),
      "Top variant"
    )),
    p(label(position.relative,
      span(Matter.tooltip, span(id:="input-tt", aria.hidden:=true, "Help")),
      input(aria.describedby:="input-tt"),
      span("Label")
    ))
  )

}

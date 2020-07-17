package example

import io.udash.css.CssText._
import matter.Matter
import scalatags.Text.all._

object Typography extends AbstractPage {

  override def tpl: Seq[Modifier] = Seq(
    h1(Matter.h1, "I am h1"),
    h2(Matter.h2, "I am h2"),
    h3(Matter.h3, "I am h3"),
    h4(Matter.h4, "I am h4"),
    h5(Matter.h5, "I am h5"),
    div(Matter.subtitle1, "Subtitle1"),
    div(Matter.subtitle2, "Subtitle2"),
    div(Matter.body1, "body1"),
    div(Matter.body2, "body2"),
    a(Matter.buttonGeneric, "Button generic"),
    div(Matter.caption, "Caption"),
    div(Matter.overline, "Overline"),
  )
}

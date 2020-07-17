package example

import io.udash.css.CssText._
import matter.Matter
import scalatags.Text
import scalatags.Text.all._

object Index extends AbstractPage {

  val pages = Seq(
    Colors,
    Typography,
    Buttons,
    Progress,
    Inputs
  )

  override def tpl: Seq[Text.all.Modifier] = pages map(page =>
    p(a(Matter.link, href:=page.fileName, page.pageTitle))
  )
}

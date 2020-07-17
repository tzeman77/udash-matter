package example

import scalatags.Text
import scalatags.Text.all._

object Index extends AbstractPage {

  val pages = Seq(
    Colors,
    Typography
  )

  override def tpl: Seq[Text.all.Modifier] = pages map(page =>
    p(a(href:=page.fileName, page.pageTitle))
  )
}

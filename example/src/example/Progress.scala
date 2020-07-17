package example

import io.udash.css.CssText._
import matter.Matter
import scalatags.Text.TypedTag
import scalatags.Text.all._

object Progress extends AbstractPage {

  val progress: TypedTag[String] = tag("progress")

  override def tpl: Seq[Modifier] = Seq(
    p(progress(Matter.progress.circular)),
    p(progress(Matter.progress.linear)),
    p(progress(Matter.progress.linear, max:=100, value:=0)),
    p(progress(Matter.progress.linear, Matter.color.warning, max:=100,
      value:=50)),
    p(progress(Matter.progress.linear, max:=100, value:=100)),
  )
}

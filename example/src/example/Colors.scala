package example

import io.udash.css.CssText._
import matter.Matter
import scalatags.Text.all._
import scalatags.Text.tags2

object Colors extends AbstractPage {

  override def headContributor: Seq[Modifier] = Seq(tags2.style("""
    |button {
    |  color: rgb(var(--matter-ontheme-rgb, 255, 0, 0));
    |  background-color: rgb(var(--matter-theme-rgb, 0, 0, 0));
    |}""".stripMargin))

  def tpl = Seq(
    button(Matter.color.primary, "Primary color"),
    button(Matter.color.secondary, "Secondary color"),
    button(Matter.color.error, "Error color"),
    button(Matter.color.warning, "Warning color"),
    button(Matter.color.success, "Success color"),
    br,
    p(Matter.color.text.primary, "Primary color"),
    p(Matter.color.text.secondary, "Secondary color"),
    p(Matter.color.text.error, "Error color"),
    p(Matter.color.text.warning, "Warning color"),
    p(Matter.color.text.success, "Success color")
  )

}

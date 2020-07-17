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
    button(Matter.colors.primary, "Primary color"),
    button(Matter.colors.secondary, "Secondary color"),
    button(Matter.colors.error, "Error color"),
    button(Matter.colors.warning, "Warning color"),
    button(Matter.colors.success, "Success color"),
    br,
    p(Matter.colors.text.primary, "Primary color"),
    p(Matter.colors.text.secondary, "Secondary color"),
    p(Matter.colors.text.error, "Error color"),
    p(Matter.colors.text.warning, "Warning color"),
    p(Matter.colors.text.success, "Success color")
  )

}

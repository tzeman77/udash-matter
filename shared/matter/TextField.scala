package matter

import io.udash.css.CssStyleName

trait TextField {
  val filled: CssStyleName = CssStyleName("matter-textfield-filled")
  val outlined: CssStyleName = CssStyleName("matter-textfield-outlined")
  val standard: CssStyleName = CssStyleName("matter-textfield-standard")
}

object TextField extends TextField

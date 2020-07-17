package matter

import io.udash.css.CssStyleName

trait Typography {

  val h1: CssStyleName = CssStyleName("matter-h1")
  val h2: CssStyleName = CssStyleName("matter-h2")
  val h3: CssStyleName = CssStyleName("matter-h3")
  val h4: CssStyleName = CssStyleName("matter-h4")
  val h5: CssStyleName = CssStyleName("matter-h5")
  val subtitle1: CssStyleName = CssStyleName("matter-subtitle1")
  val subtitle2: CssStyleName = CssStyleName("matter-subtitle2")
  val body1: CssStyleName = CssStyleName("matter-body1")
  val body2: CssStyleName = CssStyleName("matter-body2")
  val buttonGeneric: CssStyleName = CssStyleName("matter-button")
  val caption: CssStyleName = CssStyleName("matter-caption")
  val overline: CssStyleName = CssStyleName("matter-overline")
}

object Typography extends Typography
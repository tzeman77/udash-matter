package matter

import io.udash.css.CssStyleName

trait Matter {

  object button {
    val contained: CssStyleName = CssStyleName("matter-button-contained")
    val outlined: CssStyleName = CssStyleName("matter-button-outlined")
    val text: CssStyleName = CssStyleName("matter-button-text")
    val unElevated: CssStyleName = CssStyleName("matter-button-unelevated")
  }

  object color {

    val primary: CssStyleName = CssStyleName("matter-primary")
    val secondary: CssStyleName = CssStyleName("matter-secondary")
    val error: CssStyleName = CssStyleName("matter-error")
    val warning: CssStyleName = CssStyleName("matter-warning")
    val success: CssStyleName = CssStyleName("matter-success")

    object text {
      val primary: CssStyleName = CssStyleName("matter-primary-text")
      val secondary: CssStyleName = CssStyleName("matter-secondary-text")
      val error: CssStyleName = CssStyleName("matter-error-text")
      val warning: CssStyleName = CssStyleName("matter-warning-text")
      val success: CssStyleName = CssStyleName("matter-success-text")
    }
  }

  object input {
    val checkbox: CssStyleName = CssStyleName("matter-checkbox")
    val radio: CssStyleName = CssStyleName("matter-radio")
    val switch: CssStyleName = CssStyleName("matter-switch")
  }

  val link: CssStyleName = CssStyleName("matter-link")

  object progress extends Progress

  object textfield extends TextField
}

object Matter extends Matter with Typography

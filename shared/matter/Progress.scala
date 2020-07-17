package matter

import io.udash.css.CssStyleName

trait Progress {

  val circular: CssStyleName = CssStyleName("matter-progress-circular")
  val linear: CssStyleName = CssStyleName("matter-progress-linear")
}

object Progress extends Progress

/*
 * Copyright 2020 Tomas Zeman <tomas@functionals.cz>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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

  val tooltip: CssStyleName = CssStyleName("matter-tooltip")
  val tooltipTop: CssStyleName = CssStyleName("matter-tooltip-top")

}

object Matter extends Matter with Typography

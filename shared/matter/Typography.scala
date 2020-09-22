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
package example

import os.Path

object Runner extends App {

  val Array(dest) = args
  (Index.pages :+ Index) foreach { p =>
    os.write(Path(dest) / p.fileName, p.render)
  }

}

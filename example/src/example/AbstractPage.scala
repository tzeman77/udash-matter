package example

import scalatags.Text.all._
import scalatags.Text.{all, tags2}

abstract class AbstractPage {

  def fileName: String =
    s"${getClass.getSimpleName.toLowerCase.replaceAllLiterally("$", "")}.html"

  def pageTitle: String = getClass.getSimpleName.replaceAllLiterally("$", "")

  def headContributor: Seq[Modifier] = Seq()

  def tpl: Seq[Modifier]

  def render: String = "<!DOCTYPE html>" + html(
    all.head(
      meta(charset:="utf-8"),
      meta(name:="viewport", content:="width=device-width, initial-scale=1.0"),
      tags2.title(s"$pageTitle | Matter example"),
      link(href:="https://res.cloudinary.com/finnhvman/raw/upload/matter/matter-0.2.2.min.css",
        rel:="stylesheet", tpe:="text/css"),
      headContributor,

    ),
    body(margin:="5em",
      p(a(href:=Index.fileName, "Back to index")),
      h1(pageTitle), tpl)
  )
}

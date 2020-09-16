import mill._
import mill.api.Loose
import mill.define.{Command, Sources, Target}
import mill.modules.Jvm
import mill.scalajslib._
import mill.scalalib._
import mill.scalalib.publish._

object V {
  val app = "0.1-SNAPSHOT"
  val scalaJs = "0.6.33"
  val scala212 = "2.12.12"

  object udash {
    val core = "0.8.5"
  }
}

object D {

  object udash {
    val core = ivy"io.udash::udash-core::${V.udash.core}"
    val css = ivy"io.udash::udash-css::${V.udash.core}"
  }

  val ammonite = ivy"com.lihaoyi:::ammonite::2.1.4-12-f697522"
}


trait Common extends CrossScalaModule with PublishModule {

  override def artifactName: T[String] = "matter"

  override def publishVersion: Target[String] = V.app

  override def pomSettings = PomSettings(
    description = "Scala.js library facade for matter - Material Design Components in Pure CSS",
    organization = "cz.functionals",
    url = "",
    licenses = Seq(License.`Apache-2.0`),
    versionControl = VersionControl(developerConnection = Some(
      "ssh://tzeman@hg.functionals.cz/repos/private/udash-matter.fossil")),
    developers = Seq(
      Developer("tzeman", "Tomas Zeman", "")
    )
  )

  override def scalacOptions = T{Seq(
    "-deprecation",                      // Emit warning and location for usages of deprecated APIs.
    "-encoding", "utf-8",                // Specify character encoding used by source files.
    "-explaintypes",                     // Explain type errors in more detail.
    "-feature",                          // Emit warning and location for usages of features that should be imported explicitly.
    "-language:higherKinds",             // Allow higher-kinded types
    "-language:implicitConversions",     // Allow definition of implicit functions called views
    "-language:reflectiveCalls",
    "-language:postfixOps",
    "-unchecked",                        // Enable additional warnings where generated code depends on assumptions.
    "-Xcheckinit",                       // Wrap field accessors to throw an exception on uninitialized access.
    "-Xfuture",                          // Turn on future language features.
    "-target:jvm-1.8",
  )}

  override def sources: Sources = T.sources{
    super.sources() :+ PathRef(millSourcePath / 'shared)
  }

  protected def commonDeps = Agg(D.udash.core, D.udash.css)

  override def ivyDeps: Target[Loose.Agg[Dep]] = commonDeps

}

trait CommonJs extends Common with ScalaJSModule {
  override def scalaJSVersion: T[String] = V.scalaJs
}

class JvmModule(val crossScalaVersion: String) extends Common
class JsModule(val crossScalaVersion: String) extends CommonJs

object jvm extends Cross[JvmModule](V.scala212)
object js extends Cross[JsModule](V.scala212)

def publishLocal(): Command[Unit] = T.command{
  jvm(V.scala212).publishLocal()()
  js(V.scala212).publishLocal()()
  ()
}

def publishM2Local(p: os.Path): Command[Unit] = T.command{
  jvm(V.scala212).publishM2Local(p.toString)()
  js(V.scala212).publishM2Local(p.toString)()
  ()
}

object example extends Common {
  override def crossScalaVersion: String = V.scala212

  override def sources = T.sources(millSourcePath / 'example / 'src)

  override def moduleDeps = Seq(jvm(crossScalaVersion))

  override def ivyDeps: Target[Loose.Agg[Dep]] = commonDeps ++ Agg(D.ammonite)

  def run: Target[PathRef] = T{
    val d = T.ctx().dest
    Jvm.runLocal(mainClass = "example.Runner",
      runClasspath().map(_.path),
      Seq(d.toString))
    PathRef(d)
  }

  def distPath = T{ millSourcePath / 'www / 'example }

  def dist() = T.command{
    val d = distPath()
    os.remove.all(d)
    os.copy(run().path, d, replaceExisting = true, createFolders = true)
    println(s"Example files copied to $d")
  }
}

// vim: et ts=2 sw=2 syn=scala

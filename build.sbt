enablePlugins(ScalaNativePlugin)

scalaVersion := "3.1.1"
organization := "com.fiatjaf"
name         := "sn-random"
version      := "0.1.0"
sonatypeProfileName := "com.fiatjaf"
homepage := Some(url("https://github.com/fiatjaf/sn-random"))
scmInfo := Some(ScmInfo(url("https://github.com/fiatjaf/sn-random"), "git@github.com:fiatjaf/sn-random.git"))
licenses += ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0"))
developers := List(
  Developer(id="fiatjaf", name="fiatjaf", email="fiatjaf@gmail.com", url=url("https://fiatjaf.com/"))
)
publishMavenStyle := true
publishTo := sonatypePublishToBundle.value
sonatypeCredentialHost := "s01.oss.sonatype.org"

libraryDependencies += "com.lihaoyi" %%% "utest" % "0.7.11" % Test
testFrameworks += new TestFramework("utest.runner.Framework")
nativeLinkStubs := true

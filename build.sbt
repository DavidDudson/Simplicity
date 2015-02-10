name := "simplicity"

scalaVersion := "2.11.5"

resolvers ++= Seq(
  "bintray/paulp" at "https://dl.bintray.com/paulp/maven"
)

libraryDependencies ++= Seq(
  "org.scalaz" %% "scalaz-core" % "7.1.0",
  "com.chuusai" %% "shapeless" % "2.0.0",
  "org.improving" %% s"psp-std" % "0.4.8",
  "org.typelevel" %% "shapeless-scalaz" % "0.3"
)

initialCommands in console := "import psp.std._"

import scalariform.formatter.preferences._

scalariformSettings

ScalariformKeys.preferences := ScalariformKeys.preferences.value
  .setPreference(AlignSingleLineCaseStatements, true)
  .setPreference(DoubleIndentClassDeclaration, true)
  .setPreference(PreserveDanglingCloseParenthesis, true)
  .setPreference(AlignParameters, true)
  .setPreference(RewriteArrowSymbols, true)
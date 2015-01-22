name := "simplicity"

scalaVersion := "2.11.5"

resolvers += "bintray/paulp" at "https://dl.bintray.com/paulp/maven"

libraryDependencies ++= Seq(
  "org.scalaz" %% "scalaz-core" % "7.1.0",
  "com.chuusai" %% "shapeless" % "2.0.0",
  "org.improving" %% s"psp-std" % "0.4.8"
)

initialCommands in console := "import psp.std._"
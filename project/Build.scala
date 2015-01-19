/*
 * Copyright (c) ${Year}, David J. Dudson
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 * The views and conclusions contained in the software and documentation are those
 * of the authors and should not be interpreted as representing official policies,
 * either expressed or implied, of the FreeBSD Project.
 */

import sbt._
import Keys._

object Build extends Build {

  lazy val myProject = Project(
    id = name.toString,
    base = file("."),
    settings = Defaults.coreDefaultSettings
  )

  lazy val root = project.in(file(".")).aggregate()

  lazy val simplicityJS = project.in(file("simplicity-js")).settings(scalaJSSettings: _*)
    .settings(dependencySettings: _*)
    .settings(
    name := "simplicity",
    unmanagedSourceDirectories in Compile +=
      (baseDirectory in root).value / "simplicity-shared" / "src" / "main" / "scala"
  )

  lazy val simplicityJVM = project.in(file("simplicity-jvm")).settings(
    name := "simplicity",
    unmanagedSourceDirectories in Compile +=
      (baseDirectory in root).value / "simplicity-shared" / "src" / "main" / "scala"
  )

  name := "Simplicity"

  crossScalaVersions := Seq("2.10.0","2.10.3","2.11.3","2.11.4","2.11.5")

  scalaVersion := "2.11.5"

}
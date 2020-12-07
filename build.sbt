name := "WeatherData"

version := "0.1"

scalaVersion := "2.13.4"

libraryDependencies += "org.scala-lang.modules" %% "scala-xml" % "1.3.0"
//libraryDependencies += "com.lihaoyi" %% "upickle" % "0.9.5"
//libraryDependencies ++= Seq("com.typesafe.play" % "play-json_2.11" % "2.4.2")
// https://mvnrepository.com/artifact/org.json4s/json4s-native
libraryDependencies += "org.json4s" %% "json4s-native" % "3.7.0-M7"
// https://mvnrepository.com/artifact/org.json4s/json4s-xml
libraryDependencies += "org.json4s" %% "json4s-xml" % "3.7.0-M7"
// https://mvnrepository.com/artifact/org.json4s/json4s-jackson
libraryDependencies += "org.json4s" %% "json4s-jackson" % "3.7.0-M7"

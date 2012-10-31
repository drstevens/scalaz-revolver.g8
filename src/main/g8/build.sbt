Revolver.settings

resolvers += "Typesafe Snapshots" at "http://repo.typesafe.com/typesafe/snapshots/"
 
libraryDependencies ++= Seq(
  "org.scalaz" % "scalaz-core" % "7.0-SNAPSHOT" cross CrossVersion.full
)
 
initialCommands in console := "import scalaz._, Scalaz._"

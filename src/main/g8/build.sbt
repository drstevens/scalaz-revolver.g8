Revolver.settings

resolvers ++= Seq(
  "Typesafe Snapshots" at "http://repo.typesafe.com/typesafe/snapshots/", 
  "Sonatype snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/",
  "Scalaz Bintray Repo" at "http://dl.bintray.com/scalaz/releases")


scalacOptions ++= Seq("-language:postfixOps", "-language:implicitConversions", "-language:higherKinds", "-deprecation", "-feature")
 
libraryDependencies ++= Seq(
  "com.typesafe"        %  "config"                    % "1.2.1",
  "com.typesafe.scala-logging" %% "scala-logging"      % "3.1.0",
  "org.scalaz"          %% "scalaz-core"               % "7.1.0",
  "org.scalaz"          %% "scalaz-scalacheck-binding" % "7.1.0"  % "test",
  "com.github.scopt"    %% "scopt"                     % "3.2.0",
  "org.specs2"          %% "specs2"                    % "2.4.4"  % "test",
  "org.scalacheck"      %% "scalacheck"                % "1.11.4" % "test"
)
 
initialCommands in console := "import scalaz._, Scalaz._"

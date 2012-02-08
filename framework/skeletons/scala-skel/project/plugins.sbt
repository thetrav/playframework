// Comment to get more information during initialization
logLevel := Level.Warn

// The Typesafe repository contains all required dependencies
resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

// Use the Play sbt plugin for Play projects
addSbtPlugin("play" % "sbt-plugin" % "%PLAY_VERSION%")
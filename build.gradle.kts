// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
  repositories {
    google()
    jcenter()
  }
  dependencies {
    classpath(Deps.Plugin.buildTools)
    classpath(Deps.Plugin.navigationSafeArgs)
    classpath(Deps.Plugin.kotlin)
  }
}

allprojects {
  repositories {
    google()
    jcenter()
  }
}

task("clean", Delete::class) {
  delete = setOf(rootProject.buildDir)
}
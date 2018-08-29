import groovy.lang.Closure

//import org.jetbrains.kotlin.config.KotlinCompilerVersion

plugins {
  id("com.android.application")// version Versions.agp
  id("androidx.navigation.safeargs")// version Versions.Arch.navigation
  kotlin("android") //version Versions.kotlin
  kotlin("android.extensions")// version Versions.kotlin
}

android {
  compileSdkVersion(28)

  defaultConfig {
    // TODO: Change package name for navigation.
    applicationId = "com.github.droibit.hello.androidjetpack"
    minSdkVersion(19)
    targetSdkVersion(28)
    versionCode = 1
    versionName = "1.0"
    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
  }

  buildTypes {
    getByName("release") {
      isMinifyEnabled = false
      proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
    }
  }

  compileOptions {
    setSourceCompatibility(JavaVersion.VERSION_1_8)
    setTargetCompatibility(JavaVersion.VERSION_1_8)
  }

  flavorDimensions("default")
  productFlavors {
    create("dev") {
      applicationIdSuffix = ".dev"
    }
    create("prod") {
    }
  }

  testOptions {
    // ref. https://stackoverflow.com/questions/32315978/jvm-options-in-android-when-run-gradlew-test
    unitTests.apply {
      all(closureOf<Test> {
        jvmArgs = listOf("-noverify")
      } as Closure<Test>) // TODO: Refactor
      isReturnDefaultValues = true
    }
  }

  // Remove mockRelease as it's not needed.
  android.variantFilter {
    if (this.buildType.name == "release"
        && listOf("dev").contains(this.flavors[0].name)) {
      this.setIgnore(true)
    }
  }
}

androidExtensions {
  isExperimental = true
}

dependencies {
  implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
  implementation(Deps.kotlin)
  implementation(Deps.Android.Support.appCompat)
  implementation(Deps.Android.Support.cardView)
  implementation(Deps.Android.Support.recyclerView)
  implementation(Deps.Android.Support.design)
  implementation(Deps.Android.Support.constraintLayout)
  implementation(Deps.Android.Arch.Lifecycle.extensions)

  //    implementation 'com.google.android.material:material:1.0.0-alpha1'
  //    implementation 'androidx.lifecycle:lifecycle-extensions:2.0.0-alpha1'
  //    implementation 'androidx.lifecycle:lifecycle-viewmodel-ktx:2.0.0-alpha1'
  //    implementation 'androidx.fragment:fragment-ktx:1.0.0-alpha1'

  implementation(Deps.Android.Arch.Navigation.UI.ktx)
  implementation(Deps.Android.Arch.Navigation.Fragment.ktx)

  testImplementation(Deps.junit)
  androidTestImplementation("androidx.test:runner:1.1.0-alpha3")
  androidTestImplementation("androidx.test.espresso:espresso-core:3.1.0-alpha3")
}

plugins {
  id("com.android.application")// version Versions.agp
  kotlin("android") //version Versions.kotlin
  kotlin("android.extensions")// version Versions.kotlin
}

android {
  compileSdkVersion(28)

  defaultConfig {
    applicationId = "com.github.droibit.hello.livedata"
    minSdkVersion(21)
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
}

dependencies {
  implementation(Deps.kotlin)
  implementation(Deps.Androidx.appCompat)
  implementation(Deps.Androidx.constraintLayout)

  // ktx
  implementation(Deps.Androidx.Core.ktx)
  implementation(Deps.Androidx.Fragment.ktx)
  implementation(Deps.Androidx.Lifecycle.ReactiveStreams.ktx)
  implementation(Deps.Androidx.Lifecycle.ViewModel.ktx)
  implementation(Deps.Androidx.Preference.ktx)

  implementation(Deps.Rx.java)
  implementation(Deps.Rx.kotlin)
  implementation(Deps.Rx.android)

  testImplementation(Deps.junit)
  androidTestImplementation("androidx.test:runner:1.1.0-alpha3")
  androidTestImplementation("androidx.test.espresso:espresso-core:3.1.0-alpha3")
}

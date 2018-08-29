plugins {
  id("com.android.application")// version Versions.agp
  kotlin("android") //version Versions.kotlin
  kotlin("android.extensions")// version Versions.kotlin
}

android {
  compileSdkVersion(28)

  defaultConfig {
    applicationId = "com.github.droibit.hello.ktx"
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
}

dependencies {
  implementation(Deps.kotlin)
  implementation(Deps.Androidx.appCompat)
  implementation(Deps.Androidx.constraintLayout)

  implementation(Deps.Androidx.versionedParcelable)

  // ktx
  implementation(Deps.Androidx.Collection.ktx)
  implementation(Deps.Androidx.Core.ktx)
  implementation(Deps.Androidx.Fragment.ktx)
  implementation(Deps.Androidx.Lifecycle.ReactiveStreams.ktx)
  implementation(Deps.Androidx.Lifecycle.ViewModel.ktx)
  implementation(Deps.Androidx.Palette.ktx)
  implementation(Deps.Androidx.Preference.ktx)
  implementation(Deps.Androidx.Slice.Builders.ktx)
  implementation(Deps.Androidx.Sqlite.ktx)

  testImplementation("junit:junit:4.12")
  androidTestImplementation("androidx.test:runner:1.1.0-alpha3")
  androidTestImplementation("androidx.test.espresso:espresso-core:3.1.0-alpha3")
}

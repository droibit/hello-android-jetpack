object Versions {

  const val agp = "3.2.0-rc02"
  const val kotlin = "1.2.60"
  const val supportLibrary = "28.0.0-rc01"
  const val dagger = "2.1.7"

  object Arch {
    const val core = "1.1.1"
    const val lifecycle = "1.1.1"
    const val navigation = "1.0.0-alpha05"
  }
}

object Deps {

  const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
  const val timber = "com.jakewharton.timber:timber:4.7.0"

  const val junit = "junit:junit:4.12"
  const val robolectric = "org.robolectric:robolectric:3.8"
  const val assertj = "org.assertj:assertj-core:3.9.1"
  const val mockito = "org.mockito:mockito-core:2.18.3"

  object Plugin {

    const val buildTools = "com.android.tools.build:gradle:3.2.0-rc02"
    const val navigationSafeArgs = "android.arch.navigation:navigation-safe-args-gradle-plugin:1.0.0-alpha05"
    const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    const val gradleVersions = "com.github.ben-manes:gradle-versions-plugin:0.17.0"
  }

  object Android {

    object Support {
      const val annotations = "com.android.support:support-annotations:${Versions.supportLibrary}"
      const val v4 = "com.android.support:support-v4:${Versions.supportLibrary}"
      const val appCompat = "com.android.support:appcompat-v7:${Versions.supportLibrary}"
      const val design = "com.android.support:design:${Versions.supportLibrary}"
      const val constraintLayout = "com.android.support.constraint:constraint-layout:1.1.2"
      const val recyclerView = "com.android.support:recyclerview-v7:${Versions.supportLibrary}"
      const val cardView = "com.android.support:cardview-v7:${Versions.supportLibrary}"
    }

    object Arch {

      object Lifecycle {
        const val extensions = "android.arch.lifecycle:extensions:${Versions.Arch.lifecycle}"
        const val compiler = "android.arch.lifecycle:compiler:${Versions.Arch.lifecycle}"
        const val reactiveStreams =
          "android.arch.lifecycle:reactivestreams:${Versions.Arch.lifecycle}"
      }

      object Navigation {

        object UI {
          const val ktx = "android.arch.navigation:navigation-ui-ktx:${Versions.Arch.navigation}"
        }

        object Fragment {
          const val ktx =
            "android.arch.navigation:navigation-fragment-ktx:${Versions.Arch.navigation}"
        }
      }
    }
  }

  object Androidx {
    const val appCompat = "androidx.appcompat:appcompat:1.0.0-rc01"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:1.1.2"
    const val versionedParcelable = "androidx.versionedparcelable:versionedparcelable:1.0.0-rc01"

    object Collection {
      const val ktx = "androidx.collection:collection-ktx:1.0.0-rc01"
    }

    object Core {
      const val ktx = "androidx.core:core-ktx:1.0.0-rc01"
    }

    object Fragment {
      const val ktx = "androidx.fragment:fragment-ktx:1.0.0-rc01"
    }

    object Lifecycle {

      const val extensions = "androidx.lifecycle:lifecycle-extensions:2.0.0-rc01"
      const val compiler = "androidx.lifecycle:lifecycle-compiler:2.0.0-rc01"

      object ReactiveStreams {
        const val ktx = "androidx.lifecycle:lifecycle-reactivestreams-ktx:2.0.0-rc01"
      }

      object ViewModel {
        const val ktx = "androidx.lifecycle:lifecycle-viewmodel-ktx:2.0.0-rc01"
      }
    }

    object Palette {
      const val ktx = "androidx.palette:palette-ktx:1.0.0-rc01"
    }

    object Preference {
      const val ktx = "androidx.preference:preference-ktx:1.0.0-rc01"
    }

    object Slice {

      object Builders {
        const val ktx = "androidx.slice:slice-builders-ktx:1.0.0-alpha5"
      }
    }

    object Sqlite {
      const val ktx = "androidx.sqlite:sqlite-ktx:2.0.0-rc01"
    }
  }

  object Dagger {
    const val runtime = "com.google.dagger:dagger:${Versions.dagger}"
    const val compiler = "com.google.dagger:dagger-compiler:${Versions.dagger}"
    const val androidSupport = "com.google.dagger:dagger-android-support:${Versions.dagger}"
    const val androidProcessor = "com.google.dagger:dagger-android-processor:${Versions.dagger}"
  }

  object Javax {
    const val inject = "javax.inject:javax.inject:1"
  }

  object Rx {
    const val java = "io.reactivex.rxjava2:rxjava:2.1.15"
    const val kotlin = "io.reactivex.rxjava2:rxkotlin:2.2.0"
    const val android = "io.reactivex.rxjava2:rxandroid:2.0.2"
  }
}
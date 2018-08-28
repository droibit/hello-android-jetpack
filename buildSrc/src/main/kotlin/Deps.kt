object Versions {

  object Arch {
    const val core = "1.1.1"
    const val lifecycle = "1.1.1"
    const val navigation = "1.0.0-alpha05"
  }

  const val agp = "3.2.0-rc02"
  const val kotlin = "1.2.60"
  const val supportLibrary = "28.0.0-rc01"
}

object Deps {

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
        const val reactiveStreams = "android.arch.lifecycle:reactivestreams:${Versions.Arch.lifecycle}"
      }

      object Navigation {

        object UI {

          const val ktx = "android.arch.navigation:navigation-ui-ktx:${Versions.Arch.navigation}"
        }

        object Fragment {

          const val ktx = "android.arch.navigation:navigation-fragment-ktx:${Versions.Arch.navigation}"
        }
      }
    }
  }

  const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
}
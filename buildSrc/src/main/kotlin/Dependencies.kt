object Dependencies {
    object Ktx {
        const val core = "androidx.core:core-ktx:${Versions.coreKtx}"
        const val room = "androidx.room:room-ktx:${Versions.roomKtx}"
        const val collection = "androidx.collection:collection:${Versions.collectionKtx}"
        const val fragment = "androidx.fragment:fragment-ktx:${Versions.fragmentKtx}"
        const val navigation = "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
        const val navigationUi = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"
        const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.viewModelKtx}"
        const val lifecycle = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycleKtx}"
        const val sqLite = "androidx.sqlite:sqlite-ktx:${Versions.sqliteKtx}"
    }

    object Compose {
        const val activity = "androidx.activity:activity-compose:${Versions.activityCompose}"
        const val ui = "androidx.compose.ui:ui:${Versions.compose}"
        const val uiTooling = "androidx.compose.ui:ui-tooling-preview:${Versions.compose}"
        const val material = "androidx.compose.material3:material3:${Versions.materialCompose}"
        const val uiTest = "androidx.compose.ui:ui-test-junit4:${Versions.compose}"
    }

    object Ktor {
        const val clientAndroid = "io.ktor:ktor-client-android:${Versions.ktor}"
        const val clientSerialization = "io.ktor:ktor-client-serialization:${Versions.ktor}"
        const val logging = "io.ktor:ktor-client-logging-jvm:${Versions.ktor}"
    }

    object Moshi {
        const val core = "com.squareup.moshi:moshi-kotlin:${Versions.moshi}"
    }

    object OkHttp {
        const val core = "com.squareup.okhttp3:okhttp:${Versions.okHttp}"
        const val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.okHttp}"
    }

    object Koin {
        const val core = "io.insert-koin:koin-core:${Versions.coreKoin}"
        const val android = "io.insert-koin:koin-android:${Versions.androidKoin}"
        const val navigation = "io.insert-koin:koin-androidx-navigation:${Versions.androidKoin}"
        const val compose = "io.insert-koin:koin-androidx-compose:${Versions.androidKoin}"
        const val ktor = "io.insert-koin:koin-ktor:${Versions.ktorKoin}"
        const val logger = "io.insert-koin:koin-logger-slf4j:${Versions.ktorKoin}"
    }

    object Navigation {
        const val dynamicFeature =
            "androidx.navigation:navigation-dynamic-features-fragment:${Versions.navigation}"
        const val compose = "androidx.navigation:navigation-compose:${Versions.navigation}"
    }

    object Room {
        const val core = "androidx.room:room-runtime:${Versions.room}"
        const val paging = "androidx.room:room-paging:${Versions.room}"
        const val compiler = "androidx.room:room-compiler:${Versions.room}"
    }

    object Paging {
        const val core = "androidx.paging:paging-runtime:${Versions.paging}"
        const val compose = "androidx.paging:paging-compose:${Versions.composePaging}"
    }

    object Test {
        const val junit = "junit:junit:${Versions.junit}"

    }
}
object Dependencies {

    object Ktx {
        val core = "androidx.core:core-ktx:$Versions.coreKtx"
        val room = "androidx.room:room-ktx:$Versions.roomKtx"
        val collection = "androidx.collection:collection:$Versions.collections"
        val fragment = "androidx.fragment:fragment-ktx:$Versions.fragmentKtx"
        val navigation = "androidx.navigation:navigation-fragment-ktx:$Versions.navigation"
        val navigationUi = "androidx.navigation:navigation-ui-ktx:$Versions.navigation"
    }

    object Compose {
        val activity = "androidx.activity:activity-compose:$Versions.activityCompose"
        val ui = "androidx.compose.ui:ui:$Versions.compose"
        val uiTooling = "androidx.compose.ui:ui-tooling-preview:$Versions.compose"
        val material = "androidx.compose.material3:material3:$Versions.materialCompose"
        val uiTest = "androidx.compose.ui:ui-test-junit4:$Versions.compose"
    }

    object Ktor {
        val clientAndroid = "io.ktor:ktor-client-android:$Versions.ktor"
        val clientSerialization = "io.ktor:ktor-client-serialization:$Versions.ktor"
        val logging = "io.ktor:ktor-client-logging-jvm:$Versions.ktor"
    }

    object Moshi {
        val core = "com.squareup.moshi:moshi-kotlin:$Versions.okHttp"
    }

    object OkHttp {
        val core = "com.squareup.okhttp3:okhttp:$Versions.okHttp"
        val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor:$Versions.okHttp"
    }

    object Koin {
        val core = "io.insert-koin:koin-core:$Versions.coreKoin"
        val android = "io.insert-koin:koin-android:$Versions.androidKoin"
        val navigation = "io.insert-koin:koin-androidx-navigation:$Versions.androidKoin"
        val compose = "io.insert-koin:koin-androidx-compose:$Versions.androidKoin"
        val ktor = "io.insert-koin:koin-ktor:$Versions.coreKoin"
        val logger = "io.insert-koin:koin-logger-slf4j:$Versions.coreKoin"
    }

    object Navigation {
        val dynamicFeature =
            "androidx.navigation:navigation-dynamic-features-fragment:$Versions.navigation"
        val compose = "androidx.navigation:navigation-compose:$Versions.navigation"
    }

    object Room {
        val core = "androidx.room:room-runtime:$Versions.room"
        val paging = "androidx.room:room-paging:$Versions.room"
        val compiler = "androidx.room:room-compiler:$Versions.room"
    }

    object Paging {
        val core = "androidx.paging:paging-runtime:$Versions.paging"
        val compose = "androidx.paging:paging-compose:$Versions.composePaging"
    }

    object Test {
        val junit = "junit:junit:$Versions.junit"

    }
}
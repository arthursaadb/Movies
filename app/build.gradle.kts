plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id("kotlinx-serialization")
}

android {
    namespace = "com.saad.movies"
    compileSdk = ConfigData.compileSdkVersion

    defaultConfig {
        applicationId = "com.saad.movies"
        minSdk = ConfigData.minSdkVersion
        targetSdk = ConfigData.targetSdkVersion
        versionCode = ConfigData.versionCode
        versionName = ConfigData.versionName

        testInstrumentationRunner =  "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles (
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Versions.compose
    }
    packagingOptions {
        resources {
            excludes.add("/META-INF/{AL2.0,LGPL2.1}")
        }
    }
}

dependencies {
    implementation(Dependencies.Android.kotlinSerializationRuntime)

    implementation(Dependencies.Ktx.core)
    implementation(Dependencies.Ktx.room)
    implementation(Dependencies.Ktx.collection)
    implementation(Dependencies.Ktx.fragment)
    implementation(Dependencies.Ktx.navigation)
    implementation(Dependencies.Ktx.navigationUi)
    implementation(Dependencies.Ktx.lifecycle)
    implementation(Dependencies.Ktx.viewModel)
    implementation(Dependencies.Ktx.sqLite)

    implementation(Dependencies.Compose.activity)
    implementation(Dependencies.Compose.ui)
    implementation(Dependencies.Compose.uiTooling)
    implementation(Dependencies.Compose.material)
    debugImplementation(Dependencies.Compose.uiTooling)
    debugImplementation(Dependencies.Compose.uiTest)

    implementation(Dependencies.Ktor.clientAndroid)
    implementation(Dependencies.Ktor.clientSerialization)
    implementation(Dependencies.Ktor.logging)
    implementation(Dependencies.Ktor.contentNegotiation)

    implementation(Dependencies.Moshi.core)

    implementation(Dependencies.OkHttp.core)
    implementation(Dependencies.OkHttp.loggingInterceptor)

    implementation(Dependencies.Koin.core)
    implementation(Dependencies.Koin.android)
    implementation(Dependencies.Koin.navigation)
    implementation(Dependencies.Koin.compose)
    implementation(Dependencies.Koin.ktor)
    implementation(Dependencies.Koin.logger)

    implementation(Dependencies.Navigation.dynamicFeature)
    implementation(Dependencies.Navigation.compose)

    implementation(Dependencies.Room.core)
    implementation(Dependencies.Room.paging)
    kapt(Dependencies.Room.compiler)

    implementation(Dependencies.Paging.core)
    implementation(Dependencies.Paging.compose)

    testImplementation(Dependencies.Test.junit)
}
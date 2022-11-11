buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath(Dependencies.Android.gradle)
        classpath(Dependencies.Android.kotlin)
        classpath(Dependencies.Android.kotlinSerialization)
    }
}

tasks {
    register("clean", Delete::class) {
        delete(rootProject.buildDir)
    }
}
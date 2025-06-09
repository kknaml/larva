import utility.*

plugins {
    alias(libs.plugins.kotlinMultiplatform)
}

apply(from = rootProject.resolve("gradle/nativeTarget.gradle"))
kotlin {
    explicitApi()

    jvm()

    js()

}

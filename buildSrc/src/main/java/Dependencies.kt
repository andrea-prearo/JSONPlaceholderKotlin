object Versions {
    const val kotlin = "1.3.72"
    const val ktor = "1.3.2"
    const val coroutines = "1.3.7"
    const val serialization = "0.20.0"
    const val mockk = "1.8.13.kotlin13"

    const val min_sdk = 21
    const val target_sdk = 29
    const val compile_sdk = 29

    const val androidx_test = "1.2.0"
    const val androidx_test_ext = "1.1.1"
    const val android_gradle_plugin = "3.6.3"
    const val buildToolsVersion = "29.0.0"
    const val junit = "4.13"
}

object Deps {
    const val app_compat_x = "androidx.appcompat:appcompat:1.1.0"
    const val material_x = "com.google.android.material:material:1.1.0"
    const val core_ktx = "androidx.core:core-ktx:1.2.0"
    const val constraintlayout = "androidx.constraintlayout:constraintlayout:1.1.3"
    const val recyclerView = "androidx.recyclerview:recyclerview:1.1.0"
    const val android_gradle_plugin = "com.android.tools.build:gradle:${Versions.android_gradle_plugin}"
    const val kotlin_gradle_plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    const val junit = "junit:junit:${Versions.junit}"

    object AndroidXTest {
        const val core = "androidx.test:core:${Versions.androidx_test}"
        const val junit = "androidx.test.ext:junit:${Versions.androidx_test_ext}"
        const val runner = "androidx.test:runner:${Versions.androidx_test}"
        const val rules = "androidx.test:rules:${Versions.androidx_test}"
    }

    object KotlinTest {
        const val common = "org.jetbrains.kotlin:kotlin-test-common:${Versions.kotlin}"
        const val annotations = "org.jetbrains.kotlin:kotlin-test-annotations-common:${Versions.kotlin}"
        const val jvm = "org.jetbrains.kotlin:kotlin-test:${Versions.kotlin}"
        const val junit = "org.jetbrains.kotlin:kotlin-test-junit:${Versions.kotlin}"
    }

    object Coroutines {
        const val common = "org.jetbrains.kotlinx:kotlinx-coroutines-core-common:${Versions.coroutines}"
        const val jdk = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
        const val native = "org.jetbrains.kotlinx:kotlinx-coroutines-core-native:${Versions.coroutines}"
        const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
        const val test = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.coroutines}"
    }

    object Ktor {
        const val commonCore = "io.ktor:ktor-client-core:${Versions.ktor}"
        const val commonJson = "io.ktor:ktor-client-json:${Versions.ktor}"
        const val commonLogging = "io.ktor:ktor-client-logging:${Versions.ktor}"
        const val jvmCore = "io.ktor:ktor-client-core-jvm:${Versions.ktor}"
        const val androidCore = "io.ktor:ktor-client-okhttp:${Versions.ktor}"
        const val jvmJson = "io.ktor:ktor-client-json-jvm:${Versions.ktor}"
        const val jvmLogging = "io.ktor:ktor-client-logging-jvm:${Versions.ktor}"
        const val ios = "io.ktor:ktor-client-ios:${Versions.ktor}"
        const val iosCore = "io.ktor:ktor-client-core-native:${Versions.ktor}"
        const val iosJson = "io.ktor:ktor-client-json-native:${Versions.ktor}"
        const val iosLogging = "io.ktor:ktor-client-logging-native:${Versions.ktor}"
        const val commonSerialization ="io.ktor:ktor-client-serialization:${Versions.ktor}"
        const val androidSerialization ="io.ktor:ktor-client-serialization-jvm:${Versions.ktor}"
        const val iosSerialization ="io.ktor:ktor-client-serialization-native:${Versions.ktor}"
        const val commonMock = "io.ktor:ktor-client-mock:${Versions.ktor}"
        const val jvmMock = "io.ktor:ktor-client-mock-jvm:${Versions.ktor}"
        const val mockNative = "io.ktor:ktor-client-mock-native:${Versions.ktor}"
    }

    object MockK {
        const val common = "io.mockk:mockk-common:${Versions.mockk}"
        const val native = "io.mockk:mockk:${Versions.mockk}"
    }
}

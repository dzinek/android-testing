plugins {
id("com.android.application")
id("kotlin-android")
id("kotlin-android-extensions")
}

android {
    compileSdkVersion(27)
    defaultConfig {
        applicationId="com.example.android.testing.unittesting.BasicSample"
        minSdkVersion(14)
        versionCode=1
        versionName="1.0"
        targetSdkVersion(27)
    }
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:${ProjectVersions.KOTLIN_VERSION}")

    // Unit testing dependencies.
    testImplementation("junit:junit:4.12")
    testImplementation("org.mockito:mockito-core:2.8.9")
}

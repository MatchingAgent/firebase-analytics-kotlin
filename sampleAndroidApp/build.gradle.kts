plugins {
  id("com.android.application")
  kotlin("android")
}

dependencies {
  implementation(project(":analytics"))

  implementation("com.google.android.material:material:1.2.1")
  implementation("androidx.appcompat:appcompat:1.2.0")
  implementation("androidx.constraintlayout:constraintlayout:2.0.2")
}

android {
  compileSdkVersion(30)
  defaultConfig {
    applicationId = "jp.co.matchingagent.firebase.analytics.sampleAndroidApp"
    minSdkVersion(24)
    targetSdkVersion(30)
    versionCode = 1
    versionName = "1.0"
  }
  buildTypes {
    getByName("release") {
      isMinifyEnabled = false
    }
  }
}

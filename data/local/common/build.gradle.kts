plugins {
    id("java-library")
    kotlin("jvm")
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

dependencies {
    api(libs.androidx.room.common)

    implementation(libs.kotlinx.coroutines.core)
}

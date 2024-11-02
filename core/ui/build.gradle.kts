plugins {
    alias(libs.plugins.gal9.android.library)
    alias(libs.plugins.gal9.android.library.compose)
    alias(libs.plugins.gal9.android.library.jacoco)
}

android {
    namespace = "com.sillygals.gal9.core.core.ui"
}

dependencies {
    api(libs.androidx.metrics)
    api(projects.core.designsystem)
    api(projects.core.model)

    implementation(libs.androidx.browser)
    implementation(libs.coil.kt)
    implementation(libs.coil.kt.compose)

    androidTestImplementation(libs.bundles.androidx.compose.ui.test)
}

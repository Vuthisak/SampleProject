pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            library("core-ktx", "androidx.core:core-ktx:1.10.1")
            library("lifecycle-ktx", "androidx.lifecycle:lifecycle-runtime-ktx:2.6.1")
            library("appcompat", "androidx.appcompat:appcompat:1.6.1")
            library("material", "com.google.android.material:material:1.9.0")
            library("constraintLayout", "androidx.constraintlayout:constraintlayout:2.1.4")
        }
        create("tests") {
            library("junit", "junit:junit:4.13.2")
            library("junit-ext", "androidx.test.ext:junit:1.1.5")
            library("espresso", "androidx.test.espresso:espresso-core:3.5.1")
        }
        create("composes") {
            library("ui", "androidx.compose.ui:ui:1.4.1")
            library("uiGraphic", "androidx.compose.ui:ui-graphics:1.4.1")
            library("uiToolingPreview", "androidx.compose.ui:ui-tooling-preview:1.4.1")
            library("material3", "androidx.compose.material3:material3:1.2.0")
        }
    }

    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "SampleProject"
include(":app")
include(":common")
include(":mlkit")
include(":sample")
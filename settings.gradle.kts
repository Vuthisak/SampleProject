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
            library("appcompat", "androidx.appcompat:appcompat:1.6.1")
            library("marterial", "com.google.android.material:material:1.9.0")
            library("constraintLayout", "androidx.constraintlayout:constraintlayout:2.1.4")
        }
        val composeVersion = "1.4.3"
        create("composes") {
            library("activity", "androidx.activity:activity-compose:1.7.2")
            library("ui", "androidx.compose.ui:ui:$composeVersion")
            library("ui-preview", "androidx.compose.ui:ui-tooling-preview:$composeVersion")
            library("ui-tooling", "androidx.compose.ui:ui-tooling:$composeVersion")
            library("ui-test-manifest", "androidx.compose.ui:ui-test-manifest:$composeVersion")
            library("material-icon", "androidx.compose.material:material:$composeVersion")
            library("material3", "androidx.compose.material3:material3:1.1.1")
            library("test-junit4", "androidx.compose.ui:ui-test-junit4:$composeVersion")
        }
        create("tests") {
            library("junit", "junit:junit:4.13.2")
            library("junit-ext", "androidx.test.ext:junit:1.1.5")
            library("espresso", "androidx.test.espresso:espresso-core:3.5.1")
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
include(":jetpack-compose")

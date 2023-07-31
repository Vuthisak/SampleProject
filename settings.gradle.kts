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

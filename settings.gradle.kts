rootProject.name = "MR-loader"
include("core", "cli")

pluginManagement {
  plugins {
    val kotlinVersion: String by settings
    kotlin("jvm") version kotlinVersion
    kotlin("plugin.serialization") version kotlinVersion
  }
}


# Sisig

A small Fabric mod for Minecraft Java 26.3. It adds Sisig as its own edible item.
## Gameplay

- Craft 1 Sisig with 1 cooked porkchop, 1 egg, and 1 bowl. The recipe is shapeless and unlocks after you obtain cooked porkchop.
- Each serving restores 10 hunger with a 1.0 saturation modifier (20 nominal saturation).
- Sisig stacks to 16, appears in Food & Drinks, and leaves an empty bowl after eating.

## Requirements

- Minecraft Java 26.3
- Fabric Loader 0.19.5 or newer
- Fabric API for Minecraft 26.3

## Install

Download the compiled `sisig-1.0.1.jar` from the repository's **Releases** page and place it in your Minecraft `mods` folder along with Fabric API. Remove any older Sisig JAR first. GitHub's automatic **Source code** ZIP is for reading or building the project; it is not the playable mod.

## Build from source

Install JDK 25. On Windows, run `gradlew.bat build` from this folder. The mod JAR will be in `build/libs`. On macOS or Linux, run `./gradlew build`.

The project targets Minecraft 26.3 with Fabric Loader 0.19.5 and Fabric API 0.162.0+26.3. Version 1.0.1 fixes a recipe category error that prevented world creation in version 1.0.0. The mod owner confirmed version 1.0.1 loads and works in game.

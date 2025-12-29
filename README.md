# Design n' Decor - Minecraft Forge Mod

A quality-of-life decoration mod for Minecraft 1.20.1 with Forge.

## Prerequisites

Before building this mod, ensure you have the following installed:

1. **Java 17** (JDK 17) - Required for Minecraft 1.20.1
   - Download from [Adoptium](https://adoptium.net/) or [Oracle](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
   - Verify installation: `java -version` (should show version 17)

2. **Gradle** (optional - the project includes Gradle Wrapper)
   - The project uses Gradle Wrapper, so you don't need to install Gradle separately
   - If you want to install Gradle manually, download from [gradle.org](https://gradle.org/)

## Build Instructions

### Method 1: Using Gradle Wrapper (Recommended)

1. **Open a terminal/command prompt** in the project root directory.

2. **Build the mod JAR file:**
   ```bash
   # On Windows (PowerShell/CMD)
   .\gradlew.bat build

   # On Linux/Mac
   ./gradlew build
   ```

3. **Find the built mod:**
   - The compiled JAR file will be located at:
     ```
     build/libs/dndecor-2.1.0.jar
     ```
   - This is the mod file you can use in your Minecraft installation.

### Method 2: Using IDE (IntelliJ IDEA / Eclipse)

#### IntelliJ IDEA:
1. Open IntelliJ IDEA
2. Select **File → Open** and choose the project directory
3. Wait for Gradle to sync and download dependencies
4. Open the Gradle tool window (View → Tool Windows → Gradle)
5. Navigate to: `Tasks → build → build`
6. Double-click `build` to run the build task
7. The JAR will be in `build/libs/`

#### Eclipse:
1. Open Eclipse
2. Select **File → Import → Gradle → Existing Gradle Project**
3. Select the project directory
4. Wait for Gradle to sync
5. Right-click the project → **Run As → Gradle Build...**
6. Enter `build` as the task and run
7. The JAR will be in `build/libs/`

## Running the Mod in Development

### Client Run Configuration:
```bash
.\gradlew.bat runClient
```

### Server Run Configuration:
```bash
.\gradlew.bat runServer
```

### Data Generation:
```bash
.\gradlew.bat runData
```

## Project Information

- **Minecraft Version:** 1.20.1
- **Forge Version:** 47.4.8
- **Mod Version:** 2.1.0
- **Java Version:** 17
- **Mod ID:** `dndecor`

## Dependencies

This mod requires:
- **Create** (version 6.0.6-150)
- **Flywheel** (for rendering)
- **Registrate** (for registration)
- **JEI** (Just Enough Items) - optional, for development

All dependencies will be automatically downloaded by Gradle during the build process.

## Troubleshooting

### Build Fails with "Java Version" Error
- Ensure you have Java 17 installed
- Check your `JAVA_HOME` environment variable points to Java 17
- Verify with: `java -version`

### Gradle Wrapper Issues
- If `gradlew.bat` doesn't work, try running it with explicit Java:
  ```bash
  java -jar gradle/wrapper/gradle-wrapper.jar build
  ```

### Dependency Download Issues
- Check your internet connection
- Some repositories may be slow; be patient on first build
- If issues persist, try:
  ```bash
  .\gradlew.bat --refresh-dependencies build
  ```

### Out of Memory Errors
- The project is configured with 3GB heap space
- If you encounter memory issues, edit `gradle.properties` and increase:
  ```
  org.gradle.jvmargs=-Xmx4G
  ```

## Installation

To use the built mod in Minecraft:

1. Install Minecraft Forge 47.4.8 for Minecraft 1.20.1
2. Place the built JAR file (`dndecor-2.1.0.jar`) in your `mods` folder:
   - Windows: `%appdata%\.minecraft\mods\`
   - Linux: `~/.minecraft/mods/`
   - Mac: `~/Library/Application Support/minecraft/mods/`
3. Also install the required dependency: **Create** mod
4. Launch Minecraft with Forge

## License

MIT & ARR (All Rights Reserved)

## Authors

- Luna
- DrMangoTea



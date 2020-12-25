# SuperLuckyAPI
This is the API for the SuperLuckyBlock plugin on Spigot. It can be found here: https://www.spigotmc.org/resources/48837/

All functions in the API have Javadoc comments explaining what they do and how they should be used.

## Examples
Coming at some point. Don't know when.
SuperLuckyAPI.java contains everything you need to use.

## Maven
Add this to your pom.xml
```
<repositories>
  <repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
  </repository>
</repositories>

<dependencies>
  <dependency>
    <groupId>com.github.SickSkillz</groupId>
    <artifactId>SuperLuckyAPI</artifactId>
    <version>1.0.0</version>
    <scope>provided</scope>
  </dependency>
</dependencies>
```


## Gradle
Add this to your build.gradle file:
```
repositories {
    maven { url 'https://jitpack.io' }
}

dependencies {
   compileOnly 'com.github.SickSkillz:SuperLuckyAPI:1.0.0'
}
```

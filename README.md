# demo-drawimage-photoeditor-lib
Demo android library for editing image for pest control.
Published using Jitpack.

## Requirements
* Android API lv16 or higher
* Android Gradle Plugin (AGP) 7.3.1

## Usage / Implementation

### Gradle (settings.gradle)

```groovy
repositories {
    mavenCentral()
    maven { url 'https://jitpack.io' }
}
```

### Gradle (build.gradle)

```groovy
plugins {
    id 'kotlin-kapt'
}

android {
    compileSdk 33
    
    defaultConfig {
        targetSdk 33
    }
}

dependencies {
    implementation 'com.github.NeoRevolt:demo-drawimage-photoeditor-lib:1.0.0'
}
```

# Sample Code
#### With previews:

MainActivity.kt
```kotlin
private lateinit var binding: ActivityMainBinding
public override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityMainBinding.inflate(layoutInflater)
    setContentView(binding.root)
    
    // Intent to Photo Editor with EXTRA Request (gallery/remote) and Image
    binding.apply {
            btnToLib.setOnClickListener {
            Intent(this@MainActivity, Class.forName("com.neorevolt.drawimage.EditImageActivity")).also {
                    it.putExtra(EditImageActivity.EXTRA_REQ,"remote")
                    it.putExtra(EditImageActivity.EXTRA_PHOTO,"https://w0.peakpx.com/wallpaper/205/460/HD-wallpaper-sea-beach-beautiful-scene-clouds-deep-sea-natural-graphy-nature-beauty-graphy-lover-portrait.jpg")
                    startActivity(it)
           }
     }      
}
```

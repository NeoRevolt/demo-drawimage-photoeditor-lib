package com.example.forpublishmodule

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.forpublishmodule.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            btnToLib.setOnClickListener {
//                Intent(this@MainActivity, Class.forName("com.example.photoeditor_module.EditImageActivity")).also {
//                    it.putExtra(EditImageActivity.EXTRA_REQ,"gallery")
//                    startActivity(it)
//                }

                Intent(this@MainActivity, Class.forName("com.neorevolt.pesteditor.EditImageActivity")).also {
                    it.putExtra(com.neorevolt.pesteditor.EditImageActivity.EXTRA_REQ,"remote")
                    it.putExtra(com.neorevolt.pesteditor.EditImageActivity.EXTRA_PHOTO,"https://w0.peakpx.com/wallpaper/205/460/HD-wallpaper-sea-beach-beautiful-scene-clouds-deep-sea-natural-graphy-nature-beauty-graphy-lover-portrait.jpg")
                    startActivity(it)
                }
//                Intent(this@MainActivity, ShowDataLibActivity::class.java).also {
//                    it.putExtra(ShowDataLibActivity.EXTRA_DETAIL,"INI DATA")
//                    startActivity(it)
//                }
            }
        }
    }
}
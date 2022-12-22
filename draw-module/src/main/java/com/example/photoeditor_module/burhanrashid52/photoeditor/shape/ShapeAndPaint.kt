package com.example.photoeditor_module.burhanrashid52.photoeditor.shape

import android.graphics.Paint
import com.example.photoeditor_module.burhanrashid52.photoeditor.shape.AbstractShape

/**
 * Simple data class to be put in an ordered Stack
 */
open class ShapeAndPaint(
    val shape: AbstractShape,
    val paint: Paint
)
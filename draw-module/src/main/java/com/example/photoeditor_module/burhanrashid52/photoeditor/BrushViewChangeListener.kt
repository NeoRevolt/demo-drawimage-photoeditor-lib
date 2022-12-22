package com.example.photoeditor_module.burhanrashid52.photoeditor

/**
 * Created on 1/17/2018.
 * @author [Burhanuddin Rashid](https://github.com/example)
 *
 *
 */
interface BrushViewChangeListener {
    fun onViewAdd(drawingView: DrawingView)
    fun onViewRemoved(drawingView: DrawingView)
    fun onStartDrawing()
    fun onStopDrawing()
}
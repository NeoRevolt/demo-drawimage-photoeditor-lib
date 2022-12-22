package com.example.photoeditor_module.filters

import com.example.photoeditor_module.burhanrashid52.photoeditor.PhotoFilter

interface FilterListener {
    fun onFilterSelected(photoFilter: PhotoFilter?)
}
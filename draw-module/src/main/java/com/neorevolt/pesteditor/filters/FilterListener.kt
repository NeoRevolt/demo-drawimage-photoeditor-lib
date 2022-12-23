package com.neorevolt.pesteditor.filters

import com.neorevolt.pesteditor.burhanrashid52.photoeditor.PhotoFilter

interface FilterListener {
    fun onFilterSelected(photoFilter: PhotoFilter?)
}
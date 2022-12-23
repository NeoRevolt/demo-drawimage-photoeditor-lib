package com.neorevolt.pesteditor.data.offline

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.neorevolt.pesteditor.data.IconRepository
import com.neorevolt.pesteditor.data.offline.entity.IconEntity
import com.neorevolt.pesteditor.data.offline.room.IconsDatabase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class IconViewModel(application: Application): AndroidViewModel(application) {
    val readAllIcon: LiveData<List<IconEntity>>
    private val repository: IconRepository

    init {
        val iconDao = IconsDatabase.getInstance(application).iconsDao()
        repository = IconRepository(iconDao)
        readAllIcon = repository.readAllIcons
    }

    fun addIcon(icon: IconEntity){
        viewModelScope.launch(Dispatchers.IO){
            repository.addIcons(icon)
        }
    }

    fun deleteIconFromDB(){
        viewModelScope.launch(Dispatchers.IO){
            repository.deleteIcons()
        }
    }
}
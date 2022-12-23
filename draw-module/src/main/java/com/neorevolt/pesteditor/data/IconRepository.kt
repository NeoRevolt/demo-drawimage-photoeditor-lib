package com.neorevolt.pesteditor.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import com.neorevolt.pesteditor.data.offline.entity.IconEntity
import com.neorevolt.pesteditor.data.offline.room.IconsDao

class IconRepository constructor(
    private val iconsDao: IconsDao,
//    private val appExecutor: AppExecutor
) {
    private val result = MediatorLiveData<Result<List<IconEntity>>>()

    val readAllIcons: LiveData<List<IconEntity>> = iconsDao.getIcons()

    suspend fun addIcons(icon: IconEntity) {
        iconsDao.insertIcon(icon)
    }

    fun deleteIcons() {
        iconsDao.deleteAll()
    }
}
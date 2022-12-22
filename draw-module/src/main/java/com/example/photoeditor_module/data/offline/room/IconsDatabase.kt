package com.example.photoeditor_module.data.offline.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.photoeditor_module.data.offline.entity.IconEntity
import com.example.photoeditor_module.data.offline.entity.LayoutEntity
import com.example.photoeditor_module.data.offline.entity.TransactionEntity

@Database(entities = [IconEntity::class, LayoutEntity::class,TransactionEntity::class], version = 1, exportSchema = false)

abstract class IconsDatabase : RoomDatabase() {
    abstract fun iconsDao(): IconsDao
    abstract fun layoutDao(): LayoutDao

    companion object {
        @Volatile
        private var instance: IconsDatabase? = null

        fun getInstance(context: Context): IconsDatabase =
            instance ?: synchronized(this) {
                instance ?: Room.databaseBuilder(
                    context.applicationContext,
                    IconsDatabase::class.java, "Icons.db"
                )
                    .fallbackToDestructiveMigration()
                    .build()
            }
    }
}
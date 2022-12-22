package com.example.photoeditor_module.data.offline.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "iconTb")
class IconEntity(

    @field:ColumnInfo(name = "iconId")
    @field:PrimaryKey(autoGenerate = true)
    val iconId: Int? = null,

    @field:ColumnInfo(name = "iconName")
    val iconName: String,

    @field:ColumnInfo(name = "iconUrl")
    val iconUrl: String
)
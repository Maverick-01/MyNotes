package com.maverick01.mynotes

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


//this is entity
@Entity(tableName = "notes_table")
class Note(@ColumnInfo(name = "text")val text:String) {
    @PrimaryKey(autoGenerate = true)var id = 0
}
package com.maverick01.mynotes

import androidx.lifecycle.LiveData
import androidx.room.*

//data access object.
@Dao
interface NoteDao {

    @Insert  //onConflict=onConflictStrategy.IGNORE
    suspend fun insert(note: Note)

    @Delete
    suspend fun delete(note: Note)

    @Query("Select * from notes_table order by id ASC")
    fun getAllNotes():LiveData<List<Note>>
}
package com.example.basiccompose.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.basiccompose.data.local.dao.NoteDao
import com.example.basiccompose.data.local.entity.NoteEntity

@Database(
    version = 1,
    entities = [NoteEntity::class]
)
abstract class NoteDatabase: RoomDatabase() {

    abstract val noteDao: NoteDao

    companion object {
        const val name = "note_db"
    }
}
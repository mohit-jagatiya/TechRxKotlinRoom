package com.techextensor.rxkotlin.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.techextensor.rxkotlin.model.Task
import com.techextensor.rxkotlin.ui.main.TaskDao

// Database class that defines the database structure and version
@Database(entities = [Task::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun taskDao(): TaskDao
}
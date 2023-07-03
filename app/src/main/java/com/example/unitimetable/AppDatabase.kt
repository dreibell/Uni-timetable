package com.example.unitimetable

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.unitimeable.dao.LectureDao
import com.example.unitimetable.model.Lecture

@Database(entities = [Lecture::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun lectureDao(): LectureDao
}
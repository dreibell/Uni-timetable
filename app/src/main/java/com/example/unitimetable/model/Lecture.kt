package com.example.unitimetable.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Lecture(
    @PrimaryKey(autoGenerate = true)
    val lid: Int,
    @ColumnInfo(name = "lecture_name")
    val lecName: String?,
    @ColumnInfo(name = "professor_name")
    val proName: String?
)

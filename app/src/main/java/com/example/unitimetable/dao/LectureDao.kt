package com.example.unitimeable.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.unitimetable.model.Lecture

@Dao
interface LectureDao {
    /*탐색*/
    @Query("SELECT * FROM lecture")
    fun getAll(): List<Lecture>

    @Query("SELECT * FROM lecture WHERE lid IN (:lectureIds)")
    fun loadAllByIds(lectureIds: IntArray): List<Lecture>

    /*삽입*/
    @Insert
    fun insertAll(lectures: Lecture)

    /*삭제*/
    @Delete
    fun delete(lecture: Lecture)

    @Update
    fun update(lecture: Lecture)
}
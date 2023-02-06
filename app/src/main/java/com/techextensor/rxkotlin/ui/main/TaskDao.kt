package com.techextensor.rxkotlin.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.room.*
import com.techextensor.rxkotlin.model.Task
import io.reactivex.Completable
import io.reactivex.Flowable

@Dao
interface TaskDao {
    @Insert
    fun insertTask(task: Task): Completable

    @Update
    fun updateTask(task: Task): Completable

    @Delete
    fun deleteTask(task: Task): Completable

    @Query("SELECT * FROM Task")
    fun getAllTasks(): Flowable<List<Task>>

    @Query("SELECT * FROM Task")
    fun getAllTasksAsLiveData(): MutableLiveData<List<Task>>
}

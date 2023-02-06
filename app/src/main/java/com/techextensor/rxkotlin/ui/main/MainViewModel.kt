package com.techextensor.rxkotlin.ui.main

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import androidx.room.Room
import com.techextensor.rxkotlin.model.Task
import com.techextensor.rxkotlin.db.AppDatabase
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.coroutines.launch

class MainViewModel(application: Application) : AndroidViewModel(application) {


    private val taskDao: TaskDao
    var taskList: MutableLiveData<List<Task>> = MutableLiveData()
    var appDatabase : AppDatabase
    init {
        appDatabase = Room.databaseBuilder(
            application,
            AppDatabase::class.java,
            "app_database"
        ).build()
        taskDao = appDatabase.taskDao()
        taskList = taskDao.getAllTasksAsLiveData()
    }

    fun insertTask(task: Task) {
        val disposable = appDatabase.taskDao().insertTask(task)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                { taskList.setValue(taskDao.getAllTasksAsLiveData().value)},
                { error -> Log.e("Error inserting task", error.message!!) }
            )
    }

    fun updateTask(task: Task) {
        val disposable = appDatabase.taskDao().updateTask(task)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                { taskList.setValue(taskDao.getAllTasksAsLiveData().value)},
                { error -> Log.e("Error updating task", error.message!!) }
            )
    }

    fun deleteTask(task: Task) {
        val disposable = appDatabase.taskDao().deleteTask(task)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                { taskList.setValue(taskDao.getAllTasksAsLiveData().value)},
                { error -> Log.e("Error deleting task", error.message!!) }
            )
    }

    fun observeTasks() {
        val taskLiveData = appDatabase.taskDao().getAllTasks()
        val disposable = taskLiveData.observeOn(AndroidSchedulers.mainThread())
            .subscribe { tasks ->
                // Do something with the updated tasks
            }
    }
    fun markTaskAsComplete(task: Task) {
        task.isCompleted = true
        viewModelScope.launch {
            taskDao.updateTask(task)
        }
    }
}
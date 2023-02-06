package com.techextensor.rxkotlin.ui.main;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0007H\'J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\nH\'J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\r"}, d2 = {"Lcom/techextensor/rxkotlin/ui/main/TaskDao;", "", "deleteTask", "Lio/reactivex/Completable;", "task", "Lcom/techextensor/rxkotlin/Task;", "getAllTasks", "Lio/reactivex/Flowable;", "", "getAllTasksAsLiveData", "Landroidx/lifecycle/LiveData;", "insertTask", "updateTask", "app_debug"})
public abstract interface TaskDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Insert()
    public abstract io.reactivex.Completable insertTask(@org.jetbrains.annotations.NotNull()
    com.techextensor.rxkotlin.Task task);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Update()
    public abstract io.reactivex.Completable updateTask(@org.jetbrains.annotations.NotNull()
    com.techextensor.rxkotlin.Task task);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Delete()
    public abstract io.reactivex.Completable deleteTask(@org.jetbrains.annotations.NotNull()
    com.techextensor.rxkotlin.Task task);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM Task")
    public abstract io.reactivex.Flowable<java.util.List<com.techextensor.rxkotlin.Task>> getAllTasks();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM Task")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.techextensor.rxkotlin.Task>> getAllTasksAsLiveData();
}
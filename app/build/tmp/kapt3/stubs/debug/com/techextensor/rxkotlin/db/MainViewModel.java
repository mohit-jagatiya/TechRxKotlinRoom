package com.techextensor.rxkotlin.db;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0010J\u000e\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0010J\u0006\u0010\u0017\u001a\u00020\u0014J\u000e\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0010R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0019"}, d2 = {"Lcom/techextensor/rxkotlin/db/MainViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "appDatabase", "Lcom/techextensor/rxkotlin/db/AppDatabase;", "getAppDatabase", "()Lcom/techextensor/rxkotlin/db/AppDatabase;", "setAppDatabase", "(Lcom/techextensor/rxkotlin/db/AppDatabase;)V", "taskDao", "Lcom/techextensor/rxkotlin/ui/main/TaskDao;", "taskList", "Landroidx/lifecycle/LiveData;", "", "Lcom/techextensor/rxkotlin/Task;", "getTaskList", "()Landroidx/lifecycle/LiveData;", "deleteTask", "", "task", "insertTask", "observeTasks", "updateTask", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.techextensor.rxkotlin.ui.main.TaskDao taskDao = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.techextensor.rxkotlin.Task>> taskList = null;
    @org.jetbrains.annotations.NotNull()
    private com.techextensor.rxkotlin.db.AppDatabase appDatabase;
    
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.techextensor.rxkotlin.Task>> getTaskList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.techextensor.rxkotlin.db.AppDatabase getAppDatabase() {
        return null;
    }
    
    public final void setAppDatabase(@org.jetbrains.annotations.NotNull()
    com.techextensor.rxkotlin.db.AppDatabase p0) {
    }
    
    public final void insertTask(@org.jetbrains.annotations.NotNull()
    com.techextensor.rxkotlin.Task task) {
    }
    
    public final void updateTask(@org.jetbrains.annotations.NotNull()
    com.techextensor.rxkotlin.Task task) {
    }
    
    public final void deleteTask(@org.jetbrains.annotations.NotNull()
    com.techextensor.rxkotlin.Task task) {
    }
    
    public final void observeTasks() {
    }
}
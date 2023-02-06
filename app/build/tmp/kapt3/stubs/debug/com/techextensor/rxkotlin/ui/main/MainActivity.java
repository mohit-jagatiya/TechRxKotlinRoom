package com.techextensor.rxkotlin.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u000e\u000fB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00060\u0006R\u00020\u0000X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/techextensor/rxkotlin/ui/main/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "mainViewModel", "Lcom/techextensor/rxkotlin/db/MainViewModel;", "taskAdapter", "Lcom/techextensor/rxkotlin/ui/main/MainActivity$TaskAdapter;", "taskList", "", "Lcom/techextensor/rxkotlin/Task;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "TaskAdapter", "TaskViewHolder", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.techextensor.rxkotlin.db.MainViewModel mainViewModel;
    private com.techextensor.rxkotlin.ui.main.MainActivity.TaskAdapter taskAdapter;
    private final java.util.List<com.techextensor.rxkotlin.Task> taskList = null;
    private java.util.HashMap _$_findViewCache;
    
    public MainActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\b\u0082\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\u001c\u0010\n\u001a\u00020\u000b2\n\u0010\f\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\r\u001a\u00020\tH\u0016J\u001c\u0010\u000e\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\tH\u0016J\u0014\u0010\u0012\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0014R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/techextensor/rxkotlin/ui/main/MainActivity$TaskAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/techextensor/rxkotlin/ui/main/MainActivity$TaskViewHolder;", "Lcom/techextensor/rxkotlin/ui/main/MainActivity;", "taskList", "", "Lcom/techextensor/rxkotlin/Task;", "(Lcom/techextensor/rxkotlin/ui/main/MainActivity;Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateTasks", "tasks", "", "app_debug"})
    final class TaskAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.techextensor.rxkotlin.ui.main.MainActivity.TaskViewHolder> {
        private final java.util.List<com.techextensor.rxkotlin.Task> taskList = null;
        
        public TaskAdapter(@org.jetbrains.annotations.NotNull()
        java.util.List<com.techextensor.rxkotlin.Task> taskList) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.techextensor.rxkotlin.ui.main.MainActivity.TaskViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int viewType) {
            return null;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        com.techextensor.rxkotlin.ui.main.MainActivity.TaskViewHolder holder, int position) {
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
        
        public final void updateTasks(@org.jetbrains.annotations.NotNull()
        java.util.List<com.techextensor.rxkotlin.Task> tasks) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u00a8\u0006\u000b"}, d2 = {"Lcom/techextensor/rxkotlin/ui/main/MainActivity$TaskViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/techextensor/rxkotlin/ui/main/MainActivity;Landroid/view/View;)V", "taskDescriptionTextView", "Landroid/widget/TextView;", "getTaskDescriptionTextView", "()Landroid/widget/TextView;", "taskNameTextView", "getTaskNameTextView", "app_debug"})
    final class TaskViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView taskNameTextView = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView taskDescriptionTextView = null;
        
        public TaskViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTaskNameTextView() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTaskDescriptionTextView() {
            return null;
        }
    }
}
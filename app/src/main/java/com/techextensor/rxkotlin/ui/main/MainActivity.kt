package com.techextensor.rxkotlin.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.techextensor.rxkotlin.R
import com.techextensor.rxkotlin.model.Task
import kotlinx.android.synthetic.main.activity_main.*
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer

// Activity class that displays the tasks in a RecyclerView
class MainActivity : AppCompatActivity() {
    private lateinit var mainViewModel: MainViewModel
    private lateinit var taskAdapter: TaskAdapter
    private val taskList = mutableListOf<Task>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel = ViewModelProvider(this, ViewModelProvider.AndroidViewModelFactory(application)).get(
            MainViewModel::class.java)
        taskAdapter = TaskAdapter(taskList)
        recyclerView.adapter = taskAdapter
        mainViewModel.observeTasks()

        addButton.setOnClickListener {
            // Add a new task
            val task = Task(name= "Task", description =  "Description",isCompleted = false)
            mainViewModel.insertTask(task)
        }
        mainViewModel.taskList.observe(this, Observer { tasks ->
            taskAdapter.updateTasks(tasks)
        })
    }

    private inner class TaskAdapter(private val taskList: MutableList<Task>) : RecyclerView.Adapter<TaskViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
            val itemView = LayoutInflater.from(parent.context).inflate(R.layout.task_item, parent, false)
            return TaskViewHolder(itemView)
        }

        override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
            val task = taskList[position]
            holder.taskNameTextView.text = task.name
            holder.taskDescriptionTextView.text = task.description
        }

        override fun getItemCount() = taskList.size
        fun updateTasks(tasks: List<Task>) {
            taskList.clear()
            taskList.addAll(tasks)
            notifyDataSetChanged()
        }
    }

    private inner class TaskViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val taskNameTextView: TextView = itemView.findViewById(R.id.taskNameTextView)
        val taskDescriptionTextView: TextView = itemView.findViewById(R.id.taskDescriptionTextView)
    }
}

package com.example.android.architecture.blueprints.todoapp.tasks

import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Created by tanle on 6/1/20.
 */

@RunWith(AndroidJUnit4::class)
class TasksViewModelTest {

    @Test
    fun addNewTask_setsNewTaskEvent(){

        val tasksViewModel = TasksViewModel(ApplicationProvider.getApplicationContext())

        tasksViewModel.addNewTask()


    }
}
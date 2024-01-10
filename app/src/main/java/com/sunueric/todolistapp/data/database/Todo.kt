package com.sunueric.todolistapp.data.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "todo_table")
data class Todo(
    @PrimaryKey
    val id: Int? = null,
    val title: String,
    val description: String?,
    val isCompleted: Boolean
)

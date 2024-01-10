package com.sunueric.todolistapp.ui.todo_list

import com.sunueric.todolistapp.data.database.Todo

sealed class TodoListEvent {

    data class DeleteTodo(val todo: Todo): TodoListEvent()

    data class OnDoneChange(val todo: Todo, val isDone: Boolean): TodoListEvent()

    data object OnUndoDeleteClick: TodoListEvent()

    data class OnTodoClick(val todo: Todo): TodoListEvent()

    data object OnAddTodoClick: TodoListEvent()
}
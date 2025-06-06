package com.example.demo.repository;

import java.util.ArrayList;

import com.example.demo.model.Todo;

public interface TodoRepository {

	  ArrayList<Todo> getTodos();
	  Todo getTodoById(int id);
	  Todo addTodo(Todo todo);
	  Todo updateTodo(int id,Todo todo);
	  void deleteTodo(int id);
	  
}

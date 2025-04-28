package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Todo;
import com.example.demo.service.TodoJpaService;

@RestController
@RequestMapping("/todos")
public class TodoController {

    @Autowired
    private TodoJpaService todoService;

    @GetMapping
    public ArrayList<Todo> getAllTodos() {
        return  todoService.getTodos();
    }

    @GetMapping("/{todoId}")
    public Todo getTodoById(@PathVariable("todoId") int todoId) {
        return todoService.getTodoById(todoId);
    }

    @PostMapping
    public Todo addTodo(@RequestBody Todo todo) {
        return todoService.addTodo(todo);
    }

    @PutMapping("/{todoId}")
    public Todo updateTodo(@PathVariable("todoId") int todoId, @RequestBody Todo todo) {
        return todoService.updateTodo(todoId, todo);
    }

    @DeleteMapping("/{todoId}")
    public void deleteTodo(@PathVariable("todoId") int todoId) {
        todoService.deleteTodo(todoId);
    }
}

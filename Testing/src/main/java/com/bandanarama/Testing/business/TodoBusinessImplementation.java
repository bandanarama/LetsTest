package com.bandanarama.Testing.business;

import data.api.TodoService;

import java.util.ArrayList;
import java.util.List;

//TodoBusinessImplementation SUT
//TodoService Dependency
public class TodoBusinessImplementation {
    private TodoService todoService;

    public TodoBusinessImplementation(TodoService todoService) {
        this.todoService = todoService;
    }

    public List<String> retrieveTodosRelatedToSpring(String user) {
        List<String> filteredTodos = new ArrayList<String>();
        List<String> todos = todoService.retrieveTodos(user);

        for(String todo:todos) {
            if(todo.contains("Spring")) {
                filteredTodos.add(todo);
            }
        }
        return filteredTodos;
    }
}

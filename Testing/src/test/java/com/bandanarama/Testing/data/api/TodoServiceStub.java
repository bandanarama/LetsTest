package com.bandanarama.Testing.data.api;

import data.api.TodoService;

import java.util.Arrays;
import java.util.List;

//2 problems using stubs
//dynamic conditions
//service definition
public class TodoServiceStub implements TodoService {

    @Override
    public List<String> retrieveTodos(String user) {
        return Arrays.asList("MVC","Spring MVC","Learn to dance");
    }
}

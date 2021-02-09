package com.bandanarama.Testing.business;

import com.bandanarama.Testing.data.api.TodoServiceStub;
import data.api.TodoService;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TodoBusinessImplementationStubTest {

    @Test
    public void testRetrieveTodosRelatedToSpring_usingAStub(){
        TodoService todoServiceStub = new TodoServiceStub();
        TodoBusinessImplementation todoBusinessImplementation = new TodoBusinessImplementation(todoServiceStub);
        List<String> filteredTodos = todoBusinessImplementation.retrieveTodosRelatedToSpring("Dummy");
        assertEquals(2, filteredTodos.size());
    }

    @Test
    public void testRetrieveTodosRelatedToSpring_usingAStub2(){
        TodoService todoServiceStub = new TodoServiceStub();
        TodoBusinessImplementation todoBusinessImplementation = new TodoBusinessImplementation(todoServiceStub);
        List<String> filteredTodos = todoBusinessImplementation.retrieveTodosRelatedToSpring("Dummy");
        assertEquals(0, filteredTodos.size());
    }
}

package com.bandanarama.Testing.business;

import com.bandanarama.Testing.data.api.TodoServiceStub;
import data.api.TodoService;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;


public class TodoBusinessImplementationMockTest {

    @Test
    public void testRetrieveTodosRelatedToSpring_usingAMock0(){

        TodoService todoServiceMock = mock(TodoService.class);

        List<String> todos = Arrays.asList();

        when(todoServiceMock.retrieveTodos("Dummy")).thenReturn(todos);
        TodoBusinessImplementation todoBusinessImplementation = new TodoBusinessImplementation(todoServiceMock);
        List<String> filteredTodos = todoBusinessImplementation.retrieveTodosRelatedToSpring("Dummy");
        assertEquals(0, filteredTodos.size());
    }

    @Test
    public void testRetrieveTodosRelatedToSpring_usingAMock(){

        TodoService todoServiceMock = mock(TodoService.class);

        List<String> todos = Arrays.asList("MVC","Spring MVC","Learn to dance");
        when(todoServiceMock.retrieveTodos("Dummy")).thenReturn(todos);
        TodoBusinessImplementation todoBusinessImplementation = new TodoBusinessImplementation(todoServiceMock);
        List<String> filteredTodos = todoBusinessImplementation.retrieveTodosRelatedToSpring("Dummy");
        assertEquals(1, filteredTodos.size());
    }

    @Test
    public void testRetrieveTodosRelatedToSpring_usingAStub2(){
        TodoService todoServiceStub = new TodoServiceStub();
        TodoBusinessImplementation todoBusinessImplementation = new TodoBusinessImplementation(todoServiceStub);
        List<String> filteredTodos = todoBusinessImplementation.retrieveTodosRelatedToSpring("Dummy");
        assertEquals(0, filteredTodos.size());
    }
}

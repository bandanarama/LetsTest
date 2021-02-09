package data.api;

import java.util.List;

//Create TodoServiceStub
//Test TodoBusinessImplemenetation using TodoService Stub
public interface TodoService {
    public List<String> retrieveTodos(String user);
}

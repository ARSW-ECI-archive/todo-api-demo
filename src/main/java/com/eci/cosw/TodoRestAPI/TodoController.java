package com.eci.cosw.TodoRestAPI;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Santiago Carrillo
 * 2/14/18.
 */
@RestController
public class TodoController
{

    private final List<Todo> todoList = new ArrayList<>();

    public TodoController()
    {
        todoList.add( new Todo( "task 1", 5 ) );
        todoList.add( new Todo( "task 2", 4 ) );
        todoList.add( new Todo( "task 3", 3 ) );
        todoList.add( new Todo( "task 4", 2 ) );
    }

    @RequestMapping( "/todo" )
    public List<Todo> getTodoList()
    {
        return todoList;
    }
}

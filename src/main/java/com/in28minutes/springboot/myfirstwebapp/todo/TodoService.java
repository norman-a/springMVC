package com.in28minutes.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.List;

public class TodoService {
    private static List<Todo> todos;

    static {
        todos.add(new Todo(1, "Norman", "Learn AWS", false, LocalDate.now().plusWeeks(3)));
        todos.add(new Todo(2, "Norman", "FrontEnd", false, LocalDate.now().plusMonths(2)));
        todos.add(new Todo(3, "Norman", "Julia", false, LocalDate.now().plusWeeks(1)));
    }

    public List<Todo> findByUsername(String username){
        return todos;
    }
}

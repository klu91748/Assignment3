package com.springboot.web.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.web.dao.TodoDAO;
import com.springboot.web.model.Todo;

@Service
public class TodoService {
    
    @Autowired
    private TodoDAO todoDao;

    public List<Todo> retrieveTodos(String user) {
        return (List<Todo>) todoDao.findAll();
    }
    
    public Todo retrieveTodo(int id) {
        return todoDao.findOne(id);
    }

    public void updateTodo(Todo todo){
    	Todo obj = todoDao.findOne(todo.getId());
    	if (obj != null) {
    		todoDao.save(todo);
    	}
    }

    public void addTodo(String name, String taskName, Date targetDate,
            Date endDate, String description, String email, String severity) {
    	todoDao.save(new Todo(name, taskName, targetDate, endDate, description, email, severity));
    }

    public void deleteTodo(int id) {
    	todoDao.delete(id);
    }
}
package com.example.demo.controller;

import com.example.demo.model.Task;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final List<Task> tasks = new ArrayList<>();
    private int idCounter = 1;

    @GetMapping
    public List<Task> getTasks() {
        return tasks;
    }

    @PostMapping
    public Task addTask(@RequestBody Task task) {
        task.setId(idCounter++);
        tasks.add(task);
        return task;
    }

    @GetMapping("/{id}")
    public Task getTask(@PathVariable int id) {
        return tasks.stream().filter(t -> t.getId() == id).findFirst().orElse(null);
    }

    @PutMapping("/{id}")
    public Task updateTask(@PathVariable int id, @RequestBody Task updated) {
        for (Task t : tasks) {
            if (t.getId() == id) {
                t.setTitle(updated.getTitle());
                t.setDone(updated.isDone());
                return t;
            }
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable int id) {
        tasks.removeIf(t -> t.getId() == id);
    }
}

package com.in28minutes.springboot.myfirstwebapp.todo;

import java.time.LocalDate;

public class Todo {
    private int id;
    private String username;
    private String description;
    private boolean done;
    private LocalDate targetDate;

    public Todo(int id, String username, String description, boolean done, LocalDate targetDate) {
        this.id = id;
        this.username = username;
        this.description = description;
        this.done = done;
        this.targetDate = targetDate;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getDescription() {
        return description;
    }

    public boolean isDone() {
        return done;
    }

    public LocalDate getTargetDate() {
        return targetDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public void setTargetDate(LocalDate targetDate) {
        this.targetDate = targetDate;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", description='" + description + '\'' +
                ", done=" + done +
                ", targetDate=" + targetDate +
                '}';
    }
}


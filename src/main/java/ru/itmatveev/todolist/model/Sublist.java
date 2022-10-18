package ru.itmatveev.todolist.model;

public class Sublist {
    private String text;
    private boolean done;

    public Sublist() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}

package ru.itmatveev.todolist.model;

public class Sublist {
    private long id;
    private String text;
    private boolean done;

    public Sublist(long id, String text, boolean done) {
        this.id = id;
        this.text = text;
        this.done = done;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

package ru.itmatveev.todolist.model;

public class Entry {
    private long id;
    private String text;
    private boolean done;

    public Entry(long id, String text, boolean done){
        this.id = id;
        this.text = text;
        this.done = done;
    }

    public Long getId(){
        return this.id;
    }

    public String getText(){
        return this.text;
    }
}

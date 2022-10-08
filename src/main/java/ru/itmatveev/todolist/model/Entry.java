package ru.itmatveev.todolist.model;

public class Entry {
    private long id;
    private String text;

    public Entry(long id, String text){
        this.id = id;
        this.text = text;
    }

    public Long getId(){
        return this.id;
    }

    public String getText(){
        return this.text;
    }
}

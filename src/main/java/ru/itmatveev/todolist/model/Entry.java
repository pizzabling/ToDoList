package ru.itmatveev.todolist.model;

import java.util.List;

public class Entry {
    private long id;
    private String text;
    private boolean done;
    private String priority;
    private List<Sublist> subList;

    public Entry() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getText() {
        return this.text;
    }

    public boolean getDone() {
        return this.done;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public List<Sublist> getSubList() {
        return subList;
    }

    public void setSubList(List<Sublist> subList) {
        this.subList = subList;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
}

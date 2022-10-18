package ru.itmatveev.todolist.model;

import java.util.List;

public class Entry {
    private long id;
    private String text;
    private boolean done;
//    private List<Sublist> subList;
    private String priority;

//    public Entry(long id, String text, boolean done, List<Sublist> subList, String priority){
//        this.id = id;
//        this.text = text;
//        this.done = done;
//        this.subList = subList;
//        this.priority = priority;
//    }

    public Entry(long id, String text, boolean done, String priority){
        this.id = id;
        this.text = text;
        this.done = done;
        this.priority = priority;
    }

    public Long getId(){
        return this.id;
    }

    public String getText(){
        return this.text;
    }

    public boolean getDone(){
        return this.done;
    }

    public void setText(String text){
        this.text = text;
    }

    public void setDone(boolean done){
        this.done = done;
    }

//    public List<Sublist> getSubList() {
//        return subList;
//    }
//
//    public void setSubList(List<Sublist> subList) {
//        this.subList = subList;
//    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
}

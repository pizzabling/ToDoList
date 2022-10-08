package ru.itmatveev.todolist.service;

import org.springframework.stereotype.Service;
import ru.itmatveev.todolist.model.Entry;

import java.util.ArrayList;
import java.util.List;

@Service
public class ToDoService {
    private List<Entry> entryList = new ArrayList<>();

    public List<Entry> getEntryList(){
        return entryList;
    }

    public void createToDo(Entry entry){
        entryList.add(entry);
    }
}

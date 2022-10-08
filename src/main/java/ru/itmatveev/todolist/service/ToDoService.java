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

    public Entry getEntryById(long id){
        Entry entry = null;
        for (Entry e : entryList) {
            if (e.getId().equals(id)) {
                entry = e;
                break;
            }
        }
        return entry;
    }

    public void createEntry(Entry entry){
        entryList.add(entry);
    }

    public void deleteEntry(long id){
        for (int i = 0; i < entryList.size(); i++){
            if (entryList.get(i).getId().equals(id)){
                entryList.remove(i);
                break;
            }
        }
    }

    public void updateEntry(long id, String text, boolean done){
        for (Entry e : entryList){
            if(e.getId().equals(id)){
                e.setText(text);
                e.setDone(done);
                break;
            }
        }
    }
}

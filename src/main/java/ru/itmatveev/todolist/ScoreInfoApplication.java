package ru.itmatveev.todolist;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.itmatveev.todolist.model.Entry;
import ru.itmatveev.todolist.model.Sublist;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ScoreInfoApplication {

    public static void main(String[] args){
        SpringApplication.run(ScoreInfoApplication.class, args);
//        List<Sublist> sub = new ArrayList<>();
//        sub.add(new Sublist(1,
//                "text",
//                false
//                ));
//        Entry entry = new Entry(
//                1,
//                "text",
//                false,
//                "1",
//                sub
//        );
//        ObjectMapper mapper = new ObjectMapper();
//        String json = mapper.writeValueAsString(entry);
//        System.out.println(json);
    }

}

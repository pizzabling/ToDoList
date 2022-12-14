package ru.itmatveev.todolist.controller;

import org.springframework.web.bind.annotation.*;
import ru.itmatveev.todolist.BaseResponse;
import ru.itmatveev.todolist.model.Entry;
import ru.itmatveev.todolist.model.Sublist;
import ru.itmatveev.todolist.service.ToDoService;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/v1")
public class ToDoController {
    private long id = 0;
    private static final String SUCCESS_STATUS = "success";
    private static final String ERROR_STATUS = "error";
    private static final int CODE_SUCCESS = 100;
    private static final int AUTH_FAILURE = 102;

    private final ToDoService toDoService;

    public ToDoController(ToDoService toDoService) {
        this.toDoService = toDoService;
    }

    @GetMapping("/status")
    public BaseResponse showStatus() {
        return new BaseResponse(SUCCESS_STATUS, 1);
    }

    @GetMapping("/todolist")
    public List<Entry> getToDo() {
        return toDoService.getEntryList();
    }

    @GetMapping("/todolist/{id}")
    public Entry getToDoById(@PathVariable long id) {
        return toDoService.getEntryById(id);
    }

    @PostMapping("/createtodo")
    public void createToDo(@RequestBody Entry entry) {
        toDoService.createEntry(entry);
        id++;
    }

    @GetMapping("/deletetodo")
    public void deleteToDo(@RequestParam(value = "id") long id) {
        toDoService.deleteEntry(id);
    }

    @GetMapping("/updatetodo")
    public void updateToDo(@RequestParam(value = "id") long id,
                           @RequestParam(value = "text") String text,
                           @RequestParam(value = "done") boolean done) {
        toDoService.updateEntry(id, text, done);
    }

//    @PostMapping("/pay")
//    public BaseResponse pay(@RequestParam(value = "key") String key, @RequestBody PaymentRequest request) {
//
//        final BaseResponse response;
//
//        if (sharedKey.equalsIgnoreCase(key)) {
//            int userId = request.getUserId();
//            String itemId = request.getItemId();
//            double discount = request.getDiscount();
//            // Process the request
//            // ....
//            // Return success response to the client.
//            response = new BaseResponse(SUCCESS_STATUS, CODE_SUCCESS);
//        } else {
//            response = new BaseResponse(ERROR_STATUS, AUTH_FAILURE);
//        }
//        return response;
//    }

}


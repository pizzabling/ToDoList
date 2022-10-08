package ru.itmatveev.todolist;

import org.springframework.web.bind.annotation.*;
import ru.itmatveev.todolist.model.Entry;
import ru.itmatveev.todolist.service.ToDoService;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/v1")
public class Controller {
    private long id = 0;
    private static final String SUCCESS_STATUS = "success";
    private static final String ERROR_STATUS = "error";
    private static final int CODE_SUCCESS = 100;
    private static final int AUTH_FAILURE = 102;

    private final ToDoService toDoService;

    public Controller(ToDoService toDoService) {
        this.toDoService = toDoService;
    }

    @GetMapping("/status")
    public BaseResponse showStatus() {
        return new BaseResponse(SUCCESS_STATUS, 1);
    }

    @GetMapping("/ToDoList")
    public List<Entry> getToDo() {
        return toDoService.getEntryList();
    }

    @GetMapping("/ToDoList/{id}")
    public Entry getToDoById(@RequestParam long id) {
        return toDoService.getEntryById(id);
    }

    @RequestMapping("/createToDo")
    public void createToDo(@RequestParam(value = "text") String text) {
        Entry newEntry = new Entry(id, text, false);
        toDoService.createEntry(newEntry);
        id++;
    }

    @GetMapping("/deleteToDo")
    public void deleteToDo(@RequestParam(value = "id") long id) {
        toDoService.deleteEntry(id);
    }

    @GetMapping("/updateToDo")
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

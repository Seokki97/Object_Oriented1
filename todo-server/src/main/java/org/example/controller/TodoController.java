package org.example.controller;

import lombok.AllArgsConstructor;
import org.example.model.TodoEntity;
import org.example.model.TodoRequest;
import org.example.model.TodoResponse;
import org.example.service.TodoService;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin
@AllArgsConstructor
@RequestMapping("/")
public class TodoController {
    private final TodoService service;

    @PostMapping
    public ResponseEntity<TodoResponse> create(@RequestBody TodoRequest request){
        System.out.println("CREATE");
        if(ObjectUtils.isEmpty(request.getTitle()))
        return ResponseEntity.badRequest().build();

        if (ObjectUtils.isEmpty(request.getOrder()))
            request.setOrder(0L);

        if(ObjectUtils.isEmpty(request.getCompleted()))
            request.setCompleted(false);

        TodoEntity result = this.service.add(request);
        return ResponseEntity.ok(new TodoResponse(result));
    }

    @GetMapping("{id}")
    public ResponseEntity<TodoResponse> readOne(@PathVariable Long id){
        System.out.println("Read one");
        TodoEntity result = this.service.searchId(id);
        return ResponseEntity.ok(new TodoResponse(result));
    }

    @GetMapping
    public ResponseEntity<List<TodoResponse>> readAll(){
        System.out.println("Read all");
        List<TodoEntity> list = this.service.searchAll();
        List<TodoResponse> response = list.stream().map(TodoResponse::new)
                .collect(Collectors.toList());
        return ResponseEntity.ok(response);
    }

    @PatchMapping("{id}")
    public ResponseEntity<TodoResponse> update(@PathVariable Long id, @RequestBody TodoRequest request){
        System.out.println("UPDATE");
        TodoEntity result = this.service.updateById(id, request);
        return ResponseEntity.ok(new TodoResponse(result));

    }

    @DeleteMapping
    public ResponseEntity<?> deleteOne(@PathVariable Long id){
        System.out.println("Delete");
        this.service.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteAll(){
        System.out.println("Delete all");
        this.service.deleteAll();
        return ResponseEntity.ok().build();
    }
}

package com.geekster.ToDoApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Todocontroller {


@Autowired
    List<Todo>Todovar;

     @PostMapping("Todo")
 public String postTodo(@RequestBody Todo todo){
        Todovar.add(todo);
        return "todo added";

    }

    @GetMapping("Todoget")
    public List<Todo> Todova(){
         return Todovar;
    }


    @PutMapping("todo/put")
    public String postMapping(@PathVariable int id,@RequestParam boolean done){

         for(Todo todo :Todovar){
             if(todo.getId()==id){
                 todo.setDone(done);
             }
         }
         return "not done";


    }

@DeleteMapping("todo/delete")
    public String deleteMapping(@PathVariable int id,@RequestParam boolean done){

        for(Todo todo :Todovar){
            if(todo.getId()==id){
                todo.setDone(done);
            }
        }
        return "not done";


    }



}

package br.com.andre_casimiro.github.todolist.controllers.test;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/mfRoute")
// http://localhost:8080/mfRoute
public class MFController {

    @GetMapping("/hello")
    public String firstMensage(){
        return "hello world spring boot";
    }
    
    
}
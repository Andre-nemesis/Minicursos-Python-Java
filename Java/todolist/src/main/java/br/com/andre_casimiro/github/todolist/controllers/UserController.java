package br.com.andre_casimiro.github.todolist.controllers;

import org.springframework.web.bind.annotation.RestController;

import br.com.andre_casimiro.github.todolist.models.UserModel;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("/users")
public class UserController {

    @PostMapping("/")
    public void createUser(@RequestBody UserModel userModel) {
        System.out.println(userModel.getName());
    }

}

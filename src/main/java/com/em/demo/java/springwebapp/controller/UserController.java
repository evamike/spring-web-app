package com.em.demo.java.springwebapp.controller;

import com.em.demo.java.springwebapp.model.entity.User;
import com.em.demo.java.springwebapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/rest/users", method = RequestMethod.GET)
   // public List<User> getAllUsers(){
    public ResponseEntity<List<User>> getAllUsers(){

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Access-Control-Allow-Origin", "*");
        return new ResponseEntity<>(userService.getAll(), httpHeaders, HttpStatus.CREATED);
    }
}

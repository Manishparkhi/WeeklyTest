package com.GeeksterTest.Weekly.controller;

import com.GeeksterTest.Weekly.model.Users;
import com.GeeksterTest.Weekly.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;
import java.util.Optional;

@RestController
@RequestMapping(value = "api/v1/")
public class Controller {

    @Autowired
    Service service;

    @GetMapping(value = "allUser")
    public Iterable<Users> getAllUSer(){
        return service.getAllUSer();
    }

    @PostMapping(value = "addUser")
    public String addUser(@RequestBody Users user){
        return service.addUser(user);
    }

    @PutMapping(value = "updateInfo/{id}")
    public void updateInfo(@PathVariable Long id , @RequestBody Users user){
         service.updateInfo(id,user);
    }

    @DeleteMapping(value = "deletUser/{id}")
    public void deleteId(@PathVariable Long id){
        service.deletUserId(id);
    }

    @GetMapping(value = "findId/{id}")
    public Optional<Users> findId(@PathVariable Long id){
         return service.findById(id);
    }

    @GetMapping(value = "findUsername/{userName}")
    public Users findUserName(@PathVariable String userName){
       return service.findUserName(userName);
    }

    @GetMapping(value = "USERID/{USER_ID}")
    public Users findByUSER_ID(@PathVariable Long USER_ID){
        return service.findByUSER_ID(USER_ID);
    }
}

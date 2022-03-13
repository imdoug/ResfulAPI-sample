package me.dougmoreira.rest.controller;

import me.dougmoreira.rest.models.User;
import me.dougmoreira.rest.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApiController {

    @Autowired
    private UserRepo userRepo;


    @GetMapping(value = "/")
    public String getPage(){
        return "Welcome";
    }
///      SHOW ALL USERS IN DB
    @GetMapping(value = "/users")
    public List<User> getUsers(){
        return userRepo.findAll();
    }
//      ADDING USER TO DB
    @PostMapping(value = "/save")
    public User saveUser(@RequestBody User newUser){
        userRepo.save(newUser);
        return newUser;
    }
    //      UPDATING USER ON DB BY ID
    @PutMapping(value = "/update/{id}")
    public String updateUser(@PathVariable long id, @RequestBody  User user){
        User updatedUser = userRepo.findById(id).get();
        updatedUser.setFirstName(user.getFirstName());
        updatedUser.setLastName(user.getLastName());
        updatedUser.setAge(user.getAge());
        updatedUser.setOccupation(user.getOccupation());
        userRepo.save(updatedUser);
        return "Updated...";
    }
    //      DELETING USER ON DB BY ID
    @DeleteMapping(value = "/delete/{id}")
    public String deleteUser(@PathVariable long id){
        User deletedUser = userRepo.findById(id).get();
        userRepo.delete(deletedUser);
        return "Deleted user with the id: " + id;
    }
}

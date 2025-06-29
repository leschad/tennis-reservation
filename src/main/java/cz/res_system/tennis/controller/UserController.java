package cz.res_system.tennis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import cz.res_system.tennis.entity.UserEntity;
import cz.res_system.tennis.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserEntity> findAll() {
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public UserEntity findById(@PathVariable Long id) {
        return userService.findById(id);
    }

    @PostMapping
    public UserEntity save(@RequestBody UserEntity user) {
        return userService.save(user);
    }

    @PutMapping
    public UserEntity update(@RequestBody UserEntity user) {
        return userService.save(user);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        userService.delete(id);
    }

}

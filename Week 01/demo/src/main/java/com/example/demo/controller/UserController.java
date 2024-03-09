package com.example.demo.controller;

import com.example.demo.dto.UserDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RequestMapping("api/v1/users")
@RestController
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @GetMapping("/select")
    public String select(@RequestParam int id) {
        logger.debug("Select User id {}", id);
        return "Select User";
    }

    @GetMapping("select/all")
    public String selectAll() {
        logger.debug("Select All Users");
        return "Select All Users";
    }

    @PostMapping("/save")
    public String save(@RequestBody UserDTO user) {
        logger.debug("Save User user {} name {}", user, user.getName());
        return "Save User";
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        return "deleted";
    }
}

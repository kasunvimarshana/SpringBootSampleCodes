package com.example.demo.controller;

import com.example.demo.dto.CustomerDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RequestMapping("api/v1/test")
@RestController
public class TestController {

    private static final Logger log = LoggerFactory.getLogger(TestController.class);

    @PostMapping("/save")
    public String saveCustomer(@RequestBody CustomerDTO customerDTO) {
        log.error("Customer DTO {} name {}", customerDTO,customerDTO.getName());
        return "saved";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteCustomer(@PathVariable int id) {
        return "deleted";
    }


    @DeleteMapping("delete/new")
    public String deleteParam(@RequestParam int id) {
        return "delete using delete request param";
    }

}


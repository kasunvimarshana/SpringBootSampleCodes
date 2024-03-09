package com.example.demo.controller;

import com.example.demo.dto.CustomerDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RequestMapping("api/v1/customers")
@RestController
public class CustomerController {
    private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);

    @PostMapping("/save")
    public String saveCustomer(@RequestBody CustomerDTO customerDTO){
        logger.debug("Save: Customer DTO {} name {}", customerDTO, customerDTO.getName());
        return "saved";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteCustomer(@PathVariable int id) {
        logger.debug("Delete: id {}", id);
        return "deleted";
    }

    @GetMapping("/show")
    public String show(@RequestParam int id) {
        logger.debug("Show: id {}", id);
        return "show";
    }

    @GetMapping("/")
    public String showAll() {
        logger.debug("ShowAll");
        return "showAll";
    }
}

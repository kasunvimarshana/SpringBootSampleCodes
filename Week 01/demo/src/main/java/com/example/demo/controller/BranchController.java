package com.example.demo.controller;

import com.example.demo.dto.BranchDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RequestMapping("/api/v1/branches")
@RestController
public class BranchController {
    private static final Logger logger = LoggerFactory.getLogger(BranchController.class);

    @GetMapping("/select")
    public String select(@RequestParam int id) {
        logger.debug("Select Branch id {}", id);
        return "Select Branch";
    }

    @GetMapping("select/all")
    public String selectAll() {
        logger.debug("Select All Branches");
        return "Select All Branches";
    }

    @PostMapping("/save")
    public String save(@RequestBody BranchDTO branch) {
        logger.debug("Save Branch branch {} name {}", branch, branch.getName());
        return "Save Branch";
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        return "deleted";
    }
}

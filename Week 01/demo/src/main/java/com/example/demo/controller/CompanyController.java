package com.example.demo.controller;

import com.example.demo.dto.CompanyDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RequestMapping("api/v1/companies")
@RestController
public class CompanyController {
    private static final Logger logger = LoggerFactory.getLogger(ProductController.class);

    @GetMapping("/select")
    public String select(@RequestParam int id) {
        logger.debug("Select Company id {}", id);
        return "Select Company";
    }

    @GetMapping("select/all")
    public String selectAll() {
        logger.debug("Select All Companies");
        return "Select All Companies";
    }

    @PostMapping("/save")
    public String save(@RequestBody CompanyDTO company) {
        logger.debug("Save Company company {} name {}", company, company.getName());
        return "Save Company";
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        return "deleted";
    }
}

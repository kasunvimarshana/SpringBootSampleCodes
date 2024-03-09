package com.example.demo.controller;

import com.example.demo.dto.ProductDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RequestMapping("api/v1/products")
@RestController
public class ProductController {
    private static final Logger logger = LoggerFactory.getLogger(ProductController.class);

    @GetMapping("/select")
    public String select(@RequestParam int id) {
        logger.debug("Select Product id {}", id);
        return "Select Product";
    }

    @GetMapping("select/all")
    public String selectAll() {
        logger.debug("Select All Products");
        return "Select All Products";
    }

    @PostMapping("/save")
    public String save(@RequestBody ProductDTO product) {
        logger.debug("Save Product product {} name {}", product, product.getName());
        return "Save Product";
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        return "deleted";
    }
}

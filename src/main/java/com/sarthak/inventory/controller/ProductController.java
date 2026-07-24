package com.sarthak.inventory.controller;

import com.sarthak.inventory.entity.Product;
import com.sarthak.inventory.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/all")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public String getname(@PathVariable Long id) {
        return productService.getProductName(id);
    }

    @PostMapping
    public void createProduct(@RequestBody Product product) {
        productService.saveProduct(product);
    }

}

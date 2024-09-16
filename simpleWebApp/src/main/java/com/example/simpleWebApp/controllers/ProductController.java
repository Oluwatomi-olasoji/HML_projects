package com.example.simpleWebApp.controllers;

import com.example.simpleWebApp.model.Product;
import com.example.simpleWebApp.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("/products")
    public List<Product> getAllProducts() {
        return productService.getProducts();
    }
}

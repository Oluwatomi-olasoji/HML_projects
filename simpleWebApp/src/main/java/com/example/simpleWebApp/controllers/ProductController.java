package com.example.simpleWebApp.controllers;

import com.example.simpleWebApp.model.Product;
import com.example.simpleWebApp.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("/products") //the @RequestMapping annotation is a get mapping my default, to be more explicit @GetMapping works
    public List<Product> getAllProducts() {
        return productService.getProducts();
    }

    @RequestMapping("/products/{id}") //spring atomatically maps the id in the {} to the variable annotated with PathVariable
    public Product getProductById(@PathVariable int id) {
        return productService.getProductById(id);
    }

    @PostMapping("/products")//the @PostMapping annotation is used for Put requests.the same url can be used in the mapping because they are different request types
    public void addProduct(@RequestBody Product product) { //the @RequestBody annotation is used because we are accepting the body of the quest and not a variable passed in the url
         productService.addProduct(product);
    }

}

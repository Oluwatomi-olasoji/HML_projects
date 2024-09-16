package com.example.simpleWebApp.services;

import com.example.simpleWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products= Arrays.asList(
            new Product(1,"tampons",150),
            new Product(2,"crochet hook", 200),
            new Product(3,"perfume",300));

    public List<Product> getProducts() {
        return products;
    }
}

package com.randikalakmal.springsecurity.controller;

import com.randikalakmal.springsecurity.dto.Product;
import com.randikalakmal.springsecurity.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome, This is not secure endpoint";
    }

    @GetMapping("/all")
    public List<Product> getAllProducts(){
        return productService.getProducts();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable int id){
        return productService.getProduct(id);
    }

}

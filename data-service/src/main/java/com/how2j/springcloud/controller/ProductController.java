package com.how2j.springcloud.controller;

import com.how2j.springcloud.pojo.Product;
import com.how2j.springcloud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping("/products")
    public List<Product> getProducts(){
        return productService.getListProducts();
    }
}

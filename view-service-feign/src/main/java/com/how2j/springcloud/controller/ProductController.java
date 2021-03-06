package com.how2j.springcloud.controller;


import com.how2j.springcloud.pojo.Product;
import com.how2j.springcloud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ProductController {

    @Value("${version}")
    String version;

    @Autowired
    ProductService productService;

    @RequestMapping("/products")
    public Object getProducts(Model model){
        List<Product> ps = productService.getProducts();
        model.addAttribute("ps", ps);
        model.addAttribute("version", version);
        return "products";
    }
}

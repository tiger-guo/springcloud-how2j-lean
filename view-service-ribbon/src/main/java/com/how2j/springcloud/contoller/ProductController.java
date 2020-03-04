package com.how2j.springcloud.contoller;


import com.how2j.springcloud.pojo.Product;
import com.how2j.springcloud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping("/products")
    public Object getProducts(Model model){
        List<Product> ps = productService.listProduct();
        model.addAttribute("ps", ps);
        return "products";
    }
}

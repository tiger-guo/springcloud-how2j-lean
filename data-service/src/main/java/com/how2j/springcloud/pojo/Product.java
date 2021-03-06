package com.how2j.springcloud.pojo;

import lombok.Data;

@Data
public class Product {

    private int id;
    private String name;
    private int price;

    public Product(int id, String name, int price){
        this.id = id;
        this.price = price;
        this.name = name;
    }
}

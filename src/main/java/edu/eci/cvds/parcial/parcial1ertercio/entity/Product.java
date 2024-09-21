package edu.eci.cvds.parcial.parcial1ertercio.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {

    private String name;
    private int price;
    private int stock;
    private String category;

    public Product(){

    }

    /**
     * entity representate of a product
     * @param name name of product
     * @param price price of product
     * @param stock stock of product
     * @param category category of producto
     */
    public Product(String name, int price, int stock, String category) {
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.category = category;
    }



}

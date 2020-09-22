package com.VeebiPood.service;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String serial;
    private String name_long;
    private String category_id;
    private String colour;
    private String size;
    private String gender;
    private String brand;
    private String quantity;
    private String price;

    public void setId(Long id) {
        this.id = id;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public void setName_long(String name_long) {
        this.name_long = name_long;
    }

    public void setCategory_id(String category_id) {
        this.category_id = category_id;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public String getSerial() {
        return serial;
    }

    public String getName_long() {
        return name_long;
    }

    public String getCategory_id() {
        return category_id;
    }

    public String getColour() {
        return colour;
    }

    public String getSize() {
        return size;
    }

    public String getGender() {
        return gender;
    }

    public String getBrand() {
        return brand;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getPrice() {
        return price;
    }
}

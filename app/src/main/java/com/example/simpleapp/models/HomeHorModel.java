package com.example.simpleapp.models;

public class HomeHorModel {
    int image;
    String name;
    String country;
    String price;

    public HomeHorModel(int image, String name, String country, String price) {
        this.image = image;
        this.name = name;
        this.country = country;
        this.price = price;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}


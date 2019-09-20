package com.company;

import java.math.RoundingMode;
import java.text.NumberFormat;

public class Product {
    private String code;
    private String description;
    private double price;

    // Default constructor
    public Product() {
    }

    // Overloaded Constructor
    public Product(String code, String description, double price) {
        this.code = code;
        this.description = description;
        this.price = price;
    }

    // methods to return variables formatted as one string
    @Override
    public String toString() {
        String s = "Code:\t\t\t\t\t" + code + "\n" +
                "Description:\t\t\t" + description + "\n" +
                "Price:\t\t\t\t\t" + this.getFormattedPrice() + "\n";
        return s;
    }

    public String getFormattedPrice() {
        // Use the NumberFormat class to format the price to 2 decimal places
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(2);
        nf.setMinimumFractionDigits(2);
        nf.setRoundingMode(RoundingMode.HALF_UP);
        return nf.format(price);
    }

    @Override
    public boolean equals(Object o){
        Product p = new Product();
        if(this.getCode().equals(p.getCode())){
            return true;
        }else{
            return false;
        }
    }

    // Get and set accessors for the code, description, and price instance variables
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
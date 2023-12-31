package com.engeto.homework;

import java.math.BigDecimal;

public class Item {
    private String description;
    private BigDecimal price;
    private Category category;

    public Item(String description, BigDecimal price, Category category) {
        this.description = description;
        this.price = price;
        this.category = category;
    }

    public Item(String description, BigDecimal price) {
        this(description, price, Category.OTHERS);
    }

    // Gettery a Settery
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Položka:" + description +
                ", "+ price + " Kč"+
                " (" + category + ")";
    }
}

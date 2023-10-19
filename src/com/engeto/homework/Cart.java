package com.engeto.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Item> listOfItems = new ArrayList<>();
    private LocalDate dateOfPurchase = LocalDate.now();


    // Gettery a Settery

    public void addItem(Item newItem ){
        listOfItems.add(newItem);
    }

    public void removeItem(int index) {
        listOfItems.remove(index);
    }

    public Item get(int index) {
    return listOfItems.get(index);
    }

    public List<Item> getListOfItems() {
        return listOfItems;
    }

    public void setListOfItems(List<Item> listOfItems) {
        this.listOfItems = listOfItems;
    }

    public LocalDate getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(LocalDate dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;

    }
}

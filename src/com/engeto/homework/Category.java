package com.engeto.homework;

public enum Category {
    FOOD("jídlo"),
    CONSUMABLES("spotřební zboží"),
    OTHERS ("ostatní");

    private String description;

    private Category(String description){
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}

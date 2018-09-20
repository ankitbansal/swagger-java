package com.ankit.model;

/**
 * Created by anbabans on 9/20/2018.
 */
public class Item {
    private final int id;
    private final String name;
    private final int quantity;

    public Item(int id, String name, int quantity) {

        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }
}

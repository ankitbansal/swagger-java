package com.ankit.repository;

import com.ankit.model.Item;

import java.util.List;

/**
 * Created by anbabans on 9/20/2018.
 */
public class CatalogRepository {

    public static List<Item> catalog;
    static {
        catalog.add(new Item(1, "Item 1", 20));
        catalog.add(new Item(2, "Item 2", 2));
        catalog.add(new Item(3, "Item 3", 50));
        catalog.add(new Item(4, "Item 4", 10));
        catalog.add(new Item(5, "Item 5", 5));
    }

    public List<Item> getCatalog() {
        return catalog;
    }

    public Item getItem(int id) {
        return null;
    }
}

package com.shopping;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Narmadha Ganapathy
 ***/
public class ShoppingCart {

    public static void main(String[] args) {
        Map<String, Double> itemsPrice = new HashMap<>();
        itemsPrice.put("Apple", 0.60);
        itemsPrice.put("Orange", 0.25);
        ScanItems scanItems = new ScanItems();
        PriceCaculator priceCaculator = new PriceCaculator();
        System.out.println("Calculate price is " + priceCaculator.calculatePrice(scanItems.getItemsScanned(itemsPrice.keySet()), itemsPrice));
    }
}

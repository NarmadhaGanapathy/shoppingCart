package com.shopping;

/**
 * Created by Narmadha Ganapathy
 ***/

import java.util.Map;

/***
 * Calculates the total price based on the count of items and their price provided.
 */
 class PriceCaculator {
    double calculatePrice(final Map<String, Integer> scannedItems, final Map<String, Double> itemPrice) {
        double price = 0.0;
        for (String item : scannedItems.keySet()
        ) {
            price += scannedItems.get(item) * itemPrice.get(item);

        }
        return price;
    }
}

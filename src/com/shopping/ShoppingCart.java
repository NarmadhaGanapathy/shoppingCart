package com.shopping;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Narmadha Ganapathy
 ***/
public class ShoppingCart {

    public static void main(String[] args) {
        Map<String, Double> itemsPrice = new HashMap<>();
        itemsPrice.put("Apple", 0.60);
        itemsPrice.put("Orange", 0.25);
        ItemCount itemCount = new ItemCount();
        PriceCaculator priceCaculator = new PriceCaculator();
        Set<String> itemKey = itemsPrice.keySet();
        System.out.println("Calculated price is " + priceCaculator.calculatePrice(itemCount.getItemsCount(itemKey), itemsPrice));
        OfferItemCount offerItemCount =  new OfferItemCount();
        System.out.println("Please try shopping with the offer price");
        System.out.println("Calculated price with offer is "+ priceCaculator.calculatePrice(offerItemCount.getItemsCount(itemKey),itemsPrice));
    }

}

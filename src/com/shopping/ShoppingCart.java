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
        ItemCount itemCount = new ItemCount();
        PriceCaculator priceCaculator = new PriceCaculator();
        System.out.println("Calculated price is " + priceCaculator.calculatePrice(itemCount.getItemsCount(itemsPrice.keySet()), itemsPrice));
        OfferItemCount offerItemCount =  new OfferItemCount();
        System.out.println("Please try shopping with the offer price");
        System.out.println("Calculated price with offer is "+ priceCaculator.calculatePrice(offerItemCount.getItemsCount(itemsPrice.keySet()),itemsPrice));
    }

}

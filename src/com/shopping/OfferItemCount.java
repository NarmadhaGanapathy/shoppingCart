package com.shopping;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Narmadha Ganapathy
 ***/

/***
 * Calculate the count for each items to be priced as per the offer
 */

public class OfferItemCount extends ItemCount {
    @Override
    Map<String, Integer> getItemsCount(Set<String> itemKey) {
        Map<String, Integer> offerItemsCount = new HashMap<>();
        Map<String, Integer> scannedItemsCount = super.getItemsCount(itemKey);
        int itemCount = 0;
        for (String item : scannedItemsCount.keySet()
        ) {
            if ("Apple".equalsIgnoreCase(item)) {
                itemCount = scannedItemsCount.get(item) / 2 + scannedItemsCount.get(item) % 2;
            } else if ("Orange".equalsIgnoreCase(item)) {

                itemCount = (scannedItemsCount.get(item) / 3) > 0 ? scannedItemsCount.get(item) - (scannedItemsCount.get(item) / 3) : scannedItemsCount.get(item);
            }
            offerItemsCount.put(item, itemCount);
        }
        return offerItemsCount;
    }
}



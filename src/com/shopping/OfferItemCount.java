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
            Integer scannedItemCount = scannedItemsCount.get(item);
            if ("Apple".equalsIgnoreCase(item)) {
                itemCount = scannedItemCount / 2 + scannedItemCount % 2;
            } else if ("Orange".equalsIgnoreCase(item)) {

                int groupBy3Count = scannedItemCount / 3;
                itemCount = groupBy3Count > 0 ? scannedItemCount - groupBy3Count : scannedItemCount;
            }
            offerItemsCount.put(item, itemCount);
        }
        return offerItemsCount;
    }
}



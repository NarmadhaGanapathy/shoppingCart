package com.shopping;

/**
 * Created by Narmadha Ganapathy
 ***/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*******
 * Scan the item, by getting input from the user and calculate the count of each item
 */

class ItemCount {

    Map<String, Integer> getItemsCount(Set<String> itemKey) {

        Map<String, Integer> scannedItemsCount = new HashMap<>();
        System.out.println("Please enter the item name");
        System.out.println("Please enter bill when you are done scanning");
        Scanner in = new Scanner(System.in);
        String item;
        while (in.hasNext()) {
            item = in.next();
            if ("Bill".equalsIgnoreCase(item)) {
                break;
            } else if (itemKey.contains(item)) {
                Integer count = scannedItemsCount.get(item);
                scannedItemsCount.put(item, count != null ? count + 1 : 1);
            } else {
                System.out.println("Please scan only the following items ");
                itemKey.forEach(System.out::println);
            }
        }
        return scannedItemsCount;
    }
}

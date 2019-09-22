package com.shopping;

/**
 * Created by Narmadha Ganapathy
 ***/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*******
 * Scan the item, by getting input from the user and calculate the count of each item
 */

 class ScanItems {

     Map<String, Integer> getItemsScanned() {

        Map<String, Integer> scannedItems = new HashMap<>();
        System.out.println("Please enter the item name");
        System.out.println("Please enter bill when you are done scanning");
        Scanner in = new Scanner(System.in);
        String item;
        while (in.hasNext()) {
            item = in.next();
            if ("Bill".equalsIgnoreCase(item)) {
                break;
            } else {
                scannedItems.put(item, scannedItems.get(item) != null ? scannedItems.get(item) + 1 : 1);
            }
        }
        return scannedItems;
    }
}

package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
/*
        Demo 1 will cover:

         context
         instantiating HashMap
         printing it -- can just pass to System.out.println directly!
         adding to a map, what happens with duplicate keys
         accessing data in the map
         HashMap efficiency vs ArrayList - contains

         */

// 0. So much data in our lives can be modeled as a map and so maps can help us write
// so many different types of applications.
//
// Come up with some potential key/value type data that you could store in a map
// related to your hobbies or anything you can think of.  Write it down
// and we'll share as a group!

//  1. Declare and instantiate a HashMap variable called `foodPrices`
//  that maps food names to their price.
//  for example:  You could have the following 3 key value pairs in the map:
//  Apple is mapped to 0.99,
//  Milk is mapped to 2.79,
//  Frozen Pizza is mapped to 5.99


// 2. Add the following key value pairs to `foodPrices`
//  Apple is mapped to 0.99,
//  Milk is mapped to 2.79,
//  Frozen Pizza is mapped to 5.99


// 3. Use get() to retrieve the value for a key that is in the map.
// Print out the return of get to confirm your expectation


// 4. Use containsKey twice: once that will return true and once that will return false
// Print out the returns of containsKey to confirm your expectation


    // Demo 2 cover looping briefly (keySet, foreach loop)

    public static void main(String[] args) {
        HashMap<String, Double> foodPrices = new HashMap<>();

        foodPrices.put("Apple", 0.99);
        foodPrices.put("Milk", 2.79);
        foodPrices.put("Frozen Pizza", 5.99);

        ArrayList<String> additionalFoods = new ArrayList<>();
        additionalFoods.add("Beer");
        additionalFoods.add("Broccoli");
        additionalFoods.add("Legumes");

        System.out.println("Getting Apple: " + foodPrices.get("Apple") + "\n");
        System.out.println("Is Milk in hashmap? " + foodPrices.containsKey("Milk") + "\n");
        System.out.println("Is Beer in hashmap? " + foodPrices.containsKey("Beer") + "\n");

        addAllAt499(foodPrices, additionalFoods);

        printMap(foodPrices);

        System.out.println("Is Beer in hashmap? " + foodPrices.containsKey("Beer") + "\n");

        addOneDollarToEach(foodPrices);

        printMap(foodPrices);

    }


    // 6.  Print out each key value pair with the following format with the key and value on separate lines
    // with a blank line after each pair
    // key: Apple
    // value: 0.99
    //
    public static void printMap(HashMap<String, Double> foodPrices) {
        // 6. your code here
        foodPrices.forEach((food, price) -> {
            System.out.print("key: " + food + "\n" + "value: " + price + "\n\n");
        });
    }


    // 7. Given a HashMap of existing food names -> prices mapping and an ArrayList of new foods to add,
    // add each of the foods in `additionalFoods` to `foodPrices` for 4.99 each
    public static void addAllAt499(HashMap<String, Double> foodPrices, ArrayList<String> additionalFoods) {
        // 7. your code here
        for (String elem : additionalFoods) {
            foodPrices.put(elem, 4.99);
        }
    }


    // 8.  Given a HashMap of existing food names -> prices mapping,
    // increase each of the food's current prices by 1.00
    public static void addOneDollarToEach(HashMap<String, Double> foodPrices) {
        // 8. your code here
        foodPrices.forEach((food, price) -> {
            foodPrices.put(food, price + 1.00);
        });
    }
}

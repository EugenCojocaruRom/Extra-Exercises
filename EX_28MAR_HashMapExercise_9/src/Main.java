import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc =  new Scanner(System.in);
        //Create the outer HashMap: category name -> (product name -> price)
        HashMap<String, HashMap<String, Integer>> inventory = new HashMap<>();
        //Display prompt - number of categories
        System.out.print("Enter number of categories: ");
        //Declare variable of type int and read the number of categories as an integer (also remove any whitespace)
        int numCategories = Integer.parseInt(sc.nextLine().trim());
        //Loop from i = 0 to the value of numCategories, incrementing i by 1 - for each category
        for (int i = 0; i < numCategories; i++) {
            //Display prompt - category name
            System.out.print("Enter category name: ");
            //Declare variable of type String and read the value from the keyboard (also remove any whitespace)
            String categoryName = sc.nextLine().trim();
            //Create the inner HashMap for this category's products
            HashMap<String, Integer> products = new HashMap<>();
            //Display prompt - number of products in the category
            System.out.print("Enter number of products in " + categoryName + ": ");
            //Declare variable of type int and read the number of products as an integer (also remove any whitespace)
            int numProducts = Integer.parseInt(sc.nextLine().trim());
            //Loop from j = 0 to the value of numProducts, incrementing i by 1 - for each product in the category
            for (int j = 0; j < numProducts; j++) {
                //Display prompt - product name
                System.out.print("\tEnter product name: ");
                //Declare variable of type String and read the value from the keyboard (also remove any whitespace)
                String productName = sc.nextLine().trim();
                //Display prompt - product price
                System.out.print("\tEnter price of " + productName + ": ");
                //Declare variable of type int and read the number of products as an integer (also remove any whitespace)
                int price = Integer.parseInt(sc.nextLine().trim());
                //Add the product and its price to the inner map
                products.put(productName, price);
            }
            //Add the category and its products map to the outer inventory map
            inventory.put(categoryName, products);
        }
        //Call the method to find and print the most expensive product per category
        printMostExpensiveProducts(inventory);
    }

    //Create method for finding and displaying the most expensive product per category
    public static void printMostExpensiveProducts(HashMap<String, HashMap<String, Integer>> inventory) {
        //Set condition for the case when the HashMap is empty (no categories)
        if (inventory.isEmpty()) {
            //Display message
            System.out.println("No categories in inventory.");
            //Stop executing the method
            return;
        }
        //Loop over each category entry (category name + its products map)
        for (Map.Entry<String, HashMap<String, Integer>> categoryEntry : inventory.entrySet()) {
            //Get the category name
            String category = categoryEntry.getKey();
            //Get the inner map of products for this category
            HashMap<String, Integer> products = categoryEntry.getValue();
            //Display the category name
            System.out.println("Category: " + category);
            //If condition for the case when this category has no products
            if (products.isEmpty()) {
                //Display the no-products message
                System.out.println("\tNo products available.");
            } else {
                //Declare variable of type String and set it to null
                String mostExpensiveName = null;
                //Declare variable of type int and initialize it at the lowest possible int
                int highestPrice = Integer.MIN_VALUE;
                //Loop over each product entry (product name + price) in this category
                for (Map.Entry<String, Integer> productEntry : products.entrySet()) {
                    //Declare variable of type int and initialize it at the current product's price
                    int price = productEntry.getValue();
                    //Set condition for the case when the product price is greater than the current highest price
                    if (price > highestPrice) {
                        //Update highest price
                        highestPrice = price;
                        //Update most expensive product name
                        mostExpensiveName = productEntry.getKey();
                    }
                }
                //Display the most expensive product and its price for this category
                System.out.println("\tMost Expensive Product: " + mostExpensiveName + ", Price: " + highestPrice);
            }
        }
    }
}
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Declare outer HashMap that will hold the categories and their products
        HashMap<String, HashMap<String, Integer>> inventory = new HashMap<>();
        //Display prompt - number of categories
        System.out.print("Enter number of categories: ");
        //Declare variable of type int, read it from the keyboard and convert it from String to int
        int numCategories = Integer.parseInt(sc.nextLine());
        //Loop from i = 0 to the value of numCategories, incrementing i by 1
        for (int i = 0; i < numCategories; i++) {
            //Display prompt - category name
            System.out.print("Enter category name: ");
            //Declare variable of type String and read it from the keyboard
            String categoryName = sc.nextLine();
            //Declare inner HashMap to hold the products for this category
            HashMap<String, Integer> products = new HashMap<>();
            //Display prompt - number of products the category
            System.out.print("Enter number of products in " + categoryName + ": ");
            //Declare variable of type int, read it from the keyboard and convert it from String to int
            int numProducts = Integer.parseInt(sc.nextLine());
            //Loop from j = 0 to the value of numProducts, incrementing j by 1
            for (int j = 0; j < numProducts; j++) {
                //Display prompt - product name
                System.out.print("Enter product name: ");
                //Declare variable of type String and read it from the keyboard
                String productName = sc.nextLine();
                //Display prompt - product price
                System.out.print("Enter price for " + productName + ": ");
                //Declare variable of type int, read it from the keyboard and convert it from String to int
                int price = Integer.parseInt(sc.nextLine());
                //Add the product and its price to the inner HashMap
                products.put(productName, price);
            }
            //Add the category and its products HashMap to the outer inventory HashMap
            inventory.put(categoryName, products);
        }
        //Display separator
        System.out.println("<==================>");
        //Call the method to display the full nested inventory
        printNestedInventory(inventory);
    }

    //Define method for displaying the nested HashMap
    public static void printNestedInventory(HashMap<String, HashMap<String, Integer>> inventory) {
        //Loop through each entry in the outer HashMap (each entry = one category)
        for (Map.Entry<String, HashMap<String, Integer>> category : inventory.entrySet()) {
            //Display the category name
            System.out.println("Category: " + category.getKey());
            //Get the inner HashMap (products and their prices) for this category
            HashMap<String, Integer> products = category.getValue();
            //Set condition for checking if the category is empty
            if (products.isEmpty()) {
                //Display message
                System.out.println("\t(No products)");
            } else {
                //Loop through each product entry (product name -> price)
                for (Map.Entry<String, Integer> product : products.entrySet()) {
                    //Display the product name and price
                    System.out.println("\tProduct: " + product.getKey() + ", Price: " + product.getValue());
                }
            }
        }
    }
}
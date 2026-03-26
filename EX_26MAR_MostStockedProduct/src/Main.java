import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display prompt - number of products
        System.out.print("Enter number of products: ");
        //Declare variable of type int (counter), read it from the keyboard and convert it from String to int
        int count = Integer.parseInt(sc.nextLine());
        //Declare HashMap - to hold product names and quantities
        HashMap<String, Integer> inventory = new HashMap<>();
        //Loop from i = 0 to the value of 'count', incrementing i by 1 - collect each product's name and quantity
        for (int i = 0; i < count; i++) {
            //Display prompt - product name
            System.out.print("Product name: ");
            //Declare variable of type String and read it from the keyboard
            String name = sc.nextLine();
            //Display prompt - quantity
            System.out.print("Quantity: ");
            //Declare variable of type int, read it from the keyboard and convert it from String to int
            int quantity = Integer.parseInt(sc.nextLine());
            //Add the product and its quantity to the inventory map
            inventory.put(name, quantity);
        }
        //Call the method to find and display the most stocked product
        printMostStockedProduct(inventory);
    }

    //Define method for displaying the most stocked product
    public static void printMostStockedProduct(HashMap<String, Integer> inventory) {
        //Set condition for the case when the inventory has no entries
        if (inventory.isEmpty()) {
            //Display message
            System.out.println("No products in inventory.");
            return;
        }
        //Declare variable of type String and set it to null
        String mostStocked = null;
        //Declare vasiable of type int and initialize it to -1
        int maxQuantity = -1;
        //Iterate over each key-value pair in the inventory
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            //Set condition for the case when the product's quantity is greater than the current max
            if (entry.getValue() > maxQuantity) {
                //Update the maxQuantity to the retrieved value of the entry
                maxQuantity = entry.getValue();
                //Update the mostStocked to the retrieved key of the entry
                mostStocked = entry.getKey();
            }
        }
        //Display the result
        System.out.println("Most Stocked Product: " + mostStocked + ", Quantity: " + maxQuantity);
    }
}
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Declare empty HashMap to store product names and quantities
        HashMap<String, Integer> inventory = new HashMap<>();
        //Display prompt - number of products
        System.out.print("Enter number of products: ");
        //Declare variable of type int (counter) and assign to it the value read from the keyboard and converted to integer
        int count = Integer.parseInt(sc.nextLine());
        //Loop from i = 0 to the value of 'count', incrementing i by 1 (to collect each product and quantity)
        for (int i = 0; i < count; i++) {
            //Display prompt - enter product name
            System.out.print("Enter product name: ");
            //Declare variable of type String and read it from the keyboard
            String productName = sc.nextLine();
            //Display prompt - enter quantity
            System.out.print("Enter quantity: ");
            //Declare variable of type int and assign to it the value read from the keyboard and converted to integer
            int quantity = Integer.parseInt(sc.nextLine());

            //Add the product name and quantity to the HashMap as a key-value pair
            inventory.put(productName, quantity);
        }
        //Call the method to display all inventory entries
        printInventoryEntrySet(inventory);
    }

    //Define method that accepts a HashMap and prints each key-value pair
    public static void printInventoryEntrySet(HashMap<String, Integer> inventory) {
        //Iterate over each entry (key-value pair) in the HashMap
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            //Display the product name (key) and quantity (value)
            System.out.println("Product: " + entry.getKey() + ", Quantity: " + entry.getValue());
        }
    }
}
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Declare empty HashMap to store product names (keys) and quantities (values)
        HashMap<String, Integer> inventory = new HashMap<>();
        //Display prompt - number of products
        System.out.print("Enter number of products: ");
        //Declare variable of type int and converts the string entered by the user into an integer
        int count = Integer.parseInt(sc.nextLine());
        //Loop from i = 0 to the value of 'count', incrementing i by 1 (to collect each product name and quantity)
        for (int i = 0; i < count; i++) {
            //Display prompt - enter product name
            System.out.print("Enter product name: ");
            //Declare variable of type String and read it from the keyboard
            String productName = sc.nextLine();
            //Display prompt - enter the quantity for the product
            System.out.print("Enter quantity: ");
            //Declare variable of type int for reading and parsing the quantity as an integer
            int quantity = Integer.parseInt(sc.nextLine());
            //Add the product name and quantity as a key-value pair into the HashMap
            inventory.put(productName, quantity);
        }
        //Call the method to print all inventory entries using keySet()
        printInventoryKeySet(inventory);
    }

    //Define method for printing each key-value pair using keySet()
    public static void printInventoryKeySet(HashMap<String, Integer> inventory) {
        //Loop through all the keys in the HashMap using keySet()
        for (String product : inventory.keySet()) {
            //For each key, retrieve and display its value
            System.out.println("Product: " + product + ", Quantity: " + inventory.get(product));
        }
    }
}
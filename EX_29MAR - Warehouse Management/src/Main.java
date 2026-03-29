import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display prompt - number of initial products in the warehouse
        System.out.print("Enter number of initial products: ");
        //Declare variable of type String and assign to it the value entered from the keyboard, converted from String to int
        int numProducts = Integer.valueOf(sc.nextLine());
        //Create empty HashMap
        HashMap<String, Integer> warehouse = new HashMap<>();
        //Loop from i = 0 to value of numProducts, incrementing i by 1 -> to read each product name and quantity
        for (int i = 0; i < numProducts; i++) {
            //Display prompt - product name
            System.out.print("Enter product name: ");
            //Declare variable of type String and read it from the keyboard
            String name = sc.nextLine();
            //Display prompt - quantity for each product
            System.out.print("Enter quantity: ");
            //Declare variable of type String and assign to it the value entered from the keyboard, converted from String to int
            int quantity = Integer.valueOf(sc.nextLine());
            //Add the product and its quantity to the warehouse
            warehouse.put(name, quantity);
        }
        //Display prompt - number of operations to perform
        System.out.print("Enter number of operations: ");
        //Declare variable of type String and assign to it the value entered from the keyboard, converted from String to int
        int numOperations = Integer.valueOf(sc.nextLine());
        //Declare array of type String and set the number of elements to the value of numOperations -> to hold all the operation strings
        String[] operations = new String[numOperations];
        //from i = 0 to value of numOperations, incrementing i by 1
        for (int i = 0; i < numOperations; i++) {
            //Display prompt - enter operation
            System.out.print("Enter operation " + (i + 1) + ": ");
            //Store each operation string in the array
            operations[i] = sc.nextLine();
        }
        //Call the warehouse management method with the populated data
        manageWarehouse(warehouse, operations);
    }

    //Define method for managing the warehouse operations
    public static void manageWarehouse(HashMap<String, Integer> warehouse, String[] operations) {
        //Loop through each operation in the array
        for (String operation : operations) {
            //Split the operation string into parts by spaces
            String[] parts = operation.split(" ");
            //Declare variable of type String and set its value as the first part of the command (i.e. ADD, REMOVE, CHECK, PRINT)
            String command = parts[0];
            //Set condition for the case when the first part of the command is 'ADD'
            if (command.equals("ADD")) {
                //Declare variable of type String and set its value as the second part of the command, i.e. the product name
                String product = parts[1];
                //Declare variable of type int and set its value as the third part of the command, i.e. the quantity
                int quantity = Integer.valueOf(parts[2]);
                //Add quantity to existing value, or start from 0 if product doesn't exist
                warehouse.put(product, warehouse.getOrDefault(product, 0) + quantity);
            //Set condition for the case when the first part of the command is 'REMOVE'
            } else if (command.equals("REMOVE")) {
                //Declare variable of type String and set its value as the second part of the command, i.e. the product name
                String product = parts[1];
                //Declare variable of type int and set its value as the third part of the command, i.e. the quantity
                int quantity = Integer.valueOf(parts[2]);
                //Set condition to check if the product exists in the warehouse
                if (warehouse.containsKey(product)) {
                    //Declare variable of type int and subtract the quantity from the current value
                    int newQuantity = warehouse.get(product) - quantity;
                    //Set condition to remove the product entirely if the result is 0 or negative
                    if (newQuantity <= 0) {
                        warehouse.remove(product);
                    } else {
                        //Otherwise update with the new lower quantity
                        warehouse.put(product, newQuantity);
                    }
                }
            //Set condition for the case when the first part of the command is 'CHECK'
            } else if (command.equals("CHECK")) {
                //Declare variable of type String and set its value as the second part of the command, i.e. the product name to check
                String product = parts[1];
                //Display true if product exists, false otherwise
                System.out.println(warehouse.containsKey(product));
            //Set condition for the case when the first part of the command is 'PRINT'
            } else if (command.equals("PRINT")) {
                //Loop through every key-value pair in the warehouse
                for (Map.Entry<String, Integer> entry : warehouse.entrySet()) {
                    //Display each product and its quantity
                    System.out.println("Product: " + entry.getKey() + ", Quantity: " + entry.getValue());
                }
            }
        }
    }
}
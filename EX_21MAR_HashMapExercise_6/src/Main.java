import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Declare new empty HashMap to store the String keys and Integer values
        HashMap<String, Integer> data = new HashMap<>();
        //Open keyboard
        Scanner scanner = new Scanner(System.in);
        //Display prompt -number of key-value pairs
        System.out.print("Enter number of entries to add: ");
        //Declare variable of type int and read it from the keyboard
        int count = scanner.nextInt();
        //nextLine used to consume the leftover newline character after nextInt()
        scanner.nextLine();
        //Loop from i = 0 to value of 'count', incrementing i by 1 -> to read each key-value pair
        for (int i = 0; i < count; i++) {
            //Display prompt - enter key (as a String)
            System.out.print("Enter key: ");
            //Declare variable of type String and read it from the keyboard
            String key = scanner.nextLine();
            //Display prompt - enter value (as an integer)
            System.out.print("Enter value: ");
            //Declare variable of type int and read it from the keyboard
            int value = scanner.nextInt();
            //nextLine used to consume the leftover newline character after nextInt()
            scanner.nextLine();
            //Add the key-value pair to the HashMap
            data.put(key, value);
        }
        //Call the method with the populated HashMap
        modifyAndResetHashMap(data);
    }

    //Define method for modifying and resetting the HashMap
    public static void modifyAndResetHashMap(HashMap<String, Integer> data) {
        //Check if the HashMap is empty and display the result
        System.out.println("Is empty: " + data.isEmpty());
        //Display the current number of key-value pairs in the HashMap
        System.out.println("Size: " + data.size());
        //Add ("Reset", 0) only if the key "Reset" doesn't already exist
        data.putIfAbsent("Reset", 0);
        //Display the updated size after the addition
        System.out.println("Size after modification: " + data.size());
        //Remove all key-value pairs from the HashMap
        data.clear();
        //Check if the HashMap is empty after clearing all the key-value pairs and display the result
        System.out.println("Is empty after clear: " + data.isEmpty());
    }
}
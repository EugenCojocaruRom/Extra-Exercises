import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner scanner = new Scanner(System.in);
        //Create empty HashMap with String keys and Integer values
        HashMap<String, Integer> data = new HashMap<>();
        //Display prompt - number of entries in the HashMap
        System.out.print("Enter number of entries to add: ");
        //Declare variable of type int and read it from the keyboard, converting the String into an integer
        int count = Integer.parseInt(scanner.nextLine());
        //Loop from i = 0 to the value of 'count', incrementing i by 1 -> collect each key-value pair
        for (int i = 0; i < count; i++) {
            //Display prompt - enter key
            System.out.print("Enter key: ");
            //Declare variable of type String for key and read it from the keyboard
            String key = scanner.nextLine();
            //Display prompt - enter value
            System.out.print("Enter value: ");
            //Declare variable of type int for value and read it from the keyboard
            int value = Integer.parseInt(scanner.nextLine());
            //Add the key-value pair to the HashMap
            data.put(key, value);
        }
        //Call the method with the populated HashMap
        testHashMapMethods(data);
    }

    //Define the method for testing the HashMap operations (i.e. methods)
    static void testHashMapMethods(HashMap<String, Integer> data) {
        //Check if HashMap is empty and print the result
        System.out.println("Is empty: " + data.isEmpty());
        //Get the number of key-value pairs (i.e. HashMap size) and print it
        System.out.println("Size: " + data.size());
        //Remove all entries from the HashMap
        data.clear();
        //Check if the HashMap is empty after clearing it and print the result
        System.out.println("Is empty after clear: " + data.isEmpty());
    }
}
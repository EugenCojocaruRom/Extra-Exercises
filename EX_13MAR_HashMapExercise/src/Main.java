import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner scanner = new Scanner(System.in);
        //Display prompt -> number of key-value pairs
        System.out.print("How many key-value pairs? ");
        //Declare variable of type int and read it from the keyboard
        int size = scanner.nextInt();
        scanner.nextLine();
        //Declare array of type String and set the number of elements to the value of 'size' -> number of keys
        String[] keys = new String[size];
        //Declare array of type String and set the number of elements to the value of 'size' -> number of values
        String[] values = new String[size];
        //Loop from i = 0 to value of size, incrementing i by 1
        for (int i = 0; i < size; i++) {
            //Prompt user to enter key
            System.out.print("Enter key " + (i + 1) + ": ");
            //Read the input from the keyboard
            keys[i] = scanner.nextLine();
            //Prompt user to enter value
            System.out.print("Enter value " + (i + 1) + ": ");
            //Read the input from the keyboard
            values[i] = scanner.nextLine();
        }
        //Declare variable of type HashMap and set its values to the values retrieved by the called method
        HashMap<String, String> map = createStringStringMap(keys, values);
        //Display section title
        System.out.println("\nMy HashMap:");
        //Loop through the keys of the map's keySet
        for (String key : map.keySet()) {
            //Display each key
            System.out.println(key + ": " + map.get(key));
        }
    }

    //Define method for reading the key-value pairs and creating the HashMap
    public static HashMap<String, String> createStringStringMap(String[] keys, String[] values) {
        //Declare new HashMap and initialize it
        HashMap<String, String> map = new HashMap<>();
        //Loop from i = 0 to length of keys, incrementing i by 1
        for (int i = 0; i < keys.length; i++) {
            //Add key-value pair to the map at each iteration
            map.put(keys[i], values[i]);
        }
        //Return the HashMap
        return map;
    }
}
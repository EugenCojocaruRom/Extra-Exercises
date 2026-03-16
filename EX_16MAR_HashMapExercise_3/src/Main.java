import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Declare an empty HashMap to store the entries
        HashMap<String, Integer> data = new HashMap<>();
        //display prompt - number of entries in the map
        System.out.print("Enter number of entries in the map: ");
        //Declare variable of type int and read it from the keyboard
        int count = sc.nextInt();
        sc.nextLine();
        //Loop from i = 0 to value of count, incrementing i by 1 (to collect each key-value pair)
        for (int i = 0; i < count; i++) {
            //Display prompt for entering the key
            System.out.print("Enter key: ");
            //Declare variable of type int for key and read it from the keyboard
            String k = sc.nextLine();
            //Display prompt for entering the value
            System.out.print("Enter value: ");
            //Declare variable of type int for value and read it from the keyboard
            int v = sc.nextInt();
            sc.nextLine();
            //Add the key-value pair to the map
            data.put(k, v);
        }
        //Display prompt for entering the key to be checked
        System.out.print("Enter key to check: ");
        //Declare variable of type String for key and read it from the keyboard
        String key = sc.nextLine();
        //Display prompt for entering the new value
        System.out.print("Enter new value: ");
        //Declare variable of type int for the new value and read it from the keyboard
        int newValue = sc.nextInt();
        //Declare HashMap for the result and assign to it the result retrieved by calling the method
        HashMap<String, Integer> result = modifyMap(data, key, newValue);
        //Display the resulting updated map
        System.out.println("Updated map: " + result);
    }

    //Define the method for modifying the map
    public static HashMap<String, Integer> modifyMap(HashMap<String, Integer> data, String key, int newValue) {
        //Check if the key already exists in the map
        if (data.containsKey(key)) {
            //Check if the existing value equals newValue (using .equals() to compare Integer objects by value)
            if (data.get(key).equals(newValue)) {
                //If the key exists with the same value, it is replaced with newValue + 1
                data.replace(key, newValue + 1);
            } else {
                //If the key exists but has a different value, it is removed from the map
                data.remove(key);
            }
        } else {
            //If the key doesn't exist, it is added with newValue as its initial value
            data.put(key, newValue);
        }
        //Return the modified map
        return data;
    }
}
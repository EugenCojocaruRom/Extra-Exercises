import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open scanner
        Scanner sc = new Scanner(System.in);
        //Declare variable of type HashMap and initialize it (empty)
        HashMap<String, Integer> randomValues = new HashMap<>();
        //Display prompt - number of key-value pairs
        System.out.print("Enter the number of entries in the HashMap: ");
        //Declare variable of type int for HasMap size and read it from the keyboard, after converting it to integer
        int mapSize = Integer.parseInt(sc.nextLine());
        //Loop through mapSize from i = 0 to value of mapSize, incrementing i by 1
        for (int i = 0; i < mapSize; i++) {
            //Display prompt - enter key
            System.out.print("Enter key: ");
            //Declare variable of type String and read it from the keyboard
            String key = sc.nextLine();
            //Display prompt - enter value
            System.out.print("Enter value: ");
            //Declare variable of type int for value and read it from the keyboard, after converting it to integer
            int value = Integer.parseInt(sc.nextLine());
            //Add the key-value pair to the HashMap
            randomValues.put(key, value);
        }
        //Display prompt - number of keys to check
        System.out.print("Enter number of keys to check: ");
        //Declare variable of type int for arraySize and read it from the keyboard, after converting it to integer
        int arraySize = Integer.parseInt(sc.nextLine());
        //Declare array of type String and set the number of its elements to the value of arraySize
        String[] keys = new String[arraySize];
        //Loop from i = 0 to the value of arraySize, inrementing i by 1
        for (int i = 0; i < arraySize; i++) {
            //Display prompt - enter key
            System.out.print("Enter key " + (i + 1) + ": ");
            //Read the input from the keyboard
            keys[i] = sc.nextLine();
        }
        //Declare variable of type int for result and assign to it the value returned by the called method
        int result = keyChecker(randomValues, keys);
        //Display the result
        System.out.println("Matching keys found: " + result);
    }

    //Define method for counting how many keys from the array exist in the HashMap
    public static int keyChecker(HashMap<String, Integer> randomValues, String[] keys) {
        //Declare variable of type int (counter) and initialize it
        int count = 0;
        //Loop through each key in the keys array
        for (String key : keys) {
            //Set condition to check if the current key exists in the HashMap
            if (randomValues.containsKey(key)) {
                //If the condition is met, increment the counter
                count++;
            }
        }
        //Return the final count of matching keys
        return count;
    }
}
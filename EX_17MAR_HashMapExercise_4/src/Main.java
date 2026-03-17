import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner scanner = new Scanner(System.in);
        //Create an empty HashMap to store key-value pairs
        HashMap<String, Integer> data = new HashMap<>();
        //Display prompt - number of entries in the HashMap
        System.out.print("Enter the number of entries in the HashMap: ");
        //Declare variable of type int and read it from the keyboard
        int entryCount = Integer.parseInt(scanner.nextLine()); //convert the entered String into an integer

        //Loop from i = 0 to value of entryCount, incrementing i by 1 -> read each key-value pair entered by the user
        for (int i = 0; i < entryCount; i++) {
            //Display prompt - enter key
            System.out.print("Enter key: ");
            //Declare variable of type String and read it from the keyboard
            String key = scanner.nextLine();
            //Display prompt - enter value
            System.out.print("Enter value: ");
            //Declare variable of type int and read it from the keyboard
            int value = Integer.parseInt(scanner.nextLine()); //convert the entered String into an integer
            //Add the key-value pair to the map
            data.put(key, value);
        }
        //Display prompt - number of operations to perform
        System.out.print("Enter number of operations to perform: ");
        //Declare variable of type int and read it from the keyboard
        int opCount = Integer.parseInt(scanner.nextLine()); //convert the entered String into an integer

        //Declare array of type String and set the number of elements to the value of 'opCount' -> to hold the operations
        String[] operations = new String[opCount];
        //Display prompt
        System.out.println("Enter operations (e.g. GET apple / CHECK banana / MODIFY apple 3):");
        //Loop from i = 0 to value of opCount, incrementing i by 1 -> read each operation entered by the user
        for (int i = 0; i < opCount; i++) {
            //Display the operation label
            System.out.print("Operation " + (i + 1) + ": ");
            //Read the value from the keyboard
            operations[i] = scanner.nextLine();
        }
        //Process all the operations and get the modified map
        HashMap<String, Integer> result = processHashMap(data, operations);
        //Display the final map by iterating over its entries
        System.out.println("Final HashMap:");
        for (HashMap.Entry<String, Integer> entry : result.entrySet()) {
            //Display each key-value pair in the format: key=value
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }

    //Define method for processing the HashMap
    public static HashMap<String, Integer> processHashMap(HashMap<String, Integer> map, String[] operations) {
        //Loop through each operation in the array
        for (String operation : operations) {
            //Split the operation string into parts by space, using regex
            String[] parts = operation.split(" ");
            //The first part is the command (GET, CHECK, MODIFY)
            String command = parts[0];
            //The second part is the key
            String key = parts[1];
            //Use switch statement
            switch (command) {
                //Case 1 - GET
                case "GET":
                    //If the key exists in the map, print its value
                    if (map.containsKey(key)) {
                        System.out.println(map.get(key));
                    } else {
                        //Otherwise print 'Not found'
                        System.out.println("Not found");
                    }
                    break;
                //Case 2 - CHECK
                case "CHECK":
                    //If the key exists, print 'Exists'
                    if (map.containsKey(key)) {
                        System.out.println("Exists");
                    } else {
                        //Otherwise print 'Not found'
                        System.out.println("Not found");
                    }
                    break;
                //Case 3 - MODIFY
                case "MODIFY":
                    //The third part is the target value -> parse from String to int
                    int targetValue = Integer.parseInt(parts[2]);
                    //Set condition for checking that the key exists
                    if (map.containsKey(key)) {
                        //If the key exists and the current value matches targetValue -> increment by 1
                        if (map.get(key) == targetValue) {
                            map.replace(key, targetValue + 1);
                        } else {
                            //If the key exists but the value doesn't match -> remove the key
                            map.remove(key);
                        }
                    } else {
                        //If the key doesn't exist -> it is added with targetValue
                        map.put(key, targetValue);
                    }
                    break;
            }
        }
        //Return the modified map after performing all the operations
        return map;
    }
}
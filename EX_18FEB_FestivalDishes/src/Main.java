import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display prompt
        System.out.print("Enter the number of dishes served: ");
        //Declare variable of type int and read it from the keyboard (number of dishes)
        int n = sc.nextInt();
        sc.nextLine();
        //Declare array of type string and set the number of its elements to n
        String[] dishes = new String[n];

        //Declare array of type int and set its value to the result returned by the called method
        int[] hashValues = calculateHashes(dishes, sc);

        //Declare variable of type int and initialize it (for sum)
        int totalDishesServed = 0;
        //Loop through each element of the hashValue array
        for (int hash : hashValues) {
            //Add each hash value to the sum variable
            totalDishesServed += hash;
        }
        //Display separator
        System.out.println("=====================");
        //Display total dishes served
        System.out.println("Total dishes served: " + totalDishesServed);
        //Display separator
        System.out.println("=====================");
        //Display top dishes served
        System.out.println("Top dishes served: ");
        topDishes(dishes, hashValues, 3);
    }

    //Method for calculating the number of dishes
    static int[] calculateHashes(String[] dishes, Scanner sc) {
        //Loop from i = 0 to the length of array 'dishes', incrementing i by 1
        for (int i = 0; i < dishes.length; i++) {
            //Display the individual dishes
            System.out.print("Dish[" + (i + 1) + "]: ");
            //Read each value from the keyboard
            dishes[i] = sc.nextLine();
        }
        //Display separator
        System.out.println("---------------------");
        //Display dishes served
        System.out.println("Dishes served: " + Arrays.toString(dishes));
        //Display separator
        System.out.println("---------------------");
        //Display section title for individual dishes and the number of servings
        System.out.println("<=== Dishes & Portions Served ===>");
        //Declare array of type int and set the number of its elements to the value of the length of array 'dishes'
        int[] hashValues = new int[dishes.length];
        //Loop from i = 0 to the length of array 'dishes', incrementing i by 1
        for (int i = 0; i < dishes.length; i++) {
            //Declare variable of type int and initialize it (hash value)
            int hash = 0;
            //inside the loop -> loop from j = 0 to the length of each element from the array 'dishes', incrementing j by 1
            for (int j = 0; j < dishes[i].length(); j++) {
                //Add the ASCII value of each character to the hash variable
                hash += dishes[i].charAt(j);
            }
            //Set the value of each element to the hash value obtained above
            hashValues[i] = hash;
            //Display each element from the 'dishes' array with its hash value
            System.out.println(dishes[i] + ": " + hash);
        }
        //Return the hash values of the elements of the array
        return hashValues;
    }

    static void topDishes(String[] dishes, int[] hashValues, int top) {
        //Create index array of type Integer and set the number of its elements to the value of the length of the 'dishes' array (to track original positions)
        Integer[] indices = new Integer[dishes.length];
        //Loop from i = 0 to the length of 'indices' array, incrementing i by 1
        for (int i = 0; i < indices.length; i++) {
            //Set the value of each element of 'indices' to the current index
            indices[i] = i;
        }
        //Sort indices by hash value descending
        Arrays.sort(indices, (a, b) -> hashValues[b] - hashValues[a]);
//        System.out.println("Top " + top + " most sold dishes:");
        //Loop from i = 0 to the minimum value between the 'top' value and the length of array 'dishes', incrementing i by 1
        //This prevents from going over the max number of dishes
        for (int i = 0; i < Math.min(top, dishes.length); i++) {
            //Declare variable of type int and assign to it the value of the element from 'indices'
            int index = indices[i];
            //Display the dish and its hash value
            System.out.println(dishes[index] + ": " + hashValues[index]);
        }
    }
}
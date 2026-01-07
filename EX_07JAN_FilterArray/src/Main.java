import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display value n for number of elements in the array
        System.out.print("n = ");
        //Declare variable of type int and read it from the keyboard
        int n = sc.nextInt();
        //Declare array of type double and set the number of its elements to n
        int[] A = new int[n];

        //Method for reading and displaying the elements of the initial array
        displayArr(A, sc);
        //Display the new array, containing only the odd elements
        int[] B = filterArray(A);
        System.out.println("The odd elements are: " + Arrays.toString(B));
    }

    //Define method for reading the elements of the array
    static void displayArr(int[] array, Scanner sc) {
        //Loop through the array from i = 0 to the length of the array, incrementing i by 1
        for (int i = 0; i < array.length; i++) {
            //Display the label for each element of the array
            System.out.print("Element[" + i + "] = ");
            //Read each element of the array from the keyboard
            array[i] = sc.nextInt();
        }
        //Display the elements of the original array
        System.out.println("The elements of array A are: " + Arrays.toString(array));
    }

    //Define method for filtering the array
    static int[] filterArray(int[] array) {
        //Declare a temporary array with the same length as the initial array
        int[] tempArray = new int[array.length];
        //Declare variable of type int (used as counter, to track the number of odd elements found) and initialize it
        int counter = 0;
        //Loop through the initial array from i = 0 to the length of the array, incrementing i by 1
        for (int i = 0; i < array.length; i++) {
            //Set the condition for checking that the element of the array is odd
            if (array[i] % 2 != 0) {
                //The element of the temp array takes the value of the element from the original array when the condition is met
                tempArray[counter] = array[i];
                //Increment the counter
                counter++;
            }
        }
        //Truncate and return only the counted elements
        return Arrays.copyOf(tempArray, counter);
    }
}
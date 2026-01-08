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
        sc.nextLine();
        //Declare array of type double and set the number of its elements to n
        String[] A = new String[n];

        //Method for reading and displaying the elements of the initial array
        displayArr(A, sc);
        //Display the elements of the original array
        System.out.println("The elements of array A are: " + Arrays.toString(A));
        //Display the reversed copy of the array
        System.out.println("The reversed copy is: " + Arrays.toString(reversedCopy(A)));
        //Original array after making the copy (unchanged)
        System.out.println("Original after copy (unchanged): " + Arrays.toString(A));
        //Reversed (in-place) array
        reverse(A);
        System.out.println("Reversed array (in-place): " + Arrays.toString(A));
    }

    //Define method for reading the elements of the array
    static void displayArr(String[] arr, Scanner sc) {
        //Loop through the array from i = 0 to the length of the array, incrementing i by 1
        for (int i = 0; i < arr.length; i++) {
            //Display the label for each element of the array
            System.out.print("Element[" + i + "] = ");
            //Read each element of the array from the keyboard
            arr[i] = sc.nextLine();
        }

    }

    static String[] reversedCopy(String[] arr) {
        //Declare variable of type int and give it the value of the array length
        int len = arr.length;
        //Declare array of type string (for the reversed array) and set the number of its elements as the length of the original array
        String[] reversed = new String[len];
        //Loop through the original array from i = 0 to the length of the array, incrementing i by 1
        for (int i = 0; i < len; i++) {
            //Calculate the opposite index for the new array
            reversed[i] = arr[len - 1 - i];
        }
        //Return the reversed array
        return reversed;
    }

    static void reverse(String[] arr) {
        //Declare variable of type int and give it the value of the array length
        int len = arr.length;
        //Loop through the original array from i = 0 to the length of the array / 2, incrementing i by 1
        for (int i = 0; i < len / 2; i++) {
            //Call the helper method below
            swapPositions(arr, i, len - 1 - i);
        }

    }

    //helper method - swaps the elements at 2 given indices, in an array
    private static void swapPositions(String[] arr, int i, int j) {
        //Declare temporary variable of type string to hold the current value of the original array
        String temp = arr[i];
        //Put the element from position i in the array to position j of the array ()
        arr[i] = arr[j];
        //Put the value from temp into the position j
        arr[j] = temp;
    }
}
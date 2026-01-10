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
        //Display the resulting array after removing the duplicates
        System.out.println("The number of unique elements is: " + filterArray(A));
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

    //Define method for removing any duplicates from the original array
    static int filterArray(int[] array) {
        //Make sure that the array is sorted
        Arrays.sort(array);
        //Declare variable of type int for the length of the array
        int len = array.length;
        //Handle the cases when the array is empty or has only 1 element
        if (len <= 1) {
            //Return the array as it is
            return len;
        }
        //Declare variable of type int to track the unique elements
        int unique = 1;
        //Loop through the array from i = 1 to the length of the array, incrementing i by 1
        for (int i = 1; i < len; i++) {
            //Compare the element at index i to the one at index i+1
            if (array[i] != array[i - 1]) {
                //Increment the tracking variable and place it at index i
                array[unique++] = array[i];
            }
        }
        //Return the number of unique elements in the array
        return unique;
    }
}
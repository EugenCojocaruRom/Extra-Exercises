import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display value n for element of array
        System.out.print("n = ");
        //Declare variable n of type int and read it from the keyboard
        int n = sc.nextInt();
        //Declare array of type int and set the number of its elements to n
        int[] nums = new int[n];

        //Method for reading and displaying the array
        displayArray(nums, sc);

        //Display message for the number to be removed
        System.out.print("\nRemove the following value from the array: ");
        //Declare variable val and read it from the keyboard
        int val = sc.nextInt();

        //Method for removing an element and returning the number of elements not equal to the removed one
        System.out.print("There are " + removeElement(nums, val, sc) + " elements remaining in the array.");
    }

    //Define method for reading and displaying the array
    public static void displayArray(int[] array, Scanner sc) {
        //Loop through the array from i = 0 to the length of the array, incrementing i by 1
        for (int i = 0; i < array.length; i++) {
            //Display each element of the array
            System.out.print("Element[" + i + "] is: ");
            //Read the value of each element from the keyboard
            array[i] = sc.nextInt();
        }
        //Display the entire array as a string
        System.out.print("The elements of the array are: " + Arrays.toString(array));
    }

    //Define method for removing an element and returning the number of elements not equal to the removed one
    public static int removeElement(int[] nums, int val, Scanner sc) {
        //Declare variable k of type int for storing the number of elements not equal to the removed number; initialize it to 0
        int k = 0;
        //Loop through the array from i = 0 to the length of the array, incrementing i by 1
        for (int i = 0; i < nums.length; i++) {
            //Check that the value at index i is different form 'val' (the one to be removed)
            if (nums[i] != val) {
                //The valid element if placed at position k in the array
                nums[k] = nums[i];
                //Increment k by 1 (move to the next position)
                k++;
            }
        }
        //Return the number of elements not equal to the removed one
        return k;
    }
}
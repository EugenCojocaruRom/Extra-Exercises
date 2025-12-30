import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display value nums for the number of elements in the array
        System.out.print("nums = ");
        //Declare variable 'nums' of type int and read it from the keyboard
        int nums = sc.nextInt();
        //Declare array A of type int and set the number of its elements to the value of nums
        int[] A = new int[nums];

        //Method for reading array A
        readArrayA(A, sc);
        //Method for finding if there are 3 consecutive values
        System.out.println("The array contains only 1's and/or 4's: " + only14(A));
    }

    //Define the method for reading array A
    static void readArrayA(int[] A, Scanner sc) {
        //Loop through array A from i = 0 to the length of A, incrementing i by 1
        for (int i = 0; i < A.length; i++) {
            //Display each element of array A
            System.out.print("A[" + i + "] = ");
            //Read the value of each element from the keyboard
            A[i] = sc.nextInt();
        }
        //Display array A
        System.out.println("Array A is: " + Arrays.toString(A));
    }

    //Define method for finding if the array contains only 1's and/or 4's
    static boolean only14(int[] A) {
        //Loop through array A from i = 0 to the length of A, incrementing i by 1
        for (int i = 0; i < A.length; i++) {
            //Set the condition for checking if there are elements that are not 1 or 4
            if (A[i] != 1 &&  A[i] != 4) {
                //Return false if the condition is satisfied
                return false;
            }
        }
        //Return true in case the arrays contains only 1's and/or 4's
        return true;
    }
}
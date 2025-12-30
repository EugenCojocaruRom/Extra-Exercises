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
        System.out.println("The array contains 3 consecutive values: " + tripleUp(A));
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

    //Define method for finding 3 consecutive values
    static boolean tripleUp(int[] A) {
        //Loop through array A from i = 0 to the length of - 2 (to prevent the loop from going out of bounds), incrementing i by 1
        for (int i = 0; i < A.length - 2; i++) {
            //Set the condition to check for consecutive values
            if ((A[i + 1] == A[i] + 1) && (A[i + 2] == A[i] + 2)) {
                //Return true if the condition is satisfied
                return true;
            }
        }
        //Return false otherwise
        return false;
    }
}
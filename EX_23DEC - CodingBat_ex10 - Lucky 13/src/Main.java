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
        //Method for displaying array A
        System.out.println("Lucky 13 is " + checkAfor1And3(A));
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

    //Define method for checking if the array contains 1 and/or 3
    static boolean checkAfor1And3(int[] A) {
        //Loop through array A from i = 0 to the length of A, incrementing i by 1
        for (int i = 0; i < A.length; i++) {
            //Set the condition to check if there are instances of 1 / 3 in the array
            if (A[i] == 1 || A[i] == 3) {
                //Return 'false' if any of the elements is 1 or 3
                return false;
            }
        }
        //Return 'true' if none of the values is 1 or 3
        return true;
    }
}
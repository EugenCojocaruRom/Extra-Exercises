import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display value 'n' for the number of elements in the array
        System.out.print("n = ");
        //Declare variable 'n' of type int and read it from the keyboard
        int n = sc.nextInt();
        //Declare array A of type int and set the number of its elements to n
        int[] A = new int[n];

        //Method for reading and displaying array A
        displayA(A, sc);
        //Display the message after checking if the values of the array are in ascending order by calling the method
        System.out.print("The array is sorted ascending: " + isSortedAscending(A));
        //Display the message after checking if the values of the array are in descending order by calling the method
        System.out.print("\nThe array is sorted descending: " + isSortedDescending(A));
    }

    //Define method for reading and displaying array A
    static void displayA(int[] A, Scanner sc) {
        //Loop through array A from i = 0 to the length of A, incrementing i by 1
        for (int i = 0; i < A.length; i++) {
            //Display the label for each element of array A
            System.out.print("A[" + i + "] = ");
            //Read each element of array A from the keyboard
            A[i] = sc.nextInt();
        }
        //Display the elements of the original array
        System.out.println("The elements of array A are: " + Arrays.toString(A));
    }

    //Define method for checking if the values of the array are in ascending order
    static boolean isSortedAscending(int[] A) {
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] > A[i + 1]) {
                return false;
            }
        }
        return true;
    }

    //Define method for checking if the values of the array are in ascending order
    static boolean isSortedDescending(int[] A) {
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] < A[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
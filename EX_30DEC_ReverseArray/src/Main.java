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
        //Method for displaying the reversed array A
        displayReversedA(A);
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

    //Define method for displaying the reversed array A
    static void displayReversedA(int[] A) {
        //Loop through array A from i = 0 to half of the length of A, incrementing i by 1
        for (int i = 0; i < A.length / 2; i++) {
            //Declare temporary variable 'rev' for storing the values of array A
            int rev = A[i];
            //Replace the element from the beginning with its mirror element from the end of the array
            A[i] = A[A.length - i - 1];
            //Put the value stored in 'rev' in the mirror position
            A[A.length - i - 1] = rev;
        }
        //Display the elements of the reversed array
        System.out.println("The elements of the reversed array A are: " + Arrays.toString(A));
    }
}
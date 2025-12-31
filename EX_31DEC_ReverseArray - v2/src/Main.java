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
        displayReversedA(A, n);
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
    static void displayReversedA(int[] A, int n) {
        //Declare a new array B of type int, which will hold the reversed array A, and set the number of its elements to n (same as array A)
        int[] B = new int[n];
        //Declare variable j of type int and initialize it to the length of array B
        int j = n;
        //Loop through array A from i = 0 to n, incrementing i by 1
        for (int i = 0; i < n; i++) {
            //Copy the element from position i in array A to position j - 1 in array B
            B[j - 1] = A[i];
            //Decrement j to move to the previous position in array B
            j =  j - 1;
        }
        //Display the first part of the message for the reversed array
        System.out.print("The elements of the reversed array A are: " + Arrays.toString(B));
        //Loop through array B from k = 0 to n, incrementing k by 1
//        for (int k = 0; k < n; k++) {
//           //Display all the elements of array B (i.e. the reversed array A)
//            System.out.print(B[k] + ", ");
//        }
    }
}
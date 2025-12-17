import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display value n for number of values of array
        System.out.print("n = ");
        //Declare variable n of type int and read it from the keyboard
        int n = sc.nextInt();
        //Declare array A of type int and set the number of its values to n
        int[] A = new int[n];

        //Method for reading the values of array A and displaying it
        displayA(A, sc);
        //Method for displaying true/false if the conditions are met
        arrayHas77(A);
    }

    //Define method for reading the values of array A and displaying it
    static void displayA(int[] A, Scanner sc) {
        //Loop through array A from i = 0 to the length of A, incrementing i by 1
        for (int i = 0; i < A.length; i++) {
            //Display the values of array A
            System.out.print("A[" + i + "] = ");
            //Read the values of A from the keyboard
            A[i] = sc.nextInt();
        }
        System.out.println("The array is: " + Arrays.toString(A));
    }

    //Define method for reading the values of array A and checking the succession of 7's
    static boolean arrayHas77(int[] A) {
        //Loop through array A from i = 0 to the length of A, incrementing i by 1
        for (int i = 0; i < A.length; i++) {
            //Set condition to check if an elemeent is equal to 7
            if (A[i] == 7) {
                //Set condition to check if the next element is 7
                if (i + 1 < A.length && A[i + 1] == 7) {
                    //Display 'true' if correct
                    System.out.println(true);
                    return true;
                }
                //Set condition to check if the next next element is 7
                else if (i + 2 < A.length && A[i + 2] == 7) {
                    //Display 'true' if correct
                    System.out.println(true);
                    return true;
                }
            }
        }
        //Display 'false' when none of the conditions have been met
        System.out.println(false);
        return false;
    }
}
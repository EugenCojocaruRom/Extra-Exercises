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
        //Declare array A of type double and set the number of its elements to n
        double[] A = new double[n];

        //Method for reading and displaying array A
        displayA(A, sc);

        //Display value 'factor' for the number to be used for multiplication
        System.out.print("factor = ");
        //Declare variable 'n' of type int and read it from the keyboard
        double factor = sc.nextDouble();

        //Method for displaying the multiplied array
        multiply(A, factor);
    }

    //Define method for reading and displaying array A
    static void displayA(double[] A, Scanner sc) {
        //Loop through array A from i = 0 to the length of A, incrementing i by 1
        for (int i = 0; i < A.length; i++) {
            //Display the label for each element of array A
            System.out.print("A[" + i + "] = ");
            //Read each element of array A from the keyboard
            A[i] = sc.nextDouble();
        }
        //Display the elements of the original array
        System.out.println("The elements of array A are: " + Arrays.toString(A));
    }

    //Define method for multiplying each element by 10
    static void multiply(double[] A, double factor) {
        //Loop through the array from i = 0 to the length of the array, incrementing i by 1
        for (int i = 0; i < A.length; i++) {
            //Multiply each value of the array by the given factor and replace the value directly in the array
            A[i] *= factor;
        }
        //Display the array with the elements multiplied by the value of the factor
        System.out.println("The array after multiplying by 10 is: " + Arrays.toString(A));
    }
}
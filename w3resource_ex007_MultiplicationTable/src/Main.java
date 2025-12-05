import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Declare array A of type int and give it the values 1 to 10
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        multiplicationTable(A, sc);

    }

    //Define method for performing the multiplication by numbers 1 to 10
    static void multiplicationTable(int[] A, Scanner sc) {
        //Display value x
        System.out.print("x = ");
        //Declare variable n of type int and read it from the keyboard
        int x = sc.nextInt();
        System.out.print("\nMultiplication table of " + x + " : ");
        //Loop through array A from i = 0 to the length of A, incrementing i by 1
        for (int i = 0; i < A.length; ++i) {
            //Declare variable 'prod' of type int and initialize it
            int prod = 0;
            //Set the formula for calculating the result of multiplying 'x' by numbers 1 to 10
            prod = x * A[i];
            //Display the multiplication table for the given value
            System.out.print("\n" + x + " * " + A[i] + " = " + prod);
        }
    }

    //Alternate solution --> it will be commented out
    // 1. Comment out line 9 (int[] A)
    // 2. Comment out lines 15 - 31 (the method for performing the multiplication)
    // 3. Remove 'A,' from the 'multiplicationTable' method - line 11 (leave only the variable 'sc')
    // 4. Comment in the method below

    //Define second method for performing the multiplication by numbers 1 to 10
//    static void multiplicationTable(Scanner sc) {
//        //Display value x
//        System.out.print("x = ");
//        //Declare variable n of type int and read it from the keyboard
//        int x = sc.nextInt();
//        System.out.print("\nMultiplication table of " + x + " : ");
//        //Loop through array A from i = 0 to the maximum value of 10, incrementing i by 1
//        for (int i = 0; i < 10; ++i) {
//            //Declare variable 'prod' of type int and initialize it
//            int prod = 0;
//            //Set the formula for calculating the result of multiplying 'x' by the numbers 1 to 10
//            prod = x * (i + 1);
//            //Display the multiplication table for the given value
//            System.out.print("\n" + x + " * " + (i + 1) + " = " + prod);
//        }
//    }
}
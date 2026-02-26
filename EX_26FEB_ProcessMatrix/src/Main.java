import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display prompt
        System.out.print("Enter the number of rows: ");
        //Declare variable of type int and read it from the keyboard
        int n = sc.nextInt();
        sc.nextLine();
        //Display prompt
        System.out.print("Enter the number of columns: ");
        //Declare variable of type int and read it from the keyboard
        int m = sc.nextInt();
        sc.nextLine();
        //Declare 2D array of type int and set the number of elements to n
        int[][] array = new int[n][m];

        //Method for displaying the array
        displayArray(array, sc);
        //Display the result with the values returned by the method
        System.out.println("Resulting array: " + Arrays.toString(processMatrix(array)));
    }

    //Define method for reading and displaying the array
    public static void displayArray(int[][] array, Scanner sc) {
        //Loop from i = 0 to length of rows, incrementing i by 1
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter the elements for row " + (i +1) + ": ");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Element " + (j + 1) + ": ");
                array[i][j] = sc.nextInt();
                sc.nextLine();
            }
        }
        System.out.println("The array is: " + Arrays.deepToString(array));
    }

    //Define the method for processing the matrix
    public static int[] processMatrix(int[][] matrix) {
        //Variables
        int sum = 0; //Sum of all elements of the matrix
        int max = matrix[0][0]; //Maximum element of the matrix
        int count = 0; //Number of even numbers in the matrix

        //Loop from i = 0 to length of row, incrementing i by 1
        for (int i = 0; i < matrix.length; i++) {
            //Loop from j = 0 to length of column, incrementing j by 1
            for (int j = 0; j < matrix[i].length; j++) {
                //Add each element to the sum at each iteration
                sum += matrix[i][j];
                //Set condition for finding the max value
                if (matrix[i][j] > max) {
                    //Set the mas value at the value of the element
                    max = matrix[i][j];
                }
                //Set condition for checking if the element is even
                if (matrix[i][j] % 2 == 0) {
                    //Increment the count if the condition is satisfied
                    count++;
                }
            }
        }
        //Return the array with the results
        return new int[]{sum, max, count};
    }
}
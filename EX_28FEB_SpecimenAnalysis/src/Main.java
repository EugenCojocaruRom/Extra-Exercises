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
        //Declare 2D arrays of type int and set the number of elements for rows to n and for columns to m
        int[][] testJars = new int[n][m];

        //Method for displaying the matrix
        displayArray(testJars, sc);
        //Display the result after calling the method
        System.out.println(analyzeSpecimens(testJars));
    }

    //Define method for reading and displaying the matrix
    public static void displayArray(int[][] matrix, Scanner sc) {
        //Loop from i = 0 to length of the array, incrementing i by 1
        for (int i = 0; i < matrix.length; i++) {
            //Display prompt for entering the elements for each row
            System.out.println("Enter the elements for row " + (i +1) + ": ");
            //Inside this loop --> loop from j = 0 to length of each row, incrementing j by 1
            for (int j = 0; j < matrix[i].length; j++) {
                //Display label for element
                System.out.print("Element " + (j + 1) + ": ");
                //Read the element from the keyboard
                matrix[i][j] = sc.nextInt();
                sc.nextLine();
            }
        }
        System.out.println("The matrix is: " + Arrays.deepToString(matrix));
    }

    //Define method for analysing specimens
    static String analyzeSpecimens(int[][] jars) {
        //Declare variables and initialize them
        int totalSpecimens = 0;
        int totalJars = 0;
        int highestRowIndex = 0;
        int maxRowSum = -1;

        //Declare 2D array for the reversed data
        int[][] reversedData = new int[jars.length][];

        //Loop from i = 0 to length of the array, incrementing i by 1
        for (int i = 0; i < jars.length; i++) {
            //Declare variable of type int and initialize it
            int currentRowSum = 0;
            //Declare variable of type int and set its value as the length of the array element
            int rowLength = jars[i].length;
            //Set the value of the reversedData array element to a sub-array with a number of elements equal to 'rowLength'
            reversedData[i] = new int[rowLength];

            //Loop from j = 0 to the size of rowLength, incrementing j by 1
            for (int j = 0; j < rowLength; j++) {
                //Declare variable of type int and assign to it the value of the matrix element
                int specimenCount = jars[i][j];
                //Add specimenCount to totalSpecimens at each iteration
                totalSpecimens += specimenCount;
                //Add specimenCount to currentRowSum at each iteration
                currentRowSum += specimenCount;
                //Increment the totalJars counter
                totalJars++;

                //Perform the reversal while iterating
                reversedData[i][rowLength - 1 - j] = specimenCount;
            }

            //Check if this row has the highest record
            if (currentRowSum > maxRowSum) {
                maxRowSum = currentRowSum;
                highestRowIndex = i;
            }
        }

        //Calculate average rounded down (Integer division does this automatically)
        int average = (totalJars > 0) ? (totalSpecimens / totalJars) : 0;

        //Using Arrays.deepToString to format the 2D array as a String
        return String.format("Total specimens: %d, Highest row: %d, Reversed data: %s, Average per jar: %d",
                totalSpecimens, highestRowIndex, Arrays.deepToString(reversedData), average);
    }
}
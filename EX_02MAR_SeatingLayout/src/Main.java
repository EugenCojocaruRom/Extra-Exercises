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
//        int[][] array = new int[n][m];

        //Method for displaying the 2D array and its elements
//        printArray(array, sc);

        //Declare 2D array of type String and call the method for generating the seating layout
        String[][] chart = generateFestivalSeating(n, m);
        //Display section title
        System.out.println("\n<=== Seating layout ===>");
        //Print to verify seating chart generation
        //Loop through all the elements of the chart array
        for (String[] row : chart) {
            //Loop through all the elements of the row
            for (String seat : row) {
                //Display each element of the row
                System.out.print("[" + seat + "] ");
            }
            System.out.println();
        }
    }

    //
//    static void printArray(int[][] array, Scanner sc) {
//        //Display section title for array
//        System.out.println("\n<=== Array ===>");
//        //Loop from i = 0 to length of the array, incrementing i by 1
//        for (int i = 0; i < array.length; i++) {
//            //Display prompt for entering the elements for each row
//            System.out.println("Enter the elements for row " + (i +1) + ": ");
//            //Inside this loop --> loop from j = 0 to length of each row, incrementing j by 1
//            for (int j = 0; j < array[i].length; j++) {
//                //Display label for element
//                System.out.print("Element " + (j + 1) + ": ");
//                //Read the element from the keyboard
//                array[i][j] = sc.nextInt();
//                sc.nextLine();
//            }
//        }
//    }

    //Define method for generating the seating layout
    public static String[][] generateFestivalSeating(int rows, int cols) {
        //Declare 2D array of type String and initialize it with the values for rows and columns
        String[][] seatingChart = new String[rows][cols];
        //Loop from i = 0 to value of rows, incrementing i by 1
        for (int i = 0; i < rows; i++) {
            //Declare variable of type int and give it the value of the row index + 1 (to start numbering from 1, not from 0)
            int rowNumber = i + 1;
            //Declare variable of type String and assign to it the value of the row converted to binary
            String rowBinary = Integer.toBinaryString(rowNumber);
            //Inside this loop --> loop from j = 0 to value of columns, incrementing j by 1
            for(int j = 0; j < cols; j++) {
                //Declare variable of type int and give it the value of the column index + 1
                int colNumber = j + 1;
                //Declare variable of type String and assign to it the value of the column converted to binary
                String colBinary = Integer.toBinaryString(colNumber);
                //Format: R[row]C[col]-[row_binary]|[col_binary]
                seatingChart[i][j] = String.format("R%dC%d-%s|%s",
                        rowNumber, colNumber, rowBinary, colBinary);
            }
        }
        return seatingChart;
    }
}
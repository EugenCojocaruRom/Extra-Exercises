import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);

        //Declare variables of type int for depth, rows and columns
        //Display prompt
        System.out.print("Enter the value for depth: ");
        //Read the value from the keyboard
        int depth = sc.nextInt();
        //Display prompt
        System.out.print("Enter the value for rows: ");
        //Read the value from the keyboard
        int rows = sc.nextInt();
        //Display prompt
        System.out.print("Enter the value for columns: ");
        //Read the value from the keyboard
        int cols = sc.nextInt();

        //Declare 3D array of type int and set the number of its elements to the values of depth, rows and columns
        int[][][] array3D = new int[depth][rows][cols];
        //Loop from i = 0 to value of depth, incrementing i by 1
        for (int i = 0; i < depth; i++) {
            //Loop from j = 0 to value of rows, incrementing j by 1
            for (int j = 0; j < rows; j++) {
                //Loop from k = 0 to value of columns, incrementing k by 1
                for (int k = 0; k < cols; k++) {
                    //Initialize each element with the product of its indices (starting from 1)
                    array3D[i][j][k] = (i + 1) * (j + 1) * (k + 1);
                }
            }
        }

        //Display the 3D array
        for (int i = 0; i < depth; i++) {
            System.out.println("Depth " + i + ":");
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < cols; k++) {
                    System.out.print(array3D[i][j][k] + " ");
                }
                System.out.println();
            }
        }
    }
}
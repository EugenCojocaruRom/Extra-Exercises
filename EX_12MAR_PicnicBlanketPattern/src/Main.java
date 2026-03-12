import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Declare array of type string and set the number of its elements to 2
        String[] squareColors = new String[2];
        //Display prompt for color 1
        System.out.print("Enter color 1: ");
        //Read the input from the keyboard
        squareColors[0] = sc.nextLine();
        //Display prompt for color 2
        System.out.print("Enter color 2: ");
        //read the input form the keyboard
        squareColors[1] = sc.nextLine();
        //Display prompt for blanket size
        System.out.print("Enter blanket size: ");
        //Declare variable of type int and read it from the keyboard
        int blanketSize = sc.nextInt();

        //Generate and print the pattern
        String[][] blanket = picnicBlanketPattern(squareColors, blanketSize);
        //Loop through each row of the 2D array 'blanket'
        for (String[] row : blanket) {
            //Inside this loop -> loop through each color of the row
            for (String color : row) {
                //Print each color -> padded for alignment
                System.out.printf("%-10s", color);
            }
            //Display empty row
            System.out.println();
        }
    }

    //Define method for printing the pattern
    public static String[][] picnicBlanketPattern(String[] squareColors, int blanketSize) {
        //Declare 2D array of type String and set the number of rows and columns to the value of blanketsize
        String[][] blanket = new String[blanketSize][blanketSize];
        //Loop from i = 0 to the value of 'blanketsize', incrementing i by 1 --> for rows
        for (int i = 0; i < blanketSize; i++) {
            //Inside this loop -> loop from j = 0 to the value of 'blanketsize', incrementing j by 1
            for (int j = 0; j < blanketSize; j++) {
                //Set the value of each element as the remainder of (i + j) % 2, which is either 0 or 1
                //Since even and odd numbers always alternate, the colors alternate too
                blanket[i][j] = squareColors[(i + j) % 2];
            }
        }
        //Return the resulting 2D array 'blanket'
        return blanket;
    }
}
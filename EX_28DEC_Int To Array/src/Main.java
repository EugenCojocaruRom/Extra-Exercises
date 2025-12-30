import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display value 'x' for the number to be converted into an array
        System.out.print("x = ");
        //Declare variable 'x' of type int and read it from the keyboard
        int x = sc.nextInt();
        //Declare array of type int
        int[] numbers;
        //Set the number of elements in the array to the number retrieved by the 'newArray' method
        numbers = newArray(x);
        //Display the numbers in the array
        System.out.println("The numbers up to " + x + " are: " + Arrays.toString(numbers));
    }

    //Define method for converting the value 'x' into an array of numbers
    static int[] newArray(int x) {
        //Declare variable 'count' of type int to count the number of elements in the array
        int count = 0;
        //Declare array of type int and set the number of its elements to x+1 to also include x
        int[] array = new int[x + 1];
        //Loop through the number 'x' to extract the values
        for (int i = 0; i <= x; i++) {
            //Populate each position of the array with the extracted element
            array[i] = i;
            count++;
        }
        System.out.println("There are " + count + " elements in the array.");
        //Return the array with all its elements
        return array;

    }
}
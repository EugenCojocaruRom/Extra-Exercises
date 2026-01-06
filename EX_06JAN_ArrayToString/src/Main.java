import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display value n for number of elements in the array
        System.out.print("n = ");
        //Declare variable of type int and read it from the keyboard
        int n = sc.nextInt();
        //Declare array of type double and set the number of its elements to n
        double[] A = new double[n];

        //Method for reading the elements of the array
        displayArr(A, sc);
        //Method for displaying the array
        System.out.println("The array is: " + arrayToString(A));
    }

    //Define method for reading the elements of the array
    static void displayArr(double[] array, Scanner sc) {
        //Loop through the array from i = 0 to the length of the array, incrementing i by 1
        for (int i = 0; i < array.length; i++) {
            //Display the label for each element of the array
            System.out.print("Element[" + i + "] = ");
            //Read each element of the array from the keyboard
            array[i] = sc.nextDouble();
        }
    }

    //Define method for displaying the array
    static String arrayToString(double[] array) {
        //Declare variable of type String for the resulting array and initialize it with the starting bracket
        String finalArray = "[";
        //Loop through the array from i = 0 to the length of the array, incrementing i by 1
        for (int i = 0; i < array.length; i++) {
            //Format each element of the array, and add it to the string
            finalArray += String.format("%.2f", array[i]);
            //Add comma and space after each element, unless it is the last element
            if (i < array.length - 1) {
                finalArray += ", ";
            }
        }
        //Add the closing bracket to the resulting array
        finalArray += "]";
        return finalArray;
    }
}
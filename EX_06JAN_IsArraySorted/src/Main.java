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
        //Display message + result (array is sorted/not)
        System.out.println("The array is sorted: " + arrayIsSorted(A));
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

    //Define method for checking that the array is sorted
    static boolean arrayIsSorted(double[] array) {
        //Loop through the array from i = 0 to the length of the array, incrementing i by 1
        for (int i = 0; i < array.length - 1; i++) {
            //Set condition for comparing one element to the next one
            if (array[i] > array[i + 1]) {
                //Return false if any element is greater than the next, meaning it is not sorted
                return false;
            }
        }
        //Return true if all the elements are sorted in order
        return true;
    }
}
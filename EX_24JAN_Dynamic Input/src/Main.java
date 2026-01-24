import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display app title
        System.out.println("Dynamic input app");
        //Display separator
        System.out.println("-----------------");
        //Display prompt for the number of values
        System.out.print("Enter the number of values: ");
        //Read the value for the number of elements from the keyboard
        int number = sc.nextInt();
        //Declare variable 'sum' of type int and initialize it
//        int sum = 0;
//        //Display prompt for entering the values
//        System.out.println("Enter the values: ");
//        //Loop through the number of values form i = 0 to 'number', incrementing i by 1
//        for (int i = 0; i < number; i++) {
//            //Add each value entered directly to the sum
//            sum += sc.nextInt();
//        }
//        //Display the sum
//        System.out.println("The sum is: " + sum);
        //Declare array of type int for storing the values entered by the user
        int[] elements = new int[number];

        //Method for displaying the values
        displayValues(elements, sc);
        //Display separator
        System.out.println("-----------------");
        //Method for calculating the sum of the values
        System.out.print("The sum is: " + sumOfValues(elements));
        //Method for calculating the product of the values
        System.out.println("\nThe product is: " + prodOfValues(elements));
    }

    //Define method for reading and displaying the values
    static void displayValues(int[] elements, Scanner sc) {
        for (int i = 0; i < elements.length; i++) {
            //Display prompt for entering the individual elements
            System.out.print("Enter value " + (i + 1) + ": ");
            //Read the values from the keyboard
            elements[i] = sc.nextInt();
        }
    }

    //Define method for adding the entered values
    static int sumOfValues(int[] elements) {
        //Declare variable of type int and initialize it
        int sum = 0;
        //Loop through the array from i = 0 to the length of the array, incrementing i by 1
        for (int i = 0; i < elements.length; i++) {
            //Add the current element to the sum at each iteration
            sum += elements[i];
        }
        //Return the sum
        return sum;
    }

    //Define method for calculating the product of the values
    static int prodOfValues(int[] elements) {
        //Declare variable of type int and initialize it
        int product = 1;
        //Loop through the array from i = 0 to the length of the array, incrementing i by 1
        for (int i = 0; i < elements.length; i++) {
            //Multiply the product by the current element at each iteration
            product *= elements[i];
        }
        //Return the resulting product
        return product;
    }
}
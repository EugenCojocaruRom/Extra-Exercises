import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display value a for the first number
        System.out.print("a = ");
        //Declare variable of type int and read it from the keyboard
        int a = sc.nextInt();
        //Display value b for the second number
        System.out.print("b = ");
        //Declare variable of type int and read it from the keyboard
        int b = sc.nextInt();

        //Display the result of the addition, containing the result called by the method
        System.out.print("The sum of a and b is " + sumOfTwo(a, b));
    }

    //Define the method for calculating the sum of the 2 numbers
    static int sumOfTwo(int a, int b) {
        //Return the sum of the 2 numbers
        return a + b;
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display value 'x' for the number in the Fibonacci sequence
        System.out.print("x = ");
        //Declare variable 'x' of type int and read it from the keyboard
        int x = sc.nextInt();


        //Method for displaying the number in the Fibonacci sequence
        System.out.println("The number on position " + x + " in the Fibonacci sequence is " + fibFinder(x));
    }

    //Define method for finding a number in a Fibonacci sequence
    static int fibFinder(int x) {
        //Declare variable 'fib' of type int and initialize it
        int fib = 0;
        //Declare variable 'n' of type int and initialize it
        int n = 0;
        //Declare variable 'm' of type int and initialize it
        int m = 1;
        //Set condition for x smaller than 0
        if (x < 0) {
            return -1;
        }
        //Set condition for x equal to than 0
        if (x == 0) {
            return 0;
        }
        //Set condition for x bigger than 0
        else {
            for (int i = 1; i < x; i++) {
                //Calculate the Fibonacci number
                fib = n + m;
                //The first element takes the value of the following element
                n = m;
                //The m element takes the value of the Fibonacci number
                m = fib;
            }
        }
        //Return the Fibonacci number
        return m;
    }
}
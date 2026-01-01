import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display value 'n' for the number
        System.out.print("n = ");
        //Declare variable 'n' of type int and read it from the keyboard
        int n = sc.nextInt();

        //Display the result retrieved by the method
        System.out.println("The result of n factorial is " + factN(n));
    }

    //Define method for calculating n factorial
    static long factN(int n) {
        //Declare variable 'factorial' of type int and initialize it (default value 1)
        long factorial = 1;
        //Loop from i = 0 to the max value of n, incrementing i by 1
        for (int i = 1; i <= n; i++) {
            //Multiply the value of the factorial by i at each iteration
            factorial = factorial * i;
        }
        //Return the value of the factorial 20922789888000
        return factorial;
    }
}
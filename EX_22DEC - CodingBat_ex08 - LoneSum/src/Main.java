import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Display label a for the first number
        System.out.print("a = ");
        //Declare variable a of type int and read it from the keyboard
        int a = sc.nextInt();
        //Display label b for the first number
        System.out.print("b = ");
        //Declare variable b of type int and read it from the keyboard
        int b = sc.nextInt();
        //Display label c for the first number
        System.out.print("c = ");
        //Declare variable c of type int and read it from the keyboard
        int c = sc.nextInt();

        //Method for calculating the sum of a, b and c
        loneSum(a, b, c);
    }

    //Define method for calculating the sum of a, b and c
    static int loneSum(int a, int b, int c) {
        //Declare variable 'sum' of type int and set it to calculate the sum of a, b and c
        int sum = a + b + c;
        //Set the rule for calculating the sum if one value is equal to another
        if ((a == b) && (b == c)) {
            System.out.println("The sum is " + 0);
            return 0;
        }
        else if (a == b) {
            System.out.println("The sum is " + c);
            return c;
        } else if (b == c) {
            System.out.println("The sum is " + a);
            return a;
        } else if (a == c) {
            System.out.println("The sum is " + b);
            return b;
        }
        System.out.println("The sum is " + sum);
        return sum;
    }
}
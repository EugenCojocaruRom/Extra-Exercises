import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display value a for the first number
        System.out.print("a = ");
        //Declare variable a of type int and read it from the keyboard
        int a = sc.nextInt();
        //Display value b for the first number
        System.out.print("b = ");
        //Declare variable b of type int and read it from the keyboard
        int b = sc.nextInt();
        //Display value c for the first number
        System.out.print("c = ");
        //Declare variable c of type int and read it from the keyboard
        int c = sc.nextInt();

        //Method for displaying the sum of a, b and c
        System.out.println("The sum is " + noTeensum(a,b,c));
    }

    //Define the method for calculating the sum of a, b and c
    static int noTeensum(int a, int b, int c) {
        //Call the fixTeen method for each value (a, b and c)
        return fixTeen(a)  + fixTeen(b) + fixTeen(c);
    }

    //Define helper method to handle the values from 13 to 19
    static int fixTeen(int n) {
        //Set the rule to check if the value is between 13 and 19 (except 15 and 16)
        if ((n >= 13 && n <= 19) && (n != 15 && n != 16)) {
            //Return 0 in case the value is other than 15 or 16
            return 0;
        }
        else {
            //Return the number in case it is 15 or 16
            return n;
        }
    }
}
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

        //Method for determining whether the 3 values are evenly spaced
        System.out.println("The 3 values are evenly spaced: " + evenlySpaced(a, b, c));
    }

    //Define method for determining whether the 3 values are evenly spaced
    static boolean evenlySpaced(int a, int b, int c) {
        //Declare variables of type in for the 3 values
        int small, medium, large;
        //Define the rules for sorting the 3 values
        if (a <= b && a <= c) {
            //a is the smallest
            small = a;
            //Set the rules for medium and large
            if (b <= c) {
                medium = b;
                large = c;
            }
            else {
                medium = c;
                large = b;
            }
        }
        else if (b <= a && b <= c) {
            //b is the smallest
            small = b;
            //Set the rules for medium and large
            if (a <= c) {
                medium = a;
                large = c;
            }
            else {
                medium = c;
                large = a;
            }
        }
        else {
            //c is the smallest
            small = c;
            //Set the rules for medium and large
            if (a <= b) {
                medium = a;
                large = b;
            }
            else {
                medium = b;
                large = a;
            }
        }
        /*The method returns 'true' if the difference between small an medium
        is the same as the one between medium and large*/
        return (medium - small) == (large - medium);
    }
}
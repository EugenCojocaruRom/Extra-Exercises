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

        //Method for determining the position of b and c versus a
        System.out.println(isCloseOrFar(a,b,c));
    }

    //Define method for determining the position of b and c versus a
    static boolean isCloseOrFar(int a, int b, int c){
        //Declare variable of type boolean for the case when b is close to a
        boolean bIsCloseToA = Math.abs(a - b) <= 1;
        //Declare variable of type boolean for the case when c is far from a
        boolean cIsFarFromA = Math.abs(a - c) >= 2;
        //Declare variable of type boolean for the case when b is far from c
        boolean cIsFarFromB = Math.abs(b - c) >= 2;
        //Declare variable of type boolean for the case when c is close to a
        boolean cIsCloseToA = Math.abs(a - c) <= 1;
        //Declare variable of type boolean for the case when b is far from a
        boolean bIsFarFromA = Math.abs(a - b) >= 2;
        //Declare variable of type boolean for the case when b is far from c
        boolean bIsFarFromC = Math.abs(b - c) >= 2;
        //Set the conditions for checking the 'distance' between a and b/c
        if (bIsCloseToA && cIsFarFromA && cIsFarFromB) {
            return true;
        }
        else if (cIsCloseToA && bIsFarFromA && bIsFarFromC) {
            return true;
        }
        else {
            return false;
        }
    }
}
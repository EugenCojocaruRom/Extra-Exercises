import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display value A for angle 1
        System.out.print("Angle A is: ");
        //Declare variable A of type int and read it from the keyboard
        int A = sc.nextInt();
        //Display value B for angle 2
        System.out.print("Angle B is: ");
        //Declare variable B of type int and read it from the keyboard
        int B = sc.nextInt();
        //Display value B for angle 3
        System.out.print("Angle C is: ");
        //Declare variable C of type int and read it from the keyboard
        int C = sc.nextInt();

        //Method for checking if the triangle can exist
        checkTriangle(A, B, C);
        //Method for displaying the type of triangle
        rightTriangle(A, B, C);
    }

    //Define method for checking if the triangle can exist
    static boolean checkTriangle(int A, int B, int C) {
        //Declare boolean value for possible triangle
        boolean isTriangle = false;
        //Check if the triangle can exist
        if (A + B + C == 180) {
            isTriangle = true;
        }
        //Display message if the triangle cannot exist
        else {
            System.out.print("Not a valid triangle.\n");
        }
        return isTriangle;
    }

    //Define method for determining if the triangle is a right-angled triangle
    static void rightTriangle(int A, int B, int C) {
        //Set condition for angles all equal (equilateral)
        if (A == 60 && B == 60 && C == 60) {
            System.out.print("This is NOT a right-angled triangle.\nIt is an equilateral triangle.");
        }
        //Set condition for 2 equal angles (isosceles)
        else if ((A == B && A != C) || (B == C && B != A) || (A == C && A != B)) {
            System.out.print("This is NOT a right-angled triangle.\nIt is an isosceles triangle.");
        }
        //Set conditions for right-angled triangle
        else if ((A == 30 || A == 60 || A == 90) &&
                ((B == 30 || B == 60 || B == 90)) &&
                ((C == 30 || C == 60 || C == 90))) {
            System.out.print("This is a right-angled triangle.");
        }
        //Set condition for regular triangle
        else if (A + B + C == 180) {
            System.out.print("This is a regular triangle.");
        }
    }
}
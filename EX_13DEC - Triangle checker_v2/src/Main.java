import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner scanner = new Scanner(System.in);
        //Display label for side A
        System.out.print("Side A = ");
        //Declare variable sideA of type int
        int sideA;
        //Read value sideA from keyboard
        sideA = scanner.nextInt();
        //Display label for side B
        System.out.print("Side B = ");
        //Declare variable sideB of type int
        int sideB;
        //Read value sideB from keyboard
        sideB = scanner.nextInt();
        //Display label for side C
        System.out.print("Side C = ");
        //Declare variable sideC of type int
        int sideC;
        //Read value sideC from keyboard
        sideC = scanner. nextInt();


        //Method to check that the triangle can exist
        triangleCanExist(sideA, sideB, sideC);
        //Method to check if the triangle is right-angled
        rightAngledTriangle(sideA, sideB, sideC);
        //Method for isosceles and equilateral triangles
        isoscelesOrEquilateralTriangle(sideA, sideB, sideC);

    }

    //Define method to check that the triangle can exist
    static boolean triangleCanExist(int sideA, int sideB, int sideC) {
        //Set rule to check if the triangle can exist based on the values of a, b and c
        if ((sideA + sideB > sideC) && (sideA + sideC > sideB) && (sideB + sideC > sideA)) {
            //Display message that the triangle can exist
            System.out.print("The triangle can exist.\n");
            return true;
        }
        System.out.print("The triangle cannot exist.\n");
        return false;
    }

    //Define method to check if the triangle is a right-angled triangle
    static void rightAngledTriangle(int sideA, int sideB, int sideC) {
        //Set rule to check if the triangle can be right angle
        if ((Math.pow(sideA, 2) + Math.pow(sideB, 2) == Math.pow(sideC, 2)) ||
                (Math.pow(sideA, 2) + Math.pow(sideC, 2) == Math.pow(sideB, 2)) ||
                (Math.pow(sideB, 2) + Math.pow(sideC, 2) == Math.pow(sideA, 2))) {
            //Display message that the triangle is a right-angled triangle
            System.out.print("This is a right-angled triangle.\n");
        }
    }

    //Define method to check if the triangle is isosceles or equilateral
    static void isoscelesOrEquilateralTriangle(int sideA, int sideB, int sideC) {
        //Set rule to check if the triangle can be equilateral
        if ((sideA == sideB) && (sideA == sideC)) {
            //Display message that the triangle is equilateral
            System.out.print("This is a valid triangle, but it is an equilateral triangle.\n");
        }
        //Set rule to check if the triangle can be isosceles
        if ((sideA == sideB) && (sideA != sideC) || (sideA == sideC) && (sideA != sideB) || (sideB == sideC) && (sideB != sideA)) {
            //Display message that the triangle is isosceles
            System.out.print("This is a valid triangle, but it is an isosceles triangle.\n");
        }
    }

}
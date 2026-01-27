import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display app title
        System.out.println("<=== Shape Area Calculator ===>");
        //Display section title
        System.out.println(" - Square: ");
        //Display prompt for the user
        System.out.print("Enter value for square side: ");
        //Declare variable if type int and read it from the keyboard
        int squareSide = sc.nextInt();
        //Call the method for calculating the square area
        calculateArea(squareSide);
        //Display section separator
        System.out.println("---------------");
        //Display section title
        System.out.println(" - Rectangle");
        //Display prompt for the user
        System.out.print("Enter value for length: ");
        //Declare variable if type int and read it from the keyboard
        int length = sc.nextInt();
        //Display prompt for the user
        System.out.print("Enter value for width: ");
        //Declare variable if type int and read it from the keyboard
        int width = sc.nextInt();
        //Call the method for calculating the rectangle area
        calculateArea(length, width);
        //Display section separator
        System.out.println("---------------");
        //Display section title
        System.out.println(" - Triangle: ");
        //Display prompt for the user
        System.out.print("Enter value for side: ");
        int triangleSide = sc.nextInt();
        //Display prompt for the user
        System.out.print("Enter value for height: ");
        //Declare variable if type double and read it from the keyboard
        double height = sc.nextDouble();
        //Call the method for calculating the triangle area
        calculateArea(triangleSide, height);
        //Display section separator
        System.out.println("---------------");
        //Display section title
        System.out.println(" - Circle: ");
        //Display prompt for the user
        System.out.print("Enter value for radius: ");
        //Declare variable if type double and read it from the keyboard
        double radius = sc.nextDouble();
        //Call the method for calculating the circle area
        calculateArea(radius);

    }

        //Methods
    //1. Method for square area
    static int calculateArea(int side) {
        //Declare variable of type int for storing the value of the area
        int squareArea = side * side;
        //Display the message containing the result of calculating the area
        System.out.println("Square area with side " + side + ": " + squareArea);
        //Return the value of the area
        return squareArea;
    }

    //2. Method for rectangle area
    static int calculateArea (int length, int width) {
        //Declare variable of type int for storing the value of the area
        int rectangleArea = length * width;
        //Display the message containing the result of calculating the area
        System.out.println("Rectangle area with length " + length + " and width " + width + ": " + rectangleArea);
        //Return the value of the area
        return rectangleArea;
    }

    //3. Method for triangle area
    static double calculateArea(int side, double height) {
        //Declare variable of type double for storing the value of the area
        double triangleArea = (side * height) / 2;
        //Display the message containing the result of calculating the area
        System.out.printf("Triangle area with side " + side + " and height " + height + ": %.2f%n", triangleArea);
        //Return the value of the area
        return triangleArea;
    }

    //4. Method for circle area
    static double calculateArea (double radius) {
        //Set value of constant Pi
        double PI = 3.14;
        //Declare variable of type double for storing the value of the area
        double circleArea = radius * radius * PI;
        //Display the message containing the result of calculating the area
        System.out.printf("Circle area with radius " + radius + ": %.2f%n", circleArea);
        //Return the value of the area
        return circleArea;
    }
}
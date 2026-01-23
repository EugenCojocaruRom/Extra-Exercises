import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //App title
        System.out.println("Multiplication Table");
        System.out.println("--------------------");

        //Display prompt for 1st number
        System.out.print("Enter 1st number: ");
        //Declare variable of type int and read it from the keyboard
        int length = sc.nextInt();
        //Display prompt for 2nd number
        System.out.print("Enter 2nd number: ");
        //Declare variable of type int and read it from the keyboard
        int width = sc.nextInt();
        //Display separator
        System.out.println("-------------------------");
        //Loop through the width of the table from x = 1 to the value of the width, incrementing x by 1
        for (int x = 1; x <= width; x++) {
            //Inside this loop -> loop through the length of the table from y = 1 to the value of the length, incrementing y by 1
            for (int y = 1; y <= length; y++) {
                //Calculate the product of x and y
                int prod = x * y;
                //Display each product in the table, at a disytance of 2 spaces
                System.out.printf("%-2d ", prod);
            }
            //Add a new line after each row
            System.out.println();
        }
    }
}
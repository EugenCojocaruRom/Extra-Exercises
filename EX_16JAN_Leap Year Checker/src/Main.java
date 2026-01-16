import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display message for user to enter the year
        System.out.print("Enter the year: ");
        //Declare variable of type int and read it from the keyboard
        int year = sc.nextInt();

        //Call the method for the leap year
        leapYear(year);
    }

    //Define method for determining if it is a leap year
    static void leapYear(int year) {
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + " is a leap year");
        }
        else {
            System.out.println(year + " is not a leap year");
        }
    }
}
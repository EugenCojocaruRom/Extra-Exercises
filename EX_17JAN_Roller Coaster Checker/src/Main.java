import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open scanner
        Scanner scanner = new Scanner(System.in);
        //Display message to enter the age
        System.out.print("Enter age: ");
        //Declare variable of type int and read it from the keyboard
        int age = scanner.nextInt();
        //Display message to enter the height
        System.out.print("Enter height: ");
        //Declare variable of type int and read it from the keyboard
        int height = scanner.nextInt();
        //Display message to enter if accompanied
        System.out.print("Accompanied by adult: ");
        //Declare variable of type boolean and read it from the keyboard (true / false)
        boolean hasAdult = scanner.nextBoolean();

        //Call checker method
        admissionCheck(age, height, hasAdult);

    }

    //Define method to check age, height and if accompanied
    static void admissionCheck(int age, int height, boolean hasAdult) {
        System.out.println("===========================");
        //Check the conditions and display the appropriate message
        //If younger than 12
        if (age < 12) {
            System.out.print("Sorry, you're too young");
        }
        //If shorter than 150cm
        else if (height < 150) {
            System.out.print("Sorry, you're not tall enough");
        }
        //If younger than 15 and not accompanied
        else if (age < 15 && !hasAdult) {
            System.out.print("Sorry, you need an adult with you");
        }
        //If younger than 15 and accompanied
        else if (age < 15 && hasAdult) {
            System.out.print("You can ride with adult supervision!");
        }
        //If at least 15 and tall enough
        else {
            System.out.print("You can ride by yourself!");
        }
    }
}
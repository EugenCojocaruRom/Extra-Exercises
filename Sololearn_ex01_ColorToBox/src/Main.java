import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display 'item color' label
        System.out.print("Item color = ");
        //Declare color variable of type String
        String color; // --> int x for numbers
        /*Read the color value from the keyboard,
        delete any extra spaces that might have been added before or after the string,
        make all the letters lowercase*/
        color = sc.nextLine().trim().toLowerCase();
        //Start switch statement for color
        switch (color) {
            //Define case for color red and what is printed for it
            case "red":
                System.out. print("Red goes to box 1");
                //Set break to exit the loop if the case is matched
                break;
            //Define the case for green and what is printed for it
            case "green":
                System.out.print("Green goes to box 2");
                //Set break to exit the loop if the case is matched
                break;
            //Define the case for black and what is printed for it
            case "black":
                System.out.print("Black goes to box 3");
                //Set break to exit the loop if the case is matched
                break;
            case "blue":
                System.out.print("Black goes to box 4");
                //Set break to exit the loop if the case is matched
                break;
            case "yellow":
                System.out.print("Black goes to box 5");
                //Set break to exit the loop if the case is matched
                break;
            //Define the default case and what is printed for it
            default:
                System.out.print("No box for this value.");
        }
    }
}
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display prompt
        System.out.print("Enter the number of cushions (1 to 10): ");
        //Declare variable of type int an read it from the keyboard
        int numCushions = sc.nextInt();
        //Display prompt
        System.out.print("Enter cushion plumpness level (1 to 5): ");
        int cushionPlumpness = sc.nextInt();

        //Display the results after calling the method
        System.out.println(Arrays.toString(plumpCushions(numCushions, cushionPlumpness)));
    }

    //Define method for plumping the cushions
    public static String[] plumpCushions(int numCushions, int desiredPlumpness) {
        //Declare array of type String and set the number of its elements to the value of 'numCushions'
        String[] plumpedCushions = new String[numCushions];
        //Set condition for checking that the values entered are correct
            if ((numCushions >= 1 && numCushions <= 10) && (desiredPlumpness >= 1 && desiredPlumpness <= 5)) {
                //Declare variable of type String to various levels of plumpness
                String plumpness;
                //Switch between the levels of plumpness
                switch(desiredPlumpness) {
                    case 1:
                        plumpness = "barely plump";
                        break;
                    case 2:
                        plumpness = "slightly plump";
                        break;
                    case 3:
                        plumpness = "moderately plump";
                        break;
                    case 4:
                        plumpness = "very plump";
                        break;
                    case 5:
                        plumpness = "extremely plump";
                        break;
                    default:
                        plumpness = "no plumpness";
                        break;
                }
                //Loop from i = 0 to the value of 'numCushions', incrementing i by 1
                for (int i = 0; i < numCushions; i++) {
                    //Add the plumpness level to the array at each iteration
                    plumpedCushions[i] = plumpness;
                }
            }
            //Set condition for displaying message in case of incorrect values
            else {
                System.out.println("Incorrect values");
            }
            //Return the resulting array
        return plumpedCushions;
    }
}
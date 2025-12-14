import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Display message for starting the party
        System.out.println("It's Saturday! It's party time!!!\n");
        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display label for entering the hour
        System.out.print("Enter the hour: ");
        //Declare variable of type double for hour
        double hour = sc.nextDouble();
        //Set condition for finishing the party
        while (hour >= 6.0 && hour < 23.99) {
            //Display message to enter value for energy
            System.out.println("\nCan you party some more?");
            String[] energy = {"yes", "no"};
            //Declare variable 'energy' of type String and set it to empty
            String hasEnergy = sc.nextLine();
            for (int i = 0; i < energy.length; ++i) {
                if (hasEnergy == energy[0]) {
                    System.out.println("Party on!!!");
                    //Display label for entering the hour
                    System.out.print("Enter the hour: ");
                    hour = sc.nextDouble();
                }
                else {
                    System.out.println("Go home, you're tired...");
                    break;
                }
            }
        }
    }
}
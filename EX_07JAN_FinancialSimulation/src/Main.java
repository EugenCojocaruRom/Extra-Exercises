import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display value for the initial amount
        System.out.print("Initial amount: ");
        //Declare variable of type double and read it from the keyboard
        double initialAmount = sc.nextDouble();
        //Display value for the yearly interest rate
        System.out.print("Yearly interest rate: ");
        //Declare variable of type double and read it from the keyboard
        double interestRate = sc.nextDouble();
        //Display value for the target amount
        System.out.print("Target amount: ");
        //Declare variable of type double and read it from the keyboard
        double targetAmount = sc.nextDouble();

        //Method for performing the simulation
        int yearsUntilRetirement = simulationYears(initialAmount, interestRate, targetAmount);
        System.out.println("Can happily retire in: " + yearsUntilRetirement + " years!");
    }

    //Define method for performing the simulation
    static int simulationYears(double initialAmount, double interestRate, double targetAmount) {
        //Declare variable 'currentBalance' of type double, equal to the initialAmount value
        double currentBalance = initialAmount;
        //Declare variable of type int for the years John needs to save money
        int years = 0;
        System.out.printf("Simulation parameters: initial= %.2f, interest= %.2f, target= %.2f\n", initialAmount, interestRate, targetAmount);
        //Loop until the target amount is reached or exceeded
        while (currentBalance < targetAmount) {
            //Increment the years value by 1
            years++;
            //Set the method for calculating the interest that accumulates once a year has passed
            double accumulatedInterest = currentBalance * interestRate / 100;
            //Add the accumulated interest to the current balance
            double totalAmount = currentBalance + accumulatedInterest;
            System.out.printf("Year %d: amount: %.2f, interest: %.2f => total amount: %.2f\n", years, currentBalance, accumulatedInterest, totalAmount);
            //Update the current balance to the value of the total amount
            currentBalance = totalAmount;
        }
        return years;
    }
}
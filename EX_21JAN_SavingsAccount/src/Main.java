import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display label for balance
        System.out.print("Enter initial balance: ");
        //Declare variable of type double and read it from the keyboard
        double balance = sc.nextDouble();
        //Display label for yearly deposit
        System.out.print("Enter yearly deposit: ");
        //Declare variable of type double and read it from the keyboard
        double yearlyDeposit = sc.nextDouble();
        //Display label for interest rate
        System.out.print("Enter interest rate: ");
        //Declare variable of type double and read it from the keyboard
        double interestRate = sc.nextDouble();
        //Display label for target amount
        System.out.print("Enter target amount: ");
        //Declare variable of type double and read it from the keyboard
        double targetAmount = sc.nextDouble();
        //Display separator
        System.out.println("------------------------");

        //Call the method for calculating the years needed for reaching the target amount and the final balance
        totalSavings(balance, yearlyDeposit, interestRate, targetAmount);
    }

    //Define method for calculating the years and the final balance
    static void totalSavings(double balance, double yearlyDeposit, double interestRate, double targetAmount) {
        //Declare variable 'years' of type int ant initialize it (acts as a counter)
        int years = 0;
        //Loop for as long as the balance is less than the target amount
        while (balance < targetAmount) {
            //Increment the 'years' counter at each iteration
            years++;
            //Add the yearly deposit to the current balance
            balance += yearlyDeposit;
            //Calculate the interest on the new balance after adding the yearly deposit
            balance += (balance * (interestRate / 100));
            //Display the current year and its corresponding balance
            System.out.printf("Year %d: $%.2f\n", years, balance);

        }
        //Display separator
        System.out.println("------------------------");
        //Display number of years needed for reaching the target amount
        System.out.println("Goal reached in " + years + " years!");
        //Display the final balance
        System.out.printf("Final balance: $%.2f", balance);
    }
}
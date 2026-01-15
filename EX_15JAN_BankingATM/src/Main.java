import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Declare variable of type int for the initial account balance
        int userBalance = 1000;
        //Display the current account balance
        System.out.println("Your current account balance is $" + userBalance);
        //Display message to enter the amount to be withdrawn
        System.out.print("Enter the withdrawal amount: ");
        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Declare variable of type in and read it from the keyboard
        int userAmount = sc.nextInt();
        //Display conformation message for the entered amount
        System.out.println("You have entered $" + userAmount);
        //Handle possible exceptions
        try {
            //Call the method for checking that the amount entered is positive
            verifyAmountIsPositive(userAmount);
            //Method for checking if the amount entered is greater than the account balance
            verifyAmountIsGreaterThanBalance(userAmount, userBalance);
            //Subtract the entered amount from the account balance when the amount is smaller than the balance
            userBalance -= userAmount;
            //Display message for successful withdrawal
            System.out.println("Successful withdrawal of $" + userAmount);
            //Display message for the remaining balance after withdrawal
            System.out.println("Your remaining balance is $" + userBalance);
        //Exception for negative or zero amount
        } catch (IllegalAccessException e) {
            System.out.println("You cannot withdraw negative or zero amounts! Please enter a correct amount.");
        //Exception for amount greater than account balance
        } catch (IllegalArgumentException e) {
            System.out.println("Insufficient funds!");
        //For extra safety, to catch any other exception
        } catch (Exception e) {
            System.out.println("An error occurred.");
        //Final message
        } finally {
            System.out.println("Transaction completed. You can remove your card.");
        }
    }

    //Method for checking that the amount entered is positive
    public static void verifyAmountIsPositive(int amount) throws IllegalAccessException {
        //Set the condition to check that the amount entered is positive
        if (amount <= 0) {
            //Throw and exception is case the amount entered is not positive
            throw new IllegalAccessException("An attempt has been made to enter negative or 0 amount. The amount entered was " + amount);
        }
    }

    //Method for checking if the amount entered is greater than the account balance
    public static void verifyAmountIsGreaterThanBalance(int amount, int balance) {
        //Set the condition to check if the amount entered is greater than the account balance
        if (amount > balance) {
            //Throw and exception is case the amount entered is greater than the account balance
            throw new IllegalArgumentException("Insufficient funds." + amount + " > " + balance);
        }
    }
}
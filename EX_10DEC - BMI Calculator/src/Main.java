import java.text.DecimalFormat;
import java.util.Scanner;

// BMI calculator ==> weight(kg) / height(m) ^ 2

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display message for entering the weight in kilograms
        System.out.print("Enter your weight (kg): ");
        //Declare variable of type double and read it from the keyboard
        double weight = sc.nextDouble();
        //Display message for entering the height in centimeters
        System.out.print("Enter your height (cm): ");
        //Declare variable of type int and read it from the keyboard
        int height = sc.nextInt();

        //Declare variable of type double for storing the value returned by method bmiResult
        double bmi = Double.parseDouble(bmiResult(height, weight));
        //Display message including the BMI value and the BMI type
        System.out.print("Your BMI is: " + bmi + " (" + bmiType(bmi) + ")");
    }

    //Define the method for calculating the BMI value
    static String bmiResult(int height, double weight) {
        //Declare variable of type double for converting the height into meters
        double heightInMeters = (double) height /100;
        //Set the method for computing the BMI
        double totalBMI = weight / (Math.pow(heightInMeters, 2));
        //Declare decimal format for trimming the number of decimals to just two
        DecimalFormat df = new DecimalFormat("0.0");
        //Return the value of the BMI
        return df.format(totalBMI);
    }

    //Define the method for setting the BMI type
    static String bmiType(double totalBMI) {
        //Set the rules for determining the BMI type and the values that are returned
        if (totalBMI < 18.5) {
            return "Underweight";
        } else if (totalBMI >= 18.5 && totalBMI < 25) {
            return "Normal";
        } else if (totalBMI >= 25 && totalBMI < 30) {
            return "Overweight";
        } else if (totalBMI >= 30 && totalBMI < 35) {
            return "Obese class I";
        } else if (totalBMI >= 35 && totalBMI < 40) {
            return "Obese class II";
        } else {
            return "Obese class III - severe";
        }
    }
}
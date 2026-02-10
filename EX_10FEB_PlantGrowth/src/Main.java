import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //initialHeight, days, dailyGrowth, and waterSupply
        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display section title
        System.out.println("<=== Plant Information ===>");
        //Display prompt for user
        System.out.print("Enter the plant's initial height (cm): ");
        //Declare variable of type int and read it from the keyboard
        int initialHeight = sc.nextInt();
        sc.nextLine();
        //Display prompt for user
        System.out.print("Enter the number of days: ");
        //Declare variable of type int and read it from the keyboard
        int days = sc.nextInt();
        sc.nextLine();
        //Display prompt for user
        System.out.print("Enter the plant's daily growth rate (mm): ");
        //Declare variable of type int and read it from the keyboard
        int dailyGrowth = sc.nextInt();
        sc.nextLine();
        //Display prompt for user
        System.out.print("Enter the quantity of water (ml): ");
        //Declare variable of type int and read it from the keyboard
        int waterSupply = sc.nextInt();
        sc.nextLine();
        //Display section separator
        System.out.println("<=========================>");

        //Method for final height of the plant and the remaining water quantity + message
        System.out.println(simulatePlantGrowth(initialHeight, days, dailyGrowth, waterSupply));
    }

    //Define method for calculating the final height of the plant & the remaining water quantity + a message about the plant
    static String simulatePlantGrowth(int initialHeight, int days, int dailyGrowth, int waterSupply) {
        //Declare variable of type double and initialize it as the value of the initial height
        double finalHeight = initialHeight;
        //Declare variable of type int and initialize it as the value of the initial water quantity
        int remainingWater = waterSupply;
        //Declare final variable of type int and set its value
        final int WATER_PER_DAY = 50;
        //Declare variable of type int and initialize it
        int daysWithGrowth = 0;
        //Loop from day = 1 to the number of 'days', incementing day by 1
        for (int day = 1; day <= days; day++) {
            //Set the conditions for plant growth
            if (remainingWater > 0) {
                //Add the daily growth value (cast to double, converted into cm) to the final height at each iteration
                finalHeight += ((double) dailyGrowth / 10);
                //Decrease and record the water quantity by 50 (see the final variable above)
                remainingWater -= WATER_PER_DAY;
                //Set condition for handling the case when the water quantity goes below 0
                if (remainingWater < 0) {
                    remainingWater = 0;
                }
                //Increment the 'days with growth counter'
                daysWithGrowth++;
            }
        }
        //Declare variable of type String (for messages)
        String growthMessage;
        //Set the conditions for displaying the messages related to the plant growth
        if ((daysWithGrowth > 10) || (finalHeight > initialHeight * 1.5)) {
            growthMessage = "The plant has grown impressively tall!";
        }
        else if (daysWithGrowth >= 5 || finalHeight > initialHeight * 1.2) {
            growthMessage = "The plant has shown good growth.";
        }
        else {
            growthMessage = "The plant's growth was limited.";
        }
        //Return the formatted string with the final height and remaining water values
        return String.format("Final height: %.2f cm\nRemaining water: %d ml\n%s",
                finalHeight, remainingWater, growthMessage);
    }
}
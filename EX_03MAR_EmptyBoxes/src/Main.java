public class Main {
    public static void main(String[] args) {

        //Declare variable of type int and initialize it as 11 - the starting number of total boxes
        int totalBoxes = 11;
        //Declare variable of type int and initialize it as 11 - the starting number of empty boxes
        int emptyBoxes = 11;
        //Declare variable of type int and initialize it as 102 - the number of empty boxes at the end
        int targetEmpty = 102;
        //Declare variable of type int and initialize it - the number of steps needed to reach the target empty boxes
        int steps = 0;
        //Loop through the value of targetEmpty
        while (emptyBoxes < targetEmpty) {
            //Add 7 to the emptyBoxes counter at each iteration
            //Each time a box is filled, we lose an empty box, so 8 - 1 = 7
            emptyBoxes += 7;
            //Add 8 to the totalBoxes counter at each iteration
            //Count of boxes added
            totalBoxes += 8;
            //Increment the number of steps at each iteration
            steps++;
        }

        //Display the target empty boxes
        System.out.println("Target empty boxes: " + emptyBoxes);
        //Display the number of steps needed to reach the target
        System.out.println("Number of steps needed to reach the targer: " + steps);
        //Display the total number of boxes
        System.out.println("Total number of boxes: " + totalBoxes);
    }
}
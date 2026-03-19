import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display prompt - number of descriptions
        System.out.print("Enter number of descriptions: ");
        //Declare variable of type int and read it from the keyboard
        int n = sc.nextInt();
        sc.nextLine();
        //Declare array of type String and set the number of elements to n
        String[] descriptions = new String[n];
        //Loop from i = 0 to n, incrementing i by 1
        for (int i = 0; i < n; i++) {
            //Display prompt for entering the description and the format in which it must be entered
            System.out.print("Enter description " + (i + 1) + " (format: sectionNumber;animalCount;description): ");
            //Read each description entered from the keyboard
            descriptions[i] = sc.nextLine();
        }
        //Declare array of type String for storing the formatted descriptions as retrieved by the method
        String[] formatted = formatAnimalDescriptions(descriptions);
        //Display section title
        System.out.println("\nFormatted Descriptions:");
        //Loop through each element of the 'formatted' array
        for (String desc : formatted) {
            //Display each description
            System.out.println(desc);
        }
    }

    //Define method for formatting the animal descriptions
    public static String[] formatAnimalDescriptions(String[] descriptions) {
        //Declare variable of type int and initialize it to the value of the length of array 'descriptions'
        int n = descriptions.length;
        //Loop from i = 0 to half of n, incrementing i by 1
        for (int i = 0; i < n / 2; i++) {
            //Declare variable of type String for storing (temporarily) the current element
            String temp = descriptions[i];
            //Replace the current element with its mirror element from the end of the array
            descriptions[i] = descriptions[n - 1 - i];
            //Replace the mirror element with the stored temporary value
            descriptions[n - 1 - i] = temp;
        }
        //Declare array of type String (for storing the resulting descriptions) and set the number of its elements to n
        String[] result = new String[n];
        //Loop from i = 0 to n, incrementing i by 1
        for (int i = 0; i < n; i++) {
            //Declare array of type String to store the current description string split into parts by semi-colon
            String[] parts = descriptions[i].split(";");
            //Extract the section number from parts[0], remove non-numeric characters, and convert to int
            int sectionNumber = Integer.parseInt(parts[0].trim().replaceAll("[^0-9]", ""));
            //Extract the animal count from parts[1], take only the first token, and convert to int
            int animalCount = Integer.parseInt(parts[1].trim().split(" ")[0]);
            //Extract the description text from parts[2] and trim any surrounding whitespace
            String description = parts[2].trim();
            //Check if the section number is even
            if (sectionNumber % 2 == 0) {
                //If even, increment the animal count by 1
                animalCount++;
            } else {
                //If odd, decrement the animal count by 1
                animalCount--;
            }
            //Build the formatted description string and store it in the 'result' array at index i
            result[i] = "In Section " + sectionNumber + ", there are " + animalCount + " animals: " + description;
        }
        //Return the array of formatted descriptions
        return result;
    }
}
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Declare variable of type HashMap and initialize it
        HashMap<String, String> capitals = new HashMap<>();
        //Display prompt
        System.out.println("Enter country-capital pairs (type 'done' when finished):");
        //Loop for as long as the condition is met
        while (true) {
            //Display prompt for 'country'
            System.out.print("Country: ");
            //Declare variable of type String and read it from the keyboard
            String country = sc.nextLine();
            //Set condition for checking is the user has entered 'done', in which case exit the loop
            if (country.equalsIgnoreCase("done")) break;
            //Display prompt for 'capital'
            System.out.print("Capital: ");
            //Declare variable of type String and read it from the keyboard
            String capital = sc.nextLine();
            //Add each country-capital pair to the HashMap
            capitals.put(country, capital);
        }
        //Display prompt for search
        System.out.print("\nEnter a country to search for: ");
        //Declare variable of type String and read it from the keyboard
        String lookup = sc.nextLine();
        //Display the result of the search as retrieved by the method
        System.out.println("Capital: " + getCapital(capitals, lookup));
    }

    //Define method for performing the search
    public static String getCapital(HashMap<String, String> capitals, String country) {
        //Set condition for checking if the country string exists as a key in the HashMap
        if (capitals.containsKey(country)) {
            //Return the value associated with the country key if the condition is met
            return capitals.get(country);
        }
        //Set condition for returning message in case the condition above is not met
        return "Not found";
    }
}
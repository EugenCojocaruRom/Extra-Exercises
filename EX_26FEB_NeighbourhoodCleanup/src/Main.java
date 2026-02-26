import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display prompt
        System.out.print("Enter the number of zones to clean up: ");
        //Declare variable of type int and read it from the keyboard
        int n = sc.nextInt();
        sc.nextLine();
        //Declare 2D array of type int and set the number of elements to n
        int[][] zones = new int[n][];

        //Method for displaying the zones and the debris in each zone
        displayZonesAndDebris(zones, sc);
        //Display the result retrieved by the method called for the cleanup report
        System.out.println(formatCleanupReport(zones));
    }

    //Define method for reading and displaying the zones and the number of debris in each zone
    static void displayZonesAndDebris(int[][] zones, Scanner sc) {
        //Loop from i = 0 to length of 'zones', incrementing i by 1
        for (int i = 0; i < zones.length; i++) {
            //Display prompt to enter the number of debris clusters per zone
            System.out.print("Enter the number of debris clusters for zone " + (i + 1) + ": ");
            //Read each element from the keyboard
            int debrisCluster = sc.nextInt();
            sc.nextLine();
            //Each element of 'zones' is a new array
            zones[i] = new int[debrisCluster];
            //Loop from j = 0 to value of 'debrisCluster', incrementing j by 1
            for (int j = 0; j < debrisCluster; j++) {
                //Display prompt to enter the number of debris per cluster
                System.out.print("\tEnter debris count " + (j + 1) + ": ");
                //Read each element from the keyboard
                zones[i][j] = sc.nextInt();
                sc.nextLine();
            }
        }
    }

    //Method for printing the cleanup report
    public static String formatCleanupReport(int[][] zones) {
        //Declare variable of type StringBuilder to hold the final result
        StringBuilder result = new StringBuilder();
        //Loop through array 'zones' in reverse order
        for (int i = zones.length - 1; i >= 0; i--) {
            //Declare variable of type int (for total debris) and initialize it
            int totalDebris = 0;
            //Loop through each element of zone
            for (int debrisCluster : zones[i]) {
                totalDebris += debrisCluster;
            }
            //Declare variable of type int (zone number) -> length of 'zones' - value of i
            int zoneNumber = zones.length - i;
            //Append the required info to the result StringBuilder
            result.append("Zone ").append(zoneNumber).append(": ")
                    .append(totalDebris).append(" items");
            //Append new line
            if (i > 0) {
                result.append("\n");
            }

        }
        //Return the result as a string
        return result.toString();
    }
}
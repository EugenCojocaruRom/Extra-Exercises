import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display prompt
        System.out.print("Enter initial elevation: ");
        //Read variable from keyboard
        int initialElevation = sc.nextInt();
        sc.nextLine();
        //Display prompt
        System.out.print("Enter number of slope changes: ");
        //Number of slope changes
        int x = sc.nextInt();
        //Array of type int with x elements
        int[] slopeChanges = new int[x];
        //Call method for slope changes
        slopeData(slopeChanges, sc);
        //Display prompt
        System.out.print("Enter number of geothermal events: ");
        //Number of geothermal events
        int y = sc.nextInt();
        sc.nextLine();
        //Array of type float with y elements
        float[] geothermalActivity = new float[y];
        //Call method for geothermal events
        geothermalData(geothermalActivity, sc);

        System.out.println("Final elevation and significant geothermal features encountered: ");
        System.out.println(Arrays.toString(geothermalDescent(initialElevation, slopeChanges, geothermalActivity)));
    }

    //Method for displaying slope changes
    static void slopeData(int[] slopeChanges, Scanner sc) {
        for (int i = 0; i < slopeChanges.length; i++) {
            System.out.print("Slope change " + (i + 1) + ": ");
            slopeChanges[i] = sc.nextInt();
        }
    }

    //Method for displaying geothermal events
    static void geothermalData(float[] geothermalActivity, Scanner sc) {
        for (int i = 0; i < geothermalActivity.length; i++) {
            System.out.print("Geothermal activity " + (i + 1) + ": ");
            geothermalActivity[i] = sc.nextFloat();
        }
    }

    //Method for finding final elevation and geothermal features
    public static int[] geothermalDescent(int initialElevation, int[] slopeChanges, float[] geothermalActivity) {
        //Variables
        int elevation = initialElevation;
        int significantFeatures = 0;

        for (int i = 0; i < slopeChanges.length; i++) {
            //Too dangerous - end journey early
            if (geothermalActivity[i] > 0.9f) {
                break;
            }

            //High activity - skip this slope change
            if (geothermalActivity[i] > 0.75f) {
                continue;
            }

            //Count significant geothermal features
            if (geothermalActivity[i] >= 0.5f && geothermalActivity[i] <= 0.75f) {
                significantFeatures++;
            }

            //Update elevation
            elevation += (int)(slopeChanges[i] * Math.sin(slopeChanges[i]));
        }
        return new int[]{elevation, significantFeatures};
    }
}
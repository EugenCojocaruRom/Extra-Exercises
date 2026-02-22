import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display prompt
        System.out.print("Enter the number for the 1st series of settings: ");
        //Declare variable of type int and read it from the keyboard
        int n = sc.nextInt();
        //Display prompt
        System.out.print("Enter the number for the 2nd series of settings: ");
        //Declare variable of type int and read it from the keyboard
        int m = sc.nextInt();
        //Declare 2D array of type int and set the number of its elements to n and m
        int[][] equipmentData = new int[n][m];
        //Display prompt
        System.out.print("Enter increment value: ");
        //Declare variable of type int and read it from the keyboard
        int x = sc.nextInt();

        //Call method for displaying the equipment data
        displayEquipment(equipmentData, x, sc);
        //Call method for calculating the realignment
        System.out.println("Reversed rows after increment: " + Arrays.deepToString(realignEquipment(equipmentData, x)));

    }

    //Method for reading and displaying the 2D array
    public static void displayEquipment(int[][] equipmentData, int x, Scanner sc) {
        for (int i = 0; i < equipmentData.length; i++) {
            for (int j = 0; j < equipmentData[i].length; j++) {
                System.out.print("Element " + (i + 1) + " : ");
                equipmentData[i][j] = sc.nextInt();
            }
        }
        System.out.println("The equipment data is: " + Arrays.deepToString(equipmentData));
    }

    //Method for calculating the realignment
    public static int[][] realignEquipment(int[][] equipment, int increment) {
        //Loop from i = 0 to the length of 'equipment', incrementing i by 1
        for (int i = 0; i < equipment.length; i++) {
            //Inside this loop -> loop from j = 0 to the length of the element from 'equipment', incrementing j by 1
            for (int j = 0; j < equipment[i].length; j++) {
                //Increase each value by the value of the increment
                equipment[i][j] += increment;
            }
        }

        //Reverse the order of rows
        for (int i = 0; i < equipment.length / 2; i++) {
            int[] temp = equipment[i];
            equipment[i] = equipment[equipment.length - 1 - i];
            equipment[equipment.length - 1 - i] = temp;
        }
        return equipment;
    }
}
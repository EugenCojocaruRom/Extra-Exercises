import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display message for user to enter a number from 1 to 5
        System.out.print("Enter the character's class (1 to 5): ");
        //Declare variable of type int and read it from the keyboard
        int classNumber = sc.nextInt();

        //Call the method for displaying the character details
        characterDetails(classNumber);
    }

    //Define method for displaying the character details
    static void characterDetails(int classNumber) {
        //Declare variable of type string and initialize it as an empty string to store the possible values
        String ability = "";
        //Declare variable of type int and initialize it
        int health = 0;
        //Declare variable of type int and initialize it
        int power = 0;
        //Switch statement goes here
        switch (classNumber) {
            case 1:
                ability = "Sword Master";
                health = 100;
                power = 8;
                break;
            case 2:
                ability = "Spell Caster";
                health = 70;
                power = 10;
                break;
            case 3:
                ability = "Sharp Shooter";
                health = 80;
                power = 9;
                break;
            case 4:
                ability = "Life Giver";
                health = 60;
                power = 7;
                break;
            case 5:
                ability = "Shield Bearer";
                health = 90;
                power = 8;
                break;
            default:
                ability = "Acid Spitter";
                health = 200;
                power = 100;
                break;
        }

        //Display character class details
        System.out.println("Character Details:");
        System.out.println("-----------------");
        System.out.println("Class Number: " + classNumber);
        System.out.println("Special Ability: " + ability);
        System.out.println("Health: " + health);
        System.out.println("Power: " + power);
    }
}
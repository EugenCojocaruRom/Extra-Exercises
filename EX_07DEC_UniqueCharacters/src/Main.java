import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display value n
        System.out.print("The string is: ");
        //Declare variable of type string and read it from the keyboard
        String A = sc.nextLine();
        //Declare variable of type boolean with default value 'true'
        boolean isUnique = true;
        //Loop through string A from i = 0 to the length of the string, incrementing i by 1
        for (int i = 0; i < A.length(); ++i) {
            //Inside this loop -> loop through string A from j = i +1 to the length of A, incrementing j by 1
            for (int j = i + 1; j < A.length(); ++j) {
                //Set condition in case a duplicate character is found
                if (A.charAt(i) == A.charAt(j)) {
                    //When 2 characters are identical, the boolean value is 'false'
                    isUnique = false;
                    //Exit the loop
                    break;
                }
            }
            //If a duplicate character was found, there is no need to continue searching the rest of the string
            if (isUnique == false) {
                //Exit the loop
                break;
            }
        }
        //Display the message about the uniqueness of the characters
        System.out.print("All the characters of this string are unique: " + isUnique);
    }
}
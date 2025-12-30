import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display message for user
        System.out.print("Enter string here: ");
        //Declare variable of type string and read it from the keyboard
        String str = sc.nextLine();

        //Declare variable str2 of type string (for rearranged string) and set it to empty
        String str2 = "";

        //Loop through the string from i = 0 to the length of the string - 2, in groups of 3, incrementing i by 3
        for (int i = 0; i < str.length() - 2; i += 3) {
            //Create a substring of 3 characters
            String temp = str.substring(i, i + 3);
            //Rearrange the temp string by moving the first character to the end (chars at index 1, 2, then 0)
            String rearrStr = temp.substring(1, 3) + temp.substring(0, 1);
            //Append the rearranged substring to str2
            str2 = str2 + rearrStr;
        }
        //Display the rearranged string
        System.out.println("The rearranged string is: " + str2);
    }
}
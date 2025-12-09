import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display value str1 for string 1
        System.out.print("str1 = ");
        //Declare variable str1 of type String and read it from the keyboard
        String str1 = sc.nextLine();
        //Display value str2 for string 2
        System.out.print("str2 = ");
        //Declare variable str2 and read it from the keyboard
        String str2 = sc.nextLine();

        //Display the 2 strings joined into 1 string using the join method
        System.out.print("The joined string is \"" + joinStrings(str1, str2) + "\"");
    }

    //Define method for joining the 2 strings
    static String joinStrings(String str1, String str2) {
        return str1.concat(str2);
    }
}
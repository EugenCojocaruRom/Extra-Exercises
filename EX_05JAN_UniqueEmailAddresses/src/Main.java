import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display prompt for user
        System.out.print("Enter  number of emails addresses: ");
        //Declare variable of type int and read it from the keyboard
        int n = sc.nextInt();
        sc.nextLine();
        //Declare array of type string and set the number of its elements to n
        String[] emails = new String[n];

//      emails to use: {"test.email+alex@gmail.com",
//                "test.e.mail+bob.cathy@gmail.com",
//                "testemail+david@yah.oo.com"};

        //Call method for reading and displaying the emails
        displayEmails(emails, sc);
        //Call method for displaying only the unique emails
        System.out.println("Number of unique emails: " + numUniqueEmails(emails));
    }

    //Define method for reading and displaying the emails
    static void displayEmails(String[] emails, Scanner sc) {
        //Loop from i = 0 to the length of the array, incrementing i by 1
        for (int i = 0; i < emails.length; i++) {
            //Display prompt to enter the email
            System.out.print("Email " + (i + 1) + ": ");
            //Read each value from the keyboard
            emails[i] = sc.nextLine();
        }
        //Display all the emails
        System.out.println("The emails are: " + Arrays.toString(emails));
    }

    //Define method for finding the unique emails
    static int numUniqueEmails(String[] emails) {
        //Declare Set of type string for storing the unique email addresses and initialize it as a HasSet (to avoid duplicates)
        Set<String> uniqueEmails = new HashSet<>();
        //Loop through each element of the 'emails' array
        for (String email : emails) {
            //Split at the @ sign each element from the array
            String[] parts = email.split("@");
            //Declare variable of type string for the local part of the email
            String local = parts[0];
            //Declare variable of type string for the domain part of the email
            String domain = parts[1];
            //Set condition for checking if there are any + signs in the 'local' part of the email
            if (local.contains("+")) {
                //Keep only the part that precedes the + sign
                local = local.substring(0, local.indexOf("+"));
            }
            //Replace any . occurrence in the 'local' part with ""
            local = local.replace(".", "");

            //Declare variable of type string and set its value as the combination of local, @ and domain
            // 3. Reconstruim adresa și o adăugăm în Set
            String cleanEmail = local + "@" + domain;
            //Add each 'cleaned-up' email to the Set
            uniqueEmails.add(cleanEmail);
        }

        // Return the number of elements in the Set
        return uniqueEmails.size();
    }
}
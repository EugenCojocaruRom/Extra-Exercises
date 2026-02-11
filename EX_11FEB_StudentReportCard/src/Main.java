import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display prompt for the user - student name
        System.out.println("Enter the student's name (first name / last name): ");
        //Declare variable of type String and read it from the keyboard
        String studentName = sc.nextLine();
        //Display prompt for the user - student ID
        System.out.print("Enter the student's ID: ");
        //Declare variable of type int and read it from the keyboard
        int studentId = sc.nextInt();
        sc.nextLine();
        //Display prompt for the user - Math grade
        System.out.print("Enter the Math grade: ");
        //Declare variable of type double and read it from the keyboard
        double mathGrade = sc.nextDouble(); //e.g. 92.5555
        sc.nextLine();
        //Display prompt for the user - Science grade
        System.out.print("Enter the Science grade: ");
        //Declare variable of type double and read it from the keyboard
        double scienceGrade = sc.nextDouble(); //e.g. 88.7777
        sc.nextLine();
        //Display prompt for the user - English grade
        System.out.print("Enter the English grade: ");
        //Declare variable of type double and read it from the keyboard
        double englishGrade = sc.nextDouble(); //e.g. 95.1111
        sc.nextLine();
        //Display prompt for the user - attendance
        System.out.print("Enter the student's attendance value: ");
        //Declare variable of type double and read it from the keyboard
        double attendance = sc.nextDouble(); //e.g. 0.8523
        sc.nextLine();

        //Create the formatted string for student information
        String headerInfo = String.format("Student: %s, ID: %05d",
                capitalizedStudentName(studentName), studentId);

        //Create the formatted string for student's grades
        String gradesInfo = String.format("Math: %.2f, Science: %.2f, English: %.2f",
                mathGrade, scienceGrade, englishGrade);

        //Declare variable of type double and calculate the attendance as a 2 decimal floating number
        double attendancePercent = attendance * 100.0;
        //Create the formatted string for student attendance
        String attendanceInfo = String.format("Attendance: %.1f%%", attendancePercent);

        //Display separator
        System.out.println("-------------------");
        //Display section title
        System.out.println("STUDENT REPORT CARD");
        //Display section separator
        System.out.println("-------------------");
        //Display the formatted strings
        System.out.println(headerInfo);
        System.out.println(gradesInfo);
        System.out.println(attendanceInfo);
    }

    static String capitalizedStudentName(String studentName) {
        //Set condition for the cases when the student name is null or there is no value
        if (studentName == null || studentName.isBlank()) {
            //Return empty string
            return "";
        }
        /*Declare array of type String, trim any extra leading/trailing spaces
        and split the initial student name by ' ' (space)
            --> used \\s+ in case there are one or more whitespace characters*/
        String[] initialStudentName = studentName.trim().split("\\s+");
        //Declare variable of type String and initialize it as an empty string (to store the modified student name afterwards)
        String finalStudentName = "";
        //Loop through the elements of the 'initialStudentName' array
        for (String name : initialStudentName) {
            //Add to the 'finalStudentName' string the capitalized first letter of each element followed by the rest of the element in lowercase
            finalStudentName += name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase() + " ";
        }
        //Return the modified student name (any extra spaces are trimmed)
        return finalStudentName.trim();
    }
}
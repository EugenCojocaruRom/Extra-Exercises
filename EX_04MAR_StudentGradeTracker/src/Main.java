import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display prompt
        System.out.print("Enter the number of students: ");
        //Declare variable of type int and read it from the keyboard
        int students = sc.nextInt();
        sc.nextLine();
        //Call the method for displaying the subjects per student
        int[] subjectsPerStudent = new int[students];

        //Call the method for displaying the subjects taken by the students
        displaySubjectsPerStudent(subjectsPerStudent, sc);
        //Display section title
        System.out.println("<=== Grades per student ===>");
        //Display the grades after calling the method that processes the students' grades
        System.out.println(Arrays.deepToString(processGrades(students, subjectsPerStudent)));
    }

    //Define method for reading and displaying the subjects per student
    static void displaySubjectsPerStudent(int[] subjects, Scanner sc) {
        //Display section title
        System.out.println("<=== Number of subjects per student ===>");
        //Loop from i = 0 to length of 'subject', incrementing i by 1
        for (int i = 0; i < subjects.length; i++) {
            //Display prompt
            System.out.print("Subjects for student " + (i + 1) + ": ");
            //Read the value from the keyboard
            subjects[i] = sc.nextInt();
            sc.nextLine();
        }
        System.out.println("Subjects: " + Arrays.toString(subjects));
    }

    //Define method for processing the students' grades
    public static int[][] processGrades(int numStudents, int[] subjectsPerStudent) {
        //Edge cases -> numStudents is 0 or subjectsPerStudent array is null/empty
        if (numStudents == 0 || subjectsPerStudent == null || subjectsPerStudent.length == 0) {
            return null;
        }
        //Declare 2D array of type int and set the value for rows to the number of students
        int[][] grades = new int[numStudents][];
        //Loop from i = 0 to numStudents, incrementing i by 1
        for (int i = 0; i < numStudents; i++) {
            //Set each row's length to the number of subjects the corresponding student takes
            grades[i] = new int[subjectsPerStudent[i]];
            //Inside this loop --> loop through each subject for this student, from j = 0 to the value of subjectsPerStudent, incrementing j by 1
            for (int j = 0; j < subjectsPerStudent[i]; j++) {
                //Set the value of each grade by applying the formula (studentIndex + 1) × 10 + (subjectIndex + 1)
                grades[i][j] = (i + 1) * 10 + (j + 1);
            }
        }
        //Return the grades array
        return grades;
    }
}
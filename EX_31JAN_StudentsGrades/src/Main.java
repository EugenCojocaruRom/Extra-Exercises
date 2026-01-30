import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display prompt for the user
        System.out.print("Enter the number of elements (grades): ");
        //Declare variable of type int and read it from the keyboard
        int n = sc.nextInt();
        //Declare array of type int and set the number of its elements to n
        int[] grades = new int[n];
        //Read the grades from the keyboard
        for  (int i = 0; i < n; i++) {
            System.out.print("Enter grade " + (i+1) + ": ");
            grades[i] = sc.nextInt();
        }
        //Display the grades
        System.out.println("The grades of this student are: " + Arrays.toString(grades));

        //Call method for increasing specific grades by 5 points
        improveGrade(grades, sc);
        System.out.print("After improving grade: [");
        for (int i = 0; i < grades.length; i++) {
            System.out.print(grades[i]);
            if (i < grades.length - 1) System.out.print(", ");
        }
        System.out.println("]");

        //Call method for replacing any grade below 60 with 60
        replaceFailingGrade(grades);
        System.out.print("After replacing failing grade(s): [");
        for (int i = 0; i < grades.length; i++) {
            System.out.print(grades[i]);
            if (i < grades.length - 1) System.out.print(", ");
        }
        System.out.println("]");

        //Call method for adding 2 bonus points to each grade
        addBonusPoints(grades);
        System.out.print("After adding bonus: [");
        for (int i = 0; i < grades.length; i++) {
            System.out.print(grades[i]);
            if (i < grades.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    //Define method for increasing specific grades by 5 points
    public static void improveGrade(int[] score, Scanner sc) {
        int highestScore = 100;
        System.out.print("Enter the position of the score to modify: ");
        int index = sc.nextInt() - 1;
        score[index] += 5;
        if (score[index] > 100) {
            score[index] = highestScore;
        }
    }

    //Define method for replacing any grade below 60 with 60
    public static void replaceFailingGrade(int[] lowScore) {
        int consolationScore = 60;
        for (int i = 0; i < lowScore.length; i++) {
            if (lowScore[i] < 60) {
                lowScore[i] = consolationScore;
            }
        }
    }

    //Define method for adding 2 bonus points to each grade
    public static void addBonusPoints(int[] allGrades) {
        for (int i = 0; i < allGrades.length; i++) {
            allGrades[i] += 2;
            if (allGrades[i] > 100) {
                allGrades[i] = 100;
            }
        }
    }
}
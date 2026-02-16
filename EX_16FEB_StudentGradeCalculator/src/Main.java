import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner scanner = new Scanner(System.in);
        //Display prompt
        System.out.println("Enter the grades separated by comma: ");
        String text = scanner.nextLine();
        //Declare array of type String, used for splitting the provided text by comma
        String[] stringArr = text.split(",");
        //Declare array of type String and set the number of its elements to the length of the previous array (stringArr)
        int[] studentGrades = new int[stringArr.length];
        //Loop from i = 0 to the length of stringArr, incrementing i by 1
        for (int i = 0; i < stringArr.length; i++) {
            //Convert each grade string into an integer
            studentGrades[i] = Integer.parseInt(stringArr[i]);
        }
        //Declare variable of type double and set its value to the value returned by the average calculation method
        double averageGrade = calculateAverageGrade(studentGrades);
        //Display the average grade
        System.out.printf("Average grade: %.2f", averageGrade);
    }

    //Method for calculating the average grade
    public static double calculateAverageGrade(int[] grades) {
        //Declare variable of type int for the length of the 'grades' array
        int n = grades.length;
        //Declare variable of type int for sum and initialize it
        int sum = 0;
        //Loop from i = 0 to n, incrementing i by 1
        for (int i = 0; i < n; i++) {
            //Calculate the sum of the grades
            sum += grades[i];
        }
        //Return the average grade (calculated as a double)
        return (double) sum / n;
    }
}
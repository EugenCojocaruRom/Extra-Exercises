public class Main {
    public static void main(String[] args) {

        //Declare arrays and allocate some values (grades)
        int[] grades = {85, 92, 78, 65, 88, 72, 89, 98, 93, 77};
        int[] startGrades = {72, 85, 68, 90, 77};
        int[] endGrades = {84, 90, 75, 92, 80};

        //Call and display getClassStats method
        System.out.println("Class Statistics:");
        System.out.println(getClassStats(grades));

        //Call and display getLetterGrades method
        System.out.println("\nGrade Distribution:");
        System.out.println(getLetterGrades(grades));

        //Call and display getImprovement method
        System.out.println("\nImprovement Analysis:");
        System.out.println(getImprovement(startGrades, endGrades));
    }

    //Define the getClassStats method
    public static String getClassStats(int[] grades) {
        //Check if the array is null or empty
        if (grades == null || grades.length == 0) {
            return "No grades available.";
        }
        //Declare variables for sum, max, min and passing grade, and initialize them
        int sum = 0;
        int max = grades[0];
        int min = grades[0];
        int passingGrade = 0;
        //Loop from i = 0 to the length of array 'grades', incrementing i by 1
        for (int i = 0; i < grades.length; i++) {
            //Calculate sum
            sum += grades[i];
            //Find highest grade
            if (grades[i] > max) {
                max = grades[i];
            }
            //Find lowest grade
            if (grades[i] < min) {
                min = grades[i];
            }
            //Passing grades
            if (grades[i] >= 60) {
                passingGrade++;
            }
        }
        //Calculate average
        double average = (double) sum / grades.length;
        //Return the results as a formatted string
        return String.format("Class Average: %.1f\n" +
                "Highest Grade: %d\n" +
                "Lowest Grade: %d\n" +
                "Passing Grades: %d/%d",
                average, max, min, passingGrade, grades.length);
    }

    //Define the getLetterGrades method
    public static String getLetterGrades(int[] grades) {
        //Declare variables of type int and initialize them
        int counterA = 0;
        int counterB = 0;
        int counterC = 0;
        int counterD = 0;
        int counterF = 0;
        //Loop from i = 0 to the length of array 'grades', incrementing i by 1
        for (int grade : grades) {
            //Set the condition for checking that the grade is in the interval 90-100
            if (grade <= 100 &&  grade >= 90) {
                //If the condition is met, increment the counter
                counterA++;
            }
            //Set the condition for checking that the grade is in the interval 80-89
            else if (grade < 90 &&  grade >= 80) {
                //If the condition is met, increment the counter
                counterB++;
            }
            //Set the condition for checking that the grade is in the interval 70-79
            else if (grade < 80 &&  grade >= 70) {
                //If the condition is met, increment the counter
                counterC++;
            }
            //Set the condition for checking that the grade is in the interval 60-69
            else if (grade < 70 &&  grade >= 60) {
                //If the condition is met, increment the counter
                counterD++;
            }
            //Set the condition for checking that the grade is in the interval 0-59
            else {
                //If the condition is met, increment the counter
                counterF++;
            }
        }
        //Return the results as a formatted string
        return String.format("A (90-100): %d\n" +
                        "B (80-89): %d\n" +
                        "C (70-79): %d\n" +
                        "D (60-69): %d\n" +
                        "F (0-59): %d",
                counterA, counterB, counterC, counterD, counterF);
    }

    public static String getImprovement(int[] start, int[] end) {
        //Declare variables and initialize them
        int sumStart = 0;
        int sumEnd = 0;
        int mostImproved = 0;
        int gradeDiff = 0;
        int studentCounter = 0;

            //1. Calculate average improvement
        //Loop through array 'start' from i = 0 to the length of the array, incrementing i by 1
        for (int i = 0; i < start.length; i++) {
            //Calculate the sum of the grades from 'start' array
            sumStart += start[i];
        }
        //Calculate the average of the grades from 'start' array
        double averageStart = ((double) sumStart / start.length);
        //Loop through array 'end' from i = 0 to the length of the array, incrementing i by 1
        for (int i = 0; i < end.length; i++) {
            //Calculate the sum of the grades from 'end' array
            sumEnd += end[i];
        }
        //Calculate the average of the grades from 'end' array
        double averageEnd = ((double) sumEnd / end.length);
        //Calculate the difference between the 2 averages
        double averageFinal = averageEnd - averageStart;

            //2. Find the most improved grade
        //Loop through array 'end' from j = 0 to the length of the array, incrementing j by 1
        for (int j = 0; j < end.length; j++) {
            //Inside this loop, loop through array 'start' from i = 0 to the length of the array, incrementing i by 1
            for (int i = 0; i < start.length; i++) {
                //
                gradeDiff = end[i] - start[i];
                //
                if (gradeDiff > mostImproved) {
                    //
                    mostImproved = gradeDiff;
                }
            }
        }

            //3. Find how many students' grades have improved
        //Loop through array 'start' from i = 0 to the length of the array, incrementing i by 1
        for (int i = 0; i < start.length; i++) {
            if (start[i] >= end[i]) {
                studentCounter = 0;
            } else if (start[i] < end[i]) {
                studentCounter++;
            }
        }
        //Return the results as a formatted string
        return String.format("Average Improvement: %.1f points\n" +
                        "Most Improved: %d points\n" +
                        "Students Improved: %d/%d",
                averageFinal, mostImproved, studentCounter, start.length);
    }
}
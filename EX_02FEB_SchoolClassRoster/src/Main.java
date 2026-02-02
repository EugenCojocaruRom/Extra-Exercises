import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Declare array of type String with several values
        String[] names = {"Tom", "Alice", "Bob"};
        //Declare array of type int with several values
        int[] grades = {85, 92, 78};
        //Declare array of type String with several values
        int[] grades2 = {85, 92, 78};

        //Method for the seating chart
        String[] seatingChart = createSeatingChart(names, grades);
        System.out.print("Seating Chart: ");
        System.out.println(Arrays.toString(seatingChart));

        //Method for finding the top students
        String[] gradeLetters = findTopStudents(grades);
        System.out.print("Grade Letters: ");
        System.out.println(Arrays.toString(gradeLetters));

        //Method for checking that the grades are equal
        boolean equalClasses = isClassEqual(grades, grades2);
        System.out.println("Classes Equal: " + equalClasses);
    }

    //Define method for seating chart
    static String[] createSeatingChart(String[] names, int[] grades) {
        //Declare array of type String to hold "Name: Grade" strings, with number of elements equal to length of array 'names'
        String[] chart = new String[names.length];
        //Combine names and grades
        for (int i = 0; i < names.length; i++) {
            chart[i] = names[i] + ": " + grades[i];
        }
        //Sort the chart array alphabetically by name
        Arrays.sort(chart);
        //Return the chart array
        return chart;
    }

    //Define method for finding top students
    static String[] findTopStudents(int[] grades) {
        //Declare array of type String to hold letter grades, with number of elements equal to length of array 'grades'
        String[] letterGrades = new String[grades.length];
        //Assign letter grade based on score
        //Loop from i = 0 to the length of array 'grades', incrementing i by 1
        for (int i = 0; i < grades.length; i++) {
            //Set condition for assigning A+ to grades over 90
            if (grades[i] >= 90) {
                letterGrades[i] = "A+";
            }
            //Set condition for assigning A to other grades
            else {
                letterGrades[i] = "A";
            }
        }
        //Return the 'letterGrades' array
        return letterGrades;
    }

    //Define method for comparing grades
    static boolean isClassEqual(int[] grades, int[] grades2) {
        return Arrays.equals(grades, grades2);
    }
}
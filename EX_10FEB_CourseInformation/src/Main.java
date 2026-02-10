public class Main {
    public static void main(String[] args) {

        //Declare variable of type String and give it a string value
        String courseInfo = "MATH101:Algebra:Monday,Wednesday:9AM";
        //Declare array of type String and give it some values
        String[] courseCodes = {"MATH101", "ENG202", "HIST101"};
        //Declare variable of type String and give it a string value
        String days = "Monday,Wednesday,Friday";

        //Call the methods
        System.out.println("Course Information:");
        System.out.println(formatCourseInfo(courseInfo));

        System.out.println("\nCourse List:");
        System.out.println(createCourseList(courseCodes));

        System.out.println("\nSchedule Format:");
        System.out.println(formatSchedule(days));
    }

    //Define method for formatting the course information
    public static String formatCourseInfo(String courseInfo) {
        //Declare array of type String and split the input string by ':' into the array
        String[] parts = courseInfo.split(":");
        //Return the array elements
        return "Course Code: " + parts[0] + "\n" +
                "Course Name: " + parts[1] + "\n" +
                "Days: " + parts[2] + "\n" +
                "Time: " + parts[3];
    }

    //Define method for creating a list of available courses
    public static String createCourseList(String[] courseCodes) {
        //Return the array elements by combining them using a ',' separator
        return "Available Courses: " + String.join(", ", courseCodes);
    }

    //Define method for formatting the course schedule
    public static String formatSchedule(String days) {
        //Declare array of type String and split the input string by ',' into the array
        String[] dayArray = days.split(",");
        //Return the joined elements, with a '|' separator
        return String.join(" | ", dayArray);
    }
}
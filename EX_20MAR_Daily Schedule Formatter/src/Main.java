import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display prompt - number of morning tasks
        System.out.print("Enter number of morning tasks: ");
        //Declare variable of type int and read it from the keyboard
        int morningCount = sc.nextInt();
        sc.nextLine();
        //Declare array of type String and set the number of elements to the value of morningCount
        String[] morningTasks = new String[morningCount];
        //Loop from i = 0 to the value of morningCount, incrementing i by 1
        for (int i = 0; i < morningCount; i++) {
            //Display prompt for the user to enter the current morning task
            System.out.print("Morning task " + (i + 1) + ": ");
            //Read the input from the keyboard and store it in the array at position i
            morningTasks[i] = sc.nextLine();
        }
        //Display prompt - number of evening tasks
        System.out.print("Enter number of evening tasks: ");
        //Declare variable of type int and read it from the keyboard
        int eveningCount = sc.nextInt();
        sc.nextLine();
        //Declare array of type String and set the number of elements to the value of eveningCount
        String[] eveningTasks = new String[eveningCount];
        //Loop from i = 0 to the value of eveningCount, incrementing i by 1
        for (int i = 0; i < eveningCount; i++) {
            //Display prompt for the user to enter the current evening task
            System.out.print("Evening task " + (i + 1) + ": ");
            //Read the input from the keyboard and store it in the array at position i
            eveningTasks[i] = sc.nextLine();
        }
        //Call the createRanchSchedule method with the two arrays, and print the result preceded by a blank line
        System.out.println("\n" + createRanchSchedule(morningTasks, eveningTasks));
    }

    //Define method for creating the schedule
    public static String createRanchSchedule(String[] morningTasks, String[] eveningTasks) {
        //Declare variable of type StringBuilder to build the schedule string piece by piece
        StringBuilder schedule = new StringBuilder();
        //Add the header line with a newline after it, plus a blank line for spacing
        schedule.append("=== Daily Ranch Schedule ===\n\n");
        //Declare variable of type int (counter) and initialize it to 1
        int taskNumber = 1;
        //Loop through each task in the morningTasks array
        for (String task : morningTasks) {
            //Append the task number, "Morning:" label, task name, and a newline, then increment the counter
            schedule.append(taskNumber++).append(". Morning: ").append(task).append("\n");
        }
        //Loop through each task in the eveningTasks array
        for (String task : eveningTasks) {
            //Append the task number, "Evening:" label, task name, and a newline, then increment the counter
            schedule.append(taskNumber++).append(". Evening: ").append(task).append("\n");
        }
        //Append the footer, with a blank line in front of it
        schedule.append("\n=== End of Schedule ===");
        //Convert the StringBuilder to a regular String and return it
        return schedule.toString();
    }
}
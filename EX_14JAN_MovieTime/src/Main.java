import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display label 'age'
        System.out.print("Enter the age: ");
        //Declare variable of type int and read it from the keyboard
        int age = sc.nextInt();
        //Display label 'time' - 24-hour format
        System.out.print("Enter the time (HHmm format): ");
        //Declare variable of type int and read it from the keyboard
        int time = sc.nextInt();
        //Declare variable of type boolean and initialize it to true
        boolean isHoliday = true;

        //Method for determining the ticket type and details
        movieTicket(age, time, isHoliday);
    }

    static void movieTicket(int age, int time, boolean isHoliday) {
        //Code to determine ticket type and price
        String ticketType = "";
        int price = 0;
        if ((age < 13) && !isHoliday) {
            price = 8;
            ticketType = "CHILD";
        }
        else if ((age < 13) && isHoliday) {
            price = 8 + 2;
            ticketType = "CHILD";
        }
        else if ((age >= 13 && age <= 17) && !isHoliday) {
            price = 12;
            ticketType = "TEEN";
        }
        else if ((age >= 13 && age <= 17) && isHoliday) {
            price = 12 + 3;
            ticketType = "TEEN";
        }
        else if ((age >= 18 && age <= 59) && !isHoliday) {
            price = 15;
            if (time < 1700) {
                price = 15 - 3;
            }
            ticketType = "ADULT";
        }
        else if ((age >= 18 && age <= 59) && isHoliday) {
            price = 15 + 5 - 3;
            ticketType = "ADULT";
        }
        else if (age >= 60) {
            price = 10;
            if (time < 1700) {
                price = 10 - 2;
            }
            ticketType = "SENIOR";
        }

        //Display ticket details
        System.out.println("\n--Ticket Details--");
        System.out.println("===================");
        System.out.println("Customer Age: " + age);
        System.out.println("Show Time: " + time);
        System.out.println("Holiday? " + isHoliday);
        System.out.println("-------------------");
        System.out.println("Ticket Type: " + ticketType);
        System.out.println("Final Price: $" + price);
    }
}
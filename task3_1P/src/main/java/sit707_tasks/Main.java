package sit707_tasks;

import java.util.Random;

/**
 * Main class for testing DateUtil methods.
 * @author Ahsan Habib
 */
public class Main {

    public static void main(String[] args) {
        // Test getDayOfWeek method
        int dayOfWeek = DateUtil.getDayOfWeek(25, 4, 2024);
        System.out.println("Day of the week for 25th April 2024: " + dayOfWeek); // Output should be 6 (Friday)
        
        // Test getDaysBetweenDates method
        int daysBetween = DateUtil.getDaysBetweenDates(1, 1, 2024, 1, 1, 2025);
        System.out.println("Days between 1st January 2024 and 1st January 2025: " + daysBetween); // Output should be 365
        
        // Test isLeapYear method
        boolean leapYear = DateUtil.isLeapYear(2024);
        System.out.println("Is 2024 a leap year? " + leapYear); // Output should be true
        
        // Additional testing with DateUtil increment and decrement methods
        // You can add more test cases here as needed
        DateUtil date = new DateUtil(31, 12, 2023);
        date.increment();
        System.out.println("After increment: " + date);
        
        date.decrement();
        System.out.println("After decrement: " + date);
        
        // Random date between 1st January 2024 and 31st December 2024
        int rand_day_1_to_31 = 1 + new Random().nextInt(31);
        int rand_month_1_to_12 = 1 + new Random().nextInt(12);
        int rand_year = 2024;
        date = new DateUtil(rand_day_1_to_31, rand_month_1_to_12, rand_year);
        System.out.println("Random date: " + date);
    }
}
 
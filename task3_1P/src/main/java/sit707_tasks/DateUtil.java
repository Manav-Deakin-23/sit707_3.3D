package sit707_tasks;

/**
 * @author Ahsan Habib
 */
import java.util.Calendar;

public class DateUtil {

	private int day;
    private int month;
    private int year;
    
	public DateUtil(int day, int month, int year) {
	        this.day = day;
	        this.month = month;
	        this.year = year;
	    }

	    public void increment() {
	        // Increment the date by 1 day
	        // Implement your logic here
	    }

	    public void decrement() {
	        // Decrement the date by 1 day
	        // Implement your logic here
	    }
    
	/**
     * Returns the day of the week for a given date.
     * 
     * @param day   The day of the month (1-31).
     * @param month The month (1-12).
     * @param year  The year.
     * @return The day of the week (1=Sunday, 2=Monday, 3=Tuesday, 4=Wednesday, 5=Thursday, 6=Friday, 7=Saturday).
     */
    public static int getDayOfWeek(int day, int month, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day); // Month in Calendar starts from 0 (January).
        return calendar.get(Calendar.DAY_OF_WEEK);
    }

    /**
     * Calculates the number of days between two dates.
     * 
     * @param startDay   The day of the start date.
     * @param startMonth The month of the start date.
     * @param startYear  The year of the start date.
     * @param endDay     The day of the end date.
     * @param endMonth   The month of the end date.
     * @param endYear    The year of the end date.
     * @return The number of days between the two dates.
     */
    public static int getDaysBetweenDates(int startDay, int startMonth, int startYear, 
                                          int endDay, int endMonth, int endYear) {
        Calendar startDate = Calendar.getInstance();
        startDate.set(startYear, startMonth - 1, startDay); // Month in Calendar starts from 0 (January).
        
        Calendar endDate = Calendar.getInstance();
        endDate.set(endYear, endMonth - 1, endDay); // Month in Calendar starts from 0 (January).
        
        long startTimeInMillis = startDate.getTimeInMillis();
        long endTimeInMillis = endDate.getTimeInMillis();
        
        long diffInMillis = endTimeInMillis - startTimeInMillis;
        return (int) (diffInMillis / (1000 * 60 * 60 * 24)); // Convert milliseconds to days.
    }

    /**
     * Checks if a given year is a leap year.
     * 
     * @param year The year to check.
     * @return true if the year is a leap year, false otherwise.
     */
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }

}

package sit707_tasks;

import org.junit.Assert;
import org.junit.Test;

public class DateUtilTest {

    @Test
    public void testGetDayOfWeek() {
        // Test for a known date (1st January 2023, which is a Sunday)
        int dayOfWeek = DateUtil.getDayOfWeek(1, 1, 2023);
        Assert.assertEquals(1, dayOfWeek); // Sunday
    }

    @Test
    public void testGetDaysBetweenDates() {
        // Test for two dates with a difference of exactly one year
        int daysBetween = DateUtil.getDaysBetweenDates(1, 1, 2023, 1, 1, 2024);
        Assert.assertEquals(365, daysBetween); // Non-leap year

        // Test for two dates with a difference of exactly four years (including a leap year)
        daysBetween = DateUtil.getDaysBetweenDates(1, 1, 2020, 1, 1, 2024);
        Assert.assertEquals(1461, daysBetween); // Including one leap year (2020)
    }

    @Test
    public void testIsLeapYear() {
        // Test for leap year (2020)
        boolean isLeapYear = DateUtil.isLeapYear(2020);
        Assert.assertTrue(isLeapYear);

        // Test for non-leap year (2021)
        isLeapYear = DateUtil.isLeapYear(2021);
        Assert.assertFalse(isLeapYear);
    }
}

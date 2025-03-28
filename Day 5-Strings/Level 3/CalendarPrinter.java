import java.util.Scanner;

public class CalendarPrinter {

    public static String getMonthNameFromNumber(int monthNumber) {
        String[] monthNames = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };
        return monthNames[monthNumber - 1];
    }

    public static boolean isYearLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getDaysInGivenMonth(int monthNumber, int year) {
        int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (monthNumber == 2 && isYearLeap(year)) {
            return 29;
        }
        return daysInMonths[monthNumber - 1];
    }

    public static int getFirstDayOfWeek(int month, int year) {
        int day = 1;
        int yearZero = year - (14 - month) / 12;
        int x = yearZero + yearZero / 4 - yearZero / 100 + yearZero / 400;
        int monthZero = month + 12 * ((14 - month) / 12) - 2;
        int dayZero = (day + x + (31 * monthZero) / 12) % 7;
        return dayZero; // 0 for Sunday, 1 for Monday, etc.
    }

    public static void printMonthCalendar(int month, int year) {
        String monthName = getMonthNameFromNumber(month);
        int daysInMonth = getDaysInGivenMonth(month, year);
        int startingDayOfWeek = getFirstDayOfWeek(month, year);

        System.out.println("\n  " + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        //
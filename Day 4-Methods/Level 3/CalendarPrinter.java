import java.util.Scanner;

public class CalendarPrinter {

    private static final String[] MONTH_NAMES = {
            "", "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
    };

    private static String getMonthName(int month) {
        return (month >= 1 && month <= 12) ? MONTH_NAMES[month] : "Invalid Month";
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    private static int getNumberOfDays(int month, int year) {
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return (month >= 1 && month <= 12) ? daysInMonth[month] : 0;
    }

    private static int getStartDay(int day, int month, int year) {
        int y = year - (14 - month) / 12;
        int x = y + y / 4 - y / 100 + y / 400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        return (day + x + (31 * m) / 12) % 7;
    }

    private static void printCalendar(int month, int year) {
        String monthName = getMonthName(month);
        if (monthName.equals("Invalid Month") || year <= 0) {
            System.out.println("Invalid input for month or year.");
            return;
        }

        System.out.println("\n  " + monthName + " " + year);
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

        int startDay = getStartDay(1, month, year);
        int totalDays = getNumberOfDays(month, year);

        for (int i = 0; i < startDay; i++) {
            System.out.print("    ");
        }

        for (int day = 1; day <= totalDays; day++) {
            System.out.printf("%4d", day);
            if ((day + startDay) % 7 == 0 || day == totalDays) {
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        printCalendar(month, year);
        scanner.close();
    }
}
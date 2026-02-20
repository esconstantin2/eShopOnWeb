/**
 * Leap Year Calculator
 *
 * A year is a leap year if:
 *   1. It is divisible by 4
 *   2. BUT NOT divisible by 100
 *   3. UNLESS it is also divisible by 400
 */
public class LeapYearCalculator {

    public static boolean isLeapYear(int year) {
        if (year <= 0) {
            throw new IllegalArgumentException("Year must be a positive integer, got: " + year);
        }
        return (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
    }

    public static void main(String[] args) {
        int[] testYears = {1900, 2000, 2020, 2023, 2024, 2100, 2400};

        System.out.println("Leap Year Calculator");
        System.out.println("====================");

        for (int year : testYears) {
            String result = isLeapYear(year) ? "Leap year" : "Not a leap year";
            System.out.printf("%4d -> %s%n", year, result);
        }
    }
}

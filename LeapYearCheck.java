import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        int year = 2004;

        // Check if the year is a leap year using if-else statements
        if (year % 4 == 0 && year % 100 != 0){
            System.out.println("LEAP YEAR");
        } else if (year % 400 == 0 ) {
            System.out.println("LEAP YEAR");
        } else {
            System.out.println("NON-LEAP YEAR");
        }
    }
}

package ss01_introduction_java.thuchanh;

import java.util.Scanner;

public class leap_year_calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Enter a year: ");
        year = scanner.nextInt();

        boolean IsLeapYear = false;

        boolean isDivisibleBy4 = year % 4 == 0;
        if (isDivisibleBy4) {
            boolean isDivisibleBy100 = year % 100 == 0;
            if (isDivisibleBy100) {
                boolean isDivisibleBy400 = year % 400 == 0;
                if (isDivisibleBy400) {
                    IsLeapYear = true;
                }
            } else {
                IsLeapYear = true;
            }
        }
        if (IsLeapYear) {
            System.out.printf("%d is a LEAP year", year);
        } else {
            System.out.printf("%d is NOT a leap year", year);
        }
    }
}
//public class leap_year_calculator {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int year;
//        System.out.println("Enter a year: ");
//        year = scanner.nextInt();
//        boolean isLeapYear = false;
//
//        boolean isDivisibleBy4 = year % 4 == 0;
//        if(isDivisibleBy4){
//            boolean isDivisibleBy100 = year % 100 == 0;
//            if(isDivisibleBy100){
//                boolean isDivisibleBy400 = year % 400 == 0;
//                if(isDivisibleBy400){
//                    isLeapYear = true;
//                }
//            } else {
//                isLeapYear = true;
//            }
//        }
//
//        if(isLeapYear){
//            System.out.printf("%d is a leap year", year);
//        } else {
//            System.out.printf("%d is NOT a leap year", year);
//        }
//    }
//}

package ss02_loop.bai_tap;

import java.util.FormatFlagsConversionMismatchException;
import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
        choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Print the rectangle");
                for (int j = 1; j < 4; j++) {
                    for (int i = 1; i < 6; i++) {
                        System.out.print("+");
                    }
                    System.out.println();
                } break;

            case 2:
                System.out.println("Print square triangle botton-left");
                for (int i= 1; i <6; i++) {
                    for (int j = 0; j<i; j++) {
                        System.out.print("+");
                    }
                    System.out.println();
                }
                System.out.println("Print square triangle top-left");
                for (int i=6;i>1;i--) {
                    for (int j=1;j<i;j++) {
                        System.out.print("+");
                    }
                    System.out.println();
                }
                break;
            case 3:
                System.out.println("Print isosceles triangle");
                for (int i= 1; i <5; i++) {
                    for (int j = 0; j<i; j++) {
                        System.out.print("+");
                    }
                    System.out.println();
                }
                for (int i=4;i>1;i--) {
                    for (int j=1;j<i;j++) {
                        System.out.print("+");
                    }
                    System.out.println();
                }
                break;
            case 0:
                System.exit(0);

        }
    }
}

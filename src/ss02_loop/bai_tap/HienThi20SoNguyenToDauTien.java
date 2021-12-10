package ss02_loop.bai_tap;

import java.util.Scanner;

public class HienThi20SoNguyenToDauTien {
    public static void main(String[] args) {
        int numbers;
        Scanner input = new Scanner(System.in);
        System.out.print("How many number you want to print?: ");
        numbers = input.nextInt();
        int count = 1;
        int N = 3;
        int i = 2;
        System.out.println("Số nguyên tố đầu tiên là: 2");

        while (count< numbers) {
            boolean check = true;
            while (i < N) {
                if (N % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println("Số nguyên tố thứ " + (count+1) + " là: " + N);
            }
            count ++;
            N++;
        }
    }
}

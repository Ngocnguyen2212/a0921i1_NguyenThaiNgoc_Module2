package ss03_array_method.bai_tap;

import java.util.Scanner;

public class XoaPhanTuTrongMang {
    public static void main(String[] args) {
        int[] N = {1,4,5,6,0,0,0};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap phan tu can xoa: ");
        int x = scanner.nextInt();
        boolean isExist = false;
        int index_del;
        for (index_del = 0; index_del < N.length; index_del++) {
            if (N[index_del] == x) {
                System.out.println("Vi tri cua " + x + " trong mang la: " + (index_del + 1));
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Not found" + x + " in the list.");
        }
        for (; index_del < N.length - 1; index_del++) {
            N[index_del]=N[index_del+1];
        }
        System.out.printf("\n%-20s%s", "Mang hien tai: ", "");
        for (int j = 0; j < N.length; j++) {
            System.out.print(N[j] + "\t");
        }
    }
}

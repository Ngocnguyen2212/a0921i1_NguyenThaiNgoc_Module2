package ss04_oop.bai_tap;

import java.util.Scanner;

public class GiaiPhuongTrinhBacHai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        double delta1 = quadraticEquation.getDiscriminant();
        quadraticEquation.setQuadraticEquation(a,b,c);
        if (delta1>=0) {
            double root1 = quadraticEquation.getRoot1();
            System.out.print("The equation has two roots : " + root1);
            double root2 = quadraticEquation.getRoot2();
            System.out.println(" and: " + root2);}
            else if (delta1 == 0) {
                double root3 = quadraticEquation.getRoot2();
                System.out.println("The equation has one root" + root3);
            } else {
                System.out.println("The equation has no real roots");
            }

    }
}

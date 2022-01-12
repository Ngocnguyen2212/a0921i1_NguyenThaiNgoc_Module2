package ss04_oop.bai_tap;

public class QuadraticEquation {
double a, b, c;
public void setQuadraticEquation (double a, double b, double c) {

this.a=a;
this.b=b;
this.c=c;
}

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public double getDiscriminant() {
    double delta;
    delta= 2*b - 4*a*c;
    return delta;
    }

    public double getRoot1() {
    double r1;
    r1= (-b + Math.pow(b*b - 4*a*c, 0.5))/2/a;
    return r1;
    }

    public double getRoot2() {
        double r1;
        r1= (-b - Math.pow(b*b - 4*a*c, 0.5))/2/a;
        return r1;
    }

}
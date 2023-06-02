package Drawable;

public class Circle implements Drawable {
    double r;

    Circle(double r) {
        this.r = r;
    }

    public void draw() {
        System.out.println("Circle을 그립니다.");
    }

    public void printInfo() {
        System.out.printf("원의 반지름: %.1f\n", r);
    }
    public double getR() {
        return r;
    }
}

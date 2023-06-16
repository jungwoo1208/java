package Drawable;

public class Rectangle implements Drawable{
    int width,height;
    public Rectangle(int width,int height) {
        this.width=width;
        this.height=height;
    }
    public void draw() {
        System.out.println("Rectangle을 그립니다.");
    }
    public void printInfo() {
        System.out.printf("사각형의 가로 길이: %d\n사각형의 세로길이: %d\n",width,height);
    }
    public double getR(){
        return 0;
    }
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
}

package Drawable;

public class DrawableEX {
    public static void main(String[]args){
        Drawable rectangle=new Rectangle(5,3);
        Drawable circle=new Circle(2.5);
        rectangle.draw();
        rectangle.printInfo();
        System.out.println();
        circle.draw();
        circle.printInfo();
    }
}

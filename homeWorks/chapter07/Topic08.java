package homeWorks.chapter07;

abstract class Shape{
    abstract double getPerimeter();
    abstract double getArea();

}
 class Circle extends Shape{
    private double radius=10;
    final double PI=3.14;


    @Override
    double getPerimeter() {
        return 2*PI*radius;
    }

    @Override
    double getArea() {
        return PI*radius*radius;
    }

 }
 class Square extends Shape{
    double height=10;
    double width=5;

    @Override
    double getPerimeter() {
        return (height+width)*2;
    }

    @Override
    double getArea() {
        return height*width;
    }

 }
 
public class Topic08 {
    public static void main(String[] args) {
        Shape S1=new Circle();
        Shape S2=new Square();
        System.out.println(S1.getArea());
        System.out.println(S2.getArea());
        System.out.println(S1.getPerimeter());
        System.out.println(S2.getPerimeter());

    }
}

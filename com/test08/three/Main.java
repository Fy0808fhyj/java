package com.test08.three;

interface DiagArea {
    double getDiagonal();

    double getArea();
}

class Rec implements DiagArea {

    double height = 5, width = 7;

    @Override
    public double getDiagonal() {

        return Math.sqrt(height * height + width * width);
    }

    @Override
    public double getArea() {

        return height * width;
    }

}

class Squ implements DiagArea {
    double side;

     Squ(double s) {
        this.side = s;
    }

    @Override
    public double getDiagonal() {
        return Math.sqrt(side * side * 2);
    }

    @Override
    public double getArea() {
        return side * side;
    }

    void showAll() {
        System.out.println("边长: " + side);
        System.out.println("面积: " + getArea());
        System.out.println("对角线长: " + getDiagonal());
    }
}

public class Main {
 public static void main(String[] args) {
    Rec r=new Rec();
    Squ s=new Squ(7);
    System.out.println(r.getArea());
    System.out.println(s.getArea());
    System.out.println(r.getDiagonal());
    System.out.println(s.getDiagonal());
    s.showAll();

    
 }
}

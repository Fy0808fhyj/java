package com.test09;

interface Volume{
    double calculateVolume();

}
 class Sphere implements Volume{
    double radius=12;

    @Override
    public double calculateVolume() {
        return 4/3*3.14*Math.pow(radius, 3);
    }

 }
 class Cuboid implements Volume{
    double side=4;

    @Override
    public double calculateVolume() {
        return Math.pow(side, 3);
    }

 }
public class topic02 {
    public static void main(String[] args) {
        Sphere s=new Sphere();
        Cuboid c=new Cuboid();
        System.out.println("球形的体积为: "+s.calculateVolume());
        System.out.println("立方体的体积为: "+c.calculateVolume());
        
    }
    
}

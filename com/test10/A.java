package com.test10;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        try {
            int a;
            int b;
            int c;
            Scanner sc=new Scanner(System.in);
            a=sc.nextInt();
            b=sc.nextInt();
            c=a/b;
            System.out.println(c);
        }
       catch (ArithmeticException e){
           System.out.println("出现异常");
       }
    }

}

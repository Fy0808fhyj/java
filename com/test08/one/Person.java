package com.test08.one;

public class Person {
    private String name;
    private String sex;
    private int age;
    Person(String name,String sex,int age){
        this.name=name;
        this.sex=sex;
        this.age=age;
    }
    Person(){

    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getSex() {
        return sex;
    }
}

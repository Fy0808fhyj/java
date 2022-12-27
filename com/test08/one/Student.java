package com.test08.one;

public class Student extends Person{
    int Sno;
    int Etime;
    String major;
    Student(String name,String sex,int age){
        super(name,sex,age);
        
    }
    Student(){
        
    }
    public void setSno(int sno) {
        Sno = sno;
    }
    public void setEtime(int etime) {
        Etime = etime;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    public int getSno() {
        return Sno;
    }
    public int getEtime() {
        return Etime;
    }
    public String getMajor() {
        return major;
    }
    
}

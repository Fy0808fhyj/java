package homeWorks.chapter07;


interface swimmable{
    void swim();
    void fly();
}

class Duck implements swimmable{

    @Override
    public void swim() {
       System.out.println("duck swimming");
        
    }

    @Override
    public void fly() {
        System.out.println("duck flying");
        
    }
    
}
public class Topic03 {
    public static void main(String[] args) {
        System.out.println("null1");
    }
    
}

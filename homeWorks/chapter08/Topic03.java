package homeWorks.chapter08;
import java.util.Random;
import java.util.Scanner;

public class Topic03 {
    public static void main(String[] args) {
        Random r1=new Random();
        Scanner S1=new Scanner(System.in);
        System.out.println("please input a index");
        int index=S1.nextInt();
        int []arr=new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i]=r1.nextInt(100);           
        }
        try {
            System.out.println(arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("下标越界");
        }
     
    }
  
    
    
    
}

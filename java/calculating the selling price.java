import java.util.Scanner;
public class Main{
    public static void main(String[]args){
       Scanner v=new Scanner(System.in);
       int costp=v.nextInt();
       int profit=v.nextInt();
       int sp=costp+(profit*costp/100);
      System.out.printf("selling price:"+sp);
    }
}
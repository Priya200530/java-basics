import java.util.Scanner;
public class Main{
    public static void main(String[]args){
       Scanner v=new Scanner(System.in);
       int sp=v.nextInt();
       int loss=v.nextInt();
       int costprice=sp-loss;
      System.out.printf("cost price:"+costprice);
    }
}
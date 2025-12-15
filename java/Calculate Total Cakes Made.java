import java.util.Scanner;
public class Main{
    public static void main(String[]args){
       Scanner v=new Scanner(System.in);
       int cake=v.nextInt();
       int time=v.nextInt();
       int bake=(cake*time);
      System.out.println(bake);
    }
}
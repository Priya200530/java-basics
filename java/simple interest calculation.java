import java.util.Scanner;
public class Main{
    public static void main(String[]args){
       Scanner v=new Scanner(System.in);
       int p=v.nextInt();
       int r =v.nextInt();
       int t=v.nextInt();
       int interest=(p*r*t/100);
       System.out.println(interest);
    }
}
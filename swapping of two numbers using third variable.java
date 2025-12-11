import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner v=new Scanner(System.in);
        int a=v.nextInt();
        int b=v.nextInt();
        int temp;
         temp=a;
         a=b;
         b=temp;
        System.out.println(a+" "+b);
    }
}
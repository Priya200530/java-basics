import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner v=new Scanner(System.in);
        int a=v.nextInt();
        int b=v.nextInt();
        int c=v.nextInt();
        int d=(a>b)?(a>c?a:c):(b>c?b:c);
        System.out.println(d);
    }
}
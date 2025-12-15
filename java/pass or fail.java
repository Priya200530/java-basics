import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner v=new Scanner(System.in);
        int a=v.nextInt();
        String c=(a>50?"pass":"fail");
        System.out.println(c);
    }
}
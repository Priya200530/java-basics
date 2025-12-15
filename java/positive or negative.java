import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner v=new Scanner(System.in);
        int a=v.nextInt();
        String b=(a>0)?"positive":"negative";
        System.out.println(b);
    }
}
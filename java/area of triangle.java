import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner v=new Scanner(System.in);
        int base=v.nextInt();
        int height=v.nextInt();
        double Area=(0.5*base*height);
        System.out.println("Area of Triangle:"+Area);
    }
}
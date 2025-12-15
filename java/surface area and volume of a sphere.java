import java.util.Scanner;
public class Main{
    public static void main(String[]args){
    Scanner v=new Scanner(System.in);
    int r=v.nextInt();
    double area=4*3.14*(r*r);
    double volume=4/3*3.14*(r*r*r);
        System.out.println("area of sphere: "+area);
        System.out.print("volume of sphere: "+volume);
    }
}
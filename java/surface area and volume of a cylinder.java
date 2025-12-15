import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner v=new Scanner(System.in);
        int r=v.nextInt();
        int h=v.nextInt();
        double volume=Math.PI*(r*r)*h;
        double area=2*Math.PI*r*(r + h);
        System.out.println("volume of cylinder: "+volume);
        System.out.print("surface area of cylinder:"+area);
        
        
    }
}
import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner v=new Scanner(System.in);
        double price=v.nextDouble();
        double discount=v.nextDouble();
        double fp=price-(price*discount/100);
        System.out.println("PRICE AFTER DISCOUNT: "+fp);
        }
}
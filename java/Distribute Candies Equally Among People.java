import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner v=new Scanner(System.in);
      int p=v.nextInt();
      int c=v.nextInt();
      int to=(c/p);
      int lo=(c%p);
      System.out.println("candies distributed: "+to);
      System.out.print("leftover candies: "+lo);
      
}
}
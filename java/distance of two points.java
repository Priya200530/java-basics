import java.util.Scanner;
public class Main{
    public static void main(String[]args){
       Scanner v=new Scanner(System.in);
      int x1=v.nextInt();
      int x2=v.nextInt();
      int y1=v.nextInt();
      int y2=v.nextInt();
      double distance=(Math.sqrt((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
      System.out.println("distance between two points:"+distance);

    }
    }
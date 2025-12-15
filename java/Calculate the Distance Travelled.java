import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner v=new Scanner(System.in);
      int speed=v.nextInt();
      double time=v.nextDouble();
      double dt=speed*time;
      System.out.println("distance travelled:"+dt);
    }
}
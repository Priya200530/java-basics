import java.util.Scanner;
public class Main{
    public static void main(String[]args){
    Scanner v=new Scanner(System.in);
    int length=v.nextInt();
    int width=v.nextInt();
    int height=v.nextInt();
    int cub=(length*width*height);
    System.out.print("Volume of cuboid:"+cub);
}
}
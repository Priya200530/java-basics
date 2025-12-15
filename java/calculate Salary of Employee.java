import java.util.Scanner;
public class Main{
    public static void main(String[]args){
       Scanner v=new Scanner(System.in);
       int days=v.nextInt();
       int salary=v.nextInt();
       int totalsalary=salary*days;
      System.out.printf("salary:"+totalsalary);
    }
}
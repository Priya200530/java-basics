import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner v=new Scanner(System.in);
	    int a=v.nextInt();
	    int b=v.nextInt();
	    int SA=(6*(a*a));
	    int SV=(a*a*a);
	    int PC=(4*a);
	    System.out.println("Surafec area: "+SA);
	    System.out.println("Surface volume: "+SV);
	     System.out.println("perimeter of cube: "+PC);
	}
	
}
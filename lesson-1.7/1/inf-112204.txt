import java.util.Scanner;

public class Main {
	public static Scanner in = new Scanner(System.in); 
	
	public static void main (String[] argc)
	{
		int a, b;
		a = in.nextInt();
		//b = in.nextInt();
		int c = 2;
		int n = 0;
		while (n < a)
		{
			System.out.print("" + c + " ");
			c += 2; 
			n++;
		}
			
	}
}

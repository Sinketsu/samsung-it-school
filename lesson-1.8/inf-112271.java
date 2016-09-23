import java.util.Random;
import java.util.Scanner;

public class Main {
	public static Scanner in = new Scanner(System.in); 
	
	public static void main (String[] argc)
	{
		int a, b, n;
		int sum = 0;
		a = in.nextInt();
		b = in.nextInt();
		n = in.nextInt();
		for (int i = 0; i < n; i++)
		{
			System.out.print(a + " ");
			a += b;
		}
	}
}

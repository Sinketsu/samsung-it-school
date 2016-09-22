import java.util.Scanner;

public class Main {
	public static Scanner in = new Scanner(System.in); 
	
	public static void main (String[] argc)
	{
		int a, b;
		a = in.nextInt();
		b = in.nextInt();
		int c = 0;
		int sum = a;
		a ^= a;
		while (c < Math.abs(b))
		{
			a += sum;
			c++;
		}
		System.out.println(b < 0 ? -a : a);
	}
}

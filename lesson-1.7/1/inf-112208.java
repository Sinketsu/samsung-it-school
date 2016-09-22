import java.util.Scanner;

public class Main {
	public static Scanner in = new Scanner(System.in); 
	
	public static void main (String[] argc)
	{
		int a, b, c, d;
		boolean flag = false;
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		d = in.nextInt();
		for (int i = 10000; i < 100000; i++)
			if ((i % a == b) && (i % c == d))
			{
				System.out.print("" + i + " ");
				flag = true;
			}
		if (!flag)
			System.out.println(-1);
	}
}

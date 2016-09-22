import java.util.Scanner;

public class Main {
	public static Scanner in = new Scanner(System.in); 
	
	public static void main (String[] argc)
	{
		double x, y;
		x = in.nextDouble();
		y = in.nextDouble();
		if (x < 0 && y < 0)
		{
			System.out.println(3);
			System.exit(0);
		}
		if (x > 0 && y < 0)
		{
			System.out.println(4);
			System.exit(0);
		}
		if (x < 0 && y > 0)
		{
			System.out.println(2);
			System.exit(0);
		}
		System.out.println(1);
	}
}

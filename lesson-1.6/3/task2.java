import java.util.Scanner;

public class Main {
	public static Scanner in = new Scanner(System.in); 
	
	public static void main (String[] argc)
	{
		int n;
		n = in.nextInt();
		System.out.print("Вам " + n);
		if ((n / 10) % 10 == 1)
		{
			System.out.println(" лет");
			System.exit(0);
		}
		if (n % 10 == 1)
		{
			System.out.println(" год");
			System.exit(0);
		}	
		if (n % 10 <= 4)
		{
			System.out.println(" года");
			System.exit(0);
		}
		System.out.println(" лет");
		
		
	}
}

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static Scanner in = new Scanner(System.in); 
	
	public static void main (String[] argc)
	{
		int n;
		n = in.nextInt();
		int arr[][] = new int[n][n];
		for (int i = 0; i < n; i++)
		{
			for (int k = 0; k < n; k++)
			{
				if ((i + k) == (n - 1))
					System.out.print("1 ");
				if ((i + k) > (n - 1))
					System.out.print("2 ");
				if ((i + k) < (n - 1))
					System.out.print("0 ");
			}
			System.out.println();
		}
	}
}

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static Scanner in = new Scanner(System.in); 
	
	public static void main (String[] argc)
	{
		int n;
		int m;
		n = in.nextInt();
		m = in.nextInt();
		int t = 0;
		int c = 0;
		int arr[][] = new int[n][m];
		for (int i = 0; i < n; i++)
			for (int k = 0; k < m; k++)
			{
				if (i % 2 == 0)
				{
					arr[i][k] = c;
					c++;
				}
				else
				{
					arr[i][m - k - 1] = c;
					c++;
				}
			}
		
		for (int i = 0; i < n; i++)
		{
			for (int k = 0; k < m; k++)
				System.out.print("" + arr[i][k] + " ");
			System.out.println();
		}
	}	
}

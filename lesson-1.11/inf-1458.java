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
				arr[i][k] = in.nextInt();
		System.out.println("" + m + " " + n);
		for (int i = 0; i < m; i++)
		{
			for (int k = n - 1; k >= 0; k--)
				System.out.print("" + arr[k][i] + " ");
			System.out.println();
		}
	}	
}

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
			for (int k = 0; k < n; k++)
				arr[i][k] = in.nextInt();
		boolean flag = true;
		for (int i = 0; i < n; i++)
			for (int k = 0; k < n; k++)
				if (arr[i][k] != arr[k][i])
					flag = false;
		System.out.println(flag ? "yes" : "no");
	}	
}

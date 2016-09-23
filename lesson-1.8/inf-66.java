import java.util.Random;
import java.util.Scanner;

public class Main {
	public static Scanner in = new Scanner(System.in); 
	
	public static void main (String[] argc)
	{
		int n;
		n = in.nextInt();
		int arr[] = new int [n];
		int sum = 0;
		int c = in.nextInt();
		int b;
		for (int i = 0; i < n - 1; i++)
		{
			b = in.nextInt();
			if (c < b)
				sum++;
			c = b;
		}
		System.out.println(sum);
	}
}

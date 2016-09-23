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
		int arr[] = new int [n];
		Random random = new Random();
		for (int i = 0; i < n; i++)
		{
			arr[i] = Math.abs(random.nextInt()) % (b - a) + a;
			sum += arr[i];
		}
		for (int v : arr)
			System.out.print(v + " ");
		System.out.println();
		System.out.format("%.3f", (float)sum / n);
	}
}

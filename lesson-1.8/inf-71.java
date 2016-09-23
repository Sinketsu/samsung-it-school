import java.util.Random;
import java.util.Scanner;

public class Main {
	public static Scanner in = new Scanner(System.in); 
	
	public static void main (String[] argc)
	{
		int n;
		n = in.nextInt();
		int arr[] = new int [n];
		for (int i = 0; i < n; i++)
			arr[i] = in.nextInt();
		int c = arr[n - 1];
		for (int i = n - 1; i >= 1; i--)
		{
			arr[i] = arr[i - 1];
		}
		arr[0] = c;
		for (int a : arr)
			System.out.print(a + " ");
		
	}
}

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
		for (int i = 0; i < n - 1; i += 2)
		{
			arr[i] ^= (arr[i + 1] ^= arr[i]);
			arr[i + 1] ^= arr[i];
		}
		
		for (int a : arr)
			System.out.print(a + " ");
		
	}
}

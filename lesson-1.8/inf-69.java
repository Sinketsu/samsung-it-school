import java.util.Scanner;

public class Main {
	public static Scanner in = new Scanner(System.in); 
	
	public static void main (String[] argc)
	{
		int n;
		int j;
		n = in.nextInt();
		int arr[] = new int [n];
		for (int i = 0; i < n; i++)
			arr[i] = in.nextInt();
		for (int i = 0; i < (n / 2); i++)
		{
			j = arr[i];
			arr[i] = arr[n - i - 1];
			arr[n - i - 1] = j;
		}
		for (int v : arr)
			System.out.print("" + v + " ");
	}
}

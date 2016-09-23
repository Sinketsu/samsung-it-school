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
		int c = Integer.MIN_VALUE;
		for (int v : arr)
			if (v > c)
				c = v;
		System.out.println(c);
		
	}
}

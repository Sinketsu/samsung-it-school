import java.util.Random;
import java.util.Scanner;

public class Main {
	public static Scanner in = new Scanner(System.in); 
	
	public static void main (String[] argc)
	{
		String s;
		s = in.nextLine();
		String arr[] = s.trim().split(" ");
		int mas[] = new int [arr.length];
		for (int i = 0; i < mas.length; i++)
			mas[i] = Integer.valueOf(arr[i]);
		
		int max = Integer.MIN_VALUE;
		int ch = Integer.MIN_VALUE;
		for (int i = 0; i < mas.length; i++)
		{
			int c = mas[i];
			int sum = 0;
			for (int k = i; k < mas.length; k++)
			{
				if (mas[k] == c)
					sum++;
			}
			if (sum > max)
			{
				max = sum;
				ch = c;
			}
		}
		System.out.println(ch);
		
	}
}

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
		
		int sum = 0;
		for (int a : mas)
			if (a > 0)
				sum++;
		System.out.println(sum);
	}
}

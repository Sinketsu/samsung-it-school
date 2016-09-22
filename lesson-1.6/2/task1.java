import java.util.Scanner;

public class Main {
	public static Scanner in = new Scanner(System.in); 
	
	public static void main (String[] argc)
	{
		int max, min;
		int value;
		max = -2147483648; 
		min = 2147483647;
		value = in.nextInt();
		while (value != 0)
		{
			if (value > max)
				max = value;
			if (value < min)
				min = value;
			value = in.nextInt();
		}
		System.out.println("Максимум - " + max);
		System.out.println("Минимум - " + min);
	}
}

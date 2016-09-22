import java.util.Scanner;

public class Main {
	public static Scanner in = new Scanner(System.in); 
	
	public static void main (String[] argc)
	{
		String s;
		s = in.nextLine();
		int sum = 0;
		for (int i = 0; i < s.length(); i++)
			sum += (int)(s.charAt(i) - '0');
		System.out.println(sum);
	}
}

import java.util.Scanner;

public class Main {
	public static Scanner in = new Scanner(System.in); 
	
	public static void main (String[] argc)
	{
		String s;
		s = in.nextLine();
		boolean flag = false;
		int sum = 0;
		for (int i = 0; i < s.length() - 1; i++)
			if (s.charAt(i) == s.charAt(i + 1))
				flag = true;
		System.out.println(flag ? "YES" : "NO");
	}
}

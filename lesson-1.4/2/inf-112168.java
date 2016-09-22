import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static Scanner in = new Scanner(System.in); 
	public static PrintStream out = System.out;
	
	public static void main (String[] argc)
	{
		in.useLocale(Locale.US); 
		double x = in.nextDouble(); 
		double y= in.nextDouble(); 
		out.println ( ( (x < 0 && y < -x && y > (x * x - 2)) || 
				(x >= 0 && y < x && y > (x * x - 2))) 
				? "YES": "NO");
	}
}

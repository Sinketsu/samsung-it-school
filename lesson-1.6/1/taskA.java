import java.util.Scanner;

public class Main {
	public static Scanner in = new Scanner(System.in); 
	
	public static void main (String[] argc)
	{
		double x, y;
		x = in.nextDouble();
		y = in.nextDouble();
		System.out.println((y <= 0 && ((x < 0 && y > (-1.5 * x - 6)) || 
				(x >= 0 && y > (1.5 * x - 6)))) ? "Принадлежит" : "Не принадлежит");
	}
}

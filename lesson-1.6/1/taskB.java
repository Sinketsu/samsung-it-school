import java.util.Scanner;

public class Main {
	public static Scanner in = new Scanner(System.in); 
	
	public static void main (String[] argc)
	{
		double x, y;
		x = in.nextDouble();
		y = in.nextDouble();
		System.out.println((x >= 0 && y >= 0 && y < (-x + 6)) || 
				((x + 4) * (x + 4) + (y - 4) * (y - 4) <= 9) ? "Принадлежит" : "Не принадлежит");
	}
}

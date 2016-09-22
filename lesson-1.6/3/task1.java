import java.util.Scanner;

public class Main {
	public static Scanner in = new Scanner(System.in); 
	
	public static void main (String[] argc)
	{
		byte a;
		a = in.nextByte();
		double value = in.nextDouble();
		switch (a)
		{
			case 1:
				System.out.println(value * 0.1);
				break;
			case 2:
				System.out.println(value * 1000);
				break;
			case 3:
				System.out.println(value);
				break;
			case 4:
				System.out.println(value * 0.001);
				break;
			case 5:
				System.out.println(value * 0.01);
				break;
			case 6:
				System.out.println(value * 0.0254);
				break;
			case 7:
				System.out.println(value * 0.3048);
				break;
			case 8:
				System.out.println(value * 1609.34);
				break;
			default:
				System.out.println(0);
		}
	}
}

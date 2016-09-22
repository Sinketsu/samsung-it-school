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
        out.println ((x < 2 && y < x && x * x + y * y > 4 && y > 0) ? "YES": "NO");
    }
}
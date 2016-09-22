import java.io.*;
import java.util.Locale;
import java.util.Scanner;
 
public class Main {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
   
    public static void main (String[] argc)
    {
        int a;
        a = in.nextInt();
        out.println(((a & (a - 1)) == 0) ? "YES" : "NO");
    }
}
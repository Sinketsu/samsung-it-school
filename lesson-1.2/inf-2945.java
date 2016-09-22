import java.io.*;
import java.util.Scanner;
 
public class Main {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
   
    public static void main (String[] argc)
    {
        int a;
        a = in.nextInt();
        a = (a / 2 + 1) * 2;
        out.println(a);
    }
}
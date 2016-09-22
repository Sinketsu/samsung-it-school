import java.io.*;
import java.util.Scanner;
 
public class Main {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
   
    public static void main (String[] argc)
    {
        int a, i;
        a = in.nextInt();
        i = in.nextInt();
        if ((a & (1 << i)) != 0)
        {
            a = a & (~(1 << i));
        } else
        {
            a = a | (1 << i);
        }
           
        out.println(a);
    }
}
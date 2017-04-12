import java.util.ArrayList;
import java.util.Scanner;


public  class Main {	
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	ArrayList<String> arr9 = new ArrayList<>();
    	ArrayList<String> arr10 = new ArrayList<>();
    	ArrayList<String> arr11 = new ArrayList<>();
    	
    	int g;
    	long n = in.nextLong();
    	for (int i = 0; i < n; i++)
    	{
    		g = in.nextInt();
    		if (g == 9)
    			arr9.add(in.next());
    		else if (g == 10)
    			arr10.add(in.next());
    		else
    			arr11.add(in.next());
    	}
    	for (String item : arr9)
    		System.out.println("9 ".concat(item));
    	for (String item : arr10)
    		System.out.println("10 ".concat(item));
    	for (String item : arr11)
    		System.out.println("11 ".concat(item));
    	
    }
}